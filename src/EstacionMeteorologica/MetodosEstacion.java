package EstacionMeteorologica;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MetodosEstacion {

	private List<RegistroDatos> datos;
	private Init lista = new Init();

//	public void mostrarLista() {
//		lista.getAll().forEach(System.out::println);
//	}
	
	public void listaMaximo() {
		lista.getAll().stream().filter(p-> p.getProvincia()=="Valladolid" && p.getMaxima().getTemperatura() >19).forEach(p -> System.out.println(p.getFecha() + p.getProvincia() + p.getMaxima().getTemperatura()));;
		Optional asdf =	lista.getAll().stream().map(p-> p.getMaxima().getTemperatura()).max((arg0, arg1) -> hashCode());
		System.out.println(asdf);
//		Optional <Integer> x = lista.getAll().get(0).getMaxima().getTemperatura().stream().collect(Collectors.maxBy(Comparator.naturalOrder()));		
//		lista.getAll().stream().mapToDouble(p-> p.getMaxima().getTemperatura()).max().ifPresent(System.out.println());;
		
	}
}
