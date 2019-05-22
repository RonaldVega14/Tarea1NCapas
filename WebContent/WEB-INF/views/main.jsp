<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c"%>
    
<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Busca un Libro</title>
</head>
<body>

<form action = "${pageContext.request.contextPath}/formData" method = "POST">
	<label>Buscar por: </label>
  <select name="idCategory">
    <option value="1">---</option>
    <option value="2">ISBN</option>
    <option value="3">Autor</option>
    <option value="4">Género</option>
  </select>
	<br>
	<br>
	<input type = "text" name = "filtro"/><br><br>
	
	
	<form action="${pageContext.request.contextPath}/search" method = "post">
	<input type="submit" value = "Buscar">
	</form>
	<br>
	<form action="${pageContext.request.contextPath}/all" method = "post">
	<input type="submit" value = "Ver Todos">
	</form>

	
</body>
</html>