package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoEmpleado;
import modelo.Empleados;

/**
 * Servlet implementation class AgregarEmpleado
 */
@WebServlet("/AgregarEmpleado")
public class AgregarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("agregarempleado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String nombre = request.getParameter("nombre");
		String especialidad = request.getParameter("especialidad");
		
		Empleados emp = new Empleados(nombre, especialidad);
		
		DaoEmpleado daoempleado = new DaoEmpleado();
		
		boolean agregar = false;
		
		agregar = daoempleado.agregar(emp);
		
		String mensaje = "";
		if (agregar)
			mensaje = "El empleado ha sido agregado exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";
		
		/**
		 * pasamos como request mensaje y volvemos a mostrar el formulario para agregar otro cliente*/
		request.setAttribute("ccmensaje", mensaje);
		request.getRequestDispatcher("agregarempleado.jsp").forward(request, response);	
		
	}

}
