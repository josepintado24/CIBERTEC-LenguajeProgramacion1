package Ejemplo1;

public class Ejecucion4 {

	public static void main(String[] args) {
		try {
			new Ejecucion4().metodo2();
			System.out.println("Bloque Main");
			} catch (ArithmeticException e) {
			System.out.println("Capturado en la Principal 1");
			} catch (Exception e) {
			System.out.println("Capturado en la Principal 2");
			} finally {
			System.out.println("Final");
			}
		}
	
		void metodo1() {
			try {
				metodo2();
				} catch (Exception e) {
				System.out.println("Capturado en el método 1");
			}
		}
		void metodo2() {
			String[] lista = { "Alex", "Samuel", "Juan" };
			String nom = lista[3];
			System.out.println("Nombre " + nom);
		} 

}
