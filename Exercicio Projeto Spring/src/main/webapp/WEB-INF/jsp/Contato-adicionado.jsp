<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="css/Formulario.css" var="yourStyleCSS"></spring:url>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${yourStyleCSS}">
<meta charset="UTF-8">
<title>Contato Adicionado</title>
</head>
<body>
	<h3>Novo contato adicionado com Sucesso</h3>
	<a href=http://localhost:8080/spring/novoContato><button>Voltar</button></a>
</body>
</html>