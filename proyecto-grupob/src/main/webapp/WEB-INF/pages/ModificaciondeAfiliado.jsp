<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<link rel="stylesheet" href="CSSs/Navbar.css">
		<meta http-equiv="content-type" content="text/html; charset=UTF-8" /> 
		<title>Modificación de Afiliado</title>
	</head>
	<body>
		
		
		
			<ul>
				<li class="dropdown"><a href="/Home Principal AMB.html" class="dropbtn">Principal</a></li>
				<li class="dropdown" ><a href="#" class="dropbtn">Paciente</a>
					<div class="dropdown-content">
						<a href="../AMB Afiliado/Alta de Afiliado.html"> Alta  de Afiliado </a>
						<a href="../AMB Afiliado/Baja de Afiliado.html"> Baja / Modificación de Afiliado </a>
					</div>
				</li>
				<li class="dropdown" ><a href="#" class="dropbtn">Turnos</a>
					<div class="dropdown-content">
						<a href="../Registro de Turnos/Registro Turnos.html"> Registro de Turnos</a>
						<a href="#"> Modificación de Turnos </a>
					</div>
				</li>
				<li class="dropdown" ><a href="../Busqueda Paciente/Busqueda de Paciente.html" class="dropbtn"> Busqueda de Paciente</a>
				</li>
				<li style="float:right" class="dropdown"><a href="../Home AMB.html" class="dropbtn">Salir</a></li>
			</ul>
			</br>
		<form method="post" action="enviarModificacion">
			<fieldset>
				</br><legend>Modificación de Afiliado</legend>
				</br><strong>Nombre : </strong>
				<!-- <input type="text" name="nombre" disabled> -->
				<s:textfield name="pacienteDatosViejos.getNombre()" readonly="true" /> </br>
				<strong> Apellido : </strong>
				<!-- <input type="text" name="apellido" disabled></br> -->
				<s:textfield name="pacienteDatosViejos.getApellido()" readonly="true" /> </br>
				<%-- </br><label for="numdocumento"><strong>Nro. y Tipo de Documento :</strong></label> --%>
				<strong>Nro. y Tipo de Documento :</strong>
				<s:textfield name="numdocumento" readonly="true" />  
				
				<!-- <input type="number" name="numdocumento" placeholder="Nro. de Documento" disabled> -->
			<%-- 	<select name="tipodoc" disabled>
					<option value="D.N.I."> D.N.I. </option>
					<option value="L.E."> L.E.</option>
					<option value="L.C."> L.C.</option>
				</select></br>
				 --%>
				 	<s:textfield name="tipodoc" readonly="true" />  </br>
			
				</br><strong>Calle : </strong>
		<!-- 		<input type="text" name="calle"> -->		
		 		<s:textfield name="pacienteDatosViejos.getCalle()"  /> </br>
		
				<strong> Altura : </strong>
				<!-- <input type="number" name="altura" maxlength="5" size="5" min="1">
				 -->
				 <s:textfield name="pacienteDatosViejos.getAltura()"  /> </br>
				<strong> Piso : </strong>
				
				<!-- <input type="text" name="piso" size="2" maxlength="2"> -->
				<s:textfield name="pacienteDatosViejos.getPiso()"  /> </br>
				
				<strong> Departamento : </strong>
				<!-- <input type="text" name="departamento" size="3" maxlength="3"></br> -->
				<s:textfield name="pacienteDatosViejos.getDepartamento()"  /> </br>
				</br><strong>Telefono : </strong>
				<!-- <input type="tel" name="telefono"></br> -->
				<s:textfield name="pacienteDatosViejos.getTelefono()"  /> </br>
				</br><strong>Mail : </strong>
				<!-- <input type="email" name="mail" ></br> -->
				<s:textfield name="pacienteDatosViejos.getMail()"  /> </br>
				</br><strong>Fecha de Nacimiento :</strong>
				<!-- <input type="date" name="fecNac" disabled></br> -->
				<s:textfield name="pacienteDatosViejos.getFecNac()" readonly="true" /> </br>
				
				</br><label for="sexo"><strong>Sexo : </strong></label>
				<%-- <select name="sexo" disabled> --%>
				<s:textfield name="pacienteDatosViejos.getSexo()"  /> </br>
					<%-- 	<option value="Masculino"> M </option>
						<option value="Femenino"> F </option>
				</select> --%>
				</br>
				
				</br><label for="estadocivil"><strong> Estado Civil : </strong></label>
				<s:textfield name="pacienteDatosViejos.getEstadoCivil()"  /> </br>
				<%-- <select name="estadocivil" required>
					<option value="Soltero/a"> Soltero/a </option>
					<option value="Casado/a"> Casado/a </option>
					<option value="Viudo/a"> Viudo/a </option>
					<option value="Concubinato"> Concubinato </option>
					<option value="Divorciado/a"> Divorciado/a </option>
					</select> --%>
				</br>
				
				</br><strong>Cantidad de Hijos o Familiares a Cargo :</strong>
<!-- 				<input type="number" name="canthijos" size="2" min="0"></br> -->	
				<s:textfield name="pacienteDatosViejos.getCantHijos()"  /> </br>
							
				</br><strong>Plan Medico : </strong>
				<s:textfield name="pacienteDatosViejos.getPlanMedico().getDescripcion()"  /> </br>
				<!-- <input type="text" name="Plan"> -->
				
				<strong>Fecha de Modificación : </strong>
				<input type="date" name="Fecha Modificación"></br>
				</br> <textarea name="motivoCambio" placeholder="Indique el motivo de cambio..." maxlength="140" cols="50" rows="7" ></textarea></br>
							
				</br><input type="submit" value="Modificar" name="botonPresionado"></br>
				</br><button type="Submit" value="Cancelar" name="botonPresionado"> Cancelar</button>
			</fieldset>
		</form>
		
	</body>
</html>
