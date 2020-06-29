package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Clientes;
import dao.DaoCliente;
/**
 * Servlet implementation class AgregarCliente
 */
@WebServlet("/AgregarCliente")
public class AgregarCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarCliente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("agregarcliente.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		/*Rescata los datos desde el formulario agregarclientes.jsp*/
		String nombre = request.getParameter("nombre");
		String telefono = request.getParameter("telefono");
		String correo = request.getParameter("correo");
		String rubro = request.getParameter("rubro");
		String direccion = request.getParameter("direccion");
		
		/**Creamos una instancia de Clientes y le pasamos los datos rescatados del formulario*/
		Clientes cli = new Clientes(nombre,telefono,correo,rubro,direccion);
		
		/**Creamos una instancia de DaoCliente para usar el metodo de agregar el cliente*/
		DaoCliente daocliente = new DaoCliente();
		
		boolean agregar = false; //variable para validar si se agrego o no el registro
		
		/**
		 * llamamos al metodo agregar y le pasamos como valor nuestra instancia cli
		 * esta devolvera true o false y quedara almacenada en variable agregar*/
		agregar = daocliente.agregar(cli);
		
		/**Creamos variable mensaje y dependiendo del valor de agregar es lo que 
		 * se le asigna
		 * */
		String mensaje = "";
		if (agregar)
			mensaje = "El cliente ha sido agregado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";
		
		/**
		 * pasamos como request mensaje y volvemos a mostrar el formulario para agregar otro cliente*/
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("agregarcliente.jsp").forward(request, response);	
		
	}

}
