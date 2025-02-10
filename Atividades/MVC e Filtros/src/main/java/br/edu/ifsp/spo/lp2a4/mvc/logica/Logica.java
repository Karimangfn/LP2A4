package br.edu.ifsp.spo.lp2a4.mvc.logica;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface Logica {
	String executa(HttpServletRequest request,
            HttpServletResponse response) throws Exception;
}
