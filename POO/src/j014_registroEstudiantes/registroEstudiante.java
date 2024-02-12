package j014_registroEstudiantes;

public class registroEstudiante {

	private String nombre[] = new String[5];
	private String edad[] = new String[5];
	private String grado[] = new String[5];

	public String[] dimeNombre() {
		return nombre;
	}

	public void configNombre(String nombre) {
		for (int i = 0; i < this.nombre.length; i++) {
			if (this.nombre[i] == null) {
				this.nombre[i] = nombre;
				break;
			}
		}
	}

	public String[] dimeEdad() {
		return edad;
	}

	public void configEdad(String string) {
		for (int i = 0; i < this.edad.length; i++) {
			if (this.edad[i] == null) {
				this.edad[i] = string;
				break;
			}
		}
	}

	public String[] dimeGrado() {
		return grado;
	}

	public void configGrado(String grado) {
		for (int i = 0; i < this.grado.length; i++) {
			if (this.grado[i] == null) {
				this.grado[i] = grado;
				break;
			}
		}
	}

	public String dimeListado() {
		System.out.println("|| NOMBRE | EDAD | GRADO ||");
		for (int i = 0; i < edad.length; i++) {
			if (nombre[i] != null && edad[i] != null && grado[i] != null) {
				System.out.println("||" + nombre[i] + " | " + edad[i] + " | " + grado[i] + " || ");
			}

		}

		return "Listado de linkia";

	}

}
