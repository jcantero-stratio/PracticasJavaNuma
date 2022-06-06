package holamundo;

public class Singleton {

	private static Singleton objeto = null;
	private String p;
	// con este metodo devuelve solo un objeto de la clase singleton. 
	public static Singleton getInstance() {
		if (objeto==null) {
			objeto = new Singleton();
		}
		return objeto;
	}

	//podemos crear los metodos que queramos. 
	public String getP() {
		return p;
	}

	
	public void setP(String setP) {
		this.p = setP;
	}

	//crear un mensaje. 
	public void mensaje() {	
		System.out.println(p);
	}
}
