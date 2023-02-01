package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import database.MyDB;
import java.sql.*;

public final class user_005freservations_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Book My Trip</title>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Reem+Kufi&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Kaushan+Script&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/font-awesome.min.css\" />\r\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <section id=\"top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <div class=\"top\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                <li class=\"dropdown\">\r\n");
      out.write("                                    <a href=\"login.jsp\" style=\"background-color: blue; color: white\">Sign Out</a>                                    \r\n");
      out.write("                                </li>\r\n");
      out.write("                            </ul>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\t\r\n");
      out.write("\r\n");
      out.write("        <section id=\"header\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("\r\n");
      out.write("                            <!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("                            <div class=\"navbar-header\">\r\n");
      out.write("                                <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#navbar-brand-centered\">\r\n");
      out.write("                                    <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                    <span class=\"icon-bar\"></span>\r\n");
      out.write("                                </button>\r\n");
      out.write("                                <a class=\"navbar-brand\" href=\"index.jsp\">Travel<span>with me in Egypt</span></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("                            <div class=\"collapse navbar-collapse\" id=\"navbar-brand-centered\">\r\n");
      out.write("                                <ul class=\"nav navbar-nav\">\r\n");
      out.write("                                    <li><a class=\"text_2\" href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                                    <li><a class=\"text_2 active_1\" href=\"user_reservations.jsp\">User Reservations</a></li>\r\n");
      out.write("                                    <li><a class=\"text_2\" href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div><!-- /.navbar-collapse -->\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\t\r\n");
      out.write("\r\n");
      out.write("        ");

            MyDB db = new MyDB();
            Connection con = db.getCon();
            ResultSet RS = null;
            Statement stmt = con.createStatement();

            int flag = 0;

            RS = stmt.executeQuery("select * from reservation where email = " + session.getAttribute("Customer_ID") + ";");
            
            String trip_name = "";
            String email = "";
            int reservation_id = 0;
            int price = 0;
            
            while (RS.next()) {
                price = RS.getInt("price");
            }
        
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div style=\"margin-top:10px; margin-bottom:0px ; height: 26px; background-color: red\"></div>\r\n");
      out.write("\r\n");
      out.write("        <section id=\"fare\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12 box\">\r\n");
      out.write("                        <div class=\"col-sm-2 box_1\">\r\n");
      out.write("                            <p>Reservation ID</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2 box_1\">\r\n");
      out.write("                            <p>Trip</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2 box_1\">\r\n");
      out.write("                            <p>Price</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2 box_1\">\r\n");
      out.write("                            <p>Email</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2 \">\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-12 box_2\">\r\n");
      out.write("                        ");
while (RS.next()){
      out.write("\r\n");
      out.write("                        <div class=\"col-sm-2 box_2_inner_1\">\r\n");
      out.write("                            <h3>");
      out.print(RS.getInt("reservation_id"));
      out.write("</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2 box_2_inner_1\">\r\n");
      out.write("                            <h3>");
      out.print(RS.getString("trip_name"));
      out.write("</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2 box_2_inner_1\">\r\n");
      out.write("                            <h4>");
      out.print(RS.getInt("price"));
      out.write("</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2 box_2_inner_1\">\r\n");
      out.write("                            <h4>");
      out.print(RS.getString("email"));
      out.write("</h4>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2 box_2_inner_3\">\r\n");
      out.write("                            <p><a href=\"delete_reservation.jsp\">Delete</a></p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        ");
}
      out.write("\r\n");
      out.write("                    </div>    \r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section id=\"footer_text\"  class=\"border_bottom_3 border_top_3\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <div class=\"footer_3 clearfix\">\r\n");
      out.write("                            <div class=\"col-sm-3\">\r\n");
      out.write("                                <div class=\"footer_3_inner_2\">\r\n");
      out.write("                                    <p>Follow Us :</p>\r\n");
      out.write("                                    <p><a href=\"#\"><i class=\"fa fa-facebook\"></i></a>\r\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-twitter\"></i></a>\r\n");
      out.write("                                        <a href=\"#\"> <i class=\"fa fa-youtube\"></i></a>\r\n");
      out.write("                                        <a href=\"#\"><i class=\"fa fa-linkedin\"></i></a>\r\n");
      out.write("                                    </p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section id=\"footer_bottom\" style=\"background-color: red; color: white;\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <div class=\"footer_4\">\r\n");
      out.write("                            <p  class=\"text-center p2\">© 2021 Travel with me in Egypt. All Rights Reserved </p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
