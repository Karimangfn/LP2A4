package br.edu.ifsp.spo.lp2a4.spring.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.edu.ifsp.spo.lp2a4.spring.model.Usuario;

public class UsuarioDao {

	public boolean existeUsuario(Usuario usuario) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("usuarios");

		EntityManager manager = factory.createEntityManager();

		Usuario encontrado = manager.find(Usuario.class, usuario.getLogin());
		
		if (encontrado.getSenha().equals(usuario.getSenha()) &&
			encontrado.getLogin().equals(usuario.getLogin())) {
			System.out.println("encontrei");
			return true;
		}
		else {
			System.out.println("não encontrei");
			return false;
			
		}

	}
}