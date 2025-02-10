package br.edu.ifsp.spo.lp2a4.spring.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.edu.ifsp.spo.lp2a4.spring.model.Contato;

@PersistenceContext(name = "persistence-unit")
@Repository
public class ContatoDao implements ContatoDaoInterface{

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
	public List<Contato> busca(Long Id)  {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");

		EntityManager manager = factory.createEntityManager();
			
		Contato encontrado = manager.find(Contato.class, Id);
		
		List<Contato> contatos = new ArrayList<Contato>();
		
		System.out.println(encontrado);
	    encontrado.getNome();
		encontrado.getEmail();
		encontrado.getEndereco();
		encontrado.getDataNascimento();
		
		contatos.add(encontrado);
		
		return contatos;		
	}
	
	
	// Atualiza Contatos
	public void atualiza(Long Id, String nome, String email, String endereco, Calendar dataNascimento) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");

		EntityManager manager = factory.createEntityManager();
		
		Contato contato = new Contato();
		contato.setId(Id); 
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		contato.setDataNascimento(dataNascimento);

		manager.getTransaction().begin();
		manager.merge(contato);
		manager.getTransaction().commit();
	}
	
	// Remove Contatos
	public void remove(Long Id) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");

		EntityManager manager = factory.createEntityManager();
			
	    Contato encontrado = manager.find(Contato.class, Id);

		manager.getTransaction().begin();
		manager.remove(encontrado);
		manager.getTransaction().commit();
	}
	
}