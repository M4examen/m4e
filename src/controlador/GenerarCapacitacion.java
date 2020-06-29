package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoCapacitacion;
import modelo.Capacitaciones;

/**
 * Servlet implementation class GenerarCapacitacion
 */
@WebServlet("/GenerarCapacitacion")
public class GenerarCapacitacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerarCapacitacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		System.out.println("estamos en servlet capacitacion gettttttt");
		
		request.setAttribute("idvisita",  request.getParameter("id"));
		request.getRequestDispatcher("creacapacitacion.jsp").forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		System.out.println("estamos en servlet capacitacion Post-Daniel");
		// si lo hizo bien hecho.
		
		
		boolean agregar = false;
		String mensaje = "";
		
		Capacitaciones capacitacion = new Capacitaciones(
				request.getParameter("fecha"),
				request.getParameter("hora"),
				Integer.parseInt(request.getParameter("numasistente")),
				Integer.parseInt(request.getParameter("idvisita"))
		);
		
		
		DaoCapacitacion daocapacitacion = new DaoCapacitacion();
		
		agregar = daocapacitacion.agregar(capacitacion);
				
		if(agregar) {
			mensaje = "Capacitacion agregada exitosamente";
		} else {
			mensaje = "No fue posible realizar la solicutud";
		}
		
		request.setAttribute("msg", mensaje);
		System.out.println("Estamos en Post enviado el formulario a sql y esperando respuestra");
		request.getRequestDispatcher("creacapacitacion.jsp").forward(request, response);
		
		
	}

}