<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/master.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" href="http://whimsical.heartette.net/_files/material/favicons/favicon_deer1a.gif" type="image/gif">    
        <script src="js/jquery-3.2.1.js" type="text/javascript"></script>
        <script src="js/jquery.validate.js" type="text/javascript"></script>
        <script src="js/master.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <title>Anacardo registro</title>
        <script type="text/javascript">
            $(document).ready(function (){
               validar(); 
            });   

        </script>
        
    </head>
    <body class="colorearlo">    
        <jsp:include page="menu.html"></jsp:include>
        <form id="frm" name="frm" method="post" action="respuesta.jsp">
            <div class="panel panel-info">
                <div class="panel-heading">
                    <h2>Registro</h2>
                </div>
                <div class="colorear panel-body">
                    <div class="marg">
                        <label>Nombre completo</label>
                        <input class="form-control" type="text" value="" id="nombre" name="nombre"/>
                    </div>
                    <div class="medio marg">
                        <label>Email</label>
                        <input class="form-control" type="email" id="email" name="email"/>
                    </div>
                    <div class="medio marg">
                        <label>Teléfono</label>
                        <input class="form-control" type="number" value="" id="telefono" name="telefono"/>
                    </div>
                    <div class="tercio marg">
                        <label>Sexo</label>
                        <select class="form-control" id="sexo" name="sexo">
                            <option value=""></option>
                            <option value="f">Femenino</option>
                            <option value="m">Masculino</option>
                        </select>
                    </div>
                    <div class="tercio marg">
                        <label>Edad</label>
                        <input class="form-control" type="number" min="18" max="99" id="edad" name="edad"/>
                    </div>
                    <div class="tercio marg">
                        <label>Fecha de nacimiento</label>
                        <input class="form-control" type="date" min="1910-01-01" max="2001-05-05" id="fecha" name="fecha"/>
                    </div>
                    <div class="marg">
                        <label class="linea">Situaci&oacute;n laboral</label>
                    </div>
                    <div class="marg">
                        <div class="radios"><input type="radio" name="labor" value="1"/>Contrato indefinido</div>
                        <div class="radios"><input type="radio" name="labor" value="2"/>Contrato a plazo fijo</div>
                        <div class="radios"><input type="radio" name="labor" value="3"/>Contrato a honorario</div>
                    </div>
                    <div class="marg">
                        <label class="linea">Comentarios</label>
                        <textarea class="form-control" name="obs" id="obs"></textarea>
                    </div>
                    <div class="marg aceptar">
                        <input type="checkbox" value="acepta" name="acepta" id="acepta"/>Acepto las condiciones de registro
                    </div>
                </div>
                <div class="panel-footer"> 
                    <button class="btn btn-success "><span class="glyphicon glyphicon-upload">&nbsp;Enviar</span></button> 
                </div>
            </div>
            
                
        </form>
    </body>
</html>
