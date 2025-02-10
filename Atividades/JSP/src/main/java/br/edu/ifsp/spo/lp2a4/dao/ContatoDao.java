package br.edu.ifsp.spo.lp2a4.dao;

import java.util.HashMap;
import java.util.Map;
import br.edu.ifsp.spo.lp2a4.model.Contato;

public class ContatoDao {

	private static long count;
	private static Map<Long, Contato> banco = new HashMap<>();
	 
	 
	public void adiciona(Contato contato) {
		banco.put(++count, contato);
	}
	
	public Contato recuperaContato(long id) {
		return banco.get(id);
	}

	public Map<Long, Contato> getBanco() {
		return banco;
	}

	public void setBanco(Map<Long, Contato> banco) {
		ContatoDao.banco = banco;
	}
	

}
