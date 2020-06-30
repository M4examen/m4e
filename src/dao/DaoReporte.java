package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conector.ConexionSingleton;
import idao.IdaoReporte;
import modelo.Reportes;

public class DaoReporte implements IdaoReporte {

	@Override
	public List<Reportes> listarMejoras(int idcli) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		String sql = "";
		
		if(idcli == 0) {
			sql = "select idcliente, nombrecliente, rubrocliente, fechamejora, motivomejora, estadomejora " 
					+ "from clientes inner join mejoras on idcliente = idclientemejora "
					+ "order by nombrecliente";			
		} else {	
			sql ="select idcliente, nombrecliente, rubrocliente, fechamejora, motivomejora, estadomejora " 
					+ "from clientes inner join mejoras on idcliente = idclientemejora "
					+ "where idcliente = " + idcli;
		}
		
		
		List<Reportes> listamejoras = new ArrayList<Reportes>();
	
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoVisitas.listamejoras()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);			
			while(rs.next()) {
				Reportes r = new Reportes();
				r.setIdcliente(rs.getInt(1));
				r.setNombrecliente(rs.getString(2));
				r.setRubrocliente(rs.getString(3));
				r.setFechamejora(rs.getString(4));
				r.setMotivomejora(rs.getString(5));
				r.setEstadomejora(rs.getString(6));
				listamejoras.add(r);
				System.out.println("entre tablas");
			}
			stm.close();
			rs.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoVisitas, metodo Lista");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return listamejoras;
	}

	@Override
	public List<Reportes> listarAccidentes(int idcli) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		String sql = "";
		
		if(idcli == 0) {
			sql = "select idcliente, nombrecliente, rubrocliente, fechaaccidente, horaaccidente, sucesoaccidente, lugaraccidente " 
					+ "from clientes inner join accidentes on idcliente = idclienteaccidente " 
					+ "order by nombrecliente;";
		} else {
			sql = "select idcliente, nombrecliente, rubrocliente, fechaaccidente, horaaccidente, sucesoaccidente, lugaraccidente " 
					+ "from clientes inner join accidentes on idcliente = idclienteaccidente " 
					+ "where idcliente = " + idcli;
		}
		 
		List<Reportes> listamejoras = new ArrayList<Reportes>();
	
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoVisitas.listamejoras()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()) {
				Reportes r = new Reportes();
				r.setIdcliente(rs.getInt(1));
				r.setNombrecliente(rs.getString(2));
				r.setRubrocliente(rs.getString(3));
				r.setFechaaccidente(rs.getString(4));
				r.setHoraaccidente(rs.getString(5));
				r.setSucesoaccidente(rs.getString(6));
				r.setLugaraccidente(rs.getString(7));
				listamejoras.add(r);
				System.out.println("entre tablas");
			}
			stm.close();
			rs.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoVisitas, metodo Lista");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return listamejoras;
	}

	@Override
	public List<Reportes> listarVisitas(int idcli) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		String sql = "";
		
		if(idcli == 0) {
			sql = "select idcliente, nombrecliente, rubrocliente,direccionvisita, fechavisita, ciudadvisita, "
					+ "resumenvisita, nombreempleado " 
					+ "from clientes inner join visitas on idcliente = idclientevisita " 
					+ "left join empleados on idempleadovisita = idempleado " 
					+ "order by nombrecliente";
		} else {
			sql = "select idcliente, nombrecliente, rubrocliente,direccionvisita, fechavisita, ciudadvisita, "
					+ "resumenvisita, nombreempleado " 
					+ "from clientes inner join visitas on idcliente = idclientevisita " 
					+ "left join empleados on idempleadovisita = idempleado " 
					+ "where idcliente = " + idcli;
		}
		
		List<Reportes> listamejoras = new ArrayList<Reportes>();
	
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoVisitas.listamejoras()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			
			while(rs.next()) {
				Reportes r = new Reportes();
				
				r.setIdcliente(rs.getInt(1));
				r.setNombrecliente(rs.getString(2));
				r.setRubrocliente(rs.getString(3));
				r.setDireccionvisita(rs.getString(4));
				r.setFechavisita(rs.getString(5));
				r.setCiudadvisita(rs.getString(6));
				r.setResumenvisita(rs.getString(7));
				r.setNombremepleado(rs.getString(8));
				listamejoras.add(r);
				System.out.println("entre tablas");
			}
			stm.close();
			rs.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoVisitas, metodo Lista");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return listamejoras;
	}

	@Override
	public List<Reportes> listarVisitasCapacitacion(int idcli) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		String sql = "";

		if(idcli == 0) {
			sql = "select  idcliente, nombrecliente, rubrocliente, direccionvisita, fechavisita, ciudadvisita, "
					+ "resumenvisita, nombreempleado, fechacapacitacion, horacapacitacion, numasistcapacitacion " 
					+ "from clientes inner join visitas on idcliente = idclientevisita " 
					+ "left join empleados on idempleadovisita = idempleado " 
					+ "inner join capacitaciones on idvisita = idvisitacapacitacion " 
					+ "order by nombrecliente";
		} else {
			sql = "select idcliente, nombrecliente, rubrocliente, direccionvisita, fechavisita, ciudadvisita, "
					+ "resumenvisita, nombreempleado, fechacapacitacion, horacapacitacion, numasistcapacitacion "
					+ "from clientes inner join visitas on idcliente = idclientevisita " 
					+ "left join empleados on idempleadovisita = idempleado " 
					+ "inner join capacitaciones on idvisita = idvisitacapacitacion " 
					+ "where idcliente = " + idcli;
		}
		List<Reportes> listamejoras = new ArrayList<Reportes>();
	
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoVisitas.listamejoras()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);			
			while(rs.next()) {
				Reportes r = new Reportes();
				r.setIdcliente(rs.getInt(1));
				r.setNombrecliente(rs.getString(2));
				r.setRubrocliente(rs.getString(3));
				r.setDireccionvisita(rs.getString(4));
				r.setFechavisita(rs.getString(5));
				r.setCiudadvisita(rs.getString(6));
				r.setResumenvisita(rs.getString(7));
				r.setNombremepleado(rs.getString(8));
				r.setFechacapacitacion(rs.getString(9));
				r.setHoracapacitacion(rs.getString(10));
				r.setNumasistcapacitacion(rs.getString(11));
				listamejoras.add(r);
				System.out.println("entre tablas");
			}
			stm.close();
			rs.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoVisitas, metodo Lista");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return listamejoras;
	}

}
