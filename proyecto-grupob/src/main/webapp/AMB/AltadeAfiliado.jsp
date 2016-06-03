<!doctype HTML>
<!-- corregir funcionalidad salir JS-->
<html>
<!-- Hi pablo -->
	<head>
		<meta charset="utf-8">
		
		<title>.:Alta Paciente:.</title>
		
		<link rel="stylesheet" href="../CSSs/Navbar.css">
		<link rel="stylesheet" href="../CSSs/Botones.css">
		<link rel="stylesheet" href="../CSSs/Solorecuadro.css">
		<link rel="stylesheet" href="../CSSs/fondo.css">
		<link rel="stylesheet" href="../CSSs/Modificacion Afiliado.css">
		
		<script src="../JSs/funcionalerta.js"></script>
	</head>
	
	<title> Alta Paciente</title>
	
	<body>
		
		<form method="post" action="nuevoPaciente" > <!-- Agregar action -->
		
			<ul>
				<li class="dropdown" ><a class="dropbtn" a href="#" onclick="funcioncancelar()">Busqueda de Paciente</a>
				</li>
				<li style="float:right" class="dropdown"><a href="#" onclick="funcionSalir()" class="dropbtn">Salir</a></li>
			</ul>
			</br>
			<fieldset>
				<legend> Ingrese los Datos del Nuevo Paciente </legend>
				
				</br><label for="nombre">Nombre :</label>
				<input type="text" name="nombre" required placeholder="Nombre del Paciente" autofocus>
				
				<label for="apellido">  Apellido :</label>
				<input type="text" name="apellido" required placeholder="Apellido del Paciente"></br>
				
				</br><label for="numdocumento">Nro. y Tipo de Documento : </label>
				<input type="number" name="numdocumento" required placeholder="Nro. de Documento" min="1">
				<select name="tipodoc" required>
					<option value="D.N.I."> D.N.I. </option>
					<option value="L.E."> L.E.</option>
					<option value="L.C."> L.C.</option>
				</select></br>
				
				</br><label for="calle">Calle : </label>
				<input type="text" name="calle" required placeholder="Calle" >
				<label for="altura"> Altura : </label>
				<input type="number" name="altura" required placeholder="Altura" size="6" maxlength="5" min="1">
				<label for="piso"> Piso : </label>
				<input type="text" name="piso" placeholder="Piso" size="2" maxlength="2">
				<label for="departamento"> Departamento : </label>
				<input type="text" name="departamento" placeholder="Dpto" size="4" maxlength="3"></br>		
				
				</br><label for="telefono">Telefono : </label>
				<input type="tel" name="telefono" required placeholder="numero de telefono" maxlength="10" ></br>
				
				</br><label for="mail">Mail : </label><input type="email" name="mail" required placeholder="dirección de correo"></br>		   
				
				</br><label for="fechanac">Fecha de Nacimiento : </label><input type="date" name="fechanac" placeholder="Fecha de Nacimiento" required></br>
				
				</br><label for="sexo">Sexo : </label>
				<select name="sexo" required>
						<option value="Masculino"> M </option>
						<option value="Femenino"> F </option>
				</select>
				</br>
	
				</br><label for="estadocivil"> Estado Civil : </label>
				<select name="estadocivil" required>
					<option value="Soltero/a"> Soltero/a </option>
					<option value="Casado/a"> Casado/a </option>
					<option value="Viudo/a"> Viudo/a </option>
					<option value="Concubinato"> Concubinato </option>
					<option value="Divorciado/a"> Divorciado/a </option>
					</select>
				</br>
				
				</br><label for="canthijos">Cantidad de Hijos o Familiares a Cargo : </label>
				<input type="number" name="canthijos" size="2" required placeholder="N°" min="0"></br>
				
				</br><label for="plan">Plan Medico : </label>
				<input type="number" name="plan" placeholder="tipo de plan" required></br>
				
				</br><label for="numafiliado"> N° de Afiliado : </label>
				<input type="number" name="numafiliado" disabled ></br> <!--Este casillero va a ser autoincremental , se realiza con css o js que en esta etapa no se incluye-->
				
				</br><input type="submit" class="button" value="Registrar" onclick="alert('El Paciente fue Agregado Exitosamente');">
				
				<button class="button" id="derecha" type="button" value="Cancelar" onclick="funcioncancelar()" >  Cancelar</button>
			</fieldset>	
		</form>
	</body>
	
</html>	 	