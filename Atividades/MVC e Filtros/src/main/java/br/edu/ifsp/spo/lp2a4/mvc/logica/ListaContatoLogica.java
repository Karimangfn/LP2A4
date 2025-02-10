package br.edu.ifsp.spo.lp2a4.mvc.logica;

import java.util.List;

import br.edu.ifsp.spo.lp2a4.mvc.dao.ContatoDao;
import br.edu.ifsp.spo.lp2a4.mvc.model.Contato;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ListaContatoLogica implements Logica {

    public String executa(HttpServletRequest request, HttpServletResponse response)
        throws Exception {

      List<Contato> contatos = new ContatoDao().getLista();
    
      System.out.println(contatos);

      request.setAttribute("contatos", contatos);

      return "Lista-contatos.jsp";
    }
  }
