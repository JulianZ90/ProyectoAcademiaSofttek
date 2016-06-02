
$("#idboton").click(function(){

$.ajax({
		url: "vistaAfiliado.jsp",
		success: function (resultado) {},
		
		/*error: function() { 
        	showWait(false); 
        	Alerta.notify("Error en el servidor al llamar: " + link); 
        },*/
        complete: function(){
        	// MG SPRINT25 CHROME
        	//preventDefault(event);
        }
	});
});