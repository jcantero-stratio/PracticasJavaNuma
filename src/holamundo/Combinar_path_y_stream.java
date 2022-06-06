package holamundo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Combinar_path_y_stream {

	public static void main(String[] args) {
		//nos coge la carpeta que queramos y no muestra las carpetas que empiecen por un punto. 
	try	(Stream<Path> stream = Files.list(Paths.get(System.getProperty("/home/"),"ejemplo"))){
			stream.map(path -> !path.startsWith(".")).sorted().forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
