package conexionformularios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionProductos {
	private static final String bd="TIENDA";
	private static final String url="jdbc:mysql://localhost:3306/TIENDA";
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String user="root";
	private static final String password="2303@pintado";
	private static Connection cnn=null;
	static Statement st;
	
	public ConexionProductos(){
		try {
			Class.forName(driver);
			try {
				cnn=DriverManager.getConnection(url,user,password);
				System.out.println("Exitoso");
				st=cnn.createStatement();
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void iniciar(){
		if (cnn==null){
			ConexionProductos a=new ConexionProductos();
		}
	}
	public static ResultSet mostrarProductos(){
		ResultSet rs = null;
		try {
			rs = st.executeQuery("select * from PRODUCTOS");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
		
	}
	
	
}
