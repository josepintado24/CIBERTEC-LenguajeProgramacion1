package Capa_datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestingConxion {
	
	public static void main(String []srh){
		MiConexion cnn=new MiConexion();
		Connection conex=cnn.getConnection();
		String query="SELECT * FROM EMPLEADOS";
		 ResultSet resultSet = null;
		try {
			Statement statement = conex.createStatement();
			resultSet = statement.executeQuery(query);
			cnn.desconectar();
			 while (resultSet.next()) {
	                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
	            }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
