package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/master.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"icon\" href=\"http://whimsical.heartette.net/_files/material/favicons/favicon_deer1a.gif\" type=\"image/gif\">    \n");
      out.write("        <script src=\"js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/master.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/bootstrap.js\" type=\"text/javascript\"></script>\n");
      out.write("        <title>Anacardo registro</title>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function (){\n");
      out.write("               validar(); \n");
      out.write("            });   \n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body class=\"colorearlo\">    \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.html", out, false);
      out.write("\n");
      out.write("        <form id=\"frm\" name=\"frm\" method=\"post\" action=\"respuesta.jsp\">\n");
      out.write("            <div class=\"panel panel-info\">\n");
      out.write("                <div class=\"panel-heading\">\n");
      out.write("                    <h2>Registro</h2>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"colorear panel-body\">\n");
      out.write("                    <div class=\"marg\">\n");
      out.write("                        <label>Nombre completo</label>\n");
      out.write("                        <input class=\"form-control\" type=\"text\" value=\"\" id=\"nombre\" name=\"nombre\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"medio marg\">\n");
      out.write("                        <label>Email</label>\n");
      out.write("                        <input class=\"form-control\" type=\"email\" id=\"email\" name=\"email\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"medio marg\">\n");
      out.write("                        <label>Teléfono</label>\n");
      out.write("                        <input class=\"form-control\" type=\"number\" value=\"\" id=\"telefono\" name=\"telefono\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tercio marg\">\n");
      out.write("                        <label>Sexo</label>\n");
      out.write("                        <select class=\"form-control\" id=\"sexo\" name=\"sexo\">\n");
      out.write("                            <option value=\"\"></option>\n");
      out.write("                            <option value=\"f\">Femenino</option>\n");
      out.write("                            <option value=\"m\">Masculino</option>\n");
      out.write("                        </select>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tercio marg\">\n");
      out.write("                        <label>Edad</label>\n");
      out.write("                        <input class=\"form-control\" type=\"number\" min=\"18\" max=\"99\" id=\"edad\" name=\"edad\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"tercio marg\">\n");
      out.write("                        <label>Fecha de nacimiento</label>\n");
      out.write("                        <input class=\"form-control\" type=\"date\" min=\"1910-01-01\" max=\"2001-05-05\" id=\"fecha\" name=\"fecha\"/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"marg\">\n");
      out.write("                        <label class=\"linea\">Situaci&oacute;n laboral</label>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"marg\">\n");
      out.write("                        <div class=\"radios\"><input type=\"radio\" name=\"labor\" value=\"1\"/>Contrato indefinido</div>\n");
      out.write("                        <div class=\"radios\"><input type=\"radio\" name=\"labor\" value=\"2\"/>Contrato a plazo fijo</div>\n");
      out.write("                        <div class=\"radios\"><input type=\"radio\" name=\"labor\" value=\"3\"/>Contrato a honorario</div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"marg\">\n");
      out.write("                        <label class=\"linea\">Comentarios</label>\n");
      out.write("                        <textarea class=\"form-control\" name=\"obs\" id=\"obs\"></textarea>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"marg aceptar\">\n");
      out.write("                        <input type=\"checkbox\" value=\"acepta\" name=\"acepta\" id=\"acepta\"/>Acepto las condiciones de registro\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"panel-footer\"> \n");
      out.write("                    <button class=\"btn btn-success \"><span class=\"glyphicon glyphicon-upload\">&nbsp;Enviar</span></button> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("                \n");
      out.write("        </form>\n");
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
