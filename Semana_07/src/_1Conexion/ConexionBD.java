package _1Conexion;

import java.sql.*;
/*
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 * */

public class ConexionBD {
	private static ConexionBD instance=null;
	private static final String url="jdbc:sqlserver://DESKTOP-D5F5DVC\\DEVELOPER:1433;databasName=PruebaJava";
	private static final String driver="com.microsoft.sqlserver.jdbc.SQLServerDriver";
	private static final String user="sa";
	private static final String password="2303@pintado";
	private static Connection cnn=null;
	
	public ConexionBD(){
		try {
			Class.forName(driver).newInstance();
			cnn= DriverManager.getConnection(url,user,password);
			System.out.println("Conectado");
			
			
		
		} catch (Exception e){
			// TODO Auto-generated catch block
			System.out.println("Sin Conectado ");
			//e.printStackTrace();
		}
	}
	
	public synchronized static ConexionBD generarIntancia(){
		if (instance==null){
			instance=new ConexionBD();
		}
		
		return instance;
	}
	
	public static void Insertar(String query){
		
		try {
			Statement insert=cnn.createStatement();
					insert.execute(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void mostrar(){
		
	}
	
	
}
