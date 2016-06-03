<!doctype HTML>
<html>
	<head>
		<meta charset="utf-8">
		<title>Baja Afiliado</title>	
		<link rel="stylesheet" href="../CSSs/Navbar.css">
		<link rel="stylesheet" href="../CSSs/Botones.css">
		<link rel="stylesheet" href="../CSSs/solorecuadro.css">
		<link rel="stylesheet" href="../CSSs/Modificacion Afiliado.css">
		<link rel="stylesheet" href="../CSSs/fondo.css">
		
		<script src="../JSs/funcionalerta.js"></script>
	</head>	
	<body>
	
		<ul>
			<li class="dropdown" ><a class="dropbtn" a href="../Busqueda Paciente/Busqueda de Paciente.html">Busqueda de Paciente</a>
				</li>
			<li style="float:right"><a href="#" onclick="funcionSalir()">Salir</a></li>
		</ul>	
		</br>
		<form>
			<fieldset>
			
				<legend> Baja de Afiliados </legend>
					</br><label for="numdocumento"><strong>Nro. y Tipo de Documento :</strong></label>
						<input type="number" name="numdocumento" required placeholder="Nro. de Documento" min="1">
						<select name="tipodoc" required>
							<option value="D.N.I."> D.N.I. </option>
							<option value="L.E."> L.E.</option>
							<option value="L.C."> L.C.</option>
						</select></br>
					
					</br><label for="horabaja"><strong> Fecha Actual:  </strong></label>
					<input type="datetime-local" name="horabaja" required></br>
					
					</br><input id="izquierda" class="button" type="submit" value="Dar de Baja">

					<button class="button" id="derecha" type="button" value="Cancelar" onclick="funcioncancelar()" >  Cancelar</button>
					
			</fieldset>
		</form>
		
	</body>
</html>