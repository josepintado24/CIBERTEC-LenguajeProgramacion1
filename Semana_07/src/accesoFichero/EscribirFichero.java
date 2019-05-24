package accesoFichero;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirFichero {
	public void Escribir(){
		String texto="Jose";
		try {
			FileWriter leer =new FileWriter("ejemplo1.txt",true);
			for (int i=0;i<texto.length();i++){
				leer.write(texto.charAt(i));
				
			}
			FileReader entrada= new FileReader("ejemplo1.txt");
			int c=entrada.read();
			while (c!=-1) {
				
				System.out.print((char)c);
				c=entrada.read();
				
			}
			
			leer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
