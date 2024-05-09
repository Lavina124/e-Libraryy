package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class bookup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    \r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\" integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"   href=\"mycss.css\" >\r\n");
      out.write("    <!-- Font Awesome -->\r\n");
      out.write("    <script src=\"https://kit.fontawesome.com/a022230fba.js\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <title>E-Library Management</title>\r\n");
      out.write("  </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <body>\r\n");
      out.write("            <nav>\r\n");
      out.write("                <h1><center>E-Library Management</center></h1></nav>\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"rectangle\">\r\n");
      out.write("                        <a href=\"addbook.jsp\" class=\"button\">Add Book</a>\r\n");
      out.write("                        <a href=\"search.jsp\" class=\"button\">Search Book</a>\r\n");
      out.write("                        <a href=\"bookor.jsp\" class=\"button\">view Order</a>\r\n");
      out.write("                        <a href=\"bookup.jsp\" class=\"button\">Update Book</a>\r\n");
      out.write("                        <a href=\"#\" class=\"button\">Sign Out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"data\">\r\n");
      out.write("                    <center>\r\n");
      out.write("                        <table cellpadding='20px'>\r\n");
      out.write("                            <form action=\"update.jsp\">\r\n");
      out.write("                                <caption style='font-weight:bold;font-size:30px'>Book Update</b></caption>\r\n");
      out.write("                                <tr><td>Book ID</td>\r\n");
      out.write("                                    <td><input type='text' placeholder='Enter Book Id' name='u2'></td>\r\n");
      out.write("                                    <td><input type='submit' value='Search' name=\"b1\" class=\"B\"></td>\r\n");
      out.write("                                </tr>\r\n");
      out.write("                                </table>\r\n");
      out.write("                        </form>\r\n");
      out.write("                            ");
                    String b=request.getParameter("b1");
                        if(b!=null)
                        {
                            String s2=request.getParameter("u2");
             try
	  {
		  Class.forName("com.mysql.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
		  Statement st=con.createStatement();
		  String q="select * from books where book_id='"+s2+"'";
		  ResultSet rs=st.executeQuery(q);
		  if(rs.next())
	          {
                      
      out.write("<form action=\"bookup.jsp\">\r\n");
      out.write("                      <table cellpadding=\"12px\">\r\n");
      out.write("                          <input type=\"hidden\" name=\"n2\" value=");
      out.print(rs.getString(1));
      out.write(">\r\n");
      out.write("                          <tr>\r\n");
      out.write("                              <td>title</td>\r\n");
      out.write("                              <td><input type=\"text\" name=\"n1\" value=");
      out.print(rs.getString(2));
      out.write("></td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                              <td>Author</td>\r\n");
      out.write("                              <td><input type=\"text\" name=\"n3\" value=");
      out.print(rs.getString(3));
      out.write("></td>                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                              <td>Cost</td>\r\n");
      out.write("                              <td><input type=\"text\" name=\"n4\" value=");
      out.print(rs.getString(4));
      out.write("></td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                              <td>Quantity</td>\r\n");
      out.write("                              <td><input type=\"text\" name=\"n5\" value=");
      out.print(rs.getString(5));
      out.write("></td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                  <th colspan=\"2\"><input type=\"submit\" value=\"update\" name=\"b2\" class=\"B\"></th>\r\n");
      out.write("                                  </tr>\r\n");
      out.write("                              </table>\r\n");
      out.write("                              </form>\r\n");
      out.write("                         ");
}	  
                   else
	            out.print("invalid id");
                   con.close();
	  }
	  catch(Exception e)
	  {
		  out.print(e);
	  }
          }
          
      out.write("\r\n");
      out.write("          ");
String b2=request.getParameter("b2");
          if(b2!=null)
          {
              String n1=request.getParameter("n1");
               String n2=request.getParameter("n2");
                String n3=request.getParameter("n3");
                 String n4=request.getParameter("n4");
                  String n5=request.getParameter("n5");
            try
                   {
	          Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
             Statement st=con.createStatement();
                  String q="update books set title='"+n1+"' , author='"+n3+"' ,cost='"+n4+"',Quantity='"+n5+"' where book_id='"+n2+"'";
                  st.executeUpdate(q);
                 response.sendRedirect("search.jsp");
                  con.close();
          }
                                
         catch(Exception e1)
         {
             out.println(e1);
         }
}
      out.write("\r\n");
      out.write("                        </center>\r\n");
      out.write("                </div>\r\n");
      out.write("        </body>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
