package equals1;

public class principal {
	public static void main(String[] args) {
		Persona p= new Persona("cecilio");
		Persona p1= new Persona("cecilio");
		System.out.println(p==p1);
		System.out.println(p.equals(p1));
		}
}


