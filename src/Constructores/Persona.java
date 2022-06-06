package Constructores;

public class Persona {

	private String nombre;
	private int edad;
	
	public Persona(String _nombre, int _edad) {
		nombre = _nombre;
		edad = _edad;
	}
	
	public void lectura () {
		System.out.println("el nombre es: "+ nombre);
		System.out.println("la edad es : "+edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
