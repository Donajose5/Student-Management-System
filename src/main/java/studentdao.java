import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import stud.Student;

public class studentdao {
	static final String DB_URL = "jdbc:mysql://localhost/student";
	static final String USER = "root";
	static final String PASS = "";
	static final String QUERY = "Create table if not exists student (roll_no varchar(4) primary key, name varchar(20), mail_id varchar(50) unique, mobile varchar(10), parent_name varchar(20), parent_mobile varchar(10), address varchar(100), 10th_marks int, 12th_marks int)";
	private String dbdriver = "com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	{
		Connection con = null;
		try {
			con = DriverManager.getConnection(DB_URL,USER, PASS);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	public int insert(Student student)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		int result = 1;
		String sql = "insert into student values(?,?,?,?,?,?,?,?,?)";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,student.getRoll_no());
			ps.setString(2,student.getName());
			ps.setString(3,student.getMail_id());
			ps.setString(4,student.getMobile());
			ps.setString(5,student.getParent_name());
			ps.setString(6,student.getParent_mobile());
			ps.setString(7,student.getAddress());
			ps.setInt(8, student.getXth_mark());
			ps.setInt(9, student.getXiith_mark());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
	
	public void create_table()
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		try {
	         Statement stmt = con.createStatement();
	         stmt.executeUpdate(QUERY);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet search(String roll)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "Select * from student where roll_no=? or mobile=?";
		ResultSet rs = null;
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,roll);
			ps.setString(2,roll);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			rs = null;
		}
		return rs;
	}
	
	public ResultSet search_for_update(String roll)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "Select * from student where roll_no=?";
		ResultSet rs = null;
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,roll);
			rs = ps.executeQuery();
		} catch (SQLException e) {
			e.printStackTrace();
			rs = null;
		}
		return rs;
	}
	
	public int update(Student student)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		int result = 1;
		String sql = "update student set name = ?, mail_id = ?, mobile = ?, parent_name = ?, parent_mobile = ?, address = ?, 10th_marks = ?, 12th_marks = ? where roll_no = ?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(9,student.getRoll_no());
			ps.setString(1,student.getName());
			ps.setString(2,student.getMail_id());
			ps.setString(3,student.getMobile());
			ps.setString(4,student.getParent_name());
			ps.setString(5,student.getParent_mobile());
			ps.setString(6,student.getAddress());
			ps.setInt(7, student.getXth_mark());
			ps.setInt(8, student.getXiith_mark());
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
	
	public ResultSet display()
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "Select * from student";
		ResultSet rs = null;
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			rs = ps.executeQuery();
			
		} catch (SQLException e) {
			e.printStackTrace();
			rs = null;
		}
		return rs;
	}
	
	public int delete(String roll)
	{
		loadDriver(dbdriver);
		Connection con = getConnection();
		int result = 1;
		String sql = "delete from student where roll_no=?";
		try {
			PreparedStatement ps=con.prepareStatement(sql);
			ps.setString(1,roll);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			result = 0;
		}
		return result;
	}
}
