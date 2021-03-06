package org.atomsk.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class AjaxFilter
 */
@WebFilter({"/quiz", "/idCheck"})
public class AjaxFilter implements Filter {

    /**
     * Default constructor. 
     */
    public AjaxFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		System.out.println(request.getRemoteAddr());
		
	  ((HttpServletResponse) response)
	    .addHeader("Access-Control-Allow-Origin", "*");
	  
	  ((HttpServletResponse) response)
	    .addHeader("Access-Control-Allow-Methods",
	    		"GET, OPTIONS, HEAD, PUT, POST");
	 
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}