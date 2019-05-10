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
	private static PreparedStatement ps;
	public ConexionBD(){
		try {
			
			Class.forName(driver).newInstance();
			cnn= DriverManager.getConnection(url,user,password);
			System.out.println("Conectado");
			DatabaseMetaData infoBD=cnn.getMetaData();
			System.out.println("Base Datos :"+infoBD.getDatabaseProductName());
			System.out.println("Version: " + infoBD.getDatabaseProductVersion());
			Statement statement = cnn.createStatement();
			//ResultSet rs=statement.executeQuery("SELECT TABLE_NAME FROM INFORMATION_SCHEMA.TABLES");
			ResultSet rs=statement.executeQuery("SELECT TABLE_NAME, COLUMN_NAME FROM INFORMATION_SCHEMA.COLUMNS");
			
			System.out.println(rs);
			
			while(rs.next()){
			}
			
			
			//statement.executeUpdate("INSERT INTO dbo.usuario "+ "VALUES(1, 'laura','laura')");
			
		
		} catch (Exception e){
			// TODO Auto-generated catch block
			System.out.println(e);
			//e.printStackTrace();
		}
	}
	
	public synchronized static ConexionBD generarIntancia(){
		if (instance==null){
			instance=new ConexionBD();
		}
		
		return instance;
	}
	
	public static void Insertar(){


	}
	public void mostrar(){
		
	}
	
	
}
