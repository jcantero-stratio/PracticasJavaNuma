package TresEnRaya;

import java.util.Random;

public class TresEnRaya {
	
	private int[][]tablero;
	
	public void DibujaTrablero() {
		System.out.println("-----------------");
		for (int i=0;i<3;i++) {
			System.out.print("|");
			System.out.print("   ");
			for (int j=0;j<3;j++) {
				if (tablero[i][j]==0) {
					System.out.print(" ");
				}
				if (tablero[i][j]==1) {
					System.out.print("X");
				}
				if (tablero[i][j]==2) {
					System.out.print("O");
				}
				System.out.print("   ");
				if (j==2) {
					System.out.print("|");
				}
				
			}
			System.out.println();
		}
		System.out.println("-----------------");
	}
	
	public void MueveJugador1(int posJugador1) {
		//Asigna un 1 a la posición correspondiente
		int pos=posJugador1-1;
		if (pos>=0 && pos<=2) {
			tablero[0][pos]=1;
		}else if(pos>=3 && pos<=5) {
			pos=pos-3;
			tablero[1][pos]=1;
		}else {
			pos=pos-6;
			tablero[2][pos]=1;
		}
	}
	
	public void MueveJugador2(int posJugador2) {
		//Asigna un 2 a la posición correspondiente
		int pos=posJugador2-1;
		if (pos>=0 && pos<=2) {
			tablero[0][pos]=2;
		}else if(pos>=3 && pos<=5) {
			pos=pos-3;
			tablero[1][pos]=2;
		}else {
			pos=pos-6;
			tablero[2][pos]=2;
		}
	}
	
	public boolean MovimientoValido(int pos) {
		//Comprueba que la posición está libre
		pos--;
		if ((pos>=0 && pos<=2)&&(tablero[0][pos]==0)) {
			return true;
		}else if((pos>=3 && pos<=5)&&(tablero[1][pos-3]==0)) {
			return true;
		}else if ((pos>=6)&&(pos<=8)&&(tablero[2][pos-6]==0)){
			return true;
		}else {
			return false;
		}
	}
	
	public void MueveOrdenador1() {
		//Crea un número aleatorio del 0 al 8 incluidos y asigna el número 1 en la posición correspondiente. A la vez acude al método
		//MovimientoValido para comprobar que el movimiento es correcto y asi no sobreescribir la posición
		Random aleatorio=new Random();
		int pos=0;
		boolean fichaIntroducida=false;
		do {
			pos=aleatorio.nextInt(9);
			if ((pos>=0 && pos<=2) && MovimientoValido(pos+1)==true) {
				tablero[0][pos]=1;
				fichaIntroducida=true;
			}
			if((pos>=3 && pos<=5) && MovimientoValido(pos+1)==true) {
				pos=pos-3;
				tablero[1][pos]=1;
				fichaIntroducida=true;
			}
			if ((pos>=6 && pos<=9) && MovimientoValido(pos+1)==true){
				pos=pos-6;
				tablero[2][pos]=1;
				fichaIntroducida=true;
			}
		} while (fichaIntroducida==false);
		
	}
	
	public void MueveOrdenador2() {
		//Crea un número aleatorio del 0 al 8 incluidos y asigna el número 2 en la posición correspondiente. A la vez acude al método
		//MovimientoValido para comprobar que el movimiento es correcto y asi no sobreescribir la posición
		Random aleatorio=new Random();
		int pos=0;
		boolean fichaIntroducida=false;
		do {
			pos=aleatorio.nextInt(9);
			if ((pos>=0 && pos<=2) && MovimientoValido(pos+1)==true) {
				tablero[0][pos]=2;
				fichaIntroducida=true;
			}
			if((pos>=3 && pos<=5) && MovimientoValido(pos+1)==true) {
				pos=pos-3;
				tablero[1][pos]=2;
				fichaIntroducida=true;
			}
			if ((pos>=6 && pos<=9) && MovimientoValido(pos+1)==true){
				pos=pos-6;
				tablero[2][pos]=2;
				fichaIntroducida=true;
			}
		} while (fichaIntroducida==false);
	}
	
	public void Iniciar() {
		//Reinicia el tablero a 0
		tablero=new int[3][3];
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				tablero[i][j]=0;
			}
		}
	}
	
	public boolean QuedanMovimientos() {
		//Si encuentra que hay una posición libre, devuelve true;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (tablero[i][j]==0) {
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean GanaJugador1() {
		//Horizontal
		if((tablero[0][0]==1)&&(tablero[0][1]==1)&&(tablero[0][2]==1)) {
			return true;
		} else if((tablero[1][0]==1)&&(tablero[1][1]==1)&&(tablero[1][2]==1)) {
			return true;
		}else if((tablero[2][0]==1)&&(tablero[2][1]==1)&&(tablero[2][2]==1)) {
			return true;
		}
		//Vertical
		else if((tablero[0][0]==1)&&(tablero[1][0]==1)&&(tablero[2][0]==1)) {
			return true;
		}else if((tablero[0][1]==1)&&(tablero[1][1]==1)&&(tablero[2][1]==1)) {
			return true;
		}else if((tablero[0][2]==1)&&(tablero[1][2]==1)&&(tablero[2][2]==1)) {
			return true;
		}
		//Diagonal
		else if((tablero[0][0]==1)&&(tablero[1][1]==1)&&(tablero[2][2]==1)) {
			return true;
		}else if((tablero[0][2]==1)&&(tablero[1][1]==1)&&(tablero[2][0]==1)) {
			return true;
		//Si no ha ganado
		}else {
			return false;
		}
		
	}
	
	public boolean GanaJugador2() {
		//Horizontal
		if((tablero[0][0]==2)&&(tablero[0][1]==2)&&(tablero[0][2]==2)) {
			return true;
		} else if((tablero[1][0]==2)&&(tablero[1][1]==2)&&(tablero[1][2]==2)) {
			return true;
		}else if((tablero[2][0]==2)&&(tablero[2][1]==2)&&(tablero[2][2]==2)) {
			return true;
		}
		//Vertical
		else if((tablero[0][0]==2)&&(tablero[1][0]==2)&&(tablero[2][0]==2)) {
			return true;
		}else if((tablero[0][1]==2)&&(tablero[1][1]==2)&&(tablero[2][1]==2)) {
			return true;
		}else if((tablero[0][2]==2)&&(tablero[1][2]==2)&&(tablero[2][2]==2)) {
			return true;
		}
		//Diagonal
		else if((tablero[0][0]==2)&&(tablero[1][1]==2)&&(tablero[2][2]==2)) {
			return true;
		}else if((tablero[0][2]==2)&&(tablero[1][1]==2)&&(tablero[2][0]==2)) {
			return true;
		//Si no ha ganado
		}else {
			return false;
		}
	}
	
}
