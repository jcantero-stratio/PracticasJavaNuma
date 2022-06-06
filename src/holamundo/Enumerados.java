package holamundo;

import java.util.Scanner;

public class Enumerados {
	
	public enum Tallas{GRANDE, MUY_GRANDE, ENORME};

	public static void main(String[] args) {
	// Para listar lo que hay dentro:
	Tallas[] x = Tallas.values();	
	for (int i=0; i<x.length; i++) {
		System.out.println(x[i]);
	}
	System.out.print(Tallas.ENORME);
	
	// para conseguir el valor que haya dentro:
	System.out.println("introduce valor");
	Scanner pedir = new Scanner(System.in);
	String tallaUsuario = pedir.next();
	System.out.println(Tallas.valueOf(tallaUsuario.toUpperCase()));
	}
}
