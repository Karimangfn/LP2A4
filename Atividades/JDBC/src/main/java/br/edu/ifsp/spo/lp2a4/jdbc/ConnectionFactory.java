package br.edu.ifsp.spo.lp2a4.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConnectionFactory {
	public Connection getConnection() throws ClassNotFoundException {
	      try {
	    	  Class.forName("com.mysql.cj.jdbc.Driver"); 
	          return DriverManager.getConnection(
	          "jdbc:mysql://localhost/JavaJDBC", "root", "password");
	      } catch (SQLException e) {
	          throw new RuntimeException(e);
	      }
	  }
	}
