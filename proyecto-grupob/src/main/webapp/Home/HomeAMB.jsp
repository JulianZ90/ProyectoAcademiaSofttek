<!doctype HTML>
<html>
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" href="CSSs/Fieldset.css">
		<link rel="stylesheet" href="CSSs/Solorecuadro.css">
		<link rel="stylesheet" href="CSSs/fondo.css">
		<link rel="stylesheet" href="CSSs/Botones.css">
		
		<script src="JSs/HomeAMB.js"></script>
	</head>
	
	<title> Iniciar Sesion en AMB </title>
	
	<body>
		
		<form method="post" autocomplete="on">
			<fieldset>
				<legend> Inicio de Sesion </legend>

				</br><label> Usuario : </label><input type="text" name="usuario" autofocus placeholder="Usuario" required></br>
				
				</br><label> Contraseņa : </label><input type="password" name="contrasena" autocomplete="off" placeholder="Contraseņa" required></br>
				
				<button type="button" class="button" onclick="logueo(this.form)"> Entrar </button>
				<!--<input type="submit" value="Entrar" class="button" onclick="logueo(this.form)"-->
				
			</fieldset>
		</form>
		
		<img class="imgdeco" src="Imagenes/doctors-thumbs.png" width="596,5" height="491,5" alt="doctores pulgares arriba">
		
		
		
	</body>
</html>