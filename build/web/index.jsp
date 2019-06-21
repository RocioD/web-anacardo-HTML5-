<!DOCTYPE html>
<html>
    <head>
        <title>Anacardo</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
        <link href="css/master.css" rel="stylesheet" type="text/css"/>
        <link rel="icon" href="http://whimsical.heartette.net/_files/material/favicons/favicon_deer1a.gif" type="image/gif">  
        <script src="js/jquery-3.2.1.js" type="text/javascript"></script>
        <script src="js/bootstrap.js" type="text/javascript"></script>
        <script src="js/master.js" type="text/javascript"></script>
        <script type="text/javascript">
            $(document).ready(function (){
               mostrarIndicadores(); 
            });
            
        </script>
    </head>
    <body class="colorearlo">
       
        <jsp:include page="menu.html"></jsp:include>
        <div class="panel panel-info">
            <div class="panel-heading">
                <h2 class="cen">Casta&ntilde;a de Caj&uacute;</h2>
            </div>
            <div class="panel-body colorear">
                <div class="div1"><img style="width: 80%;" src="img/anacardo2.jpg" alt=""/></div>
                <div class="div2">
                    ¿Has probado alguna vez las casta&ntilde;as de caj&uacute;? <br>
                    Estas semillas son perfectas para incluir en tus comidas y provienen del &aacute;rbol de anacardo.<hr>
                    Algunas de los beneficios de las casta&ntilde;as de caj&uacute; son:
                    <ul>
                        <li>Son ricas en tript&oacute;fano, el cual se convierte en 
                        serotonina y ayuda a que te sientas bien.</li>
                        <li>Tienen 0% de colesterol.</li>
                        <li>Est&aacute;n llenas de nutrientes. 
                            Destacan minerales como hierro, magnesio, f&oacute;sforo, zinc, cobre y manganeso.</li>
                        <li>Tienen vitamina E y B.</li>
                        <li>Es una gran fuente de fibra.</li>
                        <li>Fortalecen tus huesos gracias al magnesio.</li>
                        <li>Algunas investigaciones demuestran que ayudan a regular los niveles de az&uacute;car en sangre.</li>
                        <li>Tienen menor contenido de grasa en comparaci&oacute;n con otros frutos secos.</li>
                        <li>Son ricas en grasa monoinsaturada.</li>
                        <li>Ayudan a mantener la buena higiene dental gracias a que eliminan algunas
                        bacterias que llevan a tener caries.</li>
                    </ul><hr>
                    ¡An&iacute;mate a probarlas en ensaladas, como un picoteo de media tarde o de la forma que quieras!
                </div>
                
            </div>
            <div class="panel-footer">
                <div>
                    <label>Indicadores del d&iacute;a</label>
                </div>
                <div class="indi" id="UF"></div>
                <div class="indi" id="UTM"></div>
                <div class="indi" id="Dolar"></div>
                <div class="indi" id="Euro"></div>
                
            </div>
        </div>
    </body>
</html>
