package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calculoIMC_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>calculadora IMC</title>\n");
      out.write("        <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"css/master.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link rel=\"icon\" href=\"http://whimsical.heartette.net/_files/material/favicons/favicon_deer1a.gif\" type=\"image/gif\">\n");
      out.write("        <script src=\"js/jquery-3.2.1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.validate.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/master.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body class=\"bodycal\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "menu.html", out, false);
      out.write("\n");
      out.write("        <h2 class=\"cen neg titulocal\">Calculadora IMC</h2>\n");
      out.write("        <div class=\"medio\">\n");
      out.write("            <label>Peso</label>\n");
      out.write("            <input class=\"form-control\" id=\"peso\" name=\"peso\" type=\"number\" value=\"\" min=\"5\" max=\"300\"/>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"medio\">\n");
      out.write("            <label>Altura</label>\n");
      out.write("            <input class=\"form-control\" id=\"altura\" name=\"altura\" type=\"number\" value=\"\" min=\"0\" max=\"2\" />\n");
      out.write("        </div>\n");
      out.write("        <button class=\"boton btn btn-info\" onclick=calculo()>Calcular</button>\n");
      out.write("        \n");
      out.write("        <div><input class=\"form-control\" type=\"number\" id=\"img\" value=\"\"></div>\n");
      out.write("        <div ><p id=\"condicion\"></p></div>\n");
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
