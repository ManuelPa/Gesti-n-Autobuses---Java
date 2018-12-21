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
            <div class="col-xs-8 contenedor">
                <h1>Datos Personales y asientos</h1>
                <form>
                    <div style="float: left; height: 150px; width: 50%">
                        <input type="text" name="nif" class="inputs" required="required" placeholder="D.N.I.">
                        <input type="text" name="nombre" class="inputs" required="required" placeholder="Nombre">
                        <input type="text" name="apellidos" class="inputs" required="required" placeholder="Apellidos">
                    </div>
                    <div style="float: right; height: 150px; width: 50%">
                        <h5 style="text-align: center;">Selecciona el asiento del pasajero: <input type="number" value="<%=session.getAttribute("plazas")%>" name="plazas" disabled="disabled"></h5>
                        <table class="table-responsive table-bordered table-hover" style="margin: auto">
                            <tr>
                                <td style="height: 20px; width: 40px"><input type="radio" name="asiento" class="radio-inline" required="required"></td>
                                <td style="height: 20px; width: 40px"><input type="radio" name="asiento" class="radio-inline" required="required"></td>
                            </tr>
                            <tr>
                                <td style="height: 20px; width: 40px"><input type="radio" name="asiento" class="radio-inline" required="required"></td>
                                <td style="height: 20px; width: 40px"><input type="radio" name="asiento" class="radio-inline" required="required"></td>
                            </tr>
                            <tr>
                                <td style="height: 20px; width: 40px"><input type="radio" name="asiento" class="radio-inline" required="required"></td>
                                <td style="height: 20px; width: 40px"><input type="radio" name="asiento" class="radio-inline" required="required"></td>
                            </tr>
                            <tr>
                                <td style="height: 20px; width: 40px"><input type="radio" name="asiento" class="radio-inline" required="required"></td>
                                <td style="height: 20px; width: 40px"><input type="radio" name="asiento" class="radio-inline" required="required"></td>
                            </tr>
                        </table>
                    </div>
                    <input type="submit" value="Siguiente" class="botones" style="float: right;">
                </form>
                <button id="volver" value="volver" class="botones" onclick="location.href = 'Horarios.jsp'" style="float: left;">Volver</button>
            </div>
        </section>
        <footer class="navbar-default navbar-fixed-bottom" style="opacity: 0.95;">
            <div style="margin: 2%;">
                <strong>Desarrollo de Aplicaciones en Entorno Servidor.</strong>
                <p>&copy;2017-2018</p>
            </div>
        </footer>
    </body>
</html>