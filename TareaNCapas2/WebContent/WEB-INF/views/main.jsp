<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="resources/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container p-5 ">
		<div class="d-flex justify-content-center h-100 p-3 mb-2 bg-gradient-secondary text-white">
			<div>
				<h1>LOGIN</h1>
				<form:form  action="userLogin" method="POST" modelAttribute="usuario">
				        <br>
						<label>Nombre usuario: </label><br>
						<form:input  type="text" name="usuario" path="usuario"/><br>
						
					
					<br><label>Contrasenia: </label><br>
					<form:input type="password" name="clave" path="clave"/><br>
					<br><br>
					<input type="submit"  class="btn btn-info btn-lg" value="Ingresar"><br><br>
				</form:form>
			</div>	
		</div>
	</div>
</body>
</html>