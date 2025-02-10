package br.edu.ifsp.spo.lp2a4.jpa.model;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name="contatos")
public class Contato {
	
	@Id
	@GeneratedValue
	private Long Id;
	
	@Column (length=2000)
	private String nome;
	
	@Column (length=2000)
	private String endereco;
	
	@Column (nullable=false)
	private String email;
	
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
