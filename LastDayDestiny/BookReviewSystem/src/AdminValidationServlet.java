

import java.io.IOException;
import java.io.PrintWriter;
import  model.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class AdminValidationServlet
 */
@WebServlet("/AdminValidationServlet")
public class AdminValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminValidationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println("email:"+email+"paass"+password);
		String Name = Admin.getAdminName(email);	
		
		if(Admin.verifyAdmin(email, password))
		{
						       
			 	HttpSession session=request.getSession();  
		        session.setAttribute("AdminName",Name);  
				RequestDispatcher rd=request.getRequestDispatcher("AdminIndex.jsp");  
		       rd.include(request, response);
		
		}
		else
		{
			 	RequestDispatcher rd=request.getRequestDispatcher("adminlogin.jsp");  
				out.println("<script type='text/javascript'>alert('Incorrect EmailId/Password. Please try again.')</script>");
		       rd.include(request, response); 
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
