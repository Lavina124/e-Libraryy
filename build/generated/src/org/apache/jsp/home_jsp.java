package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\" />\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\" />\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link\r\n");
      out.write("      rel=\"stylesheet\"\r\n");
      out.write("      href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css\"\r\n");
      out.write("      integrity=\"sha384-zCbKRCUGaJDkqS1kPbPd7TveP5iyJE0EjAuZQTgFLD2ylzuqKfdKlfG/eSrtxUkn\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    />\r\n");
      out.write("   \r\n");
      out.write("    <script\r\n");
      out.write("      src=\"https://kit.fontawesome.com/a022230fba.js\"\r\n");
      out.write("      crossorigin=\"anonymous\"\r\n");
      out.write("    ></script>\r\n");
      out.write("    <title>E-Library Management</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        body {\r\n");
      out.write("            font-family: Arial, sans-serif;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-color: #f2f2f2;\r\n");
      out.write("            background-image: url(index.jpg);\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("        }\r\n");
      out.write("      \r\n");
      out.write("        nav {\r\n");
      out.write("            background-color: #333;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            padding: 10px;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("      \r\n");
      out.write("        nav h1 {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("        }\r\n");
      out.write("      \r\n");
      out.write("        #mymenu {\r\n");
      out.write("            background-color: #053d1a86;\r\n");
      out.write("    color: #201b1b;\r\n");
      out.write("    width: 403px;\r\n");
      out.write("    height: 201px;\r\n");
      out.write("    margin: 100px auto;\r\n");
      out.write("    padding: 10px;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    font-style: italic;\r\n");
      out.write("    font-size: larger;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #mymenu ul li {\r\n");
      out.write("            display: inline-block; /* Display list items side by side */\r\n");
      out.write("            margin: 20px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #mymenu ul li a.admin-button img, #mymenu ul li a.student-button img {\r\n");
      out.write("            width: 100px;\r\n");
      out.write("            height: 100px;\r\n");
      out.write("            object-fit: cover;\r\n");
      out.write("            border-radius: 4px;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        #mymenu ul li a span {\r\n");
      out.write("            display: block; /* Each name on a new line */\r\n");
      out.write("            margin-top: 5px; /* Add some space between the image and the name */\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <nav>\r\n");
      out.write("        <h1><center>E-Library Management</center></h1>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div id=\"mymenu\">\r\n");
      out.write("        <ul>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"adlog.jsp\" class=\"admin-button\">\r\n");
      out.write("                    <img src=\"admin.jpg\" alt=\"Admin Image\">\r\n");
      out.write("                    <span>Admin</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("            <li>\r\n");
      out.write("                <a href=\"slogin.jsp\" class=\"student-button\">\r\n");
      out.write("                    <img src=\"student.png\" alt=\"Student Image\">\r\n");
      out.write("                    <span>Student</span>\r\n");
      out.write("                </a>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("</body>\r\n");
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
