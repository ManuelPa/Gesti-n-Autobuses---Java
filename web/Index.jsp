<%@page import="java.util.Calendar"%>
<%@page import="java.sql.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>AlibaBús S.L.</title>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/css.css" rel="stylesheet">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <script src="js/AjaxJava.js"></script>
    </head>
    <body class="container">
        <header class="navbar navbar-default navbar-fixed-top" style="opacity: 0.95;">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a href="Index.jsp"><img src="css/icono.png" alt="Alibabus" width="55px" height="55px" class="img-responsive" style="margin-left: 40px; margin-right: 40px"></a>
                </div>
                <ul class="nav navbar-nav">
                    <li class="activa"><a href="Index.jsp">Inicio</a></li>
                    <li><a href="#">Page 1</a></li>
                    <li><a href="#">Page 2</a></li>
                    <li><a href="#">Page 3</a></li>
                </ul>
            </div>
        </header>
        <section class="row">
            <div class="col-xs-1"></div>
            <div class="col-xs-5 contenedor center-block">
                <form method="post" action="servletOrigenDestino">
                    <select name="origen" required="required" class="inputs" onfocus="muestraorigen()" onchange="muestradestino(this.value)" id="origen">
                        <option value="-1">Origen:</option>
                    </select> 
                    <select name="destino" required="required" class="inputs" id="destino">
                        <option value="-1">Destino:</option>
                    </select> 
                    <%Date sysdate = new Date(Calendar.getInstance().getTime().getTime());%>
                    <input type="date" name="fecha" min="<% out.print(sysdate);%>" class="inputs" required="required" placeholder="Fecha del Billete:">
                    <input type="number" name="plazas" min="1"  class="inputs" required="required" placeholder="Cantidad de Plazas:"/>
                    <input type="submit" name="enviar" value="Ver Viajes" class="botones " style="width: 400px"/>
                </form>
            </div>
        </section>
        <footer class="navbar navbar-default navbar-fixed-bottom" style="opacity: 0.95;">
            <div class="h4" style="margin: 2%;">
                <strong>Desarrollo de Aplicaciones en Entorno Servidor.</strong>
                <p>&copy;2017-2018</p>
            </div>
        </footer>
    </body>
</html>
