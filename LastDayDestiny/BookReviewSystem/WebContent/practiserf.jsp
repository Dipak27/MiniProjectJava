<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ page import="java.sql.*" %>
<%ResultSet resultset =null;%>
<%ResultSet resultset1 =null;%>
<%ResultSet resultset2 =null;%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">

	<head>
		<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
		
		<title>Citizen Redressal System </title>
		
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
                    
			function showUser(str)
			{
				if (str=="null")
				{
					document.getElementById("zone").innerHTML="";
					return;
				} 
				if (window.XMLHttpRequest)
				{// code for IE7+, Firefox, Chrome, Opera, Safari
					 xmlhttp=new XMLHttpRequest();
				 }
				 else
				{// code for IE6, IE5
					xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
				 }
				 xmlhttp.onreadystatechange=function()
				{
					 if (xmlhttp.readyState==4 && xmlhttp.status==200)
					 {
						document.getElementById("zone").innerHTML=xmlhttp.responseText;
						
					}
				 }
				 
					 xmlhttp.open("GET","gethospitallist.jsp?q="+str,true);
					 xmlhttp.send();
			}
		</script>
	</head>

	<body>
		<!-- HEADER START -->
		<div class="header">
			<div class="dark-nav">
				<div class="container_24">
					<div class="grid_12">
						<ul class="nav-alt">
							
							
						</ul>
					</div>
					<div class="grid_12">
						<ul class="nav-alt">
							<form action="#" class="float-right" method="post">
				   
								<table cellpadding="0" cellspacing="0">
									<tr>
										<td>
							     			<li><a href="logout.jsp"><B>Corporator Logout</B></a></li>
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
					<img alt="logo" src="images/logo.png" class="img-logo" />
				</div>
				<div class="grid_20">
					<h1 class="title">Citizen Redressal System</h1>
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
						<h2> Complaints</h2>
					</div>
						<div class="grid_6 alpha">
							<div class="padding_20">
								<div class="accordion nav-sidebar">
									<h3>Messages</h3>
										<div>
												
										
											<ul>
												<li><a href="corporatorindex.jsp">Complaint &nbsp;[<b><span class="msg"></span></b>]</a></li>
												<li><a href="viewapplication.jsp">Application</a></li>
												<li><a href="viewsuggestion.jsp">Suggestion</a></li>
											</ul>
										</div>
									
								
									<h3>Account</h3>
										<div>
											<ul>
												<li><a href="corporatorprofile.jsp">Corporator Profile</a></li>
												<li><a href="corporatorchangepassword.jsp">Change Password</a></li>
												
											</ul>
										</div>
									<h3>Alert Messages</h3>
										<div>
											<ul>
												<li><a href="notice.jsp">Notice</a></li>
												
																					
										</ul>
										</div>
									
								</div>
							</div>
						</div>	
			
						<div class="grid_18 omega">
						 
							<div class="padding_20 text-justify">
								<div class="tabs-container">
									<ul class="tabs">
										<li><a href="#tabs-1">Reply To Complaint</a></li>
							
						
										<li><a href="#tabs-2">View Complaint</a></li>
										<li><a href="#tabs-3">View Feedback</a></li>
										

									</ul>
								<div class="clear">
								</div>
						<div class="tabs-contents">
							<div id="tabs-1">
								<form id="frmMain" action="#" method="post">
									<table class="form-table" style="width:auto">
									
										
										<table border='0' width='100%' class='table11'>
										<tr>
												<th>Complaint Id</th>
											<th>Date</th>
											<th>Complaint Type</th>
											<th>Description</th>
											<th>Complaintant UID</th>
											<th>Complaint Status</th>
											<th>Replay</th>
										</tr>
								
										</table>
												
												
										
														
														
														
														
														

									</table>
								</form>
						</div>
							
						<div id="tabs-2" style="overflow:auto;max-height:450px">
							
							<form id="frmMain2"  class="frmMain" action="#" method="post">
							
									
									<table class="form-table" style="width:auto">
									
										
										<table border='0' width='100%' class='table11'>
										<tr>
												<th>Complaint Id</th>
											<th>Date</th>
											<th>Complaint Type</th>
											<th>Description</th>
											<th>Complaintant UID</th>
											<th>Complaint Status</th>
											
										</tr>
									
										</table>
												
												
														
														
														
														

									</table>
								
						
							</form>
						</div>

						<div id="tabs-3">
							<form id="frmMain4" class="frmMain" action="#" method="post">
								<table class="form-table" style="width:auto">
									
										
										<table border='0' width='100%' class='table11'>
										<tr>
												<th>Complaint Id</th>
												<th>Complaintant UID</th>
												<th>Feedback Date</th>
												<th>Satisfaction Status</th>
												<th>Description</th>
											
												
											
											
										</tr>
									 
										</table>
												
												
												
													
														
														

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
	
		<!-- SLIDER START -->
		<div class="slider-container">
			<div class="container_24">
				<div class="grid_1">
					<span id="slider-left" class="slider-left"></span>
				</div>
				<div class="grid_22">
					<ul class="slider">
					<li><a rel="prettyPhoto[slider]" href="dummy/s1.jpg" title="Bibi Ka Makhbara"><img src="dummy/s1.jpg" /></a></li>
					<li><a rel="prettyPhoto[slider]" href="dummy/s2.jpg" title="BAMU University"><img src="dummy/s2.jpg" /></a></li>
					<li><a rel="prettyPhoto[slider]" href="dummy/s3.jpg" title="Kranti Chowk"><img src="dummy/s3.jpg" /></a></li>
					<li><a rel="prettyPhoto[slider]" href="dummy/s4.jpg" title="Aurangabad Caves"><img src="dummy/s4.jpg" /></a></li>
					<li><a rel="prettyPhoto[slider]" href="dummy/s5.jpg" title="Ellora Caves"><img src="dummy/s5.jpg" /></a></li>
					<!--<li><a rel="prettyPhoto[slider]" href="dummy/s6.jpg"><img src="dummy/s6.jpg" /></a></li>-->
					<li><a rel="prettyPhoto[slider]" href="dummy/s7.jpg" title="Maismal View Point"><img src="dummy/s7.jpg" /></a></li>
					<!--<li><a rel="prettyPhoto[slider]" href="dummy/s8.jpg"><img src="dummy/s8.jpg" /></a></li>
					<li><a rel="prettyPhoto[slider]" href="dummy/s9.jpg"><img src="dummy/s9.jpg" /></a></li>-->
					<li><a rel="prettyPhoto[slider]" href="dummy/s10.jpg" title="Paan Chakki"><img src="dummy/s10.jpg" /></a></li>
				</ul>
				</div>
				<div class="grid_1">
					<span id="slider-right" class="slider-right"></span>
				</div>
			</div>
		</div>
		<!-- SLIDER START -->
		
		
		
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
