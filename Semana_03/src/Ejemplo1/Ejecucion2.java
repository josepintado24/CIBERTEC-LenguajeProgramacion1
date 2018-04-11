package Ejemplo1;


	
	import java.awt.Color;
	import javax.swing.JButton;
	
	public class Ejecucion2 {
		public static void main(String[] args) {
			
		 try {
		System.out.print(1);
		new JButton().setBackground(Color.RED);
		System.out.print(2);
		double x = 3333 / 0;
		System.out.print(3);
		} catch (NullPointerException e) {
		System.out.print(4);
		} catch (ArithmeticException e) {
		System.out.print(5);
		} catch (StringIndexOutOfBoundsException e) {
		System.out.print(6);
		} catch (Exception e) {
		System.out.print(7);
		} finally {
		 System.out.print(8);
		}
	}
	} 
