package mytube;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.mapping.Set;

/**
 * Servlet implementation class VideoFormCreateServlet
 */
@WebServlet("/video-create ")
public class VideoFormCreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VideoFormCreateServlet() {
    	
       }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.getWriter().append("Served at: ").append(request.getContextPath());
			
			request.getRequestDispatcher("/video-create.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String title = request.getParameter("title");
		String source = request.getParameter("source");
		String description = request.getParameter("description");
		String commentaire = request.getParameter("commentaire");
		
		String author = request.getParameter("author");
		String datepub = request.getParameter("datePub");
		String nbVues =request.getParameter("nbVues");
		String nbLikes =request.getParameter("nbLikes");
		String nbDisLikes =request.getParameter("nbDisLikes");

		/*response.setContentType("text/html");

		PrintWriter out = response.getWriter();
		
		out.println(title);
		out.println(source);
		out.println(description);
		out.println(commentaire);
		out.println(author);
		out.println(datepub);
		out.println(nbVues);
		out.println(nbLikes);
		out.println(nbDisLikes);*/
		
		
		
	
		HashMap<String, String> validationErrors = new HashMap<String, String>();
		boolean validator = true;
		
		if(title.length() < 5) {
			validator = false;
			validationErrors.put("title", "le titre est trop court");
		}
		
		if(description.length() < 10) {
			validator = false;
			validationErrors.put("description", "la description est trop courte");
		}
		
		if(source.isEmpty()) {
			validator = false;
			validationErrors.put("source", "il faut une source!");
		}
		
		if(commentaire.isEmpty()) {
			validator = false;
			validationErrors.put("commentaire", "ce champ ne doit pas être vide!");
		}
		if(author.isEmpty()) {
			validator = false;
			validationErrors.put("author", "il faut le nom de l'auteur");
		}
		
		if(datepub.isEmpty()) {
			validator = false;
			validationErrors.put("datepub", "renseigner la date");
		}
		
		if(nbVues.isEmpty()) {
			validator = false;
			validationErrors.put("nbVues", "donnez le nombre de vues");
		}
		
		if(nbLikes.isEmpty()) {
			validator = false;
			validationErrors.put("nbLikes", "donnez le nombre de likes");
		}
		
		if(nbDisLikes.isEmpty()) {
			validator = false;
			validationErrors.put("nbDisLikes", "donnez le nombre de dislikes");
		}
		
        
        Iterator iterator = validationErrors.entrySet().iterator();
        while (iterator.hasNext()) {
          request.setAttribute("validationErrors", validationErrors);
          request.getRequestDispatcher("/video-create.jsp").forward(request, response);
        }
        
        request.setAttribute("title",title);     
        request.setAttribute("source",source);
        request.setAttribute("description",description);
        request.setAttribute("commentaire",commentaire);
        request.setAttribute("author",author);
        request.setAttribute("datepub",title);
        request.setAttribute("nbVues",nbVues);
        request.setAttribute("nbLikes",nbLikes);
        request.setAttribute("nbDisLikes",nbDisLikes);
        
        request.getRequestDispatcher("/video-create.jsp").forward(request, response);
        
        
	}

}
