

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

public class update extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String roll = request.getParameter("roll");
		studentdao sdao = new studentdao();
		ResultSet rs = sdao.search_for_update(roll);

		String name = null, mail = null, mobile = null, pname = null, pmob = null, address = null;
		int xth = 0, xiith = 0;
		try {
			if(!rs.isBeforeFirst()) {
				response.sendRedirect(request.getContextPath() + "/recordnotfound.jsp");
				return ;
			}
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			while(rs.next()) {
				name = rs.getString("name");
				mail = rs.getString("mail_id");
				mobile = rs.getString("mobile");
				pname = rs.getString("parent_name");
				pmob = rs.getString("parent_mobile");
				address = rs.getString("address");
				xth = rs.getInt("10th_marks");
				xiith = rs.getInt("12th_marks");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		Student student = new Student(roll, name, mail, mobile, pname, pmob, address, xth, xiith);
		request.setAttribute("student", student);
		RequestDispatcher rd = request.getRequestDispatcher("update2.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String roll = request.getParameter("roll");
		String name = request.getParameter("name");
		String mail = request.getParameter("mail");
		String mobile = request.getParameter("mobile");
		String pname = request.getParameter("pname");
		String pmob = request.getParameter("pmob");
		String address = request.getParameter("address");
		int xth = Integer.parseInt(request.getParameter("xth"));
		int xiith = Integer.parseInt(request.getParameter("xiith"));
		Student student = new Student(roll, name, mail, mobile, pname, pmob, address, xth, xiith);
		studentdao sdao = new studentdao();
		int result = sdao.update(student);
		if (result==1) {
			response.sendRedirect(request.getContextPath() + "/successful.jsp");
		}
		else if (result==0) {
			response.sendRedirect(request.getContextPath() + "/unsuccessful.jsp");
		}
	}
}
