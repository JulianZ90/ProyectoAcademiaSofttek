$(document).ready(function(){
    $("#remover").click(function(){
        $("#Nueva Fecha").remove();
    });
});

function afterText() {	
	var newInput = $("<input name='new_field' type='date' id='Nueva Fecha'>");
	var txt1= "</br>";
    $("#Fecha").after(txt1, txt1, newInput);
};