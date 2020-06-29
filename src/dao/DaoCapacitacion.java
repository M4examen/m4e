package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import conector.ConexionSingleton;
import idao.IdaoCapacitacion;
import modelo.Capacitaciones;

public class DaoCapacitacion implements IdaoCapacitacion {

	@Override
	public boolean agregar(Capacitaciones capacitacion) {
		// TODO Auto-generated method stub
		
	boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
				
		String sql = "INSERT INTO Capacitaciones VALUES (null,'" 
				+ capacitacion.getFechaCapacitacion() + "','" 
				+ capacitacion.getHoraCapacitacion()  + "','" 
				+ capacitacion.getNumAsistCapacitacion() + "','" 
				+ capacitacion.getIdVisitaCapacitacion() + "')";
		System.out.println("Valor sql: " + sql);
		
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("Valor con despues de con = ConexionSingleton.getConnection() " + con);
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			System.out.println("Si me lees es porque se agrego l con EXITO");
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error en DaoClientes.agregar()");
			System.out.println("Valor del evento e: " + e);
			e.printStackTrace();
		}
		
		return agregar;
	}
	

}
