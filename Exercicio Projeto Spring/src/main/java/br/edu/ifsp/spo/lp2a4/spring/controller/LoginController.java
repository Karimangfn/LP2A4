package br.edu.ifsp.spo.lp2a4.spring.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.edu.ifsp.spo.lp2a4.spring.dao.UsuarioDao;
import br.edu.ifsp.spo.lp2a4.spring.model.Usuario;

@Controller
public class LoginController {

	@RequestMapping("/loginForm")
	public String loginForm() {
	  return "Formulario-login";
	}
	
	@RequestMapping("/efetuaLogin")
	public String efetuaLogin(Usuario usuario, HttpSession session) {
		if(new UsuarioDao().existeUsuario(usuario)) {
			session.setAttribute("usuarioLogado", usuario);
			return "menu";
		} else {
			return "redirect:loginForm";
		}
	}
	
	@RequestMapping("logout")
	  public String logout(HttpSession session) {
	      session.invalidate();
	      return "redirect:loginForm";
	  }	
}
