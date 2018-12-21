<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>AlibaBús S.L.</title>
        <link href="../css/bootstrap.min.css" rel="stylesheet">
        <link href="../css/css.css" rel="stylesheet">
        <script src="../js/jquery.min.js"></script>
        <script src="../js/bootstrap.min.js"></script>
    </head>
    <body class="container">
        <header class="navbar navbar-default navbar-fixed-top" style="opacity: 0.95;">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a href="../Index.jsp"><img src="../css/icono.png" alt="Alibabus" width="55px" height="55px" class="img-responsive" style="margin-left: 40px; margin-right: 40px"></a>
                </div>
                <ul class="nav navbar-nav">
                    <li><a href="../Index.jsp">Inicio</a></li>
                    <li><a href="#">Page 1</a></li>
                    <li><a href="#">Page 2</a></li>
                    <li><a href="#">Page 3</a></li>
                </ul>
            </div>
        </header>
        <section class="row">
            <div class="col-xs-2"></div>
            <div class="col-xs-6 contenedor center-block">
                <h2 style="margin-left: 3%"><%=session.getAttribute("error")%></h2>
                <button id="volver" value="volver" class="botones" onclick="location.href = '../Index.jsp'">Volver</button>
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