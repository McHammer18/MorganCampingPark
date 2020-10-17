package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




//this is where the user is either directed to a camper/hiker page



/**
 * Servlet implementation class ChooseTypeServlet
 */
@WebServlet("/ChooseTypeServlet")
public class ChooseTypeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChooseTypeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String choice = request.getParameter("type");
		
		if (choice.equals("camper")) {
			getServletContext().getRequestDispatcher("/camper.jsp").forward(request, response);
		}
		else if(choice.equals("hiker")) {
			System.out.println("hike");
			//getServletContext().getRequestDispatcher("/hiker.jsp").forward(request, response);
		}
	}

}
