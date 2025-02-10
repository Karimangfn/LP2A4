package br.edu.ifsp.spo.lp2a4.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class TestaConexão {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Connection connection = new ConnectionFactory().getConnection();
	    System.out.println("Conexão aberta!");
	    connection.close();
	}

}
