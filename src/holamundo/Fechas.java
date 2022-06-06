package holamundo;

import java.time.LocalTime;
import java.util.Calendar;

public class Fechas {

	public static void main(String[] args) {
		LocalTime hora = LocalTime.now();
		int a = hora.get(null);
		System.out.println(hora);
		System.out.println(a);
	}

}
