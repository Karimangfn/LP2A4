package br.edu.ifsp.spo.lp2a4.jpa.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import br.edu.ifsp.spo.lp2a4.jpa.dao.ContatoDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/removeContato")
public class RemoveContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		
        int id = Integer.parseInt(request.getParameter("id"));
       
		ContatoDao dao = new ContatoDao();
		
		dao.remove(id);
		
		out.println("<html>");
        out.println("<body>");
        out.println("<body>");
        out.println("Contato Removido com Sucesso! " + "<br/>");
        out.println("<br/>");
        out.println("<a href=\"http://localhost:8080/LP2-Maven-JPA/Remove-contato.html\"><button>Voltar</button></a>");
        out.println("</body>");
        out.println("</html>");
		
	}
}
