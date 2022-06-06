package EjemploThread;

public class PrimoDani extends Thread {

	private long minimo;

	public PrimoDani(long minimo) {
		this.minimo = minimo;
	}

	public void run() {
		long n = minimo;
		while (!testPrimalidad(n)) {
			System.out.println("no es primo");
			++n;
		}
		System.out.println("Mira! ES PRIMO!");
	}

	public boolean testPrimalidad(long n) {
		boolean continuar = true;
		boolean esPrimo = true;
		long divisor = 2;
		do {
			if (n % divisor == 0) {
				continuar = false;
				esPrimo = false;
			} else {
				++divisor;
			}
		} while (continuar && divisor <= (n / 2));

		return esPrimo;
	}
}
