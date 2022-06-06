package EjemploThread;

public class MiPrueba_thread extends Thread {

	
	public static void main (String[] args) {
		MiPrueba_thread ejecutor = new MiPrueba_thread();
		ejecutor.start();
	}
	
	public void run() {
		System.out.println("nuevo texto de ejemplo");
	}
}
