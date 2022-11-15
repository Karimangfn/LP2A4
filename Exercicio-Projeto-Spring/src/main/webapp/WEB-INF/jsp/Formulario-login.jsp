<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="css/Formulario.css" var="yourStyleCSS"></spring:url>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${yourStyleCSS}">
<meta charset="UTF-8">
<title>Formulario de Login</title>
</head>
<body>
	<h2>Página de Login</h2>
	<form action="efetuaLogin" method="post">
	Login: <input type="text" name="login" /> <br /> 
	Senha: <input type="password" name="senha" /> <br /> 
	<input type="submit" value="Entrar nos Contatos" />
	</form>
</body>
</html>