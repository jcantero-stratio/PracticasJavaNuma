/**
 * 
 */
package holamundo;

//Aquí no hemos puesto nada, cualquier clase que esté en el mismo paquete puede acceder. 
class Persona {

	// Estructura, conocida como propiedades o atributos.
	String nombre;
	String apellidos;
	int edad;
	float altura;
	float peso;

	// Comportamiento, esto son los métodos.
	void caminar() {
		System.out.println("estoy caminando");
	}

	void hablar() {
		System.out.println("Estoy hablando");
	}

	void nacer() {
		System.out.println("He nacido malformado");
	}

	void morir() {
		System.out.println("todavia no");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public Persona(String nombre, String apellidos, int edad, float altura, float peso) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.altura = altura;
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", altura=" + altura
				+ ", peso=" + peso + "]";
	}

}
