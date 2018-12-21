function muestraorigen() {
    var xmlhttp;
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    } else {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            document.getElementById("origen").innerHTML = xmlhttp.responseText;
        }
    }
    xmlhttp.open("GET", "servletOrigen", true);
    xmlhttp.send();
}

function muestradestino(idorigen) {
    var xmlhttp;
    if (idorigen == "") {
        document.getElementById("destino").innerHTML = "No se ha podido encontrar datos.";
        return;
    }
    if (window.XMLHttpRequest) {
        xmlhttp = new XMLHttpRequest();
    } else {
        xmlhttp = new ActiveXObject("Microsoft.XMLHTTP");
    }
    xmlhttp.onreadystatechange = function () {
        if (xmlhttp.readyState == 4 && xmlhttp.status == 200) {
            document.getElementById("destino").innerHTML = xmlhttp.responseText;
        }
    }
    xmlhttp.open("GET", "servletDestino?idorigen=" + idorigen, true);
    xmlhttp.send();
}
function validarFecha(date) {
    var x = new Date();
    var fecha = date.split("/");
    x.setFullYear(fecha[2], fecha[1] - 1, fecha[0]);
    var today = new Date();
    if (x <= today)
        alert("Selecciona una fecha superior a la actual:" + today);
}
