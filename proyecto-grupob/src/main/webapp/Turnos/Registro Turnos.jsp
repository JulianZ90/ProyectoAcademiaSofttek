<!doctype html>
<!--agregar funcionalidades JS-->
<html>
	
	<head>
		<meta charset="utf-8">
		
		<title>Registro de Turnos</title>
		<link rel="stylesheet" href="../CSSs/Style Table.css">
		<link rel="stylesheet" href="../CSSs/Navbar.css">
		<link rel="stylesheet" href="../CSSs/Registro Turnos.css">
		<link rel="stylesheet" href="../CSSs/Botones.css">
		<link rel="stylesheet" href="../CSSs/fondo.css">
		<link rel="stylesheet" href="../CSSs/Fieldset.css">
		<link rel="stylesheet" href="../CSSs/Solorecuadro.css">
		<link rel="stylesheet" href="../CSSs/izqder.css">
		
</head>
<body>

	</head>

	<body>
		<ul>
			<li class="dropdown" ><a href="../Busqueda Paciente/Busqueda de Paciente.html" class="dropbtn"> Busqueda de Paciente</a>
			</li>
			
			<li style="float:right"><a href="#">Salir</a></li>
		</ul>
		</br>
		
		<form >
			<fieldset>
				
				<legend>Registro de Turno</legend>
				</br>
				<label for="Nro. Turno">Nro. Turno : </label>
				<input type="number" name="numturno" disabled /></br>
				</br>
				<label for="Prestador">Prestador : </label>
				<input type="text" name="Prestador" placeholder="Prestador" required autofocus></br>
				</br>
				<label for="Fechas">Fecha Disponible : </label>
				<input type="date" name="Fecha Disponible"/></br>
				</br>
				</br><table style="width:20%">
					<tr>
						<th> Horario </th>
						<th> Seleccione </th>
					</tr>
					<tr>
						<td> horario 1</td>
						<td> <input type="radio" name="Turno" value="Turno 1" checked/></td>
					</tr>
					<tr>
						<td> horario 2</td>
						<td> <input type="radio" name="Turno" value="Turno 2"/></td>
					</tr>
				</table>
				</br>
				<input type="submit" id="Solicitar Turno" value=" Solicitar Turno " class="button" />
				<!-- este boton debe subir los datos -->
				
				<button class="button" id="derecha" type="button" value="Cancelar" onclick="funcioncancelar()" >  Cancelar</button>
				</br>
			</fieldset>
		</form>
		
	</body>

</html>

