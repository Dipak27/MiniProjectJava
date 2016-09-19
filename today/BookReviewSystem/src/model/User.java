package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class User 
{
	String username;
	String useremail;
	String userpassword;
	String userquestion;
	String useranswer;
	Connection con=Connect.getConnection();
	Statement stmt=Connect.getStatement();
	ResultSet rs=null;
	int userid=0;
	
	
	public boolean registerUser(String username, String useremail, String userpassword,
			String userquestion, String useranswer) throws SQLException 
	{
		int i=0;
		this.username = username;
		this.useremail = useremail;
		this.userpassword = userpassword;
		this.userquestion = userquestion;
		this.useranswer = useranswer;
		
		if(con!=null && stmt!=null)
		{
			i=stmt.executeUpdate("insert into user(username,useremailid,userpassword,usersecurityquestion,usersecurityanswer)values('"+username+"','"+useremail+"','"+userpassword+"','"+userquestion+"','"+useranswer+"') ");
			if(i!=0)
			{
				 return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
			
		}
		
		
		
	}
	
	public int verifyUser(String email,String password)
	{
		this.useremail = email;
		this.userpassword = password;
		
		try
		{
			rs= stmt.executeQuery("select * from user where useremailid='"+useremail+"' and userpassword='"+userpassword+"'");
			while(rs.next())
			{
				userid= rs.getInt(1);
				
			}
			if(userid!=0)
			{
				return userid;
			}
			else
			{
				return 0;
			}
		} 
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
		
	}


}
