import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import stud.Student;

import java.io.IOException;

public class insert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
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
		int result = sdao.insert(student);
		if (result==1) {
			response.sendRedirect(request.getContextPath() + "/successful.jsp");
		}
		else if (result==0) {
			response.sendRedirect(request.getContextPath() + "/unsuccessful.jsp");
		}
	}
}

