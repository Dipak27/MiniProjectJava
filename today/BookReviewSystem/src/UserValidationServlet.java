

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;

/**
 * Servlet implementation class UserValidationServlet
 */
@WebServlet("/UserValidationServlet")
public class UserValidationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserValidationServlet() {
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
		User u=new User();
		int i=0;
		i=u.verifyUser(email, password);
		
		if(i!=0)
		{
						       
			 	HttpSession session=request.getSession();  
		        session.setAttribute("userid",i);  
				RequestDispatcher rd=request.getRequestDispatcher("/UserIndex.jsp");  
		       rd.include(request, response);
				//response.sendRedirect("userlogin.jsp");
		}
		else
		{
			 	RequestDispatcher rd=request.getRequestDispatcher("/userlogin.jsp");  
				out.println("<script type='text/javascript'>alert('Incorrect EmailId/Password. Please try again.')</script>");
		       rd.include(request, response); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
	}

}
