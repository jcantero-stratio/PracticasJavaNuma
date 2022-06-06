package holamundo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Array_List {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> cars = new ArrayList<>();
		cars.add(" coche nuevo " + " coche viejo " + " coche robusto ");
		cars.add("  pedro ");
		cars.add(" juan ");
		cars.add(" aviejo sabroso ");
		System.out.println(cars.size());
		System.out.println(cars);
		System.out.println(cars.get(2));
		
		for (String p:cars) {
			System.out.println(p);
		}
		
		cars.remove(1);
		
		for (String p:cars) {
			System.out.println(p);
		}
		
//		cars.clear();
		
		if (cars.size() != 0) {
			System.out.println("hola");
		}else {
			System.out.println("Bob y hus... que nostalgia.");
		}
		//para sacar la lista por pantalla podemos hacer lo siguiente:
		System.out.println(cars);
		// o con un bucle for:
		for(int i = 0; i <cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		Collections.sort(cars);
		System.err.println(cars);
	}

}
