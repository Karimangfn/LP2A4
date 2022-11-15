package br.edu.ifsp.spo.lp2a4.spring.dao;

import java.util.Calendar;
import java.util.List;

import br.edu.ifsp.spo.lp2a4.spring.model.Contato;

public interface ContatoDaoInterface {
	
	void adiciona(Contato contato);
	List<Contato> busca(Long Id);
	public void atualiza(Long Id, String nome, String email, String endereco, Calendar dataNascimento);
	public void remove(Long Id);
	
}
