package TresEnRaya;

import java.util.Random;
import java.util.Scanner;

public class OperadorMiTresEnRaya {
	
	static int mov1;
	static int mov2;
	static Scanner entrada;
	public static void main(String[] args) {
		Scanner opcion = new Scanner(System.in);
		
		//objeto 3 en raya para llamar a los métodos.
		MiTresEnRayaMetodos m1= new MiTresEnRayaMetodos();
		int op;
		//Iniciamos la partida
		do {
		System.out.println("Bienvenido al 3 en raya.");
		System.out.println("-.1: Comenzar la partida");
		System.out.println("-.0: Salir de la partida");
		op = opcion.nextInt();

		if(op<0 || op>1){
			System.out.println("Opción no válida");
		}else {
			switch (op) {
			case 1:
			iniciarPartida(m1);
			break;
			}
		}	
		}while(op!=0);
		System.out.println("Hasta la vista!");	
	}
	public static void iniciarPartida(MiTresEnRayaMetodos m1) {
		Scanner entr = new Scanner(System.in);
		m1.inicializar();
		m1.print();
		
		while (m1.tableroLleno()==true && m1.ganadorCPU()==false && m1.ganadorJugadores()==false) {
			
			System.out.println("Tu turno!");
			mov1 = entr.nextInt();
			mov2 = entr.nextInt();	
			
			while(m1.casillaLlena(mov1, mov2)==true) {
			System.out.println("casilla ocupada! Inténtalo de nuevo!");
			mov1 = entr.nextInt();
			mov2 = entr.nextInt();				
			}
			m1.movimientoJug1(mov1, mov2);
			m1.print();
			if(m1.tableroLleno()==false|| m1.ganadorJugadores()) {
				break;
			}
			System.out.println("Turno Cpu");
			mov1 = m1.random1();
			mov2 = m1.random1();
			while(m1.casillaLlena(mov1, mov2)==true) {	
			mov1 = m1.random1();
			mov2 = m1.random1();
			}
				m1.movimientoCPU(mov1, mov2);
				m1.print();
			if(m1.tableroLleno()==false || m1.ganadorCPU()) {
				break;
			}
		
		}
		if(m1.ganadorCPU()==true) {
			System.out.println("la CPU ha ganado!");
		}
		if (m1.ganadorJugadores()==true) {
			System.out.println("Victoria!");
		}
		if (m1.tableroLleno()==false) {
			System.out.println("Tablero lleno! Empieza de nuevo!");
		}
	}

}
