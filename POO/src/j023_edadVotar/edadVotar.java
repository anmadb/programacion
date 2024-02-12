package j023_edadVotar;

public class edadVotar {
	
	private final int minVotar = 18;
	private String mensaje;
	private String nombre;
	
	
	public edadVotar(String nombre, int edad) {
		if (edad > minVotar) {
			mensaje = nombre+" puede votar. Tiene "+edad+" años";
		}else {		
			mensaje = nombre+" no puede votar. Tiene "+edad+" años";
		}
		
	}
	public String getMensaje() {
		return mensaje;
	}
	public String getNombre() {
		return nombre;
	}
	public int getMinVotar() {
		return minVotar;
	}

}
