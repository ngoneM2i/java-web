package com.aiconoa.hello;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter()
				.append("GET Served at: ")
				.append(request.getContextPath());
		
		response.getWriter()
				.append("method: ")
				.append(request.getMethod());
		
		System.out.println("");
		
		response.getWriter()
				.append("URL: ")
				.append(request.getRequestURI());
		System.out.println("");
		
		response.getWriter()
				.append("Servelet path: ")
				.append(request.getServletPath());
		System.out.println("");
		
		
		response.getWriter()
				.append("scheme: ")
				.append(request.getScheme());
		System.out.println("");
		
		response.getWriter()
				.append("server name: ")
				.append(request.getServerName());
		System.out.println("");
		
		response.getWriter()
		    	.append("user agents: ")
		    	.append(request.getHeader("User-Agent"));
		System.out.println("");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.getWriter().append("POST Served at: ").append(request.getContextPath());
	}

}
