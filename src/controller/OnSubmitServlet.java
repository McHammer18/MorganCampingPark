package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Hiker;
import models.camper;


//THIS HANDLES SUBMIT FOR A HIKER ENTITY



/**
 * Servlet implementation class OnSubmitServlet
 */
@WebServlet("/OnSubmitServlet")
public class OnSubmitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OnSubmitServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Variables that request the inputs of the user
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String phone = request.getParameter("phone");
		String date = request.getParameter("date");
		Date dateS = java.sql.Date.valueOf(date);
		System.out.println(dateS.toString());
		//Using the model and controller to add input to a table
		Hiker li = new Hiker(firstName, lastName, phone, dateS);

		HikerHelper dao = new HikerHelper();
		dao.insertItem(li);

		//Sends user back to the homepage to enter another store
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);
	}

}
