package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conector.ConexionSingleton;
import idao.IdaoVisita;
import modelo.Visitas;
import modelo.VisitasGeneradas;

public class DaoVisita implements IdaoVisita {

	@Override
	public boolean agregar(Visitas visita) {
		// TODO Auto-generated method stub
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
		
				
		String sql = "INSERT INTO Visitas VALUES (null,'" 
					+ visita.getDireccionVisita() + "','" 
					+ visita.getCiudadVisita() + "','" 
					+ visita.getFechaVisita() + "','" 
					+ visita.getResumenVisita() + "','"
					+ visita.getObservacionVisita() + "','"
					+ visita.getIdClienteVisita() + "','"
					+ visita.getIdEmpleadoVisita() + "')";
		
		System.out.println("Valor sql: " + sql);
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("Valor con despues de con = ConexionSingleton.getConnection() " + con);
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			System.out.println("Si me lees es porque se agrego el nuevo visita con EXITO");
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error en DaoVisitas.agregar()");
			System.out.println("Valor del evento e: " + e);
			e.printStackTrace();
		}
		
		return agregar;
	}

	@Override
	public List<Visitas> listar() {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from Visitas ORDER BY idvisita";
		//String sql = "select * from Visitas ORDER BY ID";
		
		List<Visitas> listaVisitas = new ArrayList<Visitas>();
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoVisitas.listar()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()) {
				Visitas v = new Visitas();
				v.setIdVisita(rs.getInt(1));
				v.setDireccionVisita(rs.getString(2));
				v.setCiudadVisita(rs.getString(3));
				v.setFechaVisita(rs.getString(4));
				v.setResumenVisita(rs.getString(5));
				v.setObservacionVisita(rs.getString(6));
				v.setIdClienteVisita(rs.getInt(7));
				v.setIdEmpleadoVisita(rs.getInt(8));
				listaVisitas.add(v);
				System.out.println("entre tabla visitas");
			}
			stm.close();
			rs.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoVisitas, metodo listar");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return listaVisitas;
	}

	@Override
	public boolean eliminar(Visitas visita) {
		
		return false;
	}

	@Override
	public boolean actualizar(Visitas visita) {
		return false;
	}

	
	@Override
	public Visitas buscar(int visitaid) {

		return null;
	}

	@Override
	public List<VisitasGeneradas> listaGenerada() {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select nombrecliente, telefonocliente, direccioncliente, fechavisita, ciudadvisita, nombreempleado "
				+ "from Visitas left join Clientes on idclientevisita = idcliente" 
				+ " left join empleados on idempleadovisita = idempleado"
				+ " order by idvisita desc";
		 
		List<VisitasGeneradas> listaVisitasGeneradas = new ArrayList<VisitasGeneradas>();
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoVisitas.listaGenerada()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()) {
				VisitasGeneradas vg = new VisitasGeneradas();
				vg.setNombrecliente(rs.getString(1));
				vg.setTelefonocliente(rs.getInt(2));
				vg.setDireccioncliente(rs.getString(3));
				vg.setFechavisita(rs.getString(4));
				vg.setCiudadvisita(rs.getString(5));
				vg.setNombreempleado(rs.getString(6));
				listaVisitasGeneradas.add(vg);
				System.out.println("entre tabla visitasgeneradas");
			}
			stm.close();
			rs.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoVisitas, metodo ListaGenerada");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return listaVisitasGeneradas;
	}
	
	

}
