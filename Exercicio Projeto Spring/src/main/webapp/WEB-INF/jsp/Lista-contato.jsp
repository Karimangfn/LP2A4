<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="css/Formulario.css" var="yourStyleCSS"></spring:url>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${yourStyleCSS}">
<meta charset="UTF-8">
<title>Lista Contato</title>
</head>
<body>
	<h2>Lista de Contatos</h2>
	<table>
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Endereco</th>
			<th>Data de Nascimento</th>
		</tr>
		<c:forEach items="${contatos}" var="contato">
			<tr>
				<td>${contato.nome}</td>
				<td>${contato.email}</td>
				<td>${contato.endereco}</td>
				<td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" /></td>
				<td><a href="removeContato?id=${contato.id}">Remover</a></td>
				<td><a href="atualizaContato?id=${contato.id}">Alterar</a></td>
			</tr>
		</c:forEach>
	</table>

	<h2>Opções</h2>
	<h3>
		<a href="novoContato">Adicionar novo Contato</a>
	</h3>
	<h3>
		<a href="procuraContato">Buscar novo Contato</a>
	</h3>
</body>
</html>