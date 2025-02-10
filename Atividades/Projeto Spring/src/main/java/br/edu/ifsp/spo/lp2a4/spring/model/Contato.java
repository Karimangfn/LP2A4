package br.edu.ifsp.spo.lp2a4.spring.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.*;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;

@Entity
@Table(name="contatos")
public class Contato {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Size(min=5, message="O Nome deve ter pelo menos 5 caracteres")
	private String nome;
	
	@Size(min=5, max=50, message="O Endereco deve ter entre 5 e 50 caracteres")
	private String endereco;
	
	@Size(max=40, message="O Email deve ter no Maximo 40 caracteres")
	private String email;
	
	@DateTimeFormat(pattern="dd/MM/yyyy")
	@Temporal(TemporalType.DATE)
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
