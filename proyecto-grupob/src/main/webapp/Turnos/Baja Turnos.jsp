<!doctype>
<html>
	<head>
		<title> .:Baja de Turnos:. </title>
		
		<link rel="stylesheet" href="../CSSs/Navbar.css">
		<link rel="stylesheet" href="../CSSs/Botones.css">
		<link rel="stylesheet" href="../CSSs/Baja Turnos.css">
		<link rel="stylesheet" href="../CSSs/fondo.css">
		<link rel="stylesheet" href="../CSSs/izqder.css">
		<link rel="stylesheet" href="../CSSs/Solorecuadro.css">
		
		<script src="../JSs/funcionalerta.js"></script>
	</head>
	
	<body>
		
		<ul>
			<li class="dropdown" ><a class="dropbtn" a href="../Busqueda Paciente/Busqueda de Paciente.html">Busqueda de Paciente</a>
			</li>
			 <li style="float:right" class="dropdown"><a href="../	Home AMB.html" class="dropbtn">Salir</a></li>
			</ul>
			</br>
		
		<form method="post">
		
			<fieldset>
				<legend> Baja de Turnos </legend>
				</br><label for="numturno">Nro. de Turno</label>
				<input type="num" name="numturno" disabled /></br>
				</br>
				</br><label for="horaturno">Hora del Turno</label>
				<input type="time" name="horaturno" disabled /></br>
				</br>
				</br><label for="fechaturno">Fecha del Turno</label>
				<input type="date" name="fechaturno" disabled /></br>
				</br>
				</br><input id="izquierda" class="button" type="submit" value="dar de baja" onclick="bajaTurno()" />
				<button type="button" id="derecha" class="button" value="cancelar" onclick="cancelarTurno()"> Cancelar </button>
				
			</fieldset>
		
	</body>
</html>