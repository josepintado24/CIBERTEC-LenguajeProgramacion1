package conexionBasica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexcionBasica {
	private static final String url="jdbc:mysql://localhost/TIENDA";
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String user="root";
	private static final String pass="2303@pintado";
	static Connection conexionBD;
	
	public static void main(String[] arg){
		ConexcionBasica conBas = new ConexcionBasica();
		conBas.mostrar();
	}
	
	
	public ConexcionBasica(){
		try {
			conexionBD = DriverManager.getConnection(url,user,pass);
			System.out.println("Conexion esxitosa");
		} catch (SQLException e) {
			System.out.println("Error de Conexion"+e);
			//e.printStackTrace();
		}
	}
	public void mostrar(){
		try {
			Statement st=conexionBD.createStatement();
			ResultSet rs=st.executeQuery("SELECT * FROM PRODUCTOS WHERE NOMBRE='JABON'");
			while (rs.next()) {
				System.out.println(
						"ID\t:"+rs.getString("ID")+
						"\tNOMBRE\t:"+rs.getString("NOMBRE")+
						"\tCODIGO\t:"+rs.getString("CODIGO")
						
						);
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void insertar(){
		
	}
}

