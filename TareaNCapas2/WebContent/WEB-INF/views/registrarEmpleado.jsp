<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
       <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>

	<br>
	&nbsp&nbsp&nbsp&nbsp<input type="button" class="btn btn-info btn-lg" value="REGRESAR" onclick="location.href='${pageContext.request.contextPath}/regresarAdministrador'"/>
	<h1 class="text-center text-white">INGRESAR NUEVO EMPLEADO</h1>
	

	<div class="container p-5 ">
		<div class="d-flex justify-content-center h-100 p-3 mb-2 bg-gradient-secondary text-white">
			<form:form action="${pageContext.request.contextPath}/insertarDataEmpleado?codigoSucursal=${sucursalEncontrada.codigoSucursal}" method="POST" modelAttribute="empleado">
			
			    <br>
			    <h4><label>Nombre de empleado:&nbsp&nbsp</label>
				<form:input  class="redondeadonorelieve col-sm-6" type="text;hidden" name="snombre" path="nombre"/></h4>
				<form:errors path="nombre" class="p-1 mb-2 bg-danger text-white"></form:errors><br><br>
				
				<h4><label>Edad de empleado:&nbsp&nbsp</label>
				<form:input type="number" class="redondeadonorelieve col-sm-6" name="subicacion" path="edad"/></h4>
				<form:errors path="edad" class="p-1 mb-2 bg-danger text-white"></form:errors>
				
				<h4><label>Genero:&nbsp&nbsp</label>
				<label style="padding:1em"><form:radiobutton name="genero" path="genero" value="F"/>&nbspF</label>
				<label style="padding:1em"><form:radiobutton  name="genero" path="genero" value="M"/>&nbspM</label></h4>
				
				<h4><label>Estado:&nbsp&nbsp</label>
				<label style="padding:1em"><form:radiobutton name="estado" path="estado" value="true"/>&nbspActivo</label>
				<label style="padding:1em"><form:radiobutton  name="estado" path="estado" value="false"/>&nbspInactivo</label></h4>
				
				<input type="submit" class="btn btn-dark btn-lg" value="Agregar nuevo empleado">
			</form:form>
		</div>	
		<h1 class="p-3 mb-2 bg-dark text-white">${message3}</h1>
	</div>		
</body>
</html>