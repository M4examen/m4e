package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoReporte;
import modelo.Reportes;

/**
 * Servlet implementation class GestionarReporteGlobal
 */
@WebServlet("/GestionarReporteGlobal")
public class GestionarReporteGlobal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionarReporteGlobal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		DaoReporte daoreporte = new DaoReporte();
		List<Reportes> listarepomejora = new ArrayList<Reportes>();
		List<Reportes> listarepoaccidente = new ArrayList<Reportes>();
		List<Reportes> listarepovisita = new ArrayList<Reportes>();
		List<Reportes> listarepovisitacapacitacion = new ArrayList<Reportes>();
		
	
		listarepomejora = daoreporte.listarMejoras(0);
		listarepoaccidente = daoreporte.listarAccidentes(0);
		listarepovisita = daoreporte.listarVisitas(0);
		listarepovisitacapacitacion = daoreporte.listarVisitasCapacitacion(0);
		
		
		request.setAttribute("listmejora", listarepomejora);
		request.setAttribute("listaccidente", listarepoaccidente);
		request.setAttribute("listvisita", listarepovisita);
		request.setAttribute("listvisitacapacitacion", listarepovisitacapacitacion);

		request.getRequestDispatcher("reporteglobal.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
				
		
	}

}
