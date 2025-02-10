package br.edu.ifsp.spo.lp2a4.mvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.edu.ifsp.spo.lp2a4.mvc.jdbc.ConnectionFactory;
import br.edu.ifsp.spo.lp2a4.mvc.model.Contato;

public class ContatoDao {

	private Connection connection;

	public ContatoDao() throws ClassNotFoundException {
		this.connection = new ConnectionFactory().getConnection();
	}
	
	//Adicionando Contatos
	public void adiciona(Contato contato) {
		String sql = "insert into contatos " +
				"(nome,email,endereco,dataNascimento)" +
				" values (?,?,?,?)";

		try {
			PreparedStatement stmt = connection.prepareStatement(sql);

			stmt.setString(1,contato.getNome());
			stmt.setString(2,contato.getEmail());
			stmt.setString(3,contato.getEndereco());
			stmt.setDate(4, new java.sql.Date(
					contato.getDataNascimento().getTimeInMillis()));

			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	//Recuperando Contatos
	public List<Contato> getLista() {
		try {
			List<Contato> contatos = new ArrayList<Contato>();
			PreparedStatement stmt = this.connection.
					prepareStatement("select * from contatos");
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				Contato contato = new Contato();
				contato.setId(rs.getLong("id"));
				contato.setNome(rs.getString("nome"));
				contato.setEmail(rs.getString("email"));
				contato.setEndereco(rs.getString("endereco"));

				Calendar data = Calendar.getInstance();
				data.setTime(rs.getDate("dataNascimento"));
				contato.setDataNascimento(data);

				contatos.add(contato);
			}
			rs.close();
			stmt.close();
			return contatos;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	//Alterando Dados
	public void altera(String nome, String email, String endereco, Calendar dataNascimento, int id) {
	      String sql = "update contatos set nome=?, email=?,"+
	              "endereco=?, dataNascimento=? where id=?";

	      try {
	          PreparedStatement stmt = connection
	                  .prepareStatement(sql);
	          stmt.setString(1, nome);
	          stmt.setString(2, email);
	          stmt.setString(3, endereco);
	          stmt.setDate(4, new java.sql.Date(dataNascimento
	                  .getTimeInMillis()));
	          stmt.setLong(5, id);
	          stmt.execute();
	          stmt.close();
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	
	//Removendo Dados
	public void remove(long id) throws SQLException {
		PreparedStatement stmt1 = this.connection.
				prepareStatement("select * from contatos where id=" + id);
		ResultSet rs = stmt1.executeQuery();
		
		while (rs.next()) {
			Contato contato = new Contato();
			contato.setId(rs.getLong("id"));
			contato.setNome(rs.getString("nome"));
			contato.setEmail(rs.getString("email"));
			contato.setEndereco(rs.getString("endereco"));

			Calendar data = Calendar.getInstance();
			data.setTime(rs.getDate("dataNascimento"));
			contato.setDataNascimento(data);
			
			 PreparedStatement stmt = connection
	                  .prepareStatement("delete from contatos where id=?");
	          stmt.setLong(1, contato.getId());
	          stmt.execute();
	          stmt.close();        
		}	                   
	  }			
}
