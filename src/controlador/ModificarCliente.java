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
 * Servlet implementation class ModificarCliente
 */
@WebServlet("/ModificarCliente")
public class ModificarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarCliente() {
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
		DaoCliente clidao = new DaoCliente();
		Clientes cli = clidao.buscar(clienteid);
		
		String texto = "Favor modifique los datos y presione Modificar";
		
		String telefono = cli.getTelefonoCliente();
		
		request.setAttribute("txt", texto);
		request.setAttribute("regcli", cli);
		request.setAttribute("phone", telefono);
		request.getRequestDispatcher("modificarcliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		int idcliente = Integer.parseInt(request.getParameter("idcliente"));
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String correo = request.getParameter("correo");
		String rubro = request.getParameter("rubro");
		String direccion = request.getParameter("direccion");
		
		Clientes cli = new Clientes(idcliente, nombre, telefono, correo, rubro, direccion);
		
		DaoCliente clidao = new DaoCliente();
		boolean modificado = false;
		
		modificado = clidao.actualizar(cli);
		
		String texto = "";
		
		if(modificado) {
			texto = "El cliente ha sido modificado correctamente.";
		} else {
			texto = "No fue posible cursar la solicitud de modificacion";
		}
		
		request.setAttribute("txt", texto);
		request.setAttribute("regcli", cli);
		request.getRequestDispatcher("modificarcliente.jsp").forward(request, response);
	}

}
