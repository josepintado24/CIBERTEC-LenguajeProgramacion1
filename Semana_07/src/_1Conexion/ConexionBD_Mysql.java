package _1Conexion;

import java.sql.*;

public class ConexionBD_Mysql {

	private static final String bd="tienda";
	private static final String url="jdbc:mysql://localhost/cursophp";
	private static final String driver="com.mysql.jdbc.Driver";
	private static final String user="root";
	private static final String password="";
	private static Connection cnn=null;
	
	public ConexionBD_Mysql(){
		try {
			Class.forName(driver);
			try {
				cnn=DriverManager.getConnection(url,user,password);
				System.out.println("Exitoso");
				Statement st=cnn.createStatement();
				ResultSet rs =st.executeQuery("select * from estudiante");
				
			while (rs.next()) {
					System.out.println(rs.getString("nombre"));
					}
				
				
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
			ConexionBD_Mysql a=new ConexionBD_Mysql();
		}
	}
	

}
