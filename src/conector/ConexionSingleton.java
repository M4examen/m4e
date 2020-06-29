package conector;

import java.sql.*;


public class ConexionSingleton {

	private static Connection conn = null;
	private String driver;
	private String usuario;
	private String password;
	private String url;
	
	private ConexionSingleton() {
		url = "jdbc:oracle:thin:@localhost:1521:xe";
		driver = "oracle.jdbc.driver.OracleDriver";
		usuario = "BDDEMO";
		password = "1234";
		
		try {
			System.out.println("Clase ConexionSingleton.java");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, usuario, password);	
			System.out.println("valor conn luego de conn = DriverManager.getConnection(url, usuario, password): " + conn);
		}
		catch(ClassNotFoundException | SQLException e) {
			System.out.println("Clase ConexionSingleton");
			System.out.println("no pudimos conectar con la base de datos en ConexionSingleton");
			System.out.println("el evento e es: " + e);
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		if (conn == null) {
			new ConexionSingleton();
		}
		System.out.println("valor que retornara conn de ConexionSingleton: " + conn);
		return conn;
	}
	
	
}
