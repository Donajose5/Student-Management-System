

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import stud.Student;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class search extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String rollormob = request.getParameter("rollormob");
		List<Student> students = new ArrayList<Student>();
		Student student = new Student();
		String roll = null, name = null, mail = null, mobile = null, pname = null, pmob = null, address = null;
		int xth = 0, xiith = 0;
		
		studentdao sdao = new studentdao();
		ResultSet rs = sdao.search(rollormob);
		
		try {
			while(rs.next()) {
				roll = rs.getString("roll_no");
				name = rs.getString("name");
				mail = rs.getString("mail_id");
				mobile = rs.getString("mobile");
				pname = rs.getString("parent_name");
				pmob = rs.getString("parent_mobile");
				address = rs.getString("address");
				xth = rs.getInt("10th_marks");
				xiith = rs.getInt("12th_marks");
				student = new Student(roll, name, mail, mobile, pname, pmob, address, xth, xiith);
				students.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(students.isEmpty()) {
			response.sendRedirect(request.getContextPath() + "/recordnotfound.jsp");
		}
		else {
			request.setAttribute("rollormob", rollormob);
			request.setAttribute("students", students);
			request.getRequestDispatcher("search2.jsp").forward(request, response);
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
