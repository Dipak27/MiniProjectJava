

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
 * Servlet implementation class ReviewServlet
 */
@WebServlet("/ReviewServlet")
public class ReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReviewServlet() {
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
		String review=request.getParameter("addreview");
		
		 HttpSession session=request.getSession(false);  
	        String bid=(String)session.getAttribute("bookid");
	        
	        int userid=(Integer)session.getAttribute("userid");
	        
	        if(Review.addReview(bid, userid, review))
	        {
	        	 RequestDispatcher rd=request.getRequestDispatcher("/UserIndex.jsp");  
					out.println("<script type='text/javascript'>alert('Review Submitted Successfully')</script>");
			       rd.include(request, response);
	        	
	        }
	        else
	        {
	        	RequestDispatcher rd=request.getRequestDispatcher("/givereview.jsp");  
				out.println("<script type='text/javascript'>alert('Fail to submit review. Sorry')</script>");
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
