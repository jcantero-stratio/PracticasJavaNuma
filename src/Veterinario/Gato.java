package Veterinario;

public class Gato extends Animal{

	public Gato(String nombre, int fechaNacimiento, double peso, String comentarios, String microchip) {
		super(nombre, fechaNacimiento, peso, comentarios);
		this.microchip = microchip;
	}


	public String microchip;
	
	
	public enum RazaGato{
		COMUN, SIAMES, PERSA, ANGORA, SCOTTISHFOLD;
	}
	

	public String getMicrochip() {
		return microchip;
	}


	public void setMicrochip(String microchip) {
		this.microchip = microchip;
	}


	@Override
	public String toString() {
		return "Gato [microchip=" + microchip + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento
				+ ", peso=" + peso + ", comentarios=" + comentarios + "]";
	}	
}
