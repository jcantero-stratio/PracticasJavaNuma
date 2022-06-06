package SuperMercado;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MercadonaClubDeFans {
//static int ID;
//static int precio;
//static int stock;
//static String descripcion;
static boolean ok = false;
static double cajaSuper=0;
static SuperMercado met=new SuperMercado();
static ReponedorSimple mercan = new ReponedorSimple();

	//En el Main tenemos el menú donde llamamos a los métodos. 
	public static void main(String[] args) throws Exception {
		Scanner op= new Scanner(System.in);
		int opcion=10;	
		System.out.println("Bienvenido al menú de usuarios de 'Mercadona Club de Fans'. ¿Qué desea hacer?");
		do {
		System.out.println("||***************************************************************************||");
		System.out.println("-0: Salir.");
		System.out.println("-1: Listar objetos.");
		System.out.println("-2: Comprar producto por ID");
		System.out.println("-3: Mostrar productos con Stock");
		System.out.println("-4: Mostrar productos por precio ascendente");
		System.out.println("||****Area del personal.****||");
		System.out.println("-5: Acceder al Area de personal");
		System.out.println("||********||");
		// Menu
		try {
		opcion= Integer.parseInt(op.nextLine());
			switch (opcion) {
			case 1:
			mercan.ordenarPorId();
			System.out.println();	
			break;
			case 2:
			mercan.venderProducto();	
			break;
			case 5: 
			mercan.areaEncargado();
			break;
			case 3:
			mercan.filtrarStock();	
			break;
			case 4:
			mercan.ordenAscendentePrecio();
			break;
			default:
				if(opcion<0||opcion>7) {
					System.err.println("Opción no válida");
				}
			break;
		} 
			} catch(java.util.InputMismatchException ex) {
			System.out.println("error de dígito!");	
			} catch(java.lang.NumberFormatException ex) {
			System.err.println("error de dígito!");		
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
			}
		
		} while(opcion!=0);
		System.out.println("Gracias por su visita.");
	}	
}
