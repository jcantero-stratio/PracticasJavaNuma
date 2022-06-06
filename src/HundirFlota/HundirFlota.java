package HundirFlota;

import java.util.Random;
import java.util.Scanner;

import javax.swing.Spring;

public class HundirFlota {

	public static void main(String[] args) {
//Bienvenido al hundir la flota más cutre de la historia. 
// Aqui hemos pedido la posición al jugador de donde cree que esta el numero 1. 
		Scanner posicion = new Scanner(System.in);
		int pedir = 0;
		int pedir2 = 0;		
// Aqui metemos los numeros aleatorios en el Array, entre 0 y 1.
		Random ale = new Random();
		int pos = ale.nextInt(5);
		int pos2 = ale.nextInt(5);
		int[][] matrizArrayOrdenador = new int[5][5];
// La cpu genera los números aleatorios de nuestras casilas. 				
		Random pedido = new Random();
		int cpu1 = 0;
		int cpu2 = 0;
// bucle for array CPU.
		for (int i =0; i<5; i++) {
			for (int j=0; j<5;j++) {
			matrizArrayOrdenador[pos][pos2] = 1;
			System.out.print(matrizArrayOrdenador[i][j]+" ");
			}		
		System.out.println("");
		}

// Repetimos los numeros aleatorios para nuestro array.
		Random ale2 = new Random();
		int pos3 = ale2.nextInt(5);
		int pos4 = ale2.nextInt(5);
// bucle for para nuestro array.
		int [][] nuestroArray = new int[5][5];
System.out.println("El de abajo es nuestro hundir la flota");	
		for (int k = 0; k<5; k++ ) {
			for (int l=0; l<5; l++) {
			nuestroArray[pos3][pos4]=1;
			System.out.print(nuestroArray[k][l]+" ");
			}
			System.out.println("");
		}
// Creamos un Array vacio y lo rellenamos de puntos.
		String[][] arrayVacio= new String[5][5];
			for (int w=0; w<5;w++) {
				for (int y=0;y<5;y++) {
					arrayVacio[w][y]= "O";
				}
			}
// Pruebo con el tablero vacio.			
		System.out.println("El tablero vacio");
					for (int n = 0; n<5; n++ ) {
						for (int m=0; m<5; m++) {
						System.out.print(arrayVacio[n][m]+" ");
						}
						System.out.println("");
					}
		
// Creamos un Do, donde pedimos al jugador siempre que meta donde crea que está el 1 en la posición. 
		
		do{		
// Nosotros introducimos manualmente los números. 				
				pedir = posicion.nextInt();
				pedir2 = posicion.nextInt();
// El bucle if comprueba si hemos acertado.				
				if (1 == matrizArrayOrdenador[pedir][pedir2]) {
				System.out.println("Has ganado a la CPU, eres el más poderoso jugador de hundir la flota que existe.");
				}else {
// Muestra en pantalla el tablero vacio donde hemos lanzado la bomba. 
				System.out.println("No encontrado.");
				arrayVacio[pedir][pedir2]="X";
				for (int n = 0; n<5; n++ ) {
					for (int m=0; m<5; m++) {
					System.out.print(arrayVacio[n][m]+" ");
					}
					System.out.println("");
				}
				
				
				
				
				}
//Si fallamos, turno de la máquina.				
				if(1 != matrizArrayOrdenador[pedir][pedir2]) {
					cpu1 = pedido.nextInt(5);
					cpu2 = pedido.nextInt(5);
					System.out.println(cpu1);
					System.out.println(cpu2);

				}if(nuestroArray[cpu1][cpu2] == 1){
					System.out.println("La cpu ha ganado, puto retrasado");
				}
			
		} while ((matrizArrayOrdenador[pedir][pedir2] != 1)&&(nuestroArray[cpu1][cpu2] != 1));
		
					
	}

}
