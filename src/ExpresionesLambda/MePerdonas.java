package ExpresionesLambda;

public class MePerdonas {
	private String nombre;
	private String ciudades;
	private int numero;
	
	public MePerdonas(String nombre, String ciudades, int numero) {
		super();
		this.nombre = nombre;
		this.ciudades = ciudades;
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudades() {
		return ciudades;
	}
	public void setCiudades(String ciudades) {
		this.ciudades = ciudades;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "MePerdonas [nombre=" + nombre + ", ciudades=" + ciudades + ", numero=" + numero + "]";
	}
	
	
	
}
