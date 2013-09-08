package com.telnet.radius.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.telnet.radius.model.Manager;

public class AdminSessionFilter implements Filter {

	public AdminSessionFilter() {
	
	}

	@Override
	public void destroy() {
		

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse res = (HttpServletResponse)response;
		Manager manager = (Manager)req.getSession().getAttribute("manager");
		
		String url = req.getRequestURL().toString();
		System.out.println(url);
		if (manager != null) {
			chain.doFilter(request, response);
		} else {
			res.sendRedirect("/radius/admin");
			return;
		}
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		

	}

}
