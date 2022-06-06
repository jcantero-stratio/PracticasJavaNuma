package Veterinario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Veterinario.Perro.RazaPerro;

public class ClinicaVeterinaria {

	static List<Animal> ListaAnimables = new ArrayList<>();
	
	public void InicializarLista(Animal x) {
		ListaAnimables.add(x);
	}
	
	public static void InsertarAnimal(){
		Animal ob = new Perro("perro", 1, 1, "animal ", "si", "husky");
		Scanner entrada = new Scanner(System.in);
		ListaAnimables.add(ob);
//		String valor = entrada.next();
//		RazaPerro Raza = Enum.valueOf(RazaPerro.class, valor.toUpperCase());
		System.out.println(ListaAnimables);
		
	}
	public static void main (String[] args) {
		InsertarAnimal();
	}


}
