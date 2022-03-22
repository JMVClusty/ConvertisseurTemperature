package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modeles.Temperature;

/**
 * Servlet implementation class Convertisseur
 */
@WebServlet("/convertisseur")
public class Convertisseur extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Convertisseur() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Méthode Get: on affiche le formulaire
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String maVue = "/convertisseur.jsp";
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String choixConversion = request.getParameter("unit");
		String valCelsius = request.getParameter("result");
		String valFahrentheit = request.getParameter("result");
		String choix = request.getParameter("unit");

		if (choix.equals("f")) {
			// Action: appliquons le convertisseur. Espérons que valCelsius représente
			// bien un nombre, sinon...

			Temperature temp = new Temperature(Double.valueOf(valCelsius));

			// Enregistrons l'objet dans la requête
			request.setAttribute("temperature", temp);
			request.setAttribute("valCelsius", valCelsius);
			request.setAttribute("choix", choix);
		}else if(choix.equals("c")){
			Temperature temp = new Temperature(Double.valueOf(valFahrentheit));
//            // Enregistrons l'objet dans la requête
            request.setAttribute("temperature", temp);
			request.setAttribute("valFahrentheit", valFahrentheit);
			request.setAttribute("choix", choix);
    
		}

			// Transfert à la vue
			String maVue = "/convertisseurReponse.jsp";
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(maVue);
			dispatcher.forward(request, response);
		}
	}

