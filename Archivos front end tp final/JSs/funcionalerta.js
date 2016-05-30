function funcionalerta() {
    alert("El Paciente ha sido modificado exitosamente");
	window.location.href = "../Busqueda Paciente/Busqueda de Paciente.html"
}

function funcioncancelar(){
	var respconfirm = confirm("¿Esta seguro que desea cancelar? se perderan todos los datos no  guardados");
	if ( respconfirm == true ) {
		window.location.href = "../AMB Afiliado/Baja de Afiliado.html"
		return true;
	}
}

function cancelarTurno(){
	var respconfirm = confirm("¿Esta seguro que desea cancelar? se perderan todos los datos no  guardados");
	if (respconfirm == true) {
		window.location.href = "../Busqueda Paciente/ Turnos del Paciente.html" 
		return true;
	}
}

function bajaTurno(){
	alert("El Turno ha sido dado de baja exitosamente")
	window.location.href = "../Busqueda Paciente/Busqueda de Paciente.html"
}