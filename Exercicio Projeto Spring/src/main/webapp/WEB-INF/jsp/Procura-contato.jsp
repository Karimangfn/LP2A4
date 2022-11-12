<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="css/Formulario.css" var="yourStyleCSS"></spring:url>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${yourStyleCSS}">
<meta charset="UTF-8">
<title>Procura Contato</title>
</head>
<body>
	<h1>Buscar Contatos</h1>
	<form action="listaContato">
      ID: <input type="text" name="id" /><br />
      <input type="submit" value="Buscar" />
    </form>
</body>
</html>