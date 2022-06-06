/**
 * 
 */
package Parking;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Operador {
	/**
	 * En esta clase SOLO tendremos las llamadas a métodos y el menú.
	 */
	public static void main(String[] args) {

		// Objeto de la clase Scanner para intorducir los datos, Serán un String;

		Scanner introducirValor = new Scanner(System.in);

		// El objeto park solo dibujará la plaza del parking.

		PlazasDeParking park = new PlazasDeParking();
		park.iniciarPlazas();

		// introducir los datos del vehículo.

		String matricula;

		int ale1;
		int ale2;
		int b;
		int a;
		int menu;
		do {
			System.out.println("-0. Salir del programa.");
			System.out.println("-1. Registrar entrada de vehículo.");
			System.out.println("-2. Registrar salida de vehículo.");
			System.out.println("-3. Imprimir el estado del parking.");
			System.out.println("-4. Muestra el numero de plazas libres en tu parking.");
			System.out.println("-5. Muestra los vehículos que tienes en el parking.");

			menu = introducirValor.nextInt();
			if (menu < 0 || menu > 6) {
				System.out.println("digito no valido.");
			} else {
				switch (menu) {
				case 1:
					System.out.println("Introduce tu matrícula");
					park.introducirConductor(ale1 = park.Random(), ale2 = park.Random(),
							matricula = introducirValor.next());
					break;
				case 2:
					System.out.println("Introduce la matrícula del vehículo a eliminar");
					park.eliminarPlaza(matricula = introducirValor.next());
					break;
				case 3:
					System.out.println("Este es tu parking, mileurista fracasado");
					park.mostrarPlazas();
					break;
				case 4:
					park.plazasLibres();
					break;
				case 5:
					park.numeroVehiculosParking();
					break;

				}
			}

		} while (menu != 0);
		System.out.println("Gracias por utilizar el parking de Mercadona Club de Fans.");

	}

}
