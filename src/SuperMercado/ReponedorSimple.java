package SuperMercado;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.csvreader.CsvWriter;

import ExpresionesLambda.ExpresionesLambda;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class ReponedorSimple implements Reponedor {
	static MercadonaClubDeFans ob = new MercadonaClubDeFans();
	static SuperMercado metodos = new SuperMercado();
	static List<Producto> producStock = new ArrayList<>();
	static Scanner op = new Scanner(System.in);
	static int ID;
	static Integer precio;
	static int stock;
	static String descripcion;
	static int stockAlmacen;
	static int respuesta;
	Scanner p3 = new Scanner(System.in);

	// Añade productos nuevos a la tienda.

	// iniciamos el stock inicial.
	public static void StockInicial() throws Exception { // listo
		if (producStock.isEmpty()) {
			Producto ob1 = new Producto(60, 2, "champú", 1, 5);
			Producto ob2 = new Producto(1, 2, "Gel", 10, 5);
			Producto ob3 = new Producto(2, 5, "maquinilla", 10, 5);
			Producto ob4 = new Producto(3, 3, "Dental", 10, 5);
			producStock.add(ob1);
			producStock.add(ob2);
			producStock.add(ob3);
			producStock.add(ob4);
			crearStock(producStock);

			System.err.println("Tienda abierta!");
		} else {
			throw new Exception("Tienda ya abierta!");
		}
	}

	// Este método incrementa el almacén.
	public void almacenStockIncremento(int identif) {
		if (producStock.get(identif).getStock() == 0) {
			producStock.get(identif).setStock(producStock.get(identif).getStockAlmacen());
			producStock.get(identif).setStockAlmacen(0);
		}
	}
	///////// METODOS PARA ENSEÑAR A IVAN.

	// Este método filtra el stock:
	public void filtrarStock() {
		if (!producStock.isEmpty()) {
			List filtrada = producStock.stream().filter(p -> p.getStock() > 0).collect(Collectors.toList());
			filtrada.forEach(System.out::println);
		} else {
			System.out.println("Inicializa la tienda.");
		}
	}

	// Este método ordena los productos por el ID con el interfaz "comparable".
	public void ordenarPorId() {
		if (!producStock.isEmpty()) {
			producStock.stream().sorted().forEach(System.out::println);
		} else {
			System.out.println("Inicializa la tienda");
		}
	}

	public void ordenAscendentePrecio() {
//		Comparator <Producto> ascendente = (Producto o1, Producto o2) -> Double.compare(o1.getPrecio(), o2.getPrecio());
//		List <Producto> asc = producStock.stream().sorted(ascendente).collect(Collectors.toList());
//		asc.forEach(System.out::println);
		producStock.stream().sorted(Comparator.comparing(Producto::getPrecio)).forEach(System.out::println);
	}

	public void ordenarStock() {
		producStock.stream().sorted(Comparator.comparing(Producto::getStock)).forEach(System.out::println);
	}

	// Crear archivo csv:
	public static void crearStock(List<Producto> producStock) throws IOException {
		String salidaARchivo = "/home/jcantero/Desktop/Documentos/HolaMundo/src/almacen.csv";
		boolean existe = new File(salidaARchivo).exists();
		if (existe) {
			File archivoUsuario = new File(salidaARchivo);
			archivoUsuario.delete();
		}
		try {
			CsvWriter salidaCSV = new CsvWriter(new FileWriter(salidaARchivo, true), ',');
			List<String> header = Arrays.asList("id", "precio", "stock", "descripcion", "stockAlmacen");
			salidaCSV.writeRecord(header.toArray(new String[0]));

			for (Producto p : producStock) {
				List<String> pCSV = Arrays.asList(String.valueOf(p.getIdentificador()), String.valueOf(p.getPrecio()),
						String.valueOf(p.getStock()), p.getDesripción(), String.valueOf(p.getStockAlmacen()));				
				salidaCSV.writeRecord(pCSV.toArray(new String[0]));
			}
			salidaCSV.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	// FIN DE LOS MÉTODOS PARA ENSEÑAR.
	// el menú donde realizamos todas las operaciones relacionadas con el
	// reponedor/encargado.
	public void areaEncargado() throws Exception { // listo
		System.out.println("Area super secreta, introduce el password (no es 1234).");
		int pass = Integer.parseInt(op.nextLine());
		if (pass == 1234) {
			System.out.println("-0: Salir");
			System.out.println("-1: Inicializa la tienda");
			System.out.println("-2: Muestra la caja.");
			System.out.println("-3: Mete nuevos articulos.");
			System.out.println("-4: Modificar artículos.");
			System.out.println("-5: Reponer stock.");
			int opcion2 = Integer.parseInt(op.nextLine());

			switch (opcion2) {
			case 1:
				try {
					StockInicial();
				} catch (Exception ex) {
					System.err.println(ex.getMessage());
				}
				break;
			case 2:
				System.out.println(ob.cajaSuper);
				break;
			case 3:
				meterProductos();
				break;
			case 4:
				modificarInventario();
				break;
			case 5:
				reponerStock();
				break;
			case 0:
				System.err.println("¿Para esto cobras?");
				break;
			default:
				System.err.println("elección incorrecta");
				break;
			}

		} else {
			System.err.println("El password es incorrecto, hazte encargado o hackea el sistema!");
		}
	}

	// método donde introducimos nuevos productos PERO solo si los productos han
	// sido inicializado antes.
	public void meterProductos() throws Exception {// listo
		boolean x = true;
		if (producStock.isEmpty()) {
			System.err.println("Inicializa antes la tienda!");
		} else {
			while (x == true) {
				System.out.println("¿Desea añadir un producto :");
				System.out.println("-0: No.");
				System.out.println("-1: Si");
				respuesta = Integer.parseInt(p3.nextLine());

				if (respuesta == 1) {
					try {
						System.out.print("Ingresa el nombre del producto: ");
						descripcion = p3.nextLine();
						ID = producStock.size();
						System.out.print("Introduce el precio: ");
						precio = Integer.parseInt(p3.nextLine());
						System.out.print("Introduce el stock inicial del producto: ");
						stock = Integer.parseInt(p3.nextLine());
						// Excepción donde el precio y el stock debe de ser mayor que 0.
						if (stock < 1) {
							throw new InvalidStockException();
						}
						if (precio < 1) {
							throw new Exception("El precio debe ser mayor que 1!");
						}
						// Si el stock es mayor y el precio es mayor a 1, puedes seguir añadiendo el
						// articulo.
						System.out.print("¿Qué cantidad guardarás en el almacén?");
						stockAlmacen = Integer.parseInt(p3.nextLine());
						Producto p2 = new Producto(ID, precio, descripcion, stock, stockAlmacen);
						producStock.add(p2);
						metodos.listarProductos();
					} catch (java.lang.NumberFormatException ex) {
						System.err.println("Digito no valido!");
					} catch (InvalidStockException ex) {
						System.err.println("Stock no válido!");
					} catch (Exception ex) {
						System.err.println(ex.getMessage());
					}
				}
				if (respuesta == 0) {
					x = false;
				}
			}
			System.out.println(
					"Actualmente en venta hay " + producStock.size() + " producto/s, maldito fracasado mileurista.");
		}
	}

	// método para modificar el inventario que YA hemos metido.
	public void modificarInventario() throws Exception {
		try {
			if (producStock.isEmpty()) {
				throw new Exception("Inicializa la tienda!");
			}
			metodos.listarProductos();
			System.out.print("ingresa el identificador del producto a modificar: ");
			ID = Integer.parseInt(p3.nextLine());
			System.out.print("Ingresa el nombre del producto: ");
			descripcion = p3.nextLine();
			System.out.print("Introduce el precio: ");
			precio = Integer.parseInt(p3.nextLine());
			System.out.print("Introduce el stock inicial del producto: ");
			stock = Integer.parseInt(p3.nextLine());
			System.out.print("¿Qué cantidad guardarás en el almacén? ");
			stockAlmacen = Integer.parseInt(p3.nextLine());
			producStock.get(ID).setDesripción(descripcion);
			producStock.get(ID).setPrecio(precio);
			producStock.get(ID).setStock(stock);
			producStock.get(ID).setStockAlmacen(stockAlmacen);
			System.err.println("producto modificado!");
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

	public void venderProducto() throws Exception { // listo

		try {
			if (producStock.isEmpty()) {
				throw new Exception("Tienda no inicializada! Dile al encargado que haga su puto trabajo!");
			}
			System.err.println("Elije tu producto por el ID!");
			metodos.listarProductos();
			if (op.hasNextInt()) {
				respuesta = Integer.parseInt(op.nextLine());
			}
			try {
				if (respuesta == producStock.get(respuesta).getIdentificador()) {
					metodos.decrementaStock(respuesta);
					metodos.incrementaCajaSuper(producStock.get(respuesta).getPrecio());
					almacenStockIncremento(respuesta);
					System.err.println("Producto " + producStock.get(respuesta).getDesripción() + " añadido!");
				}
			} catch (java.lang.IndexOutOfBoundsException ex) {
				System.err.println("Te has equivocado, maldito inutil");
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

	@Override
	public void reponerStock() throws Exception { // listo
		try {
			metodos.listarProductos();
			System.out.println("");
			System.err.println("elije el id del producto que vas a modificar: ");
			ID = Integer.parseInt(op.nextLine());
			System.err.println("¿Cuál es el stock de venta?");
			stock = Integer.parseInt(op.nextLine());
			System.err.println("¿Y el del almacén?.");
			stockAlmacen = Integer.parseInt(op.nextLine());
			producStock.get(ID).setStock(stock);
			producStock.get(ID).setStockAlmacen(stockAlmacen);
			System.err.println("Producto " + producStock.get(ID).getDesripción()
					+ " modificado!\nSu stock en tienda es: " + producStock.get(ID).getStock()
					+ "\nSu stock en el almacén es: " + producStock.get(ID).getStockAlmacen());
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
