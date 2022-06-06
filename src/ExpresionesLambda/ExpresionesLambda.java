package ExpresionesLambda;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors.*;

public class ExpresionesLambda implements Comparable<ExpresionesLambda> {

	private int x;
	private int y;
	private String nombre;

	public ExpresionesLambda(int x, int y, String nombre) {
		super();
		this.x = x;
		this.y = y;
		this.nombre = nombre;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "ExpresionesLambda [x=" + x + ", y=" + y + ", lope=" + nombre + "]";
	}

	@Override
	public int compareTo(ExpresionesLambda o) {
		return nombre.compareTo(o.getNombre());
	}

	public static void main(String[] args) {

		ExpresionesLambda ob1 = new ExpresionesLambda(1, 4, "zepa");
		ExpresionesLambda ob2 = new ExpresionesLambda(2, 3, "Juan");
		ExpresionesLambda ob3 = new ExpresionesLambda(3, 2, "Pedrita");
		ExpresionesLambda ob4 = new ExpresionesLambda(4, 1, "Ana");
		ExpresionesLambda ob5 = new ExpresionesLambda(4, 1, "Ana");

		ArrayList<ExpresionesLambda> lista = new ArrayList<ExpresionesLambda>();
		lista.add(ob1);
		lista.add(ob2);
		lista.add(ob3);
		lista.add(ob4);
		lista.add(ob5);

		// Te ordena la lista según el CompareTo que hemos especificado.
		Collections.sort(lista);
		System.out.println(lista);

		// Con esta expresión Lambda hacemos lo mismo, pero no he conseguido hacerla sin
		// el compareTo
		Collections.sort(lista, (ox, ox2) -> ox.compareTo(ox2));
		System.err.println(lista);

		// para usar un foreach en expresiones lambda:
		lista.forEach((p) -> System.err.println(p));

		// forma más resumida de usar las expresiones lambda
		lista.forEach(System.out::println);

		// vamos a crear un filtro donde le decimos que muestre los parámetros de la
		// lista mayores que 1.
		lista.stream().filter((p) -> p.getX() > 1).forEach(System.err::println);

		// Si queremos hacer una lista aparte FILTRADA de la misma manera:
		List<ExpresionesLambda> listaFiltrada = lista.stream().filter((p) -> p.getX() > 1).collect(Collectors.toList());
		listaFiltrada.forEach(System.out::println);

		// MAP: Map modifica una lista y devuelve el valor que nosotros queramos de la
		// misma.
		// Para retornar un valor en concreto, usamos el map. Osea, que si decimos que
		// guarde solo X, guardará X.
		List<Integer> soloX = lista.stream().filter((p) -> p.getX() > 2).map((p) -> p.getX())
				.collect(Collectors.toList());
		soloX.forEach(System.err::println);

		// Forma más simplificada
		lista.stream().map(t -> t.getNombre()).forEach(System.err::println);

		// Otra forma aun MÁS simplificada y ponemos en mayuscula los nombres. 
		Stream<Object> xget = lista.stream().map((p) -> p.getNombre()).map(p -> p.toUpperCase());
		xget.forEach(System.err::println);

		// El map nos permite modificar también parámetros. imagina que quieres añadirle
		// algo a la cadena String. Sirve igual para sumar o restar.
		lista.stream().map((p) -> p.getNombre() + " prueba").forEach(System.out::println);

		// flatMap: puedes crear un String de varios atributos dentro de un objeto.
		// Osea, tenemos que tener una lista anidada dentro de otra lista.

		// El sorted es para ordenar listas de objetos.
		// hay que aplicarle un criterio de orden. un comparador. vamos a usar el
		// "compareTo" con expresiones lambda.
		Comparator<ExpresionesLambda> byNameAscendente = (ExpresionesLambda o1, ExpresionesLambda o2) -> o1.getNombre()
				.compareTo(o2.getNombre());
		Comparator<ExpresionesLambda> byNameDescendente = (ExpresionesLambda o1, ExpresionesLambda o2) -> o2.getNombre()
				.compareTo(o1.getNombre());
		List<ExpresionesLambda> filtrada = lista.stream().sorted(byNameAscendente).collect(Collectors.toList());// .forEach(System.out::println);
		filtrada.forEach(System.err::println);

		// Orden de forma descendente.
		filtrada = lista.stream().sorted(byNameDescendente).collect(Collectors.toList());
		filtrada.forEach(System.out::println);

		// El match te devuelve un booleano si encuentra una coincidencia dentro del la
		// lista.
		// vamos a intentar buscar algún nombre que tenga la letra J, para ello usamos
		// el "anymatch".
		boolean x = lista.stream().anyMatch(p -> p.getNombre().startsWith("A"));
		System.err.println("este es el resultado de anymatch " + x);

		// El Allmatch pregunta si TODOS los objetos coinciden con el criterio AllMatch
		x = lista.stream().allMatch(p -> p.getNombre().equalsIgnoreCase("Juan"));
		System.out.println("este es el resultado de allmatch " + x); // sale true porque todos usan una a minúscula.

		// El nonematch dice que ningún elemento coincide con la J.
		x = lista.stream().noneMatch(p -> p.getNombre().contains("ñ"));
		System.err.println("este es el resultado de allmatch " + x); // sale true porque todos usan una a minúscula.

		// Skip: te saltas objetos con el skip.
		lista.stream().skip(2).forEach(System.out::println);// solo se muestran los dos primeros.
		// limit: te muestra el numero de objetos que le pidas por orden.
		lista.stream().limit(2).forEach(System.err::println);

		// Experimento, no hacerle caso.
		lista.stream().sorted(byNameAscendente).skip(2).forEach(System.out::println);

		// collectors
		// Voy a crear "mapas". Es con el método MAP, es con GroupBy y Counting
		// GroupBy
		Map<Integer, List<ExpresionesLambda>> map1 = lista.stream().filter(p -> p.getX() > 3)
				.collect(Collectors.groupingBy(ExpresionesLambda::getX));
		// podemos usar tras map1, el entryset o values para ver los resultados de cada
		// parte del map.
		System.err.println(map1);

		// Contar los elementos sobre un elemento que se agrupe, osea, contar los
		// elementos repedios.
		Map<String, Long> map2 = lista.stream()
				.collect(Collectors.groupingBy(ExpresionesLambda::getNombre, Collectors.counting()));
		System.out.println(map2);

		// Sumar cosas de los objetos.
		Map<String, Double> map3 = lista.stream().collect(
				Collectors.groupingBy(ExpresionesLambda::getNombre, Collectors.summingDouble(ExpresionesLambda::getX)));
		System.err.println(map3);

		// suma, resumen y funciones aritmeticas como suma, resta.
		DoubleSummaryStatistics estadisticas = lista.stream()
				.collect(Collectors.summarizingDouble(ExpresionesLambda::getX));
		System.out.println(estadisticas);

		// FINDANY Y FIND FIRST:
		// Busca dendro de la lista el primer valor o bien uno aleatorio.
		Optional<ExpresionesLambda> lope = lista.stream().findAny();
		System.out.println(lope.orElse(ob2));

		// FindFirst:
		Optional<ExpresionesLambda> lope2 = lista.stream().findFirst();
		System.out.println(lope2);

		// Reduce: nos da el valor máximo de un Array. Primero creamos un Array:
		int redu[] = { 1, 2, 3, 4, 9, 5, 7, 6, 8 };

		// vamos a buscar el maximo.
		OptionalInt max = Arrays.stream(redu).reduce(Integer::max);
		System.err.println("ensayo de valor máximo " + max.getAsInt());

		// vamos a buscar el máximo y el maximo.
		int min = Arrays.stream(redu).min().orElse(0);
		int maximopoder = Arrays.stream(redu).max().orElse(0);
		System.out.println("el máximo es " + maximopoder + " y el minimo es " + min);

		// el metodo sum lo que hace es sumar todos los elementos del Array.
		int suma = Arrays.stream(redu).sum();
		System.err.println("la suma total es " + suma);

		// Para buscar la palabra más larga dentro de una cadena de caracteres:
		String palabras[] = { "a", "ae", "aei", "aeio", "aeiou" };
		String palabramaxima = Arrays.stream(palabras).max((p1, p2) -> p1.length() - p2.length()).get();
		System.out.println("la tiene más larga: " + palabramaxima);

		// Para ordenar un Array.
		int[] ordenado = Arrays.stream(redu).sorted().toArray();
		System.err.println(Arrays.toString(ordenado));

		// collect: es para guardar una lo que hayamos generado:
		Random r = new Random();
		List<Integer> furro = r.ints(0, 1000).limit(2).boxed().collect(Collectors.toList());
		furro.forEach(System.out::println);

		// para mostrar cuandos elementos de números hay:
		long total = furro.stream().collect(Collectors.counting());
		System.err.println("MIRA MIKE!" + total);

		// Para mostrar le máximo.
		Optional<Integer> maximoPlacer = furro.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
		System.out.println(maximoPlacer);

		// Sumar los elementos internos del Array.
		int zumosol = furro.stream().collect(Collectors.summingInt(v -> v.intValue()));
		System.err.println("esta es la suma de los elementos del array" + zumosol);

		//Para calcular la media. 
		double pCal = furro.stream().collect(Collectors.averagingInt(Integer::intValue));
		System.out.println("y esta es su media" + pCal);
		
		//para calcular su minimo. 
		IntSummaryStatistics minimo = furro.stream().collect(Collectors.summarizingInt(Integer::intValue));
		System.out.println(minimo);
		System.out.println("para calcular su minimo" + minimo.getMin());
		
		//Para juntar todos los elementos en una cadena de caracteres separadas por comas.
		String pruebaStringDos = furro.stream().map(Object::toString).collect(Collectors.joining(", texto de emeplo"));
		System.out.println(pruebaStringDos);
		
		//CON LA CLASE INSSUMMARYSTATIStics tenemos opciones a muchas cosas de aritmetica. 
		System.out.println(minimo.getMax());
		System.out.println(minimo.getSum());
		System.out.println(minimo.toString());
		
		//NO FUNCIONA!
		//coger solo fragmentos de una lista, y meterlos en otra lista. 
		List lista2 = new ArrayList();
		MePerdonas e1 = new MePerdonas("Juanjo", "seloquehaces", 10);
		MePerdonas e2 = new MePerdonas("pepa", "seloquehaces", 10);
		MePerdonas e3 = new MePerdonas("pig", "seloquehaces", 10);
		MePerdonas e4 = new MePerdonas("casa", "seloquehaces", 10);
		lista2.add(e1); lista2.add(e2); lista2.add(e3); lista2.add(e4);
		
//		Map <String, List<MePerdonas>> nombres = lista2.stream().collect(groupingBy(MePerdonas::getCiudades));
		
	}
}




