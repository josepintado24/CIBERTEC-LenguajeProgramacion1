package equals1;

public class principal {
	public static void main(String[] args) {
		Persona p= new Persona("cecilio");
		Persona p1= p;
		modif(p1);
		System.out.println(""+p1.getNombre());
		}
	
	public static void modif(Persona am){
		am.setNombre("Jose");;
	}
}


