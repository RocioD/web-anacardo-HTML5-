<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>calculadora IMC</title>
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/master.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" href="http://whimsical.heartette.net/_files/material/favicons/favicon_deer1a.gif" type="image/gif">
        <script src="js/jquery-3.2.1.js" type="text/javascript"></script>
        <script src="js/jquery.validate.js" type="text/javascript"></script>
        <script src="js/master.js" type="text/javascript"></script>
        <script type="text/javascript">
        </script>
    </head>
    <body class="bodycal">
        <jsp:include page="menu.html"></jsp:include>
        <h2 class="cen neg titulocal">Calculadora IMC</h2>
        <div class="medio">
            <label>Peso</label>
            <input class="form-control" id="peso" name="peso" type="number" value="" min="5" max="300"/>
        </div>
        <div class="medio">
            <label>Altura</label>
            <input class="form-control" id="altura" name="altura" type="number" value="" min="0" max="2" />
        </div>
        <button class="boton btn btn-info" onclick=calculo()>Calcular</button>
        
        <div><input class="form-control centrar" readonly type="number" id="img" value=""></div>
        <div ><p id="condicion"></p></div>
    </body>
</html>
