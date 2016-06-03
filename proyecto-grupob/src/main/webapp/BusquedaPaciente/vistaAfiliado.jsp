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
		
		<script src = "https://ajax.googleapis.com/ajax/libs/jquery/2.2.2/jquery.min.js"></script>
		<script src="../JSs/funcionalerta.js"></script>
		<script src="../JSs/ajax.js"></script>
	</head>
<body>
	
	<ul>
			<li class="dropdown" ><a class="dropbtn" href="#">Busqueda de Paciente</a></li>
			<li style="float:right" class="dropdown"><a href="#" onclick="funcionSalir()" class="dropbtn">Salir</a></li>
	</ul>
	
	
	<p class="BarraBusqueda"> Buscar por : 
	<form method="post" action="busquedaPaciente">
		<select name="tipodato" required>
			<option value="apenom" name="apenom"> Nombre y Apellido</option>
			<option value="documento" name="numdoc"> Documento</option>
			<option value="plan" name="plan">Plan</option>
			<option value="paciente" name="idPaciente">Nro. Paciente</option>
		</select>
		
		<input name="valorbuscado" placeholder="Ingrese Paciente / Documento / Plan / Nro. Paciente" size="50" />
		
		</br><button id="idboton"  class="button" value="Registrar">Buscar</button>
				
	</form>
	</p>
	
	<fieldset id="Pacientes">
		<legend> Pacientes</legend>
		
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
		<s:iterator value="afiliadoDtos">
			<tr>
				<td><input type="radio" name="Paciente" ondblclick="location.href = 'Turnos del Paciente.html'" /></th>
				<td> <s:property value="apenom" /> </th>
				<td>  <s:property value="tipoDni" /> </th>
				<td>  <s:property value="dni" /> </th>
				<td>  <s:property value="direccion" /> </th>
				<td>  <s:property value="telefono" /> </th>
				<td> <s:property value="mail" /> </th>
				<td>  <s:property value="fecNac" /> </th>
			</tr>
		</s:iterator>
		</table>
		
		<img src="../Imagenes/plus.png" alt="Nuevo Paciente" class="BotonesLaterales" onclick="location.href = '../AMB/AltadeAfiliado.jsp'"></br></br></br></br>
		<img src="../Imagenes/minus.png" alt="Baja Paciente" class="BotonesLaterales" onclick="location.href = 'AMB Afiliado/Baja de Afiliado.html'"></br></br></br></br>
		<img src="../Imagenes/edit.png" alt="Modificar Paciente" class="BotonesLaterales" onclick="location.href = 'AMB Afiliado/Modificación de Afiliado.html'">
	</fieldset>

</body>
</html>
