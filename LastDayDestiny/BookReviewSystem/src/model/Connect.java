package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Connect 
{
	static Connection con=null;
	static Statement stmt=null;
	
	
	public static Connection getConnection()
	{
		try
		{  
			
			Class.forName("com.mysql.jdbc.Driver");  
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bookreviewsystem","root","root");  
	 		
			if(con!=null)
			{
				return con;
			}
			
			con.close();  
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
		return null;  
	  
	}
	
	public static Statement getStatement()
	{
		try
		{  
			stmt=con.createStatement();  
				if(stmt!=null)
			{
				return stmt;
			}
			
			
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}
		return null;  
	  
	}
	
	
	

}
