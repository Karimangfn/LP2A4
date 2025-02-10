<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="css/Formulario.css" var="yourStyleCSS"></spring:url>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${yourStyleCSS}">
<meta charset="UTF-8">
<title>Menu</title>
</head>
<body>
	<h2>Página inicial da Lista de Tarefas</h2>
    <p>Bem vindo, ${usuarioLogado.login}</p> 
    <a href="procuraContato">Clique aqui</a> para acessar a Busca de Contatos! <br />
    <a href="novoContato">Clique aqui</a> para adicionar Novos Contatos! <br />
    <a href="logout">Sair do sistema</a>
</body>
</html>