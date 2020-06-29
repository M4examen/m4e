package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoAccidente;
import modelo.Accidentes;

/**
 * Servlet implementation class AgregarAccidente
 */
@WebServlet("/AgregarAccidente")
public class AgregarAccidente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarAccidente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Agregar Accidente ").append(request.getContextPath());
		System.out.println("request.getRemoteAddr(): " + request.getRemoteAddr());
		System.out.println("request.getRemoteHost(): " + request.getRemoteHost());
		System.out.println("request.getRemotePort(): " + request.getRemotePort());
		System.out.println("request.getRemoteUser(): " + request.getRemoteUser());
		System.out.println("request.getServerName(): " + request.getServerName());
		System.out.println("request.getServerPort(): " + request.getServerPort());
		System.out.println("request.getServletPath(): " + request.getServletPath());
		System.out.println("request.getServletContext(): " + request.getServletContext());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
       
		boolean agregado = false;
		String mensaje = "";
		
        Accidentes accidente = new Accidentes(
        		request.getParameter("fechaaccidente"),
        		request.getParameter("horaaccidente"),
        		request.getParameter("sucesoaccidente"),
        		request.getParameter("lugaraccidente"),
        		Integer.parseInt(request.getParameter("idcliente")));
        
        DaoAccidente daoaccidente = new DaoAccidente();
        agregado = daoaccidente.agregar(accidente);
        
        if(agregado) {
        	mensaje = "Accidente agregado con exito";
        } else {
        	mensaje = "no fue posible cursar su solicitud";
        }
        
        request.setAttribute("msg", mensaje);
        request.getRequestDispatcher("accidenteagregado.jsp").forward(request, response);
        
	}

}
