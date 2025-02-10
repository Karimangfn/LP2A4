<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSP</title>
</head>
<body>	
	<%@ page import="java.util.*" %>
	<%@ page import="br.edu.ifsp.spo.lp2a4.dao.*" %>
	<%@ page import="br.edu.ifsp.spo.lp2a4.model.*" %>

	<h1>Agenda de Contatos</h1>
	<%
	ContatoDao dao = new ContatoDao();
	Map<Long, Contato> banco = dao.getBanco();
	
	if (banco.isEmpty()) {
		out.println("Nenhum Contato Adicionado!");
		out.println("<br/>"); out.println("<br/>");
		out.println("<a href=\"http://localhost:8080/LP2-Maven-JSP/Adiciona-contatos.html\"><button>Adicionar Contatos</button></a>");
	} else {
	for (Map.Entry<Long, Contato> entry : banco.entrySet()) {
	    Contato value = entry.getValue();
	    out.println(value);
	    out.println("<br/>");
	}
	}
	%>
</body>
</html>