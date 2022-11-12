<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="css/Formulario.css" var="yourStyleCSS"></spring:url>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${yourStyleCSS}">
<meta charset="UTF-8">
<title>Contato Removido</title>
</head>
<body>
	<h3>Contato Removido com Sucesso!</h3>
	<a href=http://localhost:8080/spring/novoContato><button>Adicionar Novo Contato</button></a>
	<br/><br/>
	<a href=http://localhost:8080/spring/procuraContato><button>Buscar Novo Contato</button></a>
</body>
</html>