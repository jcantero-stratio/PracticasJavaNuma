package Objetos;
import java.util.Scanner;

public class InteraccionCalculadora {

	public static void main(String[] args) {
	Calculadora calculo = new Calculadora();
	Scanner lectura = new Scanner(System.in);
	
	int elegir = 0;
	
	do {
	//Menú interactivo. 
	System.out.println("Pulsa 1: sumar");
	System.out.println("Pulsa 2: restar");
	System.out.println("Pulsa 3: multiplicar");
	System.out.println("Pulsa 4: dividir");
	System.out.println("Pulsa 0: salir");
	elegir = lectura.nextInt();	
	
	//Si marca numeros fuera del rango de 1-4, el programa dará error. 
		if ((elegir < 0) || (elegir > 4)) {

			System.out.println("Opción no válida, vuelva a intentarlo.");
		}
	//Si marca números dentro del rango, entramos en el switch/case con las opciones de la calculadora. 	
		else if ((elegir > 0 ) && (elegir < 5)){
			
			System.out.println("Introduce los números");
			float x = lectura.nextFloat();
			float y = lectura.nextFloat();
			calculo.num1=x;
			calculo.num2=y;
	//Cuando introduces el número (variable elegir) entramos en este menú. 
			switch (elegir){
				case 1: System.out.print("El resultado de la suma es: "); calculo.Suma();
					break;
				case 2: System.out.print("El resultado de la resta es: "); calculo.Resta();
					break;
				case 3: System.out.print("El resultado de la multiplicación es: "); calculo.Multiplic();
					break;
				case 4: System.out.print("El resultado de la división es: "); calculo.Div();
					break;
							}
	//Este mensaje es un "embellecedor".												
			System.out.println("¿Desea realizar otra operación?");			
		} 
	//Si metes 0, el programa se acaba. 
	}while (elegir != 0);
		System.out.println("Mensaje de despedida");
	}

}
