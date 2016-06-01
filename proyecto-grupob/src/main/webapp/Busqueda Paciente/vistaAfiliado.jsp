<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
		<meta charset="utf-8">
		<title> Busqueda de Paciente</title>
		<link rel="stylesheet" href="../CSSs/Style Table.css">
		<link rel="stylesheet" href="../CSSs/Navbar.css">
		<link rel="stylesheet" href="../CSSs/fondo.css">
		<link rel="stylesheet" href="../CSSs/Solorecuadro.css">
		<link rel="stylesheet" href="../CSSs/BarraBusqueda.css">
		
		<script src="../JSs/funcionalerta.js"></script>
	</head>
<body>
	
	<ul>
			<li class="dropdown" ><a class="dropbtn" href="#">Busqueda de Paciente</a></li>
			<li style="float:right" class="dropdown"><a href="#" onclick="funcionSalir()" class="dropbtn">Salir</a></li>
		</ul>
	</br>
	
	<p class="BarraBusqueda"> Buscar por : 
	<form method="post" action="busquedaPaciente">
		<select name="tipodato" required>
			<option value="apenom" name="apenom"> Nombre y/o Apellido</option>
			<option value="documento" name="numdoc"> Documento</option>
			<option value="plan" name="plan">Plan</option>
			<option value="paciente" name="idPaciente">Nro. Paciente</option>
		</select>
		
		<input type="number" name="valorbuscado" placeholder="Ingrese Paciente / Documento / Plan / Nro. Paciente" size="50" />
		
		</br><input type="submit" class="button" value="Registrar">
		<img src="../Imagenes/lupa.png" alt="Icono Lupa" class="lupa" onclick="buscarPaciente('Pacientes')" >
		<!-- tiene que tener un evento onchange , para al escribir mostrar la tabla de pacientes -->
	</form>
	</p>
	
	<fieldset id="Pacientes">
		<legend> Pacientes</legend>
		<!-- https://www.um.es/atica/documentos/forja/js/jqueryPlugins/tablesorter/doc/ejemplo.html ordenamiento de los campos de la tabla -->
		<table border="1" style="width:90%">	
			<tr>
				<th>Seleccionar</th>
				<th>Nombre y Apellido<img class="arrow" src="../Imagenes/up.png" alt="up/down"></th>
				<th>Tipo<img class="arrow" src="../Imagenes/up.png" alt="up/down"></th>
				<th>Nro. Documento<img class="arrow" src="../Imagenes/up.png" alt="up/down"></th>
				<th>Direccion<img class="arrow" src="../Imagenes/up.png" alt="up/down"></th>
				<th>Teléfono<img class="arrow" src="../Imagenes/up.png" alt="up/down"></th>
				<th>Mail<img class="arrow" src="../Imagenes/up.png" alt="up/down"></th>
				<th>Fecha de Nacimiento<img class="arrow" src="../Imagenes/up.png" alt="up/down"></th>
			</tr>

			<tr>
				<td><input type="radio" name="Paciente" ondblclick="location.href = 'Turnos del Paciente.html'" /></td>
			    <td><s:property value="afiliadoDto.apenom"/> </td>
				<td><s:property value="afiliadoDto.tipoDNI"/></td>
				<td><s:property value="afiliadoDto.dni"/></td>
				<td><s:property value="afiliadoDto.direccion"/></td>
				<td><s:property value="afiliadoDto.telefono"/></td>
				<td><s:property value="afiliadoDto.mail"/></td>
				<td><s:property value="afiliadoDto.fecNac"/></td>
			</tr>
		</table>
		
		<img src="../Imagenes/plus.png" alt="Nuevo Paciente" class="BotonesLaterales" onclick="location.href = '../AMB Afiliado/Alta de Afiliado.html'"></br></br></br></br>
		<img src="../Imagenes/minus.png" alt="Baja Paciente" class="BotonesLaterales" onclick="location.href = '../AMB Afiliado/Baja de Afiliado.html'"></br></br></br></br>
		<img src="../Imagenes/edit.png" alt="Modificar Paciente" class="BotonesLaterales" onclick="location.href = '../AMB Afiliado/Modificación de Afiliado.html'">
	</fieldset>

</body>
</html>
