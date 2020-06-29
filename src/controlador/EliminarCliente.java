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
 * Servlet implementation class EliminarCliente
 */
@WebServlet("/EliminarCliente")
public class EliminarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int clienteid = Integer.parseInt(request.getParameter("id"));
		
		Clientes cli = new Clientes();
		cli.setIdCliente(clienteid);
		
		DaoCliente clidao = new DaoCliente();
		boolean eliminado = false;
		
		eliminado = clidao.eliminar(cli);
		
		String texto = "";
		
		if(eliminado) {
			texto = "El cliente ha sido eliminado correctamente.";
		} else {
			texto = "No fue posible cursar la solicitud";
		}
		
		DaoCliente cliDao = new DaoCliente();
		List<Clientes> listacli = new ArrayList<Clientes>();
		
		listacli = cliDao.listar(); 
		
		request.setAttribute("listaclientes", listacli);
		request.setAttribute("txt", texto);
		request.getRequestDispatcher("ListarClientes").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
