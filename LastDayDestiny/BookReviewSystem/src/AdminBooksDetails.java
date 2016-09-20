

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BookDb;

/**
 * Servlet implementation class AdminBooksDetails
 */
@WebServlet("/AddBooksDetails")
public class AdminBooksDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminBooksDetails() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter o = response.getWriter();
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		int no_of_pages = Integer.parseInt(request.getParameter("pages"));
		int price = Integer.parseInt(request.getParameter("Price"));
		String publication_house = request.getParameter("publication");
		String edition = request.getParameter("edition");
		String genre = request.getParameter("genre");
		try {
			boolean a = BookDb.addBookDetail(title, author, publication_house, edition, genre, no_of_pages);
			if(a){
				o.println("<script type='text/javascript'>alert('Book Added')</script>");
				RequestDispatcher r = request.getRequestDispatcher("AdminIndex.jsp");
				r.include(request, response);
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
