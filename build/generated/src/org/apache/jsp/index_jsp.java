package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Anacardo</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/master.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"icon\" href=\"http://whimsical.heartette.net/_files/material/favicons/favicon_deer1a.gif\" type=\"image/gif\">  \n");
      out.write("        <script src=\"js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/master.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function (){\n");
      out.write("               mostrarIndicadores(); \n");
      out.write("            });\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"colorearlo\">\n");
      out.write("       \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.html", out, false);
      out.write("\n");
      out.write("        <div class=\"panel panel-info\">\n");
      out.write("            <div class=\"panel-heading\">\n");
      out.write("                <h2 class=\"cen\">Casta&ntilde;a de Caj&uacute;</h2>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-body colorear\">\n");
      out.write("                <div class=\"div1\"><img style=\"width: 80%;\" src=\"img/anacardo2.jpg\" alt=\"\"/></div>\n");
      out.write("                <div class=\"div2\">\n");
      out.write("                    ¿Has probado alguna vez las casta&ntilde;as de caj&uacute;? <br>\n");
      out.write("                    Estas semillas son perfectas para incluir en tus comidas y provienen del &aacute;rbol de anacardo.<hr>\n");
      out.write("                    Algunas de los beneficios de las casta&ntilde;as de caj&uacute; son:\n");
      out.write("                    <ul>\n");
      out.write("                        <li>Son ricas en tript&oacute;fano, el cual se convierte en \n");
      out.write("                        serotonina y ayuda a que te sientas bien.</li>\n");
      out.write("                        <li>Tienen 0% de colesterol.</li>\n");
      out.write("                        <li>Est&aacute;n llenas de nutrientes. \n");
      out.write("                            Destacan minerales como hierro, magnesio, f&oacute;sforo, zinc, cobre y manganeso.</li>\n");
      out.write("                        <li>Tienen vitamina E y B.</li>\n");
      out.write("                        <li>Es una gran fuente de fibra.</li>\n");
      out.write("                        <li>Fortalecen tus huesos gracias al magnesio.</li>\n");
      out.write("                        <li>Algunas investigaciones demuestran que ayudan a regular los niveles de az&uacute;car en sangre.</li>\n");
      out.write("                        <li>Tienen menor contenido de grasa en comparaci&oacute;n con otros frutos secos.</li>\n");
      out.write("                        <li>Son ricas en grasa monoinsaturada.</li>\n");
      out.write("                        <li>Ayudan a mantener la buena higiene dental gracias a que eliminan algunas\n");
      out.write("                        bacterias que llevan a tener caries.</li>\n");
      out.write("                    </ul><hr>\n");
      out.write("                    ¡An&iacute;mate a probarlas en ensaladas, como un picoteo de media tarde o de la forma que quieras!\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"panel-footer\">\n");
      out.write("                <div>\n");
      out.write("                    <label>Indicadores del d&iacute;a</label>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"indi\" id=\"UF\"></div>\n");
      out.write("                <div class=\"indi\" id=\"UTM\"></div>\n");
      out.write("                <div class=\"indi\" id=\"Dolar\"></div>\n");
      out.write("                <div class=\"indi\" id=\"Euro\"></div>\n");
      out.write("                \n");
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
