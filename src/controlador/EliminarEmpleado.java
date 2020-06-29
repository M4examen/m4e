package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoEmpleado;
import modelo.Empleados;

/**
 * Servlet implementation class EliminarEmpleado
 */
@WebServlet("/EliminarEmpleado")
public class EliminarEmpleado extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarEmpleado() {
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
		
		Empleados emp = new Empleados();
		emp.setIdEmpleado(empleadoid);
		
		DaoEmpleado empdao = new DaoEmpleado();
		boolean eliminado = false;
		
		eliminado = empdao.eliminar(emp);
		
		String texto = "";
		
		if(eliminado) {
			texto = "El empleado ha sido eliminado correctamente.";
		} else {
			texto = "No fue posible cursar la solicitud";
		}
		
		DaoEmpleado empDao = new DaoEmpleado();
		List<Empleados> listaemp = new ArrayList<Empleados>();
		
		listaemp = empDao.listar();
		
		request.setAttribute("listaempleados", listaemp);
		request.setAttribute("txt", texto);
		request.getRequestDispatcher("listarempleados.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
