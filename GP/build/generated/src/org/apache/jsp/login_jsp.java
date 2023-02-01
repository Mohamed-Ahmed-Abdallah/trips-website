package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Book My Trip</title>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Reem+Kufi&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\" />\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .div{\n");
      out.write("                background-image: url(\"img/2.jpg\");\n");
      out.write("            }\n");
      out.write("            .button {\n");
      out.write("                background-color: red;\n");
      out.write("                border: none;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px;\n");
      out.write("                text-align: center;\n");
      out.write("                display: inline-block;\n");
      out.write("                font-size: 16px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <section id=\"top\" style=\"padding-left: 10%\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div class=\"top\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"signup.jsp\" style=\"background-color: blue; color: white\">Sign Up</a>                                    \n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <section id=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\n");
      out.write("                            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                            <div class=\"navbar-header\" style=\"padding-top: 0px\">\n");
      out.write("                                <a class=\"navbar-brand\" href=\"login.jsp\">Travel<span>with me in Egypt</span></a>\n");
      out.write("                                <a class=\"navbar-brand\"><span style=\"color: #FF9900; font-size: 25px;margin-left: 300px\">We welcome you in Egypt</span></a>\n");
      out.write("                            </div>\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <div style=\"margin-top:0px; margin-bottom:0px ; height: 23px; background-color: red\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"div\" style=\"padding-bottom: 100px;\">\n");
      out.write("            <section id=\"trip_main\" style=\"margin-top: 0px; margin-left: 20%;\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 trip_main_1\">\n");
      out.write("                            <div class=\"tab-content clearfix\">\n");
      out.write("                                <form action=\"validate\">\n");
      out.write("                                    <div class=\"col-sm-12 more_2\">  \n");
      out.write("                                        <div>\n");
      out.write("                                            <h3 style=\"margin-left: 40%; margin-bottom: 20px; color: black\">Login</h3>\n");
      out.write("                                            <p style=\"color: black; font-size: 20px\">Email</p>\n");
      out.write("                                            <input type=\"email\" size=\"40\" placeholder=\"Email\" name=\"email\" required=\"required\" style=\"border: 2px solid black\">\n");
      out.write("                                            <p style=\"margin-top: 10px; color: black; font-size: 20px\">Password</p>\n");
      out.write("                                            <input type=\"password\" size=\"40\" placeholder=\"Password\" name=\"password\" required=\"required\" style=\"border: 2px solid black\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-12 search_1\">\n");
      out.write("                                        <div class=\"col-sm-12 search_inner\"><button class=\"button\" style=\"background-color: red; color: white\">Login</button></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>            \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <div style=\"margin: 0px; height: 26px; background-color: red\">\n");
      out.write("            <p style=\"color: white; text-align: center\">Â© 2021 Travel with me in Egypt. All Rights Reserved</p>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
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
