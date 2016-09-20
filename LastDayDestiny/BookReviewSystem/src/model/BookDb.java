package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDb {
	static String title;
	static String author;
	static int no_of_pages;
	static int price;
	static String publication_house;
	static String edition;
	static String genre;
	static Connection cc;
	static Connection con=Connect.getConnection();
	static Statement stmt=Connect.getStatement();
	static ResultSet rs=null;
	int userid=0;
	
	public static boolean addBookDetail(String Title,String AuthorName,String Publications,String Edition,String Genre,int No_of_Pages) throws ClassNotFoundException, SQLException {
	
		title = Title;
		author = AuthorName;
		no_of_pages = No_of_Pages;
		//price = Price;
		publication_house = Publications;
		edition = Edition;
		genre = Genre;
		
		PreparedStatement p = con.prepareStatement("insert into booktable (title,author,no_of_pages,publication_house,edition,genre) values(?,?,?,?,?,?)");
		p.setString(1, Title);
		p.setString(2, AuthorName);
		p.setInt(3, No_of_Pages);
		p.setString(4, Publications);
		p.setString(5, Edition);
		p.setString(6, Genre);
		int i = p.executeUpdate();
		p.close();
		if(i>0){
			return true;
		}else
			return false;
	
	}
	/* This function will add book detail
	 * return String on succession
	 * 
	 */
	public static boolean removeBook(String Title,String Edition) throws ClassNotFoundException, SQLException {
		
		title = Title;
		edition = Edition;
		
		PreparedStatement p = con.prepareStatement("delete from booktable where title = ? and edition = ?");
		p.setString(1, title);
		p.setString(2, edition);
		int i = p.executeUpdate();
		p.close();
		if(i>0){
			return true;
		}else
			return false;
	}
	/* This function will return a string 
	 * when Data removed
	 * input parameter are title and edition
	 */
	public static boolean updateBookEdition(String Title,String NewEdition) throws SQLException, ClassNotFoundException {
		title = Title;
		edition = NewEdition;
		
		PreparedStatement p = con.prepareStatement("UPDATE booktable SET edition = ? WHERE title = ?");
		p.setString(1, NewEdition);
		p.setString(2, title);
		int i = p.executeUpdate();
		p.close();
		if(i>0){
			return true;
		}else
			return false;
	}
	/* This function will update the edition of the book
	 * Will take title as input and new edition as input parameter
	 * and return A string as output
	 */
	public static boolean updateBookPrice(String Title,int NewPrice) throws SQLException, ClassNotFoundException {
		
		title = Title;
		price = NewPrice;
		PreparedStatement p = con.prepareStatement("UPDATE booktable SET price = ? WHERE title = ?");
		p.setInt(1, NewPrice);
		p.setString(2, title);
		int i = p.executeUpdate();
		p.close();
		if(i>0){
			return true;
		}else
			return false;
	}
	/* This function will update the Priice of the book
	 * Will take title as input and new price  as input parameter
	 * and return A string as output
	 */
	public static ResultSet searchbyTitle(String Title) throws ClassNotFoundException, SQLException {
		
		title = Title;
		
		 PreparedStatement st = con.prepareStatement("select * from booktable where title=?");
         st.setString(1, Title);
         ResultSet rs = st.executeQuery();
         return rs;
	}
	/* This function will search about the book
	 * Will take title as input  parameter
	 * and return an array of resultset 
	 */
	public static ResultSet searchbyAuthor(String Author) throws ClassNotFoundException, SQLException {
		author = Author;
		
		 PreparedStatement st = con.prepareStatement("select * from booktable where author=?");
        st.setString(1, Author);
        ResultSet rs = st.executeQuery();
        return rs;
	}
	/* This function will search about the book
	 * Will take author as input  parameter
	 * and return an array of resultset 
	 */
	public static int getBookId(String Title) throws ClassNotFoundException, SQLException {
		title = Title;
		
		 PreparedStatement st = con.prepareStatement("select * from booktable where title=?");
        st.setString(1,title);
        ResultSet rs = st.executeQuery();
        return rs.getInt(1);
	}
	/* This function will search about the book
	 * Will take author as input  parameter
	 * and return an array of resultset 
	 */
}
