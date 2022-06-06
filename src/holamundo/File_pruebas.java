package holamundo;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class File_pruebas {

	public static void main(String[] args) {
		//Crear fichero. 
		File f = new File("/home/jcantero/Desktop/");//especificas ruta y el nombre. 
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		//para ver la ruta de un fichero.
		System.out.println(f.getPath().toString());
		//para ver el contenido de un fichero.
		List <String> directorio = Arrays.asList(f.list());
		directorio.forEach(System.out::println);
		
		List<File> directorio2 = Arrays.asList(f.listFiles());
		directorio2.forEach(System.out::println);
		
		//Crear archivo temporal. 
//		try {
//	
//			File temp = File.createTempFile("temporal", ".tmp");//se guarda en la carpeta de ficheros temporales. 
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
		
		
		
	}

}
