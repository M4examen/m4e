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
import modelo.Reportes;
import dao.DaoReporte;

/**
 * Servlet implementation class GestionarReporteCliente
 */
@WebServlet("/GestionarReporteCliente")
public class GestionarReporteCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GestionarReporteCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("reportecliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DaoCliente daocli = new DaoCliente();
		
		Clientes datocliente = new Clientes();
		System.out.println("datocliente antes de asignar busqueda: " + datocliente);
		
		datocliente = daocli.buscar(Integer.parseInt(request.getParameter("idcli")));
		
		boolean existecliente = false;
		String mensaje = "";
		String nomcliente = "";
		String urlRevisarCliente = "";
		
		DaoReporte daoreporte = new DaoReporte();
		List<Reportes> listarepomejora = new ArrayList<Reportes>();
		List<Reportes> listarepoaccidente = new ArrayList<Reportes>();
		List<Reportes> listarepovisita = new ArrayList<Reportes>();
		List<Reportes> listarepovisitacapacitacion = new ArrayList<Reportes>();
		
		if(datocliente.getIdCliente() == 0) {
			System.out.println("es cero cliente no existe");
			mensaje = "Cliente no existe, confirme ID Cliente en ";
			urlRevisarCliente = "RevisarCliente";
		} else {
			System.out.println("cliente existe" + datocliente.getNombreCliente());
			existecliente = true;
			nomcliente = datocliente.getNombreCliente();
			listarepomejora = daoreporte.listarMejoras(datocliente.getIdCliente());
			listarepoaccidente = daoreporte.listarAccidentes(datocliente.getIdCliente());
			listarepovisita = daoreporte.listarVisitas(datocliente.getIdCliente());
			listarepovisitacapacitacion = daoreporte.listarVisitasCapacitacion(datocliente.getIdCliente());
		}
		
		System.out.println("datocliente: " + datocliente);
		System.out.println("existecliente: " + existecliente);
		
		request.setAttribute("idtrue", existecliente);
		request.setAttribute("ccmensaje", mensaje);
		request.setAttribute("urlrc", urlRevisarCliente);
		request.setAttribute("nomcli", nomcliente);
		request.setAttribute("listmejora", listarepomejora);
		request.setAttribute("listaccidente", listarepoaccidente);
		request.setAttribute("listvisita", listarepovisita);
		request.setAttribute("listvisitacapacitacion", listarepovisitacapacitacion);
		
		request.getRequestDispatcher("reportecliente.jsp").forward(request, response);
	}

}
