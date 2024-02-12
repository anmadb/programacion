package j010_clase_producto;

public class clase_producto {

	private String nombre;
	private double precio;
	private int stock;

	public void establecer_nombre() {
		nombre = "leche";
	}

	public void establecer_precio() {
		precio = 0.90;
	}

	public void establecer_stock() {
		stock = 100000;
	}

	public String dime_producto() {
		return "el precio de " + nombre + " es " + precio + " y el stock es " + stock;
	}

}
