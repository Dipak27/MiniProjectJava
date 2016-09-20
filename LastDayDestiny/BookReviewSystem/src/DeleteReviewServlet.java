

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Review;

/**
 * Servlet implementation class DeleteReviewServlet
 */
@WebServlet("/DeleteReviewServlet")
public class DeleteReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteReviewServlet() {
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
		
		
		  
        
		HttpSession session=request.getSession(false);  
        //(String) session.getAttribute("reviewid");
		
		String review= request.getParameter("review");
		
		int a=(int) session.getAttribute("reviewid");
		String option= request.getParameter("selectoption");
		
		out.println(a);
		out.println(option);
		
		if(option.equals("yes"))
		{
			if(Review.DeleteReview(a))
			{
				 RequestDispatcher rd=request.getRequestDispatcher("/UserIndex.jsp");  
				out.println("<script type='text/javascript'>alert('Review Deleted Successfully')</script>");
			       rd.include(request, response);
				
			}
			else
			{
				 RequestDispatcher rd=request.getRequestDispatcher("/UserIndex.jsp");  
					out.println("<script type='text/javascript'>alert('Fail to delete review. Sorry')</script>");
			       rd.include(request, response);
				
			}
			
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("/UserIndex.jsp"); 
			out.println("<script type='text/javascript'>alert('Your review is not deleted.')</script>");

			
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
