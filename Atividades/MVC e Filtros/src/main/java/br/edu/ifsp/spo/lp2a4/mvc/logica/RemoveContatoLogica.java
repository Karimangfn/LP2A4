package br.edu.ifsp.spo.lp2a4.mvc.logica;

import br.edu.ifsp.spo.lp2a4.mvc.dao.ContatoDao;
import br.edu.ifsp.spo.lp2a4.mvc.model.Contato;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RemoveContatoLogica implements Logica {

    public String executa(HttpServletRequest request, HttpServletResponse response)
        throws Exception {

      long id = Long.parseLong(request.getParameter("id"));

      ContatoDao dao = new ContatoDao();

      Contato contato = new Contato();
      contato.setId(id);

      dao.remove(id);

      System.out.println("Excluindo contato... ");

      return "Lista-contatos.jsp";
    }

  }
