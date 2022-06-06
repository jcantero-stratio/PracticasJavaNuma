package Veterinario;

public abstract class Animal {
	
	protected String nombre;
	protected int fechaNacimiento;
	protected double peso;
	protected String comentarios;
	
	public Animal(String nombre, int fechaNacimiento, double peso, String comentarios) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.peso = peso;
		this.comentarios = comentarios;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public String getNombre() {
		return nombre;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	
	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", peso=" + peso + ", comentarios="
				+ comentarios + "]";
	}
	
	
	
}
