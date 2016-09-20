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
								//int bid=Integer.parseInt(request.getParameter("bookid"));
								String bid=request.getParameter("bookid");
								session.setAttribute("userid",id);
								session.setAttribute("bookid",bid);  
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
						<h2> Review</h2>
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
								<div class="tabs-container">
									<ul class="tabs">
										<li><a href="#tabs-1">All Review</a></li>
										<li><a href="#tabs-2">Give Review</a></li>
										<li><a href="#tabs-3">History</a></li>
										
									</ul>
								<div class="clear">
								</div>
						<div class="tabs-contents">
							<div id="tabs-1">
								<form id="frmMain" action="#" method="post">
									<table class="form-table" style="width:auto">
									<%
									 
    									try{
    											
    										Connection con=Connect.getConnection();
    										Statement stmt=Connect.getStatement();
    										
											resultset1 =stmt.executeQuery("select user.username,booktable.title,reviewtable.reviews from user,booktable,reviewtable where user.userid=reviewtable.userid and booktable.bookid=reviewtable.bookid ");


											%>
										
										<table border='0' width='100%' class='table11'>
										<tr>
											<th>Book Name</th>
											<th>User Name</th>
											<th>Review</th>
										</tr>
											
											<%
												while(resultset1.next())
												{%>
												
												<tr>
														
														<td><%= resultset1.getString(2) %></td>
														<td><%= resultset1.getString(1)%></td>
														<td><%= resultset1.getString(3)%></td>
														
												</tr>
												
												<%
													
												}
											%>
											
										
								
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
							
						<div id="tabs-2" style="overflow:auto;max-height:450px">
							
							<form id="frmMain2"  class="frmMain" action="ReviewServlet" method="post">
							
										<table class="form-table" style="width:auto">
									
										
										<table border='0' width='100%' class='table11'>
										
										 <%
    									try{
    									
    										Connection con=Connect.getConnection();
    										Statement stmt=Connect.getStatement();
    										ResultSet rs=stmt.executeQuery("select * from booktable where bookid='"+bid+"'");  
    						  
    										while(rs.next())
    										{
												
       										
											%>
											   	
													<tr>
														
														<td>Book Name </td>
														
														<td><%= rs.getString(2) %></td>
														
														
														
													</tr>
													<tr>
														<td>
														Author
														</td>
														<td><%= rs.getString(7)%></td>
														
													</tr>
													<tr>
														<td>
														Publication
														</td>
														
														<td><%= rs.getString(4)%></td>
														
													</tr>
													<tr>
														<td>
														Edition
														</td>
														
														<td><%= rs.getString(5)%></td>
														
													</tr>
													<tr>
														<td>
														
														Your Review
														</td>
														<td>
																<textarea id="addreview"  class="validate[required]  class="validate[maxSize[200]]" style="width:99%" cols="10" rows="3"  name="addreview" placeholder="Maximum 200 Characters" value="" ></textarea>
											
															</td>
													</tr>
													<tr>
											<th>
												&nbsp;
											</th>
											<td>
												<input id="Submit1" type="submit" value="Sumbit"  />
												<input id="Reset1" type="reset" value="Reset" onclick="this.form.clear();" />
											</td>
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

						<div id="tabs-3">
						<form id="frmMain4" class="frmMain" action="#" method="post">
									<table class="form-table" style="width:auto">
									<%
									 int reviewid;
    									try{
    											
    										Connection con=Connect.getConnection();
    										Statement stmt=Connect.getStatement();
    										
											resultset1 =stmt.executeQuery("select reviewtable.reviewid,reviewtable.reviews,booktable.title from booktable,reviewtable where reviewtable.userid='"+id+"' and booktable.bookid=reviewtable.bookid ");


											%>
										
										<table border='0' width='100%' class='table11'>
										<tr>
											<th>Review Id</th>
											<th>Book Name</th>
											<th>Review</th>
											<th>Modify</th>
											<th>Delete</th>
											
											
										</tr>
											
											<%
												while(resultset1.next())
												{%>
												
												<tr>
														<td><%= resultset1.getInt(1) %></td>
														<td><%= resultset1.getString(3) %></td>
														<td><%= resultset1.getString(2)%></td>
														
														<% 
														reviewid= resultset1.getInt(1);
														
														%>
														<td><a href='modifyreview.jsp?reviewid=+<%= reviewid %>+'>Modify</a></td>
														<td><a href='deletereview.jsp?reviewid=+<%= reviewid %>+'>Delete</a></td>
														
												</tr>
												
												<%
												
													
												}
											%>
											
										
								
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
		</div>
								
								
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
