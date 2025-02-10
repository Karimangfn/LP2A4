<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<spring:url value="css/Formulario.css" var="yourStyleCSS"></spring:url>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="${yourStyleCSS}">
<meta charset="UTF-8">
<title>Atualizando Contatos</title>
</head>
<body>
	<h1>Atualiza Contatos</h1>
    <hr/>
    <form action="atualizandoContato">
      <form:errors path="contato.*"/><br/>
      ID: <input type="text" name="id" /><br />
      Nome: <input type="text" name="nome" /><br />
      E-mail: <input type="text" name="email" /><br />
      Endereço: <input type="text" name="endereco" /><br />
      Data Nascimento:
      <input type="text" name="dataNascimento" /><br />
      <input type="submit" value="Atualizar" />
    </form>
</body>
</html>