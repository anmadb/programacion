package j024_descuento;

import java.util.Iterator;

public class descuentoRopa {
	
	private final double descuento = 10;
	private double precio[]=new double[100];
	private double total;
	private int contador;
	private String nombre[] = new String[100];	
	private String mensaje;

	public void descuentos(String nombre, double precio) {
		for (int i = 0; i < this.nombre.length; i++) {
			if (this.nombre[i] == null) {
				this.nombre[i]= nombre;
				this.precio[i]= precio;
				contador += 1;
				total += precio;
				break;
			}else {
				mensaje = "Limite de productos.";
			}
		}
		if (contador > 5) {
			total = total - total * descuento / 100;
		}
	}
	
	public String verProductos() {
		String verProd = "Listado \n";
		for (int i = 0; i < this.nombre.length; i++) {
			if (nombre[i] != null) {
				verProd += nombre[i]+" "+precio[i]+"\n";
			}
		}
		return verProd;
	}
	
	public double verTotal() {
		return total;
	}
	
	public double total() {
		return total;
	}
	public String mensajeee() {
		return mensaje;
	}
	public double getDescuento() {
		return descuento;
	}
	
	
	
	

	
	
	
	

}
