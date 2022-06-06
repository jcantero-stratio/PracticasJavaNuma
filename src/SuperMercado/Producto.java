package SuperMercado;

public class Producto implements Comparable<Producto> {
private Integer identificador;
private double precio;
private String Desripción;
private int stock;
private int stockAlmacen;

public Producto(int identificador, double precio, String desripción, int stock, int stockAlmacen) {
	super();
	this.identificador = identificador;
	this.precio = precio;
	this.Desripción = desripción;
	this.stock = stock;
	this.stockAlmacen = stockAlmacen;
}

public int getStockAlmacen() {
	return stockAlmacen;
}

public void setStockAlmacen(int stockAlmacen) {
	this.stockAlmacen = stockAlmacen;
}

public int getStock() {
	return stock;
}

public void setStock(int stock) {
	this.stock = stock;
}

public int getIdentificador() {
	return identificador;
}

public void setIdentificador(int identificador) {
	this.identificador = identificador;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public String getDesripción() {
	return Desripción;
}

public void setDesripción(String desripción) {
	Desripción = desripción;
}

@Override
public String toString() {
	return "Producto [identificador=" + identificador + ", precio=" + precio + ", Desripción=" + Desripción + ", stock="
			+ stock + ", stockAlmacen=" + stockAlmacen + "]";
}

@Override
public int compareTo(Producto o) {
	return identificador.compareTo(o.getIdentificador());
}






}
