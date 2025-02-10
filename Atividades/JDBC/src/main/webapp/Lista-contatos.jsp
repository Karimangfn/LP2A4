<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista Contatos</title>
</head>
<body>	
	<%@ page import="java.util.*" %>
	<%@ page import="java.sql.*" %>
	<%@ page import="br.edu.ifsp.spo.lp2a4.jdbc.dao.ContatoDao" %>
	<%@ page import="br.edu.ifsp.spo.lp2a4.jdbc.model.Contato" %>
	<%@ page import="br.edu.ifsp.spo.lp2a4.jdbc.*" %>

	<h1>Agenda de Contatos</h1>
	<%
	ContatoDao dao = new ContatoDao();

	List<Contato> contatos = dao.getLista();

	for (Contato contato : contatos) {
		out.println("Nome: " + contato.getNome()+ "<br>");
		out.println("Email: " + contato.getEmail()+ "<br>");
		out.println("Endereço: " + contato.getEndereco()+ "<br>");
		out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "<br>");
		out.println("<br>");
	}
	%>
	
</body>
</html>