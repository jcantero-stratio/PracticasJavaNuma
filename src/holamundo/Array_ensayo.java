
package holamundo;

import java.util.stream.Stream;

import ExpresionesLambda.ExpresionesLambda;

public class Array_ensayo {
	static int unArray[][]= {{1,1,1,1},{1,1,1,1}};

	public int edad;
	private int edad2 = 100;

	public static void main(String[] args){
	
	Array_ensayo p1 = new Array_ensayo();
//	int unArray[] = new int[4];
	for (int[] p : unArray) {
		for(int row:p) {
		System.out.print(row);
		}
		System.out.println("");
		}
	}

	
}
