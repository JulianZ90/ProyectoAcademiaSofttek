function logueo(form){
	var usuario = form.usuario.value;
	var contrasena = form.contrasena.value;
	
	if (usuario == "belen" && contrasena == "belen"){
		window.location.href = "BusquedaPaciente/vistaAfiliado.jsp"
	}
	else
	{ 
		alert("usuario y/o contraseña incorrectos, por favor revise...")
	}
}

function logueo2(form){
	var usuario = form.usuario.value;
	var contrasena = form.contrasena.value;
	
	if (usuario.toLowerCase() == "belen" && contrasena == "belen"){
		window.location.href = "../BusquedaPaciente/vistaAfiliado.jsp"
	}
	else
	{ 
		alert("usuario y/o contraseña incorrectos, por favor revise...")
	}
}