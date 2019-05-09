package _1Conexion;

import java.sql.*;
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
			System.out.println("Conectado "+String.valueOf(cnn));
			
		
		} catch (Exception e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
