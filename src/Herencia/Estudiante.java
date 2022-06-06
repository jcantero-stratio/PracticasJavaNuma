 package Herencia;

public class Estudiante extends Persona {

	private int nota;
	private String curso;
	
	public Estudiante(int edad, String nombre, int nota, String curso) {
		super(edad, nombre);
		this.nota = nota;
		this.curso = curso;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "Estudiante [nota=" + nota + ", curso=" + curso + ", getEdad()=" + getEdad() + ", getNombre()="
				+ getNombre() + "]";
	}
	
	
}
