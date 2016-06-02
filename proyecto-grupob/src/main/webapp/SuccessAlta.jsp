<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Datos Usuario</title>
</head>
<body>

Nombre:<s:property value="nombre"/>!<br>
Apellido: <s:property value="apellido"/>!<br>
Numero de Doc: <s:property value="numdocumento"/>!<br>
Tipo de Doc: <s:property value="tipodoc"/>!<br>
Telefono: <s:property value="telefono"/>!<br>
Mail: <s:property value="mail"/>!<br>
Fecha de Nacimiento: <s:property value="fechanac"/>!<br>
Sexo: <s:property value="sexo"/>!<br> 
Calle: <s:property value="calle"/>!<br> 
Estado civil: <s:property value="estadocivil"/>!<br>
Cantidad de hijos: <s:property value="canthijos"/>!<br> 
Plan: <s:property value="plan"/>!<br> 
Departamento: <s:property value="departamento"/>!<br>
Piso: <s:property value="piso"/>!<br> 
Altura: <s:property value="altura"/>!<br> 


</body>
</html>