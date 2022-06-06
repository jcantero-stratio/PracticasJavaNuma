package TresEnRaya;

import java.util.Scanner;
import java.util.Random;


public class MiTresEnRayaMetodos {

	private int tablero[][]= new int[3][3];
	private String tableroXY[][]= new String[3][3];
	static boolean valido = false;
	static Random x = new Random();

	//Paso 1: El metodo inicializar inicializa el tablero que mostraremos al usuario como tal. 
	//El tableroXY es donde jugaremos. Se mostrará un "." cuando esté esa casilla vacia. 
	public void inicializar () {
		for(int a=0;a<3;a++) {
			for (int b=0;b<3;b++) {
				tablero[a][b]=0;
				tableroXY[a][b]=".";
			}
		}
	}

	//Movimientos del jugador. 
	public void movimientoJug1 (int a, int b) {
		tablero [a][b]=1;
		tableroXY[a][b]="X";		
	}
	//Movimiento de la CPU.
	public void movimientoCPU(int a,int b) {
		tablero[a][b]=2;
		tableroXY[a][b]="O";
				
	}
	//Metodo que devuelve true si el tablero está ocupado.
	public boolean movimientoHumanoValido(int a, int b) {
		if (tablero[a][b]==1) {
			return true;
		}
		return false;
	}
	//Método que devuelve un true si el tablero está ocupado. 
	public boolean movimientoCPUValido(int a, int b) {
		if (tablero[a][b]==2) {
			return true;
		}
		return false;
	}
	//si la casilla está libre, devuelve false.
	public boolean casillaLlena(int a, int b) {
		if (tablero[a][b]==0) {
			return false;
		}
		return true;
	}
	//Imprime por pantalla el tablero que verán los jugadores. 
	public void print() {
		for(int a=0;a<3;a++) {
			for (int b=0;b<3;b++) {
				System.out.print(tableroXY[a][b]);
			}
		System.out.println(" ");
		}
	}
	//devuelve true si la partida se acaba. 
	public boolean ganadorJugadores() {
		boolean x=false;
		if (tablero[0][0]==1 && tablero[0][1]==1 && tablero[0][2]==1) {
			return x=true;
		} 
		else if(tablero[1][0]==1 && tablero[1][1]==1 && tablero[1][2]==1) {
			return x=true;
		} 
		else if(tablero[2][0]==1 && tablero[2][1]==1 && tablero[2][2]==1) {
			return x=true;
		} 
		else if(tablero[0][0]==1 && tablero[1][1]==1 && tablero[2][2]==1) {
			return x=true;
		} 
		else if(tablero[0][2]==1 && tablero[1][1]==1 && tablero[2][0]==1) {
			return x=true;
		} else {
			return x = false;
		}
	}
	//Devuelve true si la partida se acaba. 
	public boolean ganadorCPU() {
		boolean x=false;
		if (tablero[0][0]==2 && tablero[0][1]==2 && tablero[0][2]==2) {
			return x=true;
		} 
		else if(tablero[1][0]==2 && tablero[1][1]==2 && tablero[1][2]==2) {
			return x=true;
		} 
		else if(tablero[2][0]==2 && tablero[2][1]==2 && tablero[2][2]==2) {
			return x=true;
		} 
		else if(tablero[0][0]==2 && tablero[1][1]==2 && tablero[2][2]==2) {
			return x=true;
		} 
		else if(tablero[0][2]==2 && tablero[1][1]==2 && tablero[2][0]==2) {
			return x=true;
		} else {
			return x = false;
		}
	}
	//Aquí comprobamos si el tablero está lleno. false es que tiene huecos libres. 
	public boolean tableroLleno() {
		
		for(int a=0;a<3;a++) {
			for (int b=0;b<3;b++) {
				if (tablero[a][b]==0) {
				return true;		
				} 
			}
		}
		return false;
	}
	//devuelve un número Random. 
	public int random1() {
		int r=x.nextInt(3);
		return r;
	}
}