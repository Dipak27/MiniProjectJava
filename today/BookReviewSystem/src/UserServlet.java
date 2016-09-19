

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		String username=request.getParameter("name");
		String useremail=request.getParameter("email");
		String userpassword=request.getParameter("password");
		String userquestion=request.getParameter("selectsecquestion");
		String useranswer=request.getParameter("answer");
		User u=new User();
		try 
		{
			if(u.registerUser(username, useremail, userpassword, userquestion, useranswer))
			{
							       
			       RequestDispatcher rd=request.getRequestDispatcher("/userlogin.jsp");  
					out.println("<script type='text/javascript'>alert('Registration Successful. Please do login.')</script>");
			       rd.include(request, response);
					//response.sendRedirect("userlogin.jsp");
			}
			else
			{
				 	RequestDispatcher rd=request.getRequestDispatcher("/registration.jsp");  
					out.println("<script type='text/javascript'>alert('Registration fail')</script>");
			       rd.include(request, response); 
			}
			
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
