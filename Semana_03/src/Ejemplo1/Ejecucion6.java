package Ejemplo1;


	
	import java.awt.Color;
	import javax.swing.JTextField; 
	import javax.swing.JButton;
	
	public class Ejecucion6 {
		
		
		public static void main(String[] args) {
			String texto = "1";
			try {
				texto += "0";
				JTextField x = null;
				x.setBounds(34, 32, 100, 25);
				texto += "1";
			} catch (NullPointerException e) {
				texto += "0";
			} catch (ClassCastException e) {
				texto += "0";
			} catch (Exception e) {
				texto += "1";
			} finally {
				texto += "1";
			}
			System.out.println(texto);
			} 

	} 
