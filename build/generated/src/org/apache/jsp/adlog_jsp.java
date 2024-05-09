package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adlog_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>AdminLogin</title>\r\n");
      out.write("    \r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write("  body {\r\n");
      out.write("    font-family: Arial, sans-serif;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    padding: 0;\r\n");
      out.write("    background-color: #f2f2f2;\r\n");
      out.write("    background-image: url(index.jpeg);\r\n");
      out.write("    background-repeat: no-repeat;\r\n");
      out.write("background-size: cover;\r\n");
      out.write("  }\r\n");
      out.write("  nav {\r\n");
      out.write("    background-color: #333;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    margin: 0;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  nav h1 {\r\n");
      out.write("    margin: 0;\r\n");
      out.write("  }\r\n");
      out.write("\r\n");
      out.write("  .container {\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    top: 50%;\r\n");
      out.write("    left: 50%;\r\n");
      out.write("    transform: translate(-50%, -50%);\r\n");
      out.write("    width: 333px;\r\n");
      out.write("    padding: 59px;\r\n");
      out.write("    background-color: #2f5834;\r\n");
      out.write("    border: 1px solid #2d2929;\r\n");
      out.write("    border-radius: 6px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .container h2 {\r\n");
      out.write("    margin-top: 0;\r\n");
      out.write("    margin-bottom: 20px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .container label {\r\n");
      out.write("    display: block;\r\n");
      out.write("    margin-bottom: 5px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .container input[type=\"text\"],\r\n");
      out.write("  .container input[type=\"password\"] {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    margin-bottom: 10px;\r\n");
      out.write("    border: 1px solid #ccc;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .container input[type=\"submit\"] {\r\n");
      out.write("    width: 80%;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    background-color: #4CAF50;\r\n");
      out.write("    color: #fff;\r\n");
      out.write("    border: none;\r\n");
      out.write("    border-radius: 4px;\r\n");
      out.write("    cursor: pointer;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("  }\r\n");
      out.write("  \r\n");
      out.write("  .container input[type=\"submit\"]:hover {\r\n");
      out.write("    background-color: #45a049;\r\n");
      out.write("  }\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav><h1>E-Library Management</h1></nav>\r\n");
      out.write("  \r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("   <form action=\"adlog1.jsp\" method=\"post\">\r\n");
      out.write("          <label for=\"username\">Username:</label>\r\n");
      out.write("          <input type=\"text\" id=\"username\" name=\"username\">\r\n");
      out.write("          <br>\r\n");
      out.write("          <label for=\"password\">Password:</label>\r\n");
      out.write("          <input type=\"password\" id=\"password\" name=\"password\">\r\n");
      out.write("          <br>\r\n");
      out.write("          <input type=\"submit\" value=\"Login\">\r\n");
      out.write("        </form>\r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("</body>\r\n");
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
