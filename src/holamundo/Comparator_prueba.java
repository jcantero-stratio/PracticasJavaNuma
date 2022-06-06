package holamundo;

import java.util.Comparator;

public class Comparator_prueba implements Comparator<Comparable_prueba>{

	//ordena de mayor a menor.

	@Override
	public int compare(Comparable_prueba p1, Comparable_prueba p2) {
		if(p1.getEdad() > p2.getEdad()) return -1;
		if(p1.getEdad() < p2.getEdad()) return 1;
		return 0;
	}

	

}
