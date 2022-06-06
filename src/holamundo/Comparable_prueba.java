package holamundo;

import java.time.LocalDate;
import java.util.*;

public class Comparable_prueba implements Comparable<Comparable_prueba>{
	
	String nombre;
	Integer edad;
	LocalDate nacimiento;

	public Comparable_prueba(String nombre, int edad, LocalDate nacimiento) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.nacimiento = nacimiento;
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

	public LocalDate getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(LocalDate nacimiento) {
		this.nacimiento = nacimiento;
	}

	
	@Override
	public String toString() {
		return "Comparable_prueba [nombre=" + nombre + ", edad=" + edad + ", nacimiento=" + nacimiento + "]";
	}

	public static void main(String[] args) {
	List <Comparable_prueba> lista = new ArrayList<>();
	Comparable_prueba ob1 = new Comparable_prueba("puya", 7, LocalDate.of(1990, 5, 16));	
	Comparable_prueba ob2 = new Comparable_prueba("oya", 6, LocalDate.of(1990, 6, 16));
	Comparable_prueba ob3 = new Comparable_prueba("moya", 8, LocalDate.of(1990, 7, 16));
	lista.add(ob1);
	lista.add(ob2);
	lista.add(ob3);
//	Collections.sort(lista);
//	System.out.println(lista + "\n");
	
	Collections.sort(lista, new Comparator_prueba());
	System.out.println(lista + "\n");

	}
	
	@Override
	public int compareTo(Comparable_prueba p) {
		return nombre.compareTo(p.getNombre());
	}
 

}
