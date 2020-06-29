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
import dao.DaoVisita;
import modelo.Clientes;
import modelo.Visitas;
import modelo.VisitasGeneradas;

/**
 * Servlet implementation class AgregarCapacitacion
 */
@WebServlet("/AgregarCapacitacion")
public class AgregarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		// datos del cliente
		System.out.println("capturamos tabla del cliente desde servlet Get");
		DaoCliente cliDao = new DaoCliente();
		List<Clientes> listacli = new ArrayList<Clientes>();
		listacli = cliDao.listar(); 
		
		
		//captuta datos visita
		System.out.println("capturamos tabla del cliente desde servlet Get");
		DaoVisita daovisita = new DaoVisita();
		List<Visitas> listavisitas = new ArrayList<Visitas>();
		listavisitas = daovisita.listar();
		
		
		System.out.println("capturamos datos visita desde servlet Get");
	
		
		// envio datos del cliente
		request.setAttribute("listaclientes", listacli);
		
		// envio datos de la visitas existentes
		
		
		request.setAttribute("listavisitas", listavisitas);
		
		System.out.print("lista visitas " + listavisitas);
		request.getRequestDispatcher("agregarcapacitacion.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
	
		
		
	}

}
