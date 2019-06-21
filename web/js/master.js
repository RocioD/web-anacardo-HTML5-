function validar() {

    $("#frm").validate({
        rules: {
            nombre: {required: true, minlength:"3"},
            email: {required: true, email: true},
            telefono: {required: true, number: true, minlength:"8", maxlength:"11"},
            sexo: {required: true},
            edad: {required: true, number: true},
            fecha: {required: true, date: true},
            obs: {required: true},
            labor: {required: true},
            acepta: {required: true}
        },
        messages: {
            nombre: {required: "Requerido", minlength:"Ingrese un nombre más largo"},
            email: {required: "Requerido", email: "No valido"},
            telefono: {required: "Requerido", number: "Ingrese solo números", minlength:"numero muy corto", maxlength:"numero excede el tamaño"},  
            sexo: {required: "Requerido"},
            edad: {required: "Requerido", number: "Ingrese solo números"},
            fecha: {required: "Requerido", date: "Formato incorrecto"},
            obs: {required: "Requerido"},
            labor: {required: "Requerido"},
            acepta: {required: "Debe aceptar las condiciones"}
        }
    });
}

function calculo() {
    var peso = $("#peso").val();
    var altura = $("#altura").val();
    var str = "";
    if (peso>=5 && peso<=300 && altura>=0.5 && altura<=2.5)
    {
        img = peso/(altura*altura);
        if (img<18.5) {
            var str = "Bajo peso";
            $("#condicion").css("background-color", "violet");
        } else if(img < 25) {
            var str = "Peso normal";
            $("#condicion").css("background-color", "green");
        } else if (img < 30) {
            var str = "Sobrepeso";
            $("#condicion").css("background-color", "orange");
        } else {
            var str = "Obesidad";
            $("#condicion").css("background-color", "red");
        }
    
        $("#img").val(img);
        $("#condicion").css("visibility", "visible");
        $("#condicion").text(str);
    }
    else {
        $("#condicion").css("background-color", "white");
        $("#condicion").css("visibility", "visible");
        $("#condicion").text("Valores no validos");
    }
}

function mostrarIndicadores() {
    $.ajax({
        url: "https://mindicador.cl/api",
        data: "",
        success: function (datos) {
            $("#UF").text("UF: " + datos.uf.valor);
            $("#UTM").text("UTM: " + datos.utm.valor);
            $("#Dolar").text("Dolar: " + datos.dolar.valor);
            $("#Euro").text("Euro: " + datos.euro.valor);
        }
    });
}