package holamundo;

public class Singleton2 {

	public static void main(String[] args) {
		//en vez de crear un objeto singleton, lo que hacemos es llamar al getinstance. 
		Singleton obj = Singleton.getInstance();
		//ya podemos llamar a sus métodos y a sus getter y setters. 
		obj.setP("novea no?");
		obj.mensaje();
		
	}

}
