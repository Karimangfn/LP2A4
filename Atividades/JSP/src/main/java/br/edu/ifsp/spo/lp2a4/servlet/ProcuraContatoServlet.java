package br.edu.ifsp.spo.lp2a4.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import br.edu.ifsp.spo.lp2a4.dao.ContatoDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet("/procuraContato")
public class ProcuraContatoServlet extends HttpServlet{
		
	protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		int id = Integer.parseInt(request.getParameter("id"));
		
		ContatoDao dao = new ContatoDao();
		
		out.println("<html>");
        out.println("<body>");
        out.println("<body>");
        out.println("Contato: " + "<br/>" + dao.recuperaContato(id));
        out.println("<br/>");
        out.println("<a href=\"http://localhost:8080/LP2-Maven-JSP/Adiciona-contatos.html\"><button>Voltar</button></a>");
        out.println("</body>");
        out.println("</html>");
	}
}
