package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class view_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>view Data info</title>\r\n");
      out.write("\r\n");
      out.write("    <style>\r\n");
      out.write("        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@400;500&display=swap');\r\n");
      out.write("* {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    box-sizing: border-box;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    color: black;\r\n");
      out.write("    border-radius: 2px solid black;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("font-family: Arial, sans-serif;\r\n");
      out.write("margin: 0;\r\n");
      out.write("padding: 0;\r\n");
      out.write("background-color: #f2f2f2;\r\n");
      out.write("background-image: url(index.jpg);\r\n");
      out.write("background-repeat: no-repeat;\r\n");
      out.write("background-size: cover;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav {\r\n");
      out.write("background-color: #333;\r\n");
      out.write("color: #fff;\r\n");
      out.write("padding: 10px;\r\n");
      out.write("margin: 0;\r\n");
      out.write("text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("nav h2 {\r\n");
      out.write("margin: 0;\r\n");
      out.write("color :white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("width: 80%; \r\n");
      out.write("    margin: 55px auto;\r\n");
      out.write("}\r\n");
      out.write(".rectangle {\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("    background-color: #325b33;\r\n");
      out.write("    border: 2px solid #ccc;\r\n");
      out.write("    padding: 20px;\r\n");
      out.write("    border-radius: 28px;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write(".button {\r\n");
      out.write("    padding: 10px 20px;\r\n");
      out.write("    background-color: #0f2d11;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 5px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    text-decoration: none;\r\n");
      out.write("}\r\n");
      out.write(".button:hover {\r\n");
      out.write("    background-color: #4fdc62;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("table{\r\n");
      out.write("background-color: rgba(0, 0, 0, 0.397);\r\n");
      out.write("color: rgb(29, 22, 22);\r\n");
      out.write("width: 30%;\r\n");
      out.write("height: auto;\r\n");
      out.write("margin: 2% auto;\r\n");
      out.write("text-align: left;\r\n");
      out.write("justify-content: center;\r\n");
      out.write("}\r\n");
      out.write("tr{\r\n");
      out.write("border: 1px solid black;\r\n");
      out.write("padding: 8px;\r\n");
      out.write("color: white;\r\n");
      out.write("font-family: bold;\r\n");
      out.write("}\r\n");
      out.write("td{\r\n");
      out.write("    border: 2px solid black;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("        th {\r\n");
      out.write("            background-color: #266532;\r\n");
      out.write("        }\r\n");
      out.write("        h1{\r\n");
      out.write("            color: white;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        .B\r\n");
      out.write("{\r\n");
      out.write("  padding: 12px;\r\n");
      out.write("  background: linear-gradient(#35523a, #2e703a);\r\n");
      out.write("  font-size: 13px;\r\n");
      out.write("  font-weight: bold;\r\n");
      out.write("  color: black;\r\n");
      out.write("  border-style: outside;\r\n");
      out.write("  border-color: black black black black;\r\n");
      out.write("  border-radius: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".B:hover\r\n");
      out.write("{\r\n");
      out.write("padding :12px;\r\n");
      out.write("background:linear-gradient(#35523a, #2e703a);\r\n");
      out.write("color:black;\r\n");
      out.write("font-size:15px;\r\n");
      out.write("font-weight:bold;\r\n");
      out.write("border-radius:10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        \r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <h2>E-Library Management</h2>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"rectangle\">\r\n");
      out.write("        <a href=\"booksrh.jsp\" class=\"button\">Book search</a>\r\n");
      out.write("        <a href=\"view.jsp\" class=\"button\">View Data info</a>\r\n");
      out.write("        <a href=\"return.jsp\" class=\"button\">Return book</a>\r\n");
      out.write("        <a href=\"place.jsp\" class=\"button\">Place order</a>\r\n");
      out.write("        <a href=\"logout.jsp\" class=\"button\">Logout      </a>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("    \r\n");
      out.write("      \r\n");
      out.write("            \r\n");
      out.write("                 <h1><center>VIEW BOOKS INFORMATION </center></h1>\r\n");
      out.write("\r\n");
      out.write("            <div id=\"data\">\r\n");
      out.write("                ");

                try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lib","root","123456789");
			Statement st = con.createStatement();
			
			String q = "select* from books";
			ResultSet re = st.executeQuery(q);
                        
      out.write("\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t<table cellpadding='12px'>\r\n");
      out.write("                            <th>Book_id</th>\r\n");
      out.write("\t\t\t<th>title</th>\r\n");
      out.write("\t\t\t<th>author</th>\r\n");
      out.write("\t\t\t<th>Cost</th>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t");

			while(re.next())
			{
                            
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(re.getString(1));
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(re.getString(2));
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(re.getString(3));
      out.write("</td>\r\n");
      out.write("                                <td>");
      out.print(re.getString(4));
      out.write("</td>\r\n");
      out.write("                               \r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("                                ");

			}
      out.write("\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("                        \r\n");
      out.write("                        ");

			con.close();
		}
		catch(Exception e)
		{
			out.println(e);
                        }

      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\t\r\n");
      out.write("            \r\n");
      out.write("\r\n");
      out.write("        </body>\r\n");
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
