package Constructores;

public class Metodo {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("pedro Sanchez",90);
		
		System.out.println(p1.getEdad());
		System.out.println(p1.getNombre());
		p1.setEdad(85);
		p1.setNombre("Señor");
		System.out.println(p1.getEdad());
		System.out.println(p1.getNombre());
	}

}
