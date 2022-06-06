package SuperMercado;

import java.util.Scanner;

public class SuperMercado {

	MercadonaClubDeFans ob = new MercadonaClubDeFans();
	ReponedorSimple oper= new ReponedorSimple();
	
	public void decrementaStock(int a) throws Exception {//listo
	int b = oper.producStock.get(a).getStock();
	if(b==0) {
		throw new Exception("No hay Stock!");
	}
	oper.producStock.get(a).setStock(b - 1);
	}
	
	public void incrementaCajaSuper (double a) {
	double b = ob.cajaSuper;
	ob.cajaSuper = b + a;
	}	
	
	public void listarProductos() throws Exception {// listo
		if(oper.producStock.isEmpty()) {
			throw new Exception("No hay objetos!");
		}else {
			for (int i=0;i<oper.producStock.size();i++)
			System.out.println(oper.producStock.get(i));
		}	
	}
	
	public void valorCaja() {//listo
	System.out.println("el valor de la caja es de "+ ob.cajaSuper +"€");
	}

}
