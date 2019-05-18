package accesoFicheroBuffers;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AccesoFicheroBuffer {
	private FileReader archivo;
	private BufferedReader controlador;
	private String linea="";
	
	public AccesoFicheroBuffer(String ruta){
		try {
			archivo=new FileReader(ruta);
			controlador=new BufferedReader(archivo);
			linea=controlador.readLine();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void imprimir(){
			
			try {
				while (linea!=null) {
				System.out.println(linea);
				linea=controlador.readLine();
				}
				controlador.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	
	public void insertar(){
		
	}
}
