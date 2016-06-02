function logueo(form){
	if (form.usuario.value == "belen" && form.contraseña.value == "belen"){
		windows.location.href = "AMB Afiliado/Alta de Afiliado.html"
	}
	else
	{ 
		alert("usuario y/o contraseña incorrectos, por favor revise...")
	}
}