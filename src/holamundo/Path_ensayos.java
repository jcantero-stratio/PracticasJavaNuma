package holamundo;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class Path_ensayos {

	public static void main(String[] args) throws IOException {
		// Nos muestra la ruta de un archivo.
		// Ya decía yo, esto no funciona, simplemente te muestra un camino por la cara
		// de lo que le especifiques dentro de donde está tu proyecto.
		Path p1 = Paths.get("dudas.odt");
		System.out.println(p1.toAbsolutePath().toString());

		Path p2 = FileSystems.getDefault().getPath("Desktop", "RE4.txt");
		System.out.println(p2.toAbsolutePath().toString());

		Path p3 = Paths.get(System.getProperty("user.home"), "Desktop", "RE4.txt");
		System.out.println(p3.toAbsolutePath().toString());

		// son tres formas diferentes de definir un path.
		
		//diferentes "devoluciones" de la ruta:
		System.out.format("toString: %s%n", p1.toString());
		System.out.format("getFilename: %s%n", p1.getFileName());
		System.out.format("getName(0): %s%n", p1.getName(0));
		System.out.format("getNameCount: %s%n", p1.getNameCount());
	//	System.out.format("subpath(0,2): %s%n", p1.subpath(0, 2));
		System.out.format("getParent: %s%n", p1.getParent());
		System.out.format("getRoot: %s%n", p1.getRoot());
	
		//Estamos mirándo si el fichero existe. 
		Path f2 = Paths.get("/home/jcantero/Desktop/RE4.txt");
		if (Files.notExists(f2)) {
			System.out.println("esto existe");
		} else {
			System.out.println("si existe");
		}
		
		if (Files.exists(f2)) {
			System.out.println("oye pues si que existe");
		}
		if (Files.isRegularFile(f2)) {
			System.out.println("el fichero : "+f2.toString()+" es regular?");
		}
		
		//Crearemos un fichero y la vamos a liar con él. 
		Path f3 = Paths.get("/home/jcantero/Desktop/", "fichero_pruebas.txt");
		//Creamos y escribimos en él. 
		BufferedWriter bw = Files.newBufferedWriter(f3);
		bw.write("curso de java");
		bw.close();
		//copiamos el fichero. 
		Path copia = Paths.get("/home/jcantero/Desktop/","fichero_copiado.txt");
		Files.copy(f3, copia, StandardCopyOption.REPLACE_EXISTING);
		
		//lo movemo fuera del directorio. 
		Files.move(copia, Paths.get("/home/jcantero/Desktop/CSV/", "RE4.txt"), StandardCopyOption.REPLACE_EXISTING);
		
		//lo eliminamos.
		Files.deleteIfExists(Paths.get("/home/jcantero/Desktop/", "RE4.txt"));
	
		//Para leer un archivo de texto:
		List<String> lectura = Files.readAllLines(f3);
		lectura.forEach(System.out::println);
		
		//Para crear un directorio:
		Files.createDirectories(Paths.get("/home/jcantero/Desktop/", "Minuri"));
	}
	
		

}
