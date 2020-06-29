package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoCliente;
import modelo.Clientes;

/**
 * Servlet implementation class GestionarMejora
 */
@WebServlet("/GestionarMejora")
public class GestionarMejora extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionarMejora() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DaoCliente daocli = new DaoCliente();
		List<Clientes> regcli = new ArrayList<Clientes>();
		regcli = daocli.listar();
		request.setAttribute("listaclientes", regcli);
		
		request.getRequestDispatcher("preingresomejoras.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("idcli", request.getParameter("idcliente"));
		request.setAttribute("nomcli", request.getParameter("nombrecliente"));
		request.getRequestDispatcher("agregarmejora.jsp").forward(request, response);
	}

}
