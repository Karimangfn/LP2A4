package br.edu.ifsp.spo.lp2a4.spring.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AutorizadorInterceptor implements HandlerInterceptor {
	
	@Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object Controller) throws Exception {
		String uri = request.getRequestURI();
		  if( uri.endsWith("loginForm")   ||
		      uri.endsWith("efetuaLogin")) {
		      return true;
		  }
		
		if (request.getSession().getAttribute("usuarioLogado") != null) {
            return true;
        } else {
        	response.sendRedirect("loginForm");
            return false;
        }

    }
}
