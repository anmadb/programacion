package j007_automovil;

public class automovil {
	
	private String marca;
	private String modelo;
	
	public void establecer_marca() {
		marca = "Honda";
	}
	public void establecer_modelo() {
		modelo = "Civic";
	}
	public String dime_automovil() {
		return "la marca del coche es "+marca+" y el modelo es "+modelo;
	}
}
