/**
 * 
 */
package holamundo;

/**
 * @author jcantero
 *
 */
public class practics {

	private static int prueba = 1;
	
	
	public static int sumar (int a, int b) {
		int c = a+b;
		return c;
	}
	
	
	
	public static void main(String[] args) {
	
	practics ob2=new practics();
	practics ob1=new practics();
	
	ob2.prueba=3;
	System.out.println(practics.sumar(1, 4));
	System.out.println(ob1.prueba);
	ob1.prueba=2;
	System.out.println(ob2.prueba);
	System.out.println(ob1.prueba);
	}
	
}
