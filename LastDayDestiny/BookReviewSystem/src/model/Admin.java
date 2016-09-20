package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Admin {
	
	static String adminemail;
	static String adminpass;
	static Connection con=Connect.getConnection();
	static Statement stmt=Connect.getStatement();
	static ResultSet rs=null;
	static int userid=0;
	
	public static boolean verifyAdmin(String email,String password)
	{
		
		System.out.println(password);
		boolean status=false;  
		try
		{
			PreparedStatement p = con.prepareStatement("select * from admintable where aemail=? and apass=?");
			p.setString(1,email);  
			p.setString(2,password);
			ResultSet rs=p.executeQuery();  
			status=rs.next();  
			System.out.println(status);
			return status;
			
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
		
	}
	public static String getAdminName(String email) {
		
	
		try {
			String name ="";
			PreparedStatement p = con.prepareStatement("select * from admintable where aemail=?");
			p.setString(1,email);
			ResultSet rs=p.executeQuery();
			if(rs.next())
			name= rs.getString(2);
			return name;
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return " ";  
		
	}
}
