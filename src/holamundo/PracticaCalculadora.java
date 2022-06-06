package holamundo;
import java.util.Scanner;

public class PracticaCalculadora {

	public static void main(String[] args) {
//Declarando la variable lectura para introducir los dígitos manualmente.
		Scanner lectura = new Scanner(System.in);
//Mensajes para guiar al usuario.
		System.out.println("¿Qué desea hacer?");
		System.out.println("Pulsa 1: suma");
		System.out.println("Pulsa 2: resta");
		System.out.println("Pulsa 3: multiplicación");
		System.out.println("Pulsa 4: división");
		System.out.println("Pulse enter cuando haya escrito el dígito");
//Inicio de la calculadora.
		int operando = lectura.nextInt();
		System.out.println("Introduce el primer número:");
		Scanner operando1 = new Scanner(System.in);
		float a=operando1.nextInt();
		System.out.println("Introduzca el segundo número:");
		Scanner operando2 = new Scanner(System.in);
		float b=operando2.nextInt();
//Inicio de las operaciones. 
		switch(operando){
			case 1: 
				System.out.println("Su resultado es : "+ (a+b));
				break;
			case 2: 
				System.out.println("Su resultado es : "+ (a-b));
				break;
			case 3: 
				System.out.println("Su resultado es : "+ (a*b));
				break;
			case 4: 
				System.out.println("Su resultado es : "+ (a/b));
				break;
			default:
				System.out.println("Operación no válida");
			break;		

		}
	}
}
