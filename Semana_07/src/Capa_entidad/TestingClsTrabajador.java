package Capa_entidad;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestingClsTrabajador {
	private static ResultSet resultSet;
	
	public static void main(String []args){
		Cls_Trabajador clsT=new Cls_Trabajador();
		
		resultSet=clsT.consulta("SELECT * FROM EMPLEADOS");
		try {
			while (resultSet.next()) {
			    System.out.println(resultSet.getString(1) + " " + resultSet.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
