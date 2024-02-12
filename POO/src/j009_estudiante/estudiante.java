package j009_estudiante;

public class estudiante {
	
	private String nombre;
	private int edad;
	private double calificaciones;
	
	public void establecer_nombre() {
		nombre="juan";
	}
	public void establecer_calificaciones() {
		calificaciones = 3;
	}
	public void establecer_edad() {
		edad = 34;
	}
	public String dime_estudiante() {
		
		return"el estudiante "+nombre+" tiene "+edad+" años y saco "+calificaciones+" en matematicas.";
	}
	

}
