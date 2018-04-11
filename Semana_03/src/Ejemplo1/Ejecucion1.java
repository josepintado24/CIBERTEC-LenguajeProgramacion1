package Ejemplo1;
import javax.swing.JButton;

public class Ejecucion1 {

	public static void main(String[] args) {
	try {
	System.out.print(1);
	String[] s = {"L","U","C","Y"};
	s[6] = "P";
	System.out.print(2);
	new JButton().setText("Procesar");
	System.out.print(3);
	} catch (NullPointerException e) {
	System.out.print(4);
	} catch (ArrayIndexOutOfBoundsException e) {
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
