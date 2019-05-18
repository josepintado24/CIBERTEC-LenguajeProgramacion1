package Capa_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class MiConexion {
	
	//usuario y pass de base de datos sql
	static String login = "sa";
	static String password = "2303@pintado";
	static String url = "jdbc:sqlserver://localhost\\MSSQLSERVER:1433;databaseName= Maderera_Chepen";

	//el puente entre aplicacion y bd
	
	public Connection con = null;
	public Statement st;
	public ResultSet rs;
	
	public MiConexion(){
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection(url,login,password);
			JOptionPane.showMessageDialog(null, "Conexion correctamente");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	
		
	}
	
	//Funcion conectar y desconectar
	
	public Connection getConnection(){
		return con;
	}
	
	public void desconectar(){
		con = null;
		System.out.println("La funcion ah fallado");
	}
	
}
