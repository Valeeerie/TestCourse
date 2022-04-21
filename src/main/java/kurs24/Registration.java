package kurs24;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

/**
 * Servlet implementation class Registration
 */
@WebServlet(name = "Registration", urlPatterns = "/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Registration() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, FileNotFoundException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("/RegistrationJSP.jsp");
		dispatcher.forward(request, response);


//        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
// 	    dispatcher.forward(request, response);
		
	}
}
