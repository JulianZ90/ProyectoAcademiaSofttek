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

function funcionSalir(){
	var confirmSalida = confirm ("¿ Esta seguro que desea salir ? Se perderan todos los datos no guardados...");
	if ( confirmSalida == true ) {
		window.location.href = "../Home AMB.html"
		return true;
	}
}

function cancelarModificacion(){
	var cancelacion = confirm("¿Esta seguro que desea cancelar? se perderan todos los datos no  guardados");
	if (cancelacion == true) {
		window.location.href = "../Busqueda Paciente/Busqueda de Paciente.html"
		return true;
}