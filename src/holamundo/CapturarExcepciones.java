package holamundo;

public class CapturarExcepciones {

	public static void main(String[] args) {
		int a = 1, b = 0;
		
		try {
		System.out.println(a/b);
		}catch(java.lang.ArithmeticException ex){
		System.out.println("ha ocurrido un error.");	
		}
	}

}
