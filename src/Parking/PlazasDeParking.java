package Parking;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlazasDeParking {
	// Aquí declararemos la plaza Random del parking.
	public int Random() {
		Random numeroaleatorio1 = new Random();
		int ale1 = numeroaleatorio1.nextInt(10);
		return ale1;
	}

	// Aquí mostramos las plazas del parking en plazas, junto al inicializador int
	// numPlazas.
	int plazas[][] = new int[10][10];
	int numPlazas = 1;
	String libreOcupado[][] = new String[10][10];
	String vehiculoIntroducido[][] = new String[10][10];

	// Aquí tendremos un ArrayList de Vehículos.
	List<Vehiculo> vehiculos = new ArrayList<>();

	// Método para dibujar cuando un vehículo ha entrado en una plaza en concreto. .
	public void introducirConductor(int a, int b, String e) {
		Vehiculo v1 = new Vehiculo(e, a, b);

		vehiculos.add(v1);
		libreOcupado[a][b] = "O";
		System.out.println("matrícula: " + v1.getMatricula() + " ubicado en la fila : " + (v1.getFila() + 1)
				+ " Columna: " + (v1.getColumna() + 1));
		System.out.println("hora de entrada: " + v1.getHoraActual());

	}

	// Método para inicializar el parking.
	public void iniciarPlazas() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				plazas[i][j] = numPlazas++;
				libreOcupado[i][j] = "L";
			}
		}
	}

	// Método para eliminar un coche del parking.
	public void eliminarPlaza(String matricula) {
		Vehiculo v1 = vehiculos.stream().filter(vehiculo -> vehiculo.getMatricula().equals(matricula)).findAny()
				.orElse(null);
		if (v1 != null) {
			libreOcupado[v1.getFila()][v1.getColumna()] = "L";
			vehiculos.remove(v1);
			System.out.println("la matricula " + v1.getMatricula() + "ha salido, su cobro es " + v1.tiempoEnSegundos());
		} else {
			System.out.println("Matricula no encontrada");
		}
	}

	// Método para mostrar las plazas libres u ocupadas.
	public void mostrarPlazas() {
		for (int a = 0; a < 10; a++) {
			for (int b = 0; b < 10; b++) {
				System.out.print(plazas[a][b] + " " + libreOcupado[a][b] + " ");
			}
			System.out.println(" ");
		}

	}

	// Método que muestra el número de plazas libres
	public void plazasLibres() {
		System.out.println("El número de plazas libres es: " + (100 - vehiculos.size()));
	}

	public void numeroVehiculosParking() {
		System.out.println(vehiculos.toString());
	}

	public void devuelveplazasocupadas() {

	}
}
