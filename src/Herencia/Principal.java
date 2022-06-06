package Herencia;

public class Principal {

	public static void main(String[] args) {
	
	Persona p1[] = new Persona[2];
	p1[0] = new Persona (1, "pedro");
	p1[1] = new Estudiante (10, "pedro", 10, "Java");
		
		for (Persona p : p1) {
			System.out.println(p.toString());
		}
	}

}
