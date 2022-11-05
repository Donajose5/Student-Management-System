import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class login extends HttpServlet {
	private static final long serialVersionUID = 998;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
		String admin_user = request.getParameter("admin");
		String pass = request.getParameter("pass");
		
		if (admin_user.equals("admin001") && pass.equals("pass"))
		{
			studentdao sdao = new studentdao();
			sdao.create_table();
			response.sendRedirect(request.getContextPath() + "/dashboard.jsp");
		}
		else {
			response.sendRedirect(request.getContextPath() + "/admininvalid.jsp");			
		}
	}
}
