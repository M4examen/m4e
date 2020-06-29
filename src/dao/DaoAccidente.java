package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import conector.ConexionSingleton;
import idao.IdaoAccidente;
import modelo.Accidentes;

public class DaoAccidente implements IdaoAccidente {

	@Override
	public boolean agregar(Accidentes accidente) {
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
				
		String sql = "INSERT INTO Accidentes VALUES (null,'" 
						+ accidente.getFechaAccidente() + "','" 
						+ accidente.getHoraAccidente() + "','" 
						+ accidente.getSucesoAccidente() + "','" 
						+ accidente.getLugarAccidente() + "','"
						+ accidente.getClienteIdAcciedente() + "')";
		
		System.out.println("Valor sql: " + sql);
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("Valor con despues de con = ConexionSingleton.getConnection() " + con);
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			System.out.println("Si me lees es porque se agrego el nuevo accidente con EXITO");
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error en DaoAccidente.agregar()");
			System.out.println("Valor del evento e: " + e);
			e.printStackTrace();
		}
		System.out.println();
		return agregar;
	}

	@Override
	public List<Accidentes> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Accidentes accidente) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean actualizar(Accidentes accidente) {
		// TODO Auto-generated method stub
		return false;
	}

}
