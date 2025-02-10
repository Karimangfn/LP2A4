package Exercicio1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/Exercicio1HelloWorld")
public class Exercicio1HelloWorld extends HttpServlet {
// Para acessar a pagina: http://localhost:8080/Servlet_19092022/
       
    public Exercicio1HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter	out	=	response.getWriter();
		//	escreve	o	texto
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Hello World<h1/>");
		out.println("</body>");
		out.println("</html>");
	}
}
