package EjemploThread;

import java.util.concurrent.atomic.AtomicInteger;

public class synchronized_prueba implements Runnable {

	private static AtomicInteger c = new AtomicInteger(0); //variable atómica. 
	private static Object object = new Object();
	private static int d;
	@Override
	public void run() {

		for (int i = 0; i < 20000; i++) {
			
			c.incrementAndGet(); //variable atómica

			synchronized (object) { // NO funciona. 
				d++;
			}
		}
	}

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		int nNucleos = runtime.availableProcessors();

		Thread[] hilos = new Thread[nNucleos];

		for (int j = 0; j < hilos.length; j++) {
			Runnable runnable = new synchronized_prueba();
			hilos[j] = new Thread(runnable);
			hilos[j].start();
		}
		System.out.println(c);
		System.out.println(d);
	}
	
	public synchronized void peexe() {
		
	}

}
