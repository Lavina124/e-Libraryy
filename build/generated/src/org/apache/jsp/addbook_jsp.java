package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addbook_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("             <form action=\"addbook1.jsp\" method=\"post\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"rectangle\">\r\n");
      out.write("                        <a href=\"addbook.jsp\" class=\"button\">Add Book</a>\r\n");
      out.write("                        <a href=\"search.jsp\" class=\"button\">Search Book</a>\r\n");
      out.write("                        <a href=\"bookor.jsp\" class=\"button\">View Order</a>\r\n");
      out.write("                        <a href=\"bookup.jsp\" class=\"button\">Update Book</a>\r\n");
      out.write("                        <a href=\"#\" class=\"button\">Sign Out</a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div id=\"data\">\r\n");
      out.write("                    <center>\r\n");
      out.write("                    \r\n");
      out.write("                    <table cellpadding=\"12px\">\r\n");
      out.write("                    <h1> <b> <u>Add Books</u> </b> </h1>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td> Book ID </td>\r\n");
      out.write("                    <td> <input type=\"text\" name=\"u1\" placeholder=\"Book ID\"> </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td> Title </td>\r\n");
      out.write("                    <td> <input type=\"text\" name=\"u2\" placeholder=\"Title\"> </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td> Author</td>\r\n");
      out.write("                    <td> <input type=\"text\" name=\"u3\" placeholder=\"Enter Name\"> </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td> cost</td>\r\n");
      out.write("                    <td> <input type=\"text\" name=\"u4\" placeholder=\"enter price\"> </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <td> Quantity </td>\r\n");
      out.write("                    <td> <input type=\"text\" name=\"u5\" placeholder=\"Enter quantity\"> </td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    <tr>\r\n");
      out.write("                    <th colspan=\"2\"> <input type=\"submit\" value=\"Add\" class=\"B\"> </th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    \r\n");
      out.write("                    </table>\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                    </center>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    \r\n");
      out.write("                    </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
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
