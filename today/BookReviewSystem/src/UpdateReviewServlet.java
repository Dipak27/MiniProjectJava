

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
 * Servlet implementation class UpdateReviewServlet
 */
@WebServlet("/UpdateReviewServlet")
public class UpdateReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateReviewServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		
		
		  
        
		HttpSession session=request.getSession(false);  
        //(String) session.getAttribute("reviewid");
		
		String review= request.getParameter("review");
		
		int a=(int) session.getAttribute("reviewid");
		
		if(Review.UpdateReview(a, review))
		{
			 RequestDispatcher rd=request.getRequestDispatcher("/UserIndex.jsp");  
				out.println("<script type='text/javascript'>alert('Review updated Successfully')</script>");
		       rd.include(request, response);
			
		}
		else
		{
			 RequestDispatcher rd=request.getRequestDispatcher("/UserIndex.jsp");  
				out.println("<script type='text/javascript'>alert('Fail to update review. Sorry')</script>");
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
