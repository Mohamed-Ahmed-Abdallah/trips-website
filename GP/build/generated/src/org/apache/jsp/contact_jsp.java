package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class contact_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");
      out.write("        <section id=\"top\" style=\"padding-left: 10%\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <div class=\"top\">\r\n");
      out.write("                            <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("                                <li class=\"dropdown\">\r\n");
      out.write("                                    <a href=\"login.jsp\" style=\"background-color: blue; color: white\">Sign out</a>                                    \r\n");
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
      out.write("                                    <li><a class=\"text_2\" href=\"trips.jsp\">Trips</a></li>\r\n");
      out.write("                                    <li><a class=\"text_2  active_1\" href=\"details.jsp\">Details</a></li>\r\n");
      out.write("                                    <li><a class=\"text_2\" href=\"user_reservations.jsp\">User Reservations</a></li>\r\n");
      out.write("                                    <li><a class=\"text_2\" href=\"contact.jsp\">Contact</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div><!-- /.navbar-collapse -->\r\n");
      out.write("\r\n");
      out.write("                        </nav>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\t\r\n");
      out.write("\r\n");
      out.write("        <section id=\"contact_us\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-sm-12\">\r\n");
      out.write("                        <div class=\"con_top clearfix\">\r\n");
      out.write("                            <iframe src=\"https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d114964.53925916665!2d-80.29949920266738!3d25.782390733064336!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x88d9b0a20ec8c111%3A0xff96f271ddad4f65!2sMiami%2C+FL%2C+USA!5e0!3m2!1sen!2sin!4v1530774403788\" style=\"width:100%; height:400px; border:0\" allowfullscreen=\"\">\r\n");
      out.write("                            </iframe>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-12 aniview\" data-av-animation=\"slideInDown\">\r\n");
      out.write("                        <div class=\"contact_us_top text-center\">\r\n");
      out.write("                            <h2> Follow Us</h2>\r\n");
      out.write("                            <div class=\"col-md-12 contact_icon\">\r\n");
      out.write("                                <ul class=\"social-network social-circle\">\r\n");
      out.write("                                    <li><a href=\"#\" class=\"icoRss\" title=\"Rss\"><i class=\"fa fa-instagram\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\" class=\"icoFacebook\" title=\"Facebook\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\" class=\"icoTwitter\" title=\"Twitter\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\" class=\"icoGoogle\" title=\"Google +\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("\r\n");
      out.write("                                </ul>\t\t\t\t\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-12 aniview\" data-av-animation=\"slideInLeft\">\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <div class=\"contact_us_1 text-center\">\r\n");
      out.write("                                <p><a href=\"#\"><i class=\"fa fa-phone\"></i></a></p>\r\n");
      out.write("                                <h4>Contact Us Here</h4>\r\n");
      out.write("                                <h5>Here you can reach us</h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <div class=\"contact_us_1 text-center\">\r\n");
      out.write("                                <p><a href=\"#\"><i class=\"fa fa-map-marker\"></i></a></p>\r\n");
      out.write("                                <h4>Find Us On Map</h4>\r\n");
      out.write("                                <h5> we are here</h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <div class=\"contact_us_1 text-center\">\r\n");
      out.write("                                <p><a href=\"#\"><i class=\"fa fa-envelope\"></i></a></p>\r\n");
      out.write("                                <h4>Subscribe Here</h4>\r\n");
      out.write("                                <h5> you can subscribe us</h5>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-sm-12 form_main aniview\" data-av-animation=\"slideInRight\">\r\n");
      out.write("                        <div class=\"col-sm-6\"> <input class=\"form-control\" placeholder=\"Name\" type=\" text\"></div>\r\n");
      out.write("                        <div class=\"col-sm-6\"> <input class=\"form-control\" placeholder=\"Email\" type=\" text\"></div>\r\n");
      out.write("                        <div class=\"col-sm-6\"> <input class=\"form-control\" placeholder=\"Phone\" type=\" text\"></div>\r\n");
      out.write("                        <div class=\"col-sm-6\"> <input class=\"form-control\" placeholder=\"City\" type=\" text\"></div>\r\n");
      out.write("                        <div class=\"col-sm-12\">\r\n");
      out.write("                            <textarea class=\"form-control text_1\" placeholder=\"Message\"></textarea>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-12\">\r\n");
      out.write("                            <a href=\"#\">Send Message</a>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section id=\"footer_bottom\">\r\n");
      out.write("            <div style=\"margin: 0px; height: 26px; background-color: red\">\r\n");
      out.write("                <p style=\"color: white; text-align: center\">Â© 2021 Travel with me in Egypt. All Rights Reserved</p>\r\n");
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
