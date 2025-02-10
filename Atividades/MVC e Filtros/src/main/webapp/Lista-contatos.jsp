<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Contatos</title>
</head>
<body>
	<h1>Agenda de Contatos</h1>
	<jsp:useBean id="dao" class="br.edu.ifsp.spo.lp2a4.mvc.dao.ContatoDao" />
	<table>
		<c:forEach var="contato" items="${dao.lista}">
			<tr>
				<td>ID: ${contato.id}</td>
				<td>Nome: ${contato.nome}</td>
				<td>Endereco: ${contato.endereco}</td>
				<td>Email: ${contato.email}</td>
				<td>Data de Nascimento: <fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy" /></td>
				<td><a href="http://localhost:8080/LP2-Maven-MVC_Filtro/Atualiza-contato.html">Alterar</a>
				<td><a href="mvc?logica=RemoveContatoLogica&id=${contato.id}">Remover</a>
				</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>