package _1Tests;

import _1Conexion.ConexionBD;

public class Test {
	//static ConexionBD conexion;
	public static void main(String []args){
		ConexionBD.generarIntancia();
		ConexionBD.Insertar("Insert into USUARIO values(1,'jose','jose')");
	}
	

}
