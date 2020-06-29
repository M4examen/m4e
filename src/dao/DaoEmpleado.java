package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conector.ConexionSingleton;
import modelo.Clientes;
import modelo.Empleados;
import idao.IdaoEmpleado;

public class DaoEmpleado implements IdaoEmpleado{

	@Override
	public boolean agregar(Empleados empleado) {
		boolean agregar = false;
		
		Statement stm = null;
		Connection con = null;
		String sql = "insert into Empleados values(null,'" 
					+ empleado.getNombreEmpleado() + "','" 
				    + empleado.getEspecialidadEmpleado() + "')";
		System.out.println("Valor sql: " + sql);
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("Valor con despues de con = ConexionSingleton.getConnection() " + con);
			stm = con.createStatement();
			stm.execute(sql);
			agregar = true;
			stm.close();
			System.out.println("Si me lees es porque se agrego el nuevo empleado con EXITO");
			//con.close();
		}catch(SQLException e) {
			System.out.println("Error en DaoEmpleado.agregar()");
			System.out.println("Valor del evento e: " + e);
			e.printStackTrace();
		}
		return agregar;
	}

	@Override
	public List<Empleados> listar() {
		
		Statement stm = null;
		Connection con = null;
		ResultSet rs = null;

		String sql = "select * from Empleados order by idEmpleado";
		System.out.println("Valor sql: " + sql);
		List<Empleados> listaEmpleados = new ArrayList<Empleados>();

		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoEmpleado.listar()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()) {
				Empleados e = new Empleados();
				e.setIdEmpleado(rs.getInt(1));
				e.setNombreEmpleado(rs.getString(2));
				e.setEspecialidadEmpleado(rs.getString(3));
				listaEmpleados.add(e);
				System.out.println("entre");
			}
			stm.close();
			rs.close();
		} catch(SQLException e) {
			System.out.println("Error: clase DaoEmpleados, metodo listar");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return listaEmpleados;

	}

	@Override
	public boolean eliminar(Empleados empleado) {
		Connection con = null;
		Statement stm = null;
		boolean eliminar = false;
		
		String sql = "delete from empleados where idempleado = " + empleado.getIdEmpleado();
		
		try {
			System.out.println("DaoEmpleado.eliminar()");
			con = ConexionSingleton.getConnection();
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			stm.execute(sql);
			eliminar = true;
			stm.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoEmpleado, metodo listar");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		System.out.println("valor de retorno DaoEmpleado.eliminar(): " + eliminar);
		return eliminar;
	}

	@Override
	public boolean actualizar(Empleados empleado) {
		boolean actualizar = false;
		
		Connection con = null;
		Statement stm = null;
		
		String sql = "update empleados set nombreempleado = '" + empleado.getNombreEmpleado() 
									+ "', especialidadempleado = '" + empleado.getEspecialidadEmpleado() 
									+ "' where idempleado = '" + empleado.getIdEmpleado() + "'";
		try {
			System.out.println("DaoEmpleado.actualizar()");
			con = ConexionSingleton.getConnection();
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			stm.execute(sql);
			actualizar = true;
			stm.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoEmpleado, metodo actualizar");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		System.out.println("valor de retorno DaoEmpleado.actualizar(): " + actualizar);
		return actualizar;
	}

	@Override
	public Empleados buscar(int empleadoid) {
		Connection con = null;
		Statement stm = null;
		ResultSet rs = null;
		
		String sql = "select * from empleados where idempleado = " + empleadoid;
		
		Empleados emp = new Empleados();
		
		try {
			con = ConexionSingleton.getConnection();
			System.out.println("DaoEmpleado.buscar()");
			System.out.println("valor de con luego de asignarle ConexionSingleton.getConnection(): " + con);
			System.out.println("valor sql: " + sql);
			stm = con.createStatement();
			rs = stm.executeQuery(sql);
			while(rs.next()) {
				emp.setIdEmpleado(rs.getInt(1));
				emp.setNombreEmpleado(rs.getString(2));
				emp.setEspecialidadEmpleado(rs.getString(3));
				System.out.println("busqueda encontrada");
			}
			stm.close();
			rs.close();
			
		} catch(SQLException e) {
			System.out.println("Error: clase DaoClientes.buscar(id)");
			System.out.println("valor de e: " + e);
			e.printStackTrace();
		}
		
		return emp;
	}
	
}

