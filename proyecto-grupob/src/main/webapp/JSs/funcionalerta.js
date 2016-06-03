function funcionalerta() {
    alert("El Paciente ha sido modificado exitosamente");
	window.location.href = "../BusquedaPaciente/vistaAfiliado.jsp"
}

function funcioncancelar(){
	var respconfirm = confirm("¿Esta seguro que desea cancelar? se perderan todos los datos no  guardados");
	if ( respconfirm == true ) {
		window.location.href = "../BusquedaPaciente/vistaAfiliado.jsp";
		return true;
	}
}

function cancelarTurno(){
	var respconfirm = confirm("¿Esta seguro que desea cancelar? se perderan todos los datos no  guardados");
	if (respconfirm == true) {
		window.location.href = "../BusquedaPaciente/TurnosdelPaciente.html" 
		return true;
	}
}

function bajaTurno(){
	alert("El Turno ha sido dado de baja exitosamente")
	window.location.href = "../BusquedaPaciente/vistaAfiliado.jsp"
}

function funcionSalir(){
	var salirconfirm = confirm("¿Esta seguro que desea cancelar? se perderan todos los datos no  guardados");
	if (salirconfirm == true){
		window.location.href = "../Home/HomeAMB2.jsp"
		return true;
	}
}

//function avisoNuevoPaciente(){
//	alert("El Paciente fue Agregado Exitosamente");
//}