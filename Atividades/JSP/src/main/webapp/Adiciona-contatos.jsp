<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
    <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
    <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
</head>
<title>Adiciona Contatos tagfiles</title>
<body>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<%@taglib tagdir="/WEB-INF/tags" prefix="tag" %>
	
	<c:import url="Header.jsp" />
    <form action="adicionaContatoTag">
      Nome: <input type="text" name="nome" /><br />
      E-mail: <input type="text" name="email" /><br />
      Endereço: <input type="text" name="endereco" /><br />
      Data Nascimento: <tag:campoData id="dataNascimento" /><br />
      <input type="submit" value="Gravar" />
    </form>
	<c:import url="Footer.jsp" />
</body>
</html>