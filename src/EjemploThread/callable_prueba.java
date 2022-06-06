package EjemploThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class callable_prueba implements Callable<String>{

	public static void main(String[] args) throws Exception{
		ExecutorService executor = Executors.newSingleThreadExecutor();
		Future<String> f1 = executor.submit(new callable_prueba());
		System.out.println(f1.get());
		
	}

	@Override
	public String call() throws Exception {
		return "esto es un hilo callable";
	}
	

}
