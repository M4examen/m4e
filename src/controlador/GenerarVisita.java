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
import dao.DaoEmpleado;
import dao.DaoVisita;
import modelo.Clientes;
import modelo.Empleados;
import modelo.Visitas;
import modelo.VisitasGeneradas;

/**
 * Servlet implementation class GenerarVisita
 */
@WebServlet("/GenerarVisita")
public class GenerarVisita extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerarVisita() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int idcliente = Integer.parseInt(request.getParameter("id"));
		String nombrecli = request.getParameter("cliente");
		
		DaoEmpleado empdao = new DaoEmpleado();
		List<Empleados> listaempleado = new ArrayList<Empleados>();
		
		listaempleado = empdao.listar();
		
		System.out.println("valor listaempleado: " + listaempleado);
		for (Empleados empleados : listaempleado) {
			System.out.println(empleados.getIdEmpleado());
		}
		
		System.out.println("idempleado: " + listaempleado);
		
		request.setAttribute("idcli", idcliente);
		request.setAttribute("cliente", nombrecli);
		request.setAttribute("listemp", listaempleado);
		request.getRequestDispatcher("generarvisita.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/**
		 * Resacatamos datos del formulario
		 * */
		String fecha = request.getParameter("fecha");
		String ciudad = request.getParameter("ciudad");
		String direccion = request.getParameter("direccion");
		String obs = request.getParameter("obs");
		String resumen = request.getParameter("resumen");
		int idempleado = Integer.parseInt(request.getParameter("idempleado"));
		int idcliente = Integer.parseInt(request.getParameter("idcliente"));
		
		
		/**
		 * Almacenamos datos en objeto "vis" del tipo Visitas
		 * Creamos objeto vacio "daovisita" del tipo DaoVisita
		 * creamos variable boolean agregar iniciada en false
		 * a variable agregar le asignamos el retorno de daovisita.agregar(vs)
		 * si true quiere decir que ingreso registros en base datos sino no lo hace*/
		Visitas vis = new Visitas(direccion, ciudad, fecha, resumen, obs, idcliente, idempleado);
		DaoVisita daovisita = new DaoVisita();
		boolean agregar = false;
		agregar = daovisita.agregar(vis);
		
		
		/**
		 * VisitasGeneradas: (modelo especial solo para mostrar los datos que necesitamos no tiene tabla en  base de datos)
		 * 
		 * Creamos una lista del tipo VisitasGeneradas que almacenara los datos especificos que necesitamos mostrar
		 * */
		List<VisitasGeneradas> listavisitagenerada = new ArrayList<VisitasGeneradas>();
		listavisitagenerada = daovisita.listaGenerada();
		
		
		/**
		 * Resacatamos datos del cliente para mostrarlos nuevamente en el generarvisita.jsp
		 * **/
		DaoCliente cliDao = new DaoCliente();
		List<Clientes> listacli = new ArrayList<Clientes>();
		listacli = cliDao.listar(); 
		
		/**
		 * mostrar mensaje si agregamos o no la nueva visita a base de datos
		 * */
		String mensaje = "";
		if (agregar)
			mensaje = "Visita ha sido agregada exitosamente.";
		else
			mensaje = "Ocurrió un error al procesar la solicitud";
		
		
		/**
		 * Pasamos todos los objetos que mostraremos en planificarvista.jsp*/
		request.setAttribute("ccmensaje", mensaje);
		request.setAttribute("listaclientes", listacli);
		request.setAttribute("listagenerada", listavisitagenerada);
		request.getRequestDispatcher("planificarvisita.jsp").forward(request, response);
	
	}

}
