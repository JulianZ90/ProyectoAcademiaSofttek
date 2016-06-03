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
		<link rel="stylesheet" href="../CSSs/BarraBusqueda.css">
		
		<script src="../JSs/ocultardiv.js"></script>
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
				<input type="date" name="Fecha Disponible" oninput="test()"/></br>
				</br>
				</br>
				<div id="oculto"><table style="width:20%">
					<tr>
						<th> Horario </th>
						<th> Seleccione </th>
					</tr>
					<tr>
						<td> 08:00</td>
						<td> <input type="radio" name="Turno" value="Turno 1" checked/></td>
					</tr>
					<tr>
						<td> 08:30</td>
						<td> <input type="radio" name="Turno" value="Turno 2"/></td>
					</tr>
					<tr>
						<td> 09:00</td>
						<td> <input type="radio" name="Turno" value="Turno 3"/></td>
					</tr>
					<tr>
						<td> 09:30</td>
						<td> <input type="radio" name="Turno" value="Turno 4"/></td>
					</tr>
					<tr>
						<td> 10:00</td>
						<td> <input type="radio" name="Turno" value="Turno 5"/></td>
					</tr>
					<tr>
						<td> 10:30</td>
						<td> <input type="radio" name="Turno" value="Turno 6"/></td>
					</tr>
					<tr>
						<td> 11:00</td>
						<td> <input type="radio" name="Turno" value="Turno 7"/></td>
					</tr>
					<tr>
						<td> 11:30</td>
						<td> <input type="radio" name="Turno" value="Turno 8"/></td>
					</tr>
					<tr>
						<td> 12:00</td>
						<td> <input type="radio" name="Turno" value="Turno 9"/></td>
					</tr>
					<tr>
						<td> 12:30</td>
						<td> <input type="radio" name="Turno" value="Turno 10"/></td>
					</tr>
					<tr>
						<td> 13:00</td>
						<td> <input type="radio" name="Turno" value="Turno 11"/></td>
					</tr>
					<tr>
						<td> 13:30</td>
						<td> <input type="radio" name="Turno" value="Turno 12"/></td>
					</tr>
				</table>
				</div>
				</br>
				<input type="submit" id="Solicitar Turno" value=" Solicitar Turno " class="button" />
				<!-- este boton debe subir los datos -->
				
				<button class="button" id="derecha" type="button" value="Cancelar" onclick="funcioncancelar()" >  Cancelar</button>
				</br>
			</fieldset>
		</form>
		
	</body>

</html>

