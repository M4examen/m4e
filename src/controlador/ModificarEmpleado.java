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
 * Servlet implementation class ModificarEmpleado
 */
@WebServlet("/ModificarEmpleado")
public class ModificarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarEmpleado() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int empleadoid = Integer.parseInt(request.getParameter("id"));
		DaoEmpleado empdao = new DaoEmpleado();
		Empleados emp = empdao.buscar(empleadoid);
		
		String texto = "Favor modifique los datos y presione Modificar";
		
		request.setAttribute("txt", texto);
		request.setAttribute("regemp", emp);
		request.getRequestDispatcher("modificarempleado.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		int idempleado = Integer.parseInt(request.getParameter("idempleado"));
		String nombre = request.getParameter("nombre");
		String especialidad = request.getParameter("especialidad");
		
		
		Empleados emp = new Empleados(idempleado, nombre, especialidad);
		
		DaoEmpleado empdao = new DaoEmpleado();
		boolean modificado = false;
		
		modificado = empdao.actualizar(emp);
		
		String texto = "";
		
		if(modificado) {
			texto = "El empleado ha sido modificado correctamente.";
		} else {
			texto = "No fue posible cursar la solicitud de modificacion";
		}
		
		request.setAttribute("txt", texto);
		request.setAttribute("regemp", emp);
		request.getRequestDispatcher("modificarempleado.jsp").forward(request, response);
	}

}
