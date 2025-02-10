package br.edu.ifsp.spo.lp2a4.jpa.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import br.edu.ifsp.spo.lp2a4.jpa.dao.ContatoDao;
import br.edu.ifsp.spo.lp2a4.jpa.model.Contato;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/buscaContato")
public class BuscaContatoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,
			HttpServletResponse response)
					throws IOException, ServletException {

		PrintWriter out = response.getWriter();
		
        int id = Integer.parseInt(request.getParameter("id"));
       
		ContatoDao dao = new ContatoDao();
			
		List<Contato> contatos = dao.busca(id);

		for (Contato contato : contatos) {
			out.println("<html>");
	        out.println("<body>");
	        out.println("<body>");
	        out.println("<h1>Busca Contato</h1>");
			out.println("Nome: " + contato.getNome() + "<br>");
			out.println("Email: " + contato.getEmail() + "<br>");
			out.println("Endereco: " + contato.getEndereco() + "<br>");
			out.println("Data de Nascimento: " + contato.getDataNascimento().getTime() + "<br>");
			out.println("<a href=\"http://localhost:8080/LP2-Maven-JPA/Busca-contato.html\"><button>Voltar</button></a>");
	        out.println("</body>");
	        out.println("</html>");
		}

	}

}
