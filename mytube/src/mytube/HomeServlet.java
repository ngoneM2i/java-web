package mytube;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HomeServlet
 */
@WebServlet("/home")
public class HomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String pathInfo = request.getPathInfo();
			if(pathInfo == null) {
				request.getRequestDispatcher("/home.jsp").forward(request, response);
				return;
			}
			
			if (! pathInfo.substring(1).matches("\\d+")) {
				response.setStatus(404);
				request.getRequestDispatcher("/404.jsp").forward(request, response);
			}
			
			int id = Integer.parseInt(pathInfo.substring(1));
			VideoRepository repo = new VideoRepository();
			Video videoDetail = repo.findVideoById(id); 
			
	
		
			if( videoDetail  == null) { // la liste de video existe ?
				response.setStatus(404);
				request.getRequestDispatcher("/404.jsp").forward(request, response);
			}

			request.setAttribute(" videoDetail ",  videoDetail );
			request.setAttribute("img1", "<div class=\"items\"><img src=\"img/img/five.webp\" alt=\"\"></div>");
			
			
			
			request.getRequestDispatcher("/home.jsp").forward(request, response);
			return;
		
		//request.getRequestDispatcher("home.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
