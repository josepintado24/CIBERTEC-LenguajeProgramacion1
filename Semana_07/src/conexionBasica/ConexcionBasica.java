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
	static Statement st;
	
	public static void main(String[] arg){
		ConexcionBasica conBas = new ConexcionBasica();
		conBas.insertar();
		conBas.mostrar();
	}
	
	
	public ConexcionBasica(){
		try {
			
			conexionBD = DriverManager.getConnection(url,user,pass);
			st=conexionBD.createStatement();
			System.out.println("Conexion esxitosa");
		} catch (SQLException e) {
			System.out.println("Error de Conexion"+e);
			//e.printStackTrace();
		}
	}
	public void mostrar(){
		try {
			
			ResultSet rs=st.executeQuery("SELECT * FROM PRODUCTOS");
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
		String instruccionSql="INSERT INTO PRODUCTOS(ID,NOMBRE,CODIGO,PROVEEDOR)VALUES(11,'CARTUCHERA','898989','MUGUEL SAC')";
		try {
			st.executeUpdate(instruccionSql);
			System.out.println("Datos Insertado");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

