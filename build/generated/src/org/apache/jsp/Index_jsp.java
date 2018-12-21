package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.sql.Date;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>AlibaBús S.L.</title>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/css.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/AjaxJava.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"container\">\n");
      out.write("        <header class=\"navbar navbar-default navbar-fixed-top\" style=\"opacity: 0.95;\">\n");
      out.write("            <div class=\"container-fluid\">\n");
      out.write("                <div class=\"navbar-header\">\n");
      out.write("                    <a href=\"Index.jsp\"><img src=\"css/icono.png\" alt=\"Alibabus\" width=\"55px\" height=\"55px\" class=\"img-responsive\" style=\"margin-left: 40px; margin-right: 40px\"></a>\n");
      out.write("                </div>\n");
      out.write("                <ul class=\"nav navbar-nav\">\n");
      out.write("                    <li class=\"activa\"><a href=\"Index.jsp\">Inicio</a></li>\n");
      out.write("                    <li><a href=\"#\">Page 1</a></li>\n");
      out.write("                    <li><a href=\"#\">Page 2</a></li>\n");
      out.write("                    <li><a href=\"#\">Page 3</a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <section class=\"row\">\n");
      out.write("            <div class=\"col-xs-1\"></div>\n");
      out.write("            <div class=\"col-xs-5 contenedor center-block\">\n");
      out.write("                <form method=\"post\" action=\"servletOrigenDestino\">\n");
      out.write("                    <select name=\"origen\" required=\"required\" class=\"inputs\" onfocus=\"muestraorigen()\" onchange=\"muestradestino(this.value)\" id=\"origen\">\n");
      out.write("                        <option value=\"-1\">Origen:</option>\n");
      out.write("                    </select> \n");
      out.write("                    <select name=\"destino\" required=\"required\" class=\"inputs\" id=\"destino\">\n");
      out.write("                        <option value=\"-1\">Destino:</option>\n");
      out.write("                    </select> \n");
      out.write("                    ");
Date sysdate = new Date(Calendar.getInstance().getTime().getTime());
      out.write("\n");
      out.write("                    <input type=\"date\" name=\"fecha\" min=\"");
 out.print(sysdate);
      out.write("\" class=\"inputs\" required=\"required\" placeholder=\"Fecha del Billete:\">\n");
      out.write("                    <input type=\"number\" name=\"plazas\" min=\"1\"  class=\"inputs\" required=\"required\" placeholder=\"Cantidad de Plazas:\"/>\n");
      out.write("                    <input type=\"submit\" name=\"enviar\" value=\"Ver Viajes\" class=\"botones \" style=\"width: 400px\"/>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <footer class=\"navbar navbar-default navbar-fixed-bottom\" style=\"opacity: 0.95;\">\n");
      out.write("            <div class=\"h4\" style=\"margin: 2%;\">\n");
      out.write("                <strong>Desarrollo de Aplicaciones en Entorno Servidor.</strong>\n");
      out.write("                <p>&copy;2017-2018</p>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
