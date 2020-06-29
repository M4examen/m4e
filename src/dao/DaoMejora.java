package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conector.ConexionSingleton;
import idao.IdaoMejora;
import modelo.Mejoras;
import modelo.MejorasVista;

public class DaoMejora implements IdaoMejora {

	@Override
	public boolean agregar(Mejoras mejora) {
		// TODO Auto-generated method stub
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
				
		String sql = "INSERT INTO Mejoras VALUES (null,'" 
					+ mejora.getFechaMejora() + "','" 
					+ mejora.getMotivoMejora() + "','" 
					+ mejora.getActividadesMejora() + "','" 
					+ mejora.getEstadoMejora() + "','"
					+ mejora.getIdClienteMejora() + "')";
		
		System.out.println("Valor sql: " + sql);
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("Valor con despues de con = ConexionSingleton.getConnection() " + con);
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			System.out.println("Si me lees es porque se agrego el nuevo mejora con EXITO");
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error en DaoMejoras.agregar()");
			System.out.println("Valor del evento e: " + e);
			e.printStackTrace();
		}
		
		return agregar;
	}

	@Override
	public List<Mejoras> listar() {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Mejoras ORDER BY idmejora";
		//String sql = "select * from Clientes ORDER BY ID";
		
		List<Mejoras> listaMejoras = new ArrayList<Mejoras>();
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoMejoras.listar()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()) {
				Mejoras m = new Mejoras();
				m.setIdMejora(rs.getInt(1));
				m.setFechaMejora(rs.getString(2));
				m.setMotivoMejora(rs.getString(3));
				m.setActividadesMejora(rs.getString(4));
				m.setEstadoMejora(rs.getString(5));
				m.setIdClienteMejora(rs.getInt(6));
				listaMejoras.add(m);
				System.out.println("entre a Mejoras");
			}
			stm.close();
			rs.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoMejoras, metodo listar");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return listaMejoras;
	}
	
	
	public List<MejorasVista> listarMejoras() {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select idmejora, idclientemejora, fechamejora, nombrecliente, motivomejora, actividadesmejora, estadomejora"
				+ " from mejoras left join clientes on idcliente = idclientemejora "
				+ "order by nombrecliente";
		
		List<MejorasVista> listaMejoras = new ArrayList<MejorasVista>();
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoMejoras.listar()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				MejorasVista mv = new MejorasVista();
				mv.setIdmejora(rs.getInt(1));
				mv.setIdclientemejora(rs.getInt(2));
				mv.setFechamejora(rs.getString(3));
				mv.setNombrecliente(rs.getString(4));
				mv.setMotivomejora(rs.getString(5));
				mv.setActividadesmejora(rs.getString(6));
				mv.setEstadomejora(rs.getString(7));
				listaMejoras.add(mv);
				System.out.println("entre a MejorasVistas");
			}
			stm.close();
			rs.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoMejoras, metodo listar");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return listaMejoras;
	}
	

	@Override
	public boolean eliminar(Mejoras mejora) {
		
		return false;
	}

	@Override
	public boolean actualizar(Mejoras mejora) {
		
		return false;
	}

	
	@Override
	public Mejoras buscar(int mejoraid) {
				
		return null;
	}
	
	

}
