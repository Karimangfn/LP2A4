package br.edu.ifsp.spo.lp2a4.spring.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="usuarios")
public class Usuario {
	
	@Id
	@Size(min=5, message="O Login deve ter pelo menos 5 caracteres")
	private String login;
	

	@Size(min=5, max=50, message="O Senha deve ter entre 5 e 50 caracteres")
	private String senha;
	
	
	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	@Override
	public String toString() {

		return "Login: " + this.login + "\nSenha: " + this.senha;
}

}