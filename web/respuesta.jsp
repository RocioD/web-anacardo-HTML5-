<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="icon" href="http://whimsical.heartette.net/_files/material/favicons/favicon_deer1a.gif" type="image/gif">  
        <title>Recibo de Formulario</title>
    </head>
    <body>
        <%
            try {
                String nombre = request.getParameter("nombre");
                String email = request.getParameter("email");
                String telefono = request.getParameter("telefono");
                String sexo = request.getParameter("sexo");
                String edad = request.getParameter("edad");
                String fecha = request.getParameter("fecha");
                String labor = request.getParameter("labor");
                String obs = request.getParameter("obs");
                String acepta = request.getParameter("acepta");

                out.print("<p>Nombre : " + nombre + "</p>");
                out.print("<p>Email : " + email + "</p>");
                out.print("<p>Teléfono : " + telefono + "</p>");

                out.print("<p>Sexo: " + sexo + "</p>");
                out.print("<p>Edad: " + edad + "</p>");

                out.print("<p>fecha nacimiento: " + fecha + "</p>");
                out.print("<p>labor: " + labor + "</p>");
                
                out.print("<p>Obs : " + obs + "</p>");
                out.print("<p>Acepta: " + acepta + "</p>");
            } catch (Exception ex) {
                out.print(ex.getMessage());
            }
        %>
        <a href="index.jsp">Volver</a>
    </body>
</html>
