package EjemploThread;

public class Runnable_prueba implements Runnable {

	public static void main(String[] args) {
		// forma tradicional:
		Thread t = new Thread(new Runnable_prueba());
		t.start();
		// hilo anónimo;
		new Thread(new Runnable() {
			public void run() {
				System.out.println("Primer texto ejemplo");
			}
		}).start();
	}

	@Override
	public void run() {
		System.out.println("Segundo texto de ejemplo");
		;
	}

}
