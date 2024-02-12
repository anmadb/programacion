package j020_constantes;

public class constantes {

	public static void main(String[] args) {

		Empleados trabajador1 = new Empleados("Paco");

		Empleados trabajador2 = new Empleados("Ana");

		trabajador1.cambioSeccion("RRHH");

		System.out.println(trabajador1.devuelveDatos());

		System.out.println(trabajador2.devuelveDatos());

	}
}

class Empleados {
	
	private final String nombre;
	private String seccion;

	public Empleados(String nom) {

		nombre = nom;

		seccion = "Administracion";
	}

	public void cambioSeccion(String seccion) {

		this.seccion = seccion;
	}

	public String devuelveDatos() {
		return "El nombre es: " + nombre + " y la secion es " + seccion;
	}
	
}
