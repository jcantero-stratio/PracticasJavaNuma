package Parking;

public class Prueba {

	static String unArray[][] = {{"L","L","L"},{"L","L","L"},{"L","L","L"}};

	
	public static void main(String[] args) {
	boolean x=false;	

		for (int a=0;a<3;a++) {
			for (int b=0;b<3;b++){
				
				System.out.print(unArray[a][b]);
			}
			System.out.println(" ");
		}
				
		for (int a=0;a<3;a++) {
			for (int b=0;b<3;b++){
				if(unArray[a][b]== "O") {
					 x=true;
				}
			}
		}
		if (x==false) {
			System.out.println("False");
		}
	}

}
