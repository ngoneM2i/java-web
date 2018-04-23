package com.aiconoa.hello;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodoListServlet
 */
@WebServlet("/TodoListServlet/*")
public class TodoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TodoListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setHeader("Content-Type", "text/html");
		response.setCharacterEncoding("UTF-8");
		
		// pathInfo est ce qui vient après le ServletPath dans l'URI
		String pathInfo = request.getPathInfo();
		
		if(pathInfo == null) { // rien après le ServletPath ?
			response.getWriter().append("<ul>");
			response.getWriter().append("<li><a href=\"http://localhost:8080/helloweb/TodoListServlet/1\">todo list 1</a></li>");
			response.getWriter().append("<li><a href=\"http://localhost:8080/helloweb/TodoListServlet/2\">todo list 2</a></li>");
			response.getWriter().append("</ul>");
			return;
		}
		
		if (! pathInfo.substring(1).matches("\\d+")) { // uniquement des chiffres ?
			response.setStatus(404);
			response.getWriter().append("<p>404 - La page demandée n'existe pas</p>");
			return;
		}

		int id = Integer.parseInt(pathInfo.substring(1));
		TodoListRepository repo = new TodoListRepository();
		ArrayList<Todo> todoList = repo.findTodoListById(id);
		
		if(todoList == null) { // la todo liste existe ?
			response.setStatus(404);
			response.getWriter().append("<p>404 - La page demandée n'existe pas</p>");
			return;
		}
			
		response.getWriter().append("<a href=\"http://localhost:8080/helloweb/TodoListServlet\">retour vers accueil</a>");
		response.getWriter().append("<ul>");
		for (Todo todo : todoList) {
			response.getWriter().append("<li>" + todo.getTitle() + "</li>");
		}
		response.getWriter().append("</ul>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
