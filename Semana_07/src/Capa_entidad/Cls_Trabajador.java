package Capa_entidad;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Capa_datos.MiConexion;

public class Cls_Trabajador {
	private MiConexion cnn;
	private Connection conex;
	private static String query;
	private ResultSet resultSet = null;
	private Statement statement;
	
	public Cls_Trabajador(){
		
	}
	
	
	public ResultSet consulta(String query){
		 try {
			cnn=new MiConexion();
			conex=cnn.getConnection();
			statement= conex.createStatement();
			resultSet = statement.executeQuery(query);
			cnn.desconectar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	
}
