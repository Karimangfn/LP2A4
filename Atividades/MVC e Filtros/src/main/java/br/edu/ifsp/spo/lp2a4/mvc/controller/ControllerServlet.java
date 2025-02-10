package br.edu.ifsp.spo.lp2a4.mvc.controller;

import java.io.IOException;


import br.edu.ifsp.spo.lp2a4.mvc.logica.Logica;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@SuppressWarnings("serial")
@WebServlet("/mvc")
public class ControllerServlet extends HttpServlet {
    protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        String parametro = request.getParameter("logica");
        String nomeDaClasse = "br.edu.ifsp.spo.lp2a4.mvc.logica." + parametro;

        try {
            @SuppressWarnings("rawtypes")
			Class classe = Class.forName(nomeDaClasse);

            @SuppressWarnings("deprecation")
			Logica logica = (Logica) classe.newInstance();
            String pagina = logica.executa(request, response);

            request.getRequestDispatcher(pagina).forward(request, response);

        } catch (Exception e) {
            throw new ServletException(
              "A lógica de negócios causou uma exceção", e);
        }
    }
}
