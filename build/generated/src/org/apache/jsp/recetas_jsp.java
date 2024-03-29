package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class recetas_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Anacardo-recetas</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/master.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(\"img/anacardo3.jpg\");\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.html", out, false);
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"panel panel-info\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h3>Recetas</h3>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-body colorear\">\n");
      out.write("                    <div><img src=\"img/receta1.jpg\" alt=\"\"/></div>\n");
      out.write("                    \n");
      out.write("                    <div>\n");
      out.write("                        <h4>Muffins light de coco y casta&ntilde;as de caj&uacute;</h4><br>\n");
      out.write("                        <h5>Ingredientes</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li>1 taza de coco rallado</li>\n");
      out.write("                            <li>1 taza de harina integral de avena</li>\n");
      out.write("                            <li>1 cda chica de polvo de hornear</li>\n");
      out.write("                            <li>6 sobres edulcorante</li>\n");
      out.write("                            <li>2 huevos</li>\n");
      out.write("                            <li>1/2 taza leche</li>\n");
      out.write("                            <li>Casta&ntilde;as de caj&uacute; a gusto</li>\n");
      out.write("                            <li>Esencia de vainilla</li>\n");
      out.write("                        </ul>\n");
      out.write("                        <h5>Pasos</h5>\n");
      out.write("                        <ol>\n");
      out.write("                            <li>Mezclar todos los ingredientes secos m&aacute;s las 2 yemas (separar las claras) y batir</li>\n");
      out.write("                            <li>Batir las dos claras a nieve con la esencia de vainilla</li>\n");
      out.write("                            <li>Unificar todo con movimientos envolventes</li>\n");
      out.write("                            <li>Agregar las casta&ntilde;as de caj&uacute;</li>\n");
      out.write("                            <li>Llevar a horno precalentado por 30 minutos aproximadamente</li>\n");
      out.write("                        </ol>\n");
      out.write("                    </div>\n");
      out.write("                    <div></div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
