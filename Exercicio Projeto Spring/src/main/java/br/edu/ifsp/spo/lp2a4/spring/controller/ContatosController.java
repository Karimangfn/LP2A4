package br.edu.ifsp.spo.lp2a4.spring.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifsp.spo.lp2a4.spring.dao.ContatoDao;
import br.edu.ifsp.spo.lp2a4.spring.model.Contato;

@Controller
@RequestMapping("/")
public class ContatosController {
	
	private ContatoDao dao;
	
	@Autowired
    public ContatosController(ContatoDao dao) {
        this.dao = dao;  
    }
	
	@RequestMapping("/atualizaContato")
	public String atualiza(Contato contato) {
		return "Atualiza-contato";
	}
	
	@RequestMapping("/atualizandoContato")
	public String atualizando(@Valid Contato contato,BindingResult result) {
		if (result.hasErrors()) {
			  System.out.println("Erro");
			  return "Atualiza-contato";
		  }
		
		dao.atualiza(contato.getId(), contato.getNome(), contato.getEmail(), contato.getEndereco(), contato.getDataNascimento());
		return "redirect:contatoAtualizado";
	}
		
	@RequestMapping("/contatoAtualizado")
	public String atualizado() {
		return "Contato-atualizado";
	}
	
	@RequestMapping("/removeContato")
	public String remove(Contato contato) {
	      dao.remove(contato.getId());
	      return "redirect:contatoRemovido";
	 }
	
	@RequestMapping("/contatoRemovido")
	public String removido() {
		return "Contato-removido";
	}
	
	@RequestMapping("/procuraContato")
	public String procura() {	
		return "Procura-contato";
	}
	
	@RequestMapping("/listaContato")
	public String lista(Contato contato, Model model) {
		model.addAttribute("contatos", dao.busca(contato.getId()));
		return "Lista-contato";
	}
	
	@RequestMapping("/novoContato")
	public String form() {
	      return "Formulario";
	}
	
	@RequestMapping("/adicionaContato")
	public String adiciona(@Valid Contato contato, BindingResult result) {
	  
	  if (result.hasErrors()) {
		  System.out.println("Erro");
		  return "Formulario";
	  }
	  
	  dao.adiciona(contato);
	  
	  return "Contato-adicionado";
	}
}
