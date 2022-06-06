package holamundo;

import java.util.Objects;

public class Equals_y_hashcode {
	private int x;
	private int y;
	private String w;
	
	
	public Equals_y_hashcode(int x, int y, String w) {
		super();
		this.x = x;
		this.y = y;
		this.w = w;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public String getW() {
		return w;
	}


	public void setW(String w) {
		this.w = w;
	}


	@Override
	public String toString() {
		return "Equals_y_hashcode [x=" + x + ", y=" + y + ", w=" + w + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(w, x, y);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equals_y_hashcode other = (Equals_y_hashcode) obj;
		return Objects.equals(w, other.w) && x == other.x && y == other.y;
	}


	public static void main(String[] args) {
		Equals_y_hashcode ob1 = new Equals_y_hashcode(1, 1, "a");
		Equals_y_hashcode ob2 = new Equals_y_hashcode(1, 1, "a");
//Si no hacemos lo del equals y hashcode SIEMPRE seŕan diferentes. 
		if(ob1.equals(ob2)) {
			System.out.println("son iguales");
		}
		else {
			System.out.println("son diferentes");
		}
		
	}

}
