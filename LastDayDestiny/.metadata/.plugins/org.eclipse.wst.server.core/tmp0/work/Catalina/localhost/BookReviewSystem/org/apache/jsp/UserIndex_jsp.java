/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.67
 * Generated at: 2016-09-20 10:17:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import model.*;

public final class UserIndex_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("\r\n");
ResultSet resultset =null;
      out.write('\r');
      out.write('\n');
ResultSet resultset1 =null;
      out.write('\r');
      out.write('\n');
ResultSet resultset2 =null;
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("\r\n");
      out.write("\t<head>\r\n");
      out.write("\t\t<meta content=\"text/html; charset=utf-8\" http-equiv=\"Content-Type\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<title>Book Review System </title>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/960_24_col.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/fonts.css\" charset=\"utf-8\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/prettyPhoto.css\" />\r\n");
      out.write("\t\t<link href=\"css/jquery-ui-1.9.1.date-picker.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<link href=\"css/validationEngine.jquery.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\" />\r\n");
      out.write("\t\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/forms.css\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery-1.8.3.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\tvar relTag = \"login\";\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t\t<style>\r\n");
      out.write("\t\tspan.msg{\r\n");
      out.write("\t\tcolor:red;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t</style>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<script type=\"text/javascript\">\r\n");
      out.write("                    \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\r\n");
      out.write("\t<body>\r\n");
      out.write("\t\t<!-- HEADER START -->\r\n");
      out.write("\t\t<div class=\"header\">\r\n");
      out.write("\t\t\t<div class=\"dark-nav\">\r\n");
      out.write("\t\t\t\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav-alt\">\r\n");
      out.write("\t\t\t\t\t\t\t");
  int id=(Integer)session.getAttribute("userid");
								String username;
						
								
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t");
	
							try{  
								
				  
								Connection con=Connect.getConnection();
								Statement stmt=Connect.getStatement();
								ResultSet rs=stmt.executeQuery("select * from user where userid='"+id+"'");  
				  
								while(rs.next())
								{
									username =rs.getString(2);
									
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\tWelcome:");
 out.println(username); 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</b>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t");

								
								}
				
				  		
				  
					}catch(Exception e){ System.out.println(e);}  
				  
			
 						
      out.write("\t\t\r\n");
      out.write(" \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_12\">\r\n");
      out.write("\t\t\t\t\t\t<ul class=\"nav-alt\">\r\n");
      out.write("\t\t\t\t\t\t\t<form action=\"#\" class=\"float-right\" method=\"post\">\r\n");
      out.write("\t\t\t\t   \t\t\t\t<table cellpadding=\"0\" cellspacing=\"0\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t\t<li><a href=\"logout.jsp\"><B>User Logout</B></a></li>\r\n");
      out.write("\t\t\t\t\t\t\t     \t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_4\">\r\n");
      out.write("\t\t\t\t\t<img alt=\"logo\" src=\"images/bookreview.png\" class=\"img-logo\" />\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"grid_20\">\r\n");
      out.write("\t\t\t\t\t<h1 class=\"title\">Book Review System</h1>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<div class=\"nav-main-container\">\r\n");
      out.write("\t\t\t\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_24\">\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- HEADER END -->\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t<!-- CONTENTS START -->\r\n");
      out.write("\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t<div class=\"grid_24\">\r\n");
      out.write("\t\t\t\t<div class=\"contents\">\r\n");
      out.write("\t\t\t\t\t<div class=\"padding_20\">\r\n");
      out.write("\t\t\t\t\t\t<h2> All Book</h2>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid_6 alpha\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"padding_20\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"accordion nav-sidebar\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Book</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"UserIndex.jsp\">All Books &nbsp;[<b><span class=\"msg\"></span></b>]</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"searchbook.jsp\">Search </a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<h3>Account</h3>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"userprofile.jsp\">User Profile</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<li><a href=\"userchangepassword.jsp\">Change Password</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"grid_18 omega\">\r\n");
      out.write("\t\t\t\t\t\t \r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"padding_20 text-justify\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form id=\"frmMain\" action=\"#\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<table class=\"form-table\" style=\"width:auto\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<table border='0' width='100%' class='table11'>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Book Name</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Author</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Pages</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Publication</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Edition</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Genre</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Review</th>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t ");

    									try{
    										int bookid=0;
    										Connection con=Connect.getConnection();
    										Statement stmt=Connect.getStatement();
    										ResultSet rs=stmt.executeQuery("select * from booktable");  
    						  
    										while(rs.next())
    										{
												
       										
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t   \t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(2) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(7));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getInt(3));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(4));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print(	rs.getInt(5) );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td>");
      out.print( rs.getString(6));
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t");
 
														bookid= rs.getInt(1);
														
														
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td><a href='givereview.jsp?bookid=+");
      out.print( bookid );
      out.write("+'>Review</a></td>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t           \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t            \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t");

       										 
       										
    											}
        													catch(Exception e)
        												{
             												out.println("wrong entry"+e);
        												}
										
											
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</table>\r\n");
      out.write("\t\t\t\t\t\t\t\t</form>\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"clear\"> </div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- CONTENTS END -->\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<!-- FOOTER START -->\r\n");
      out.write("\t\t<div class=\"dark-nav footer\">\r\n");
      out.write("\t\t\t<div class=\"container_24\">\r\n");
      out.write("\t\t\t\t<div class=\"grid_8\">\r\n");
      out.write("\t\t\t\t\t<ul class=\"nav-alt\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t <li><a href=\"help.html\">Help</a></li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_8\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-center\">Copyright &copy; All Rights Reserved</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"grid_8\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"text-right\">Designed &amp; Developed by Dipak</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t<!-- FOOTER START -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</body>\r\n");
      out.write("\t\t<script src=\"js/jquery-ui-1.9.2.custom.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.validationEngine.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script src=\"js/jquery.validationEngine-en.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.bxslider.min.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("\t\t<script type=\"text/javascript\" src=\"js/custom.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
