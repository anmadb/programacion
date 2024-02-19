package j031_producto;

public class producto {
	
	private String nombre;
	private double precio;
	private int stock;
	
	
	public producto(String nombre, double precio, int stock) {

		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}
	public producto(String nombre) {
		
		this.nombre = nombre;
		this.precio = 0;
		this.stock = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}

}
