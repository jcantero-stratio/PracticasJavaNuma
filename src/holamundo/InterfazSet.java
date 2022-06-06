package holamundo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InterfazSet {

	public static void main(String[] args) {
		//TreeSet ordena los elementos. 
		Set <String> e = new TreeSet<>();		
		e.add("interfaz\n");
		e.add("de\n");
		e.add("pruebas\n");
		e.add("interfaces\n");
		System.out.println(e);
		System.out.println("");
		//ordena por orden de inserccion
		Set<String> c = new LinkedHashSet<>();
		c.add("todo");
		c.add("es");
		c.add("una ");
		System.out.println(c);
		//no ordena ni permite repetidos. 
		Set<String> p = new HashSet<>();
		p.add("nada por aquí");
		p.add("nada por allá");
		p.add("es otro ejemplo");
		p.add("de java no más");
		System.out.println(p);
	}

}
