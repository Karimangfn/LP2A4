package br.edu.ifsp.spo.lp2a4.jpa.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ifsp.spo.lp2a4.jpa.model.Contato;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ContatoDao {

	//Adicionando Contatos
	public void adiciona(Contato contato) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");

		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();     
		manager.persist(contato);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
}
	//Busca contatos
	public List<Contato> busca(int Id)  {
	
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");

		EntityManager manager = factory.createEntityManager();
			
		Contato encontrado = manager.find(Contato.class, Id);
		
		List<Contato> contatos = new ArrayList<Contato>();
		
	    encontrado.getNome();
		encontrado.getEmail();
		encontrado.getEndereco();
		encontrado.getDataNascimento();
		
		contatos.add(encontrado);
		
		return contatos;		
	}
	
	
	// Atualiza Contatos
	public void atualiza(int Id, String nome, String email, String endereco, Calendar dataNascimento) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");

		EntityManager manager = factory.createEntityManager();
		
		Contato contato = new Contato();
		contato.setId((long) Id); 
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataNascimento);

		manager.getTransaction().begin();
		manager.merge(contato);
		manager.getTransaction().commit();
	}
	
	// Remove Contatos
	public void remove(int Id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");

		EntityManager manager = factory.createEntityManager();
			
	    Contato encontrado = manager.find(Contato.class, Id);

		manager.getTransaction().begin();
		manager.remove(encontrado);
		manager.getTransaction().commit();
	}
	
}
	
