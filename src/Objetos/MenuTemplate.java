package Objetos;

public class MenuTemplate {

	public static void main(String[] args) {
		
		int x = 7;
		do {
		if ((x <0)||(x>4)){
			System.out.println("repetir?");
		} else if ((x>0)&&(x<5)){
			System.out.println("donde quiero llegar");
		}
		}while (x != 0);
			System.out.println("he salido");
	}

}
