package accesoFichero;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {
	
	public void leer(){
		try {
			FileReader entrada= new FileReader("ejemplo.txt");
			int c=entrada.read();
			while (c!=-1) {
				
				System.out.print((char)c);
				c=entrada.read();
				
			}
			entrada.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No se encuentra el archivo");
			e.printStackTrace();
		}
	}
	

}
