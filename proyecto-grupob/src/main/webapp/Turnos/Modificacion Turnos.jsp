<!doctype HTML>
<!-- el numero de practica tiene que ser una tabla seleccionable , que 	utiliza la bbdd-->
<html>

	<head>
		<meta charset="utf-8">
		<title> Modificación de Turno </title>
		
		<link rel="stylesheet" href="../CSSs/Solorecuadro.css">
		<link rel="stylesheet" href="../CSSs/Navbar.css" />
		<link rel="stylesheet" href="../CSSs/fondo.css" />
		<link rel="stylesheet" href="../CSSs/Botones.css" />
	</head>
	
	<body>
		<ul>
			<li class="dropdown" ><a href="Busqueda de Paciente.html" class="dropbtn"> Busqueda de Paciente</a>
			</li>
				<li style="float:right" class="dropdown"><a href="../Home AMB.html" class="dropbtn">Salir</a></li>
			</ul>
			</br>
		<form>
			<fieldset>
				<legend>Ingrese los Datos del Paciente</legend>
				</br>
				<label for="Numero de Turno" >Número de turno :</label>
				<input type="number" name="Numero de Turno" disabled/></br><!-- es automatico-->
				</br>
				<label for= "Nombre" id="izquierda">Nombre : </label>
				<input type="text" name="Nombre" id="izquierda" readonly/>
				<label for="Apellido" id="derecha" > Apellido : </label>
				<input type="text" name="Apellido" id="derecha"readonly/></br>
				</br>
				<label for="Paciente" id="izquierda"> Nº de Paciente : </label>
				<input type="number" name="Paciente" id="izquierda" readonly/>
				<label for="Plan" id="derecha"> Plan : </label>
				<input type="text" name="Plan" id="derecha"readonly/></br>
				</br>
				<label type="Fecha Llegada" id="izquierda" >Fecha de Llegada : </label>
				<input type="time" name="Hora Llegada" id="izquierda"requiered />
				<input type="date" name="Fecha Llegada" id="izquierda" required/>
				<label for="Fecha Atencion" id="derecha> Fecha de Inicio de Atención : </label>
				<input type="time" name="Hora Atencion" id="derecha" requiered />
				<input type="date" name="Fecha Atencion" id="derecha" required /> </br>
				</br>
				<label for="ID Prestador" id="izquierda">ID Prestador : </label>
				<input type="number" name="ID Prestador" readonly id="izquierda" />
				<label for="Practica" id="derecha"> Nro. Práctica :</label>
				<input type="text" name="Practica" placeholder="Practica" id="derecha" required /></br>
				<!-- este campo requiere tooltip dinamico, que se realiza con este link
				https://www.jacobtomlinson.co.uk/2012/09/11/ajax-database-tooltip/ -->
				</br>
				<label for="Importe"> Importe del Turno : </label>
				<input type="number" name="Importe" placeholder="Importe" required /></br>
				</br>
				<textarea rows="4" cols="50" maxlength="140" placeholder="Obvservaciones..."></textarea></br>
				</br>
				<input type="submit" value="Modificar Turno" class="button" />
				
				<!-- deberia obtenerse por el logueo-->
			</fieldset>
		</form>
	</body>
</html>