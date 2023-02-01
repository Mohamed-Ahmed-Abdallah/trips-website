package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class reservation_005fform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                background-image: url(\"img/3.jpg\");\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section id=\"top\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <div class=\"top\">\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\n");
      out.write("                                <li class=\"dropdown\">\n");
      out.write("                                    <a href=\"login.jsp\" style=\"background-color: blue; color: white\">Sign Out</a>                                    \n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\t\n");
      out.write("\n");
      out.write("        <section id=\"header\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-sm-12\">\n");
      out.write("                        <nav class=\"navbar navbar-default\" role=\"navigation\">\n");
      out.write("\n");
      out.write("                            <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("                            <div class=\"navbar-header\">\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-brand-centered\">\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                    <span class=\"icon-bar\"></span>\n");
      out.write("                                </button>\n");
      out.write("                                <a class=\"navbar-brand\" href=\"index.jsp\">Travel<span>with me in Egypt</span></a>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!-- Collect the nav links, forms, and other content for toggling -->\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"navbar-brand-centered\">\n");
      out.write("                                <ul class=\"nav navbar-nav\">\n");
      out.write("                                    <li><a class=\"text_2\" href=\"index.jsp\">Home</a></li>\n");
      out.write("                                    <li><a class=\"text_2\" href=\"details.jsp\">Details</a></li>\n");
      out.write("                                    <li><a class=\"text_2\" href=\"user_reservations.jsp\">User Reservations</a></li>\n");
      out.write("                                    <li><a class=\"text_2\" href=\"contact.jsp\">Contact</a></li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div><!-- /.navbar-collapse -->\n");
      out.write("                        </nav>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("        <div style=\"margin-top:10px; margin-bottom:0px ; height: 26px; background-color: red\"></div>\n");
      out.write("\n");
      out.write("        <div class=\"div\" style=\"padding-bottom: 32px;\">\n");
      out.write("            <section id=\"trip_main\" style=\"margin-top: 0px; margin-left: 20%;\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6 trip_main_1\">\n");
      out.write("                            <div class=\"tab-content clearfix\">\n");
      out.write("                                <form action=\"reservation\">\n");
      out.write("                                    <div class=\"col-sm-12 more_2\">  \n");
      out.write("                                        <div>\n");
      out.write("                                            <h3 style=\"margin-left: 135px; margin-bottom: 20px; color: black\">Reservation form</h3>\n");
      out.write("                                            <p style=\"color: black; font-size: 20px\">Email</p>\n");
      out.write("                                            <input type=\"email\" size=\"40\" placeholder=\"Email\" name=\"email\" required=\"required\" style=\"border: 2px solid black\">\n");
      out.write("                                            <p style=\"margin-top: 10px; color: black; font-size: 20px\">Phone number</p>\n");
      out.write("                                            <input type=\"number\" placeholder=\"phone\" name=\"phone\" min=\"0\" required=\"required\" style=\"border: 2px solid black\">\n");
      out.write("                                            <p style=\"margin-top: 10px; color: black; font-size: 20px\">Credit card number</p>\n");
      out.write("                                            <input type=\"number\" placeholder=\"credit card\" name=\"credit\" min=\"0\" required=\"required\" style=\"border: 2px solid black\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-sm-12 search_1\">\n");
      out.write("                                        <div class=\"col-sm-12 search_inner\"><button class=\"button\" style=\"background-color: red; color: white\">Submit</button></div>\n");
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
