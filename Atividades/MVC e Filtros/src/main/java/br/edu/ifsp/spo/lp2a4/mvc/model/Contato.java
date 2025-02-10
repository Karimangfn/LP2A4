package br.edu.ifsp.spo.lp2a4.mvc.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Contato {
	private Long Id;
	private String nome;
	private String endereco;
	private String email;
	private Calendar dataNascimento;

	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	@Override
	public String toString() {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		return "Nome: " + this.nome + "\nEndereco: " + this.endereco + "\nEmail: " + this.email
				+ "\nData de Nascimento: " + dateFormat.format(dataNascimento.getTime());
	}
}
