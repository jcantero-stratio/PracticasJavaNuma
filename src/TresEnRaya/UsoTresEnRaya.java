package TresEnRaya;

import java.util.Scanner;

public class UsoTresEnRaya {
	
	static Scanner in;
	static int pos;
	
	
	public static void main(String[] args) {
		
		in=new Scanner(System.in);
		TresEnRaya partida=new TresEnRaya();
		
		String opcion="-1";
		String cero="0";
		//Menú para elegir opción del juego
		do {
			
			
			System.out.println("Bienvenido al juego de Tres En Raya. Introduzca una de las siguientes opciones:");
			System.out.println("1. Dos jugadores");
			System.out.println("2. Jugador vs. Máquina");
			System.out.println("3. Máquina vs. Máquina");
			System.out.println("0. Salir");
			
			opcion=in.nextLine();
			
			switch (opcion) {
			case "1":
				dosJugadores(partida);
				break;
			case "2":
				jugadorMaquina(partida);
				break;
			case "3":
				maquinaMaquina(partida);
				break;
			case "0":
				System.out.println("Gracias por jugar. ¡Hasta la próxima!");
				break;
			default:
				System.out.println("Opción incorrecta. Inténtelo de nuevo.");
				System.out.println("******************************************************************************************************");
			}
			
		} while (!opcion.equals(cero));
		


	}
	
	public static void dosJugadores(TresEnRaya partida) {
		in=new Scanner(System.in);
		partida.Iniciar();
		System.out.println("Ha elegido la opción de dos jugadores. Para jugar, deberá introducir "
				+ "la posición del tablero (del 1 al 9).");
		System.out.println("En el tablero, las fichas del jugador 1 serán las equis (X) y las fichas del "
				+ "jugador 2 serán los círculos (O).");
		System.out.println("¡Buena suerte!");
		
		while (partida.GanaJugador1()==false && partida.GanaJugador2()==false && partida.QuedanMovimientos()==true) {
			
			do {
				
				System.out.println("Jugador 1: introduzca posición");
				if (in.hasNextInt()) {
					pos=in.nextInt();
					if (pos<=0 || pos>=10) {
						System.out.println("El número que ha introducido es incorrecto, inténtelo de nuevo.");
					}
					if (partida.MovimientoValido(pos)==false) {
						System.out.println("La posición introducida está ocupada, inténtelo de nuevo.");
					}
				} else {
					System.out.println("Error. Debe introducir un número.");
					System.out.println("******************************************************************************************************");
				}
				in.nextLine();
				
			} while ((pos<=0 || pos>=10) || partida.MovimientoValido(pos)==false);
			
			partida.MueveJugador1(pos);
			partida.DibujaTrablero();
			
			if (partida.GanaJugador1()==false && partida.GanaJugador2()==false && partida.QuedanMovimientos()==true) {
				do {
					System.out.println("Jugador 2: introduzca posición");
					
					if (in.hasNextInt()) {
						pos=in.nextInt();
						if (pos<=0 || pos>=10) {
							System.out.println("El número que ha introducido es incorrecto, inténtelo de nuevo.");
						}
						if (partida.MovimientoValido(pos)==false) {
							System.out.println("La posición introducida está ocupada, inténtelo de nuevo.");
						}
						in.nextLine();
					} else {
						System.out.println("Error. Debe introducir un número.");
						System.out.println("******************************************************************************************************");
						in.nextLine();
					}
					
					
				} while ((pos<=0 || pos>=10) || partida.MovimientoValido(pos)==false);
				partida.MueveJugador2(pos);
				partida.DibujaTrablero();
			}
		}
		if(partida.GanaJugador1()) {
			System.out.println("¡Enhorabuena Jugador 1!¡Ha ganado!");
			System.out.println("**********************************************************************************************");
		}
		if(partida.GanaJugador2()) {
			System.out.println("¡Enhorabuena Jugador 2!¡Ha ganado!");
			System.out.println("**********************************************************************************************");
		}
		if(partida.QuedanMovimientos()==false && partida.GanaJugador1()==false && partida.GanaJugador2()==false) {
			System.out.println("Se han acabado los movimientos. Vuelvan a jugar.");
			System.out.println("**********************************************************************************************");
		}
		
	}
	
	public static void jugadorMaquina(TresEnRaya partida) {
		partida.Iniciar();
		in=new Scanner(System.in);
		System.out.println("Ha elegido la opción de jugar contra la máquina. Para jugar, deberá introducir la posición del tablero "
				+ "(del 1 al 9).");
		System.out.println("En el tablero, sus fichas serán las equis (X) y las fichas de la máquina serán los círculos (O).");
		System.out.println("¡Buena suerte!");
		
		while (partida.GanaJugador1()==false && partida.GanaJugador2()==false && partida.QuedanMovimientos()==true) {
			do {
				System.out.println("Jugador 1: introduzca posición");
				if (in.hasNextInt()) {
					pos=in.nextInt();
					if (pos<=0 || pos>=10) {
						System.out.println("El número que ha introducido es incorrecto, inténtelo de nuevo.");
					}
					if (partida.MovimientoValido(pos)==false) {
						System.out.println("La posición introducida está ocupada, inténtelo de nuevo.");
					}
				} else {
					System.out.println("Error. Debe introducir un número.");
					System.out.println("******************************************************************************************************");
				}
				in.nextLine();
			} while ((pos<=0 || pos>=10) || partida.MovimientoValido(pos)==false);
			
			partida.MueveJugador1(pos);
			partida.DibujaTrablero();
			
			if (partida.GanaJugador1()==false && partida.GanaJugador2()==false && partida.QuedanMovimientos()==true) {
				System.out.println("Máquina:");
				partida.MueveOrdenador2();
				partida.DibujaTrablero();
			}
		}
		
		if(partida.GanaJugador1()) {
			System.out.println("¡Enhorabuena Jugador 1!¡Ha ganado!");
			System.out.println("**********************************************************************************************");
		}
		if(partida.GanaJugador2()) {
			System.out.println("¡Lo siento!¡Te he ganado!");
			System.out.println("**********************************************************************************************");
		}
		if(partida.QuedanMovimientos()==false && partida.GanaJugador1()==false && partida.GanaJugador2()==false) {
			System.out.println("Se han acabado los movimientos. Vuelvan a jugar.");
			System.out.println("**********************************************************************************************");
		}
	}
	
	public static void maquinaMaquina(TresEnRaya partida) {
		partida.Iniciar();
		System.out.println("Ha elegido la opción de máquina vs. máquina. Usted no deberá introducir nada.");
		System.out.println("En el tablero, las fichas de la máquina 1 serán las equis (X) y las fichas de la máquina 2 serán "
				+ "los círculos (O).");
		System.out.println("¡Que disfrute!");
		
		//Ralentizo el programa 4 segundos para que al usuario le de tiempo a leer la introducción del modo de juego. Lo hago a traves
		//del método sleep de la case Thread
		try {
			Thread.sleep(4*1000);
		} catch (Exception e) {
			System.err.println("No se puede ralentizar el juego");
		}
		
		while (partida.GanaJugador1()==false && partida.GanaJugador2()==false && partida.QuedanMovimientos()==true) {
			System.out.println("Máquina 1:");
			partida.MueveOrdenador1();
			partida.DibujaTrablero();
			
			//Ralentizo el programa 2 segundos con el método sleep de la clase Thread, así podemos ver la ejecución de los movimientos
			//de ambas máquinas y así observar todas las jugadas
			try {
				Thread.sleep(2*1000);
			} catch (Exception e) {
				System.err.println("No se puede ralentizar el juego");
			}
			
			if (partida.GanaJugador1()==false && partida.GanaJugador2()==false && partida.QuedanMovimientos()==true) {
				System.out.println("Máquina 2:");
				partida.MueveOrdenador2();
				partida.DibujaTrablero();
				
				try {
					Thread.sleep(2*1000);
				} catch (Exception e) {
					System.err.println("No se puede ralentizar el juego");
				}
			}
		}
		
		if(partida.GanaJugador1()) {
			System.out.println("¡Ha ganado la máquina 1!");
			System.out.println("**********************************************************************************************");
		}
		if(partida.GanaJugador2()) {
			System.out.println("¡Ha ganado la máquina 2!");
			System.out.println("**********************************************************************************************");
		}
		if(partida.QuedanMovimientos()==false && partida.GanaJugador1()==false && partida.GanaJugador2()==false) {
			System.out.println("Se han acabado los movimientos. Vuelvan a jugar.");
			System.out.println("**********************************************************************************************");
		}
		
	}

}
