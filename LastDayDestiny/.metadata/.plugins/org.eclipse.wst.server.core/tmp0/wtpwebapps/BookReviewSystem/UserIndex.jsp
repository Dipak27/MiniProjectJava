<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.sql.*" %>

<%@ page import="model.*" %>
<%ResultSet resultset =null;%>
<%ResultSet resultset1 =null;%>
<%ResultSet resultset2 =null;%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
		
		<title>Book Review System </title>
		
		<link rel="stylesheet" type="text/css" href="css/960_24_col.css" />
		<link rel="stylesheet" type="text/css" href="css/fonts.css" charset="utf-8" />
		<link rel="stylesheet" type="text/css" href="css/prettyPhoto.css" />
		<link href="css/jquery-ui-1.9.1.date-picker.css" rel="stylesheet" type="text/css" />
		<link href="css/validationEngine.jquery.css" rel="stylesheet" type="text/css" />
		<link rel="stylesheet" type="text/css" href="css/style.css" />
		<link rel="stylesheet" type="text/css" href="css/forms.css" />
		
		<script type="text/javascript" src="js/jquery-1.8.3.min.js"></script>
		<script type="text/javascript">
			var relTag = "login";
		</script>
		<style>
		span.msg{
		color:red;
		}
		</style>
		
		<script type="text/javascript">
                    
			
		</script>
	</head>

	<body>
		<!-- HEADER START -->
		<div class="header">
			<div class="dark-nav">
				<div class="container_24">
					<div class="grid_12">
						<ul class="nav-alt">
							<%  int id=(Integer)session.getAttribute("userid");
								String username;
						
								%>
							<%	
							try{  
								
				  
								Connection con=Connect.getConnection();
								Statement stmt=Connect.getStatement();
								ResultSet rs=stmt.executeQuery("select * from user where userid='"+id+"'");  
				  
								while(rs.next())
								{
									username =rs.getString(2);
									%>
									<b>
											Welcome:<% out.println(username); %>
									</b>
									<%
								
								}
				
				  		
				  
					}catch(Exception e){ System.out.println(e);}  
				  
			
 						%>		
 							
							
						</ul>
					</div>
					<div class="grid_12">
						<ul class="nav-alt">
							<form action="#" class="float-right" method="post">
				   				<table cellpadding="0" cellspacing="0">
									<tr>
										<td>
							     			<li><a href="logout.jsp"><B>User Logout</B></a></li>
							     		</td>
							
									</tr>
								</table>
				</form>
				</ul>
						
					</div>
					<div class="clear"></div>
				</div>
			</div>
			<div class="container_24">
				<div class="grid_4">
					<img alt="logo" src="images/bookreview.png" class="img-logo" />
				</div>
				<div class="grid_20">
					<h1 class="title">Book Review System</h1>
				</div>
				<div class="clear"></div>
			</div>
		
			<div class="nav-main-container">
				<div class="container_24">
					<div class="grid_24">
						
					</div>
					<div class="clear"></div>
				</div>
			</div>
		</div>
		<!-- HEADER END -->
	
	
		<!-- CONTENTS START -->
	<div class="container_24">
			<div class="grid_24">
				<div class="contents">
					<div class="padding_20">
						<h2> All Book</h2>
					</div>
						<div class="grid_6 alpha">
							<div class="padding_20">
								<div class="accordion nav-sidebar">
									<h3>Book</h3>
										<div>
												
										
											<ul>
												<li><a href="UserIndex.jsp">All Books &nbsp;[<b><span class="msg"></span></b>]</a></li>
												<li><a href="searchbook.jsp">Search </a></li>
												
												
											</ul>
										</div>
									
								
									<h3>Account</h3>
										<div>
											<ul>
												<li><a href="userprofile.jsp">User Profile</a></li>
												<li><a href="userchangepassword.jsp">Change Password</a></li>
												
											</ul>
										</div>
									
									
								</div>
							</div>
						</div>	
			
						<div class="grid_18 omega">
						 
							<div class="padding_20 text-justify">
								<form id="frmMain" action="#" method="post">
									<table class="form-table" style="width:auto">
									
										
										<table border='0' width='100%' class='table11'>
										<tr>
											<th>Book Name</th>
											<th>Author</th>
											<th>Pages</th>
											<th>Publication</th>
											<th>Edition</th>
											<th>Genre</th>
											<th>Review</th>
										</tr>
								
										 <%
    									try{
    										int bookid=0;
    										Connection con=Connect.getConnection();
    										Statement stmt=Connect.getStatement();
    										ResultSet rs=stmt.executeQuery("select * from booktable");  
    						  
    										while(rs.next())
    										{
												
       										
											%>
											   	
													<tr>
														
														<td><%= rs.getString(2) %></td>
														<td><%= rs.getString(7)%></td>
														<td><%= rs.getInt(3)%></td>
														<td><%= rs.getString(4)%></td>
														<td><%=	rs.getInt(5) %></td>
														<td><%= rs.getString(6)%></td>
														
														<% 
														bookid= rs.getInt(1);
														
														%>
														<td><a href='givereview.jsp?bookid=+<%= bookid %>+'>Review</a></td>
													</tr>
														    	
												           
												            
											<% } %>
										</table>
									
											<%
       										 
       										
    											}
        													catch(Exception e)
        												{
             												out.println("wrong entry"+e);
        												}
										
											%>
									
									</table>
								</form>		
								
							</div>
						</div>
					
					<div class="clear"></div>
				</div>
			</div>
		</div>
		<div class="clear"> </div>
		

		<!-- CONTENTS END -->
	
		
		
		
		
		<!-- FOOTER START -->
		<div class="dark-nav footer">
			<div class="container_24">
				<div class="grid_8">
					<ul class="nav-alt">
							<li><a href="index.jsp">Home</a></li>
							
							 <li><a href="help.html">Help</a></li>
					</ul>
				</div>
					<div class="grid_8">
						<div class="text-center">Copyright &copy; All Rights Reserved</div>
					</div>
					<div class="grid_8">
						<div class="text-right">Designed &amp; Developed by Dipak</div>
					</div>
					<div class="clear"></div>
			</div>
		</div>
	<!-- FOOTER START -->


	</body>
		<script src="js/jquery-ui-1.9.2.custom.min.js" type="text/javascript"></script>
		<script src="js/jquery.validationEngine.js" type="text/javascript"></script>
		<script src="js/jquery.validationEngine-en.js" type="text/javascript"></script>
		<script type="text/javascript" src="js/jquery.bxslider.min.js"></script>
		<script type="text/javascript" src="js/jquery.prettyPhoto.js"></script>
		<script type="text/javascript" src="js/custom.js"></script>

</html>
