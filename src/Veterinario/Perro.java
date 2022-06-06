package Veterinario;

public class Perro extends Animal{
	
	public String microchip;
	RazaPerro Raza;
	
	public Perro(String nombre, int fechaNacimiento, double peso, String comentarios, String microchip, String args) {
		super(nombre, fechaNacimiento, peso, comentarios);
		this.microchip = microchip;
		Raza = Enum.valueOf(RazaPerro.class, args.toUpperCase());
	}
	
	public enum RazaPerro{
	PASTORALEMAN, HUSKY, FOXTERRIER, DALMATA, SANBERNARDO;
	}

	@Override
	public String toString() {
		return "Perro [microchip=" + microchip + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", peso=" + peso + ", comentarios=" + comentarios + "Raza=" + Raza +"]";
	}

	public String getMicrochip() {
		return microchip;
	}

	public void setMicrochip(String microchip) {
		this.microchip = microchip;
	}
	
}
