/**
 * 
 */
package holamundo;

import java.util.Random;

public class HolaMundo {	
	
	static int estatico = 0;
	
	public static void main(String[] args) {
		imprimeMe("El famoso 'Hola mundno'");	
		
}
	
	
	public int pepe(int a, int b){
		int c = a+b;
		return c;
	}
	
	
	
	private static void imprimeMe(String... mensajes) {
		for (String mensaje: mensajes) {
			System.out.println(mensaje);
			
		}
	}
	

}