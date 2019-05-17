package conexionBasica;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Prueba {
	private static final String url="jdbc:mysql://localhost/TIENDA";
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String user="root";
	private static final String pass="2303@pintado";
	static Connection conexionBD;
	static Statement st;
	public static void main(String[] arg){
		try {
			
			conexionBD = DriverManager.getConnection(url,user,pass);

			String instruccionSql="INSERT INTO PRODUCTOS(ID,NOMBRE,CODIGO,PROVEEDOR)VALUES(?,?,?,?)";
			PreparedStatement pps=conexionBD.prepareStatement(instruccionSql);
			pps.setInt(1, 50);
			pps.setString(2, "klkl");
			pps.setString(3, "klkl");
			pps.setString(4, "klkl");
			pps.execute();
			
			System.out.println("Conexion esxitosa");
		} catch (SQLException e) {
			System.out.println("Error de Conexion"+e);
			//e.printStackTrace();
		}
	}
	
	
}
