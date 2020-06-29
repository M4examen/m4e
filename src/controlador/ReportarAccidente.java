package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoCliente;
import modelo.Clientes;

/**
 * Servlet implementation class ReportarAccidente
 */
@WebServlet("/ReportarAccidente")
public class ReportarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReportarAccidente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.getRequestDispatcher("reportaraccidente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		DaoCliente daocli = new DaoCliente();
		
		Clientes datocliente = new Clientes();
		System.out.println("datocliente antes de asignar busqueda: " + datocliente);
		
		datocliente = daocli.buscar(Integer.parseInt(request.getParameter("idcli")));
		
		boolean existecliente = false;
		String mensaje = "";
		String urlRevisarCliente = "";
		
		if(datocliente.getIdCliente() == 0) {
			System.out.println("es cero cliente no existe");
			mensaje = "Cliente no existe, confirme ID Cliente en ";
			urlRevisarCliente = "RevisarCliente";
		} else {
			System.out.println("cliente existe" + datocliente.getNombreCliente());
			existecliente = true;
			mensaje = "Ingrese el reporte del cliente " + datocliente.getNombreCliente();
		}
		System.out.println("datocliente: " + datocliente);
		System.out.println("existecliente: " + existecliente);
		
		request.setAttribute("idtrue", existecliente);
		request.setAttribute("ccmensaje", mensaje);
		request.setAttribute("urlrc", urlRevisarCliente);
		request.setAttribute("datocli", datocliente);
		
		request.getRequestDispatcher("reportaraccidente.jsp").forward(request, response);
	}

}
