package CSV_ensayos;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileOutputStream_Ensayo {

	public static void main(String[] args) throws IOException {

		// FileWriter y FileReader
		FileWriter fw = new FileWriter("/home/jcantero/Desktop/Apuntes/JAVA/pruebaFileReader/prueba.txt");
		fw.write("Texto de ejemplo"); // escribimos el texto.
		fw.write(97);// podemos indicarle el caracter que queramos, en este caso es el "a".
		fw.write("\n texto de ejemplo");// más texto sin sentido.
		fw.close();// cerramos el flujo.

		// para leer el fichero.
		FileReader fr = new FileReader("/home/jcantero/Desktop/Apuntes/JAVA/pruebaFileReader/prueba.txt");

		int ejemplo = fr.read(); // tiene que ser si o si un int.
		while (ejemplo != -1) {// hacemos un bucle para recorrerlo de esta forma:
			System.out.print((char) ejemplo);
			ejemplo = fr.read();
		}

		// FileOutputStream:
		FileOutputStream fos = new FileOutputStream(
				"/home/jcantero/Desktop/Apuntes/JAVA/pruebaFileReader/pruebabinaria.txt");
		String texto = "\n estoy escribiendo un string?"; // Este es nuestro String.

		byte[] codes = texto.getBytes();// Lo pasamos a bytes.
		fos.write(codes);// lo volcamos en el archivo.

		// para leer un archivo "binario".
		FileInputStream fis = new FileInputStream(
				"/home/jcantero/Desktop/Apuntes/JAVA/pruebaFileReader/pruebabinaria.txt");
		int ejemplo2 = fis.read();

		while (ejemplo2 != -1) {
			System.out.print((char) ejemplo2);
			ejemplo2 = fis.read();
		}
	

	// el temido bufferoutputstream
	final int BUFFER_SIZE = (1024 * 8);
	byte[] buffer = new byte[BUFFER_SIZE];
	InputStream fuente = null;
	
	OutputStream destino = new BufferedOutputStream(new FileOutputStream("/home/jcantero/Desktop/Apuntes/JAVA/pruebaFileReader/pruebabuffer.txt"), BUFFER_SIZE);
		fuente = new FileInputStream("/home/jcantero/Desktop/Apuntes/JAVA/pruebaFileReader/pruebabinaria.txt");
		destino.write(buffer);
		destino.close();
	
	// ByteArrayOutPutStream:
	ByteArrayOutputStream arr = new ByteArrayOutputStream();
	String prueba = "es el ultimo texto de ejemplo?";
	byte nose[] = prueba.getBytes();
	arr.write(98);//esto es una bocal en cuestión
	arr.write(nose);
	arr.close();
	System.out.println(arr);

	
	}
}
