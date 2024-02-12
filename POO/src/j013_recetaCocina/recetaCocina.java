package j013_recetaCocina;

public class recetaCocina {

	private String ingredientes[] = new String[10];
	private String pasos[] = new String[10];

	public void masIngrediente(String ingrediente) {
		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i] == null) {
				this.ingredientes[i] = ingrediente;
				break;
			} else if (ingredientes[i] == ingrediente) {
				System.out.println("Este ingrediente ya fue añadido a la lista");
				break;
			}
		}
	}

	public void menosIngrediente(int ingrediente) {
		ingredientes[ingrediente - 1] = null;
	}

	public String verIngredientes() {
		for (int i = 0; i < ingredientes.length; i++) {
			if (ingredientes[i]==null) {
				ingredientes[i]="SIN INGREDIENTE";
				System.out.println("INGREDIENTE " + (i + 1) +" "+ ingredientes[i]);
			} else {
				System.out.println("INGREDIENTE " + (i + 1) +" "+ ingredientes[i]);
			}

		}
		return null;
	}

	public void masPasos(String paso) {
		for (int i = 0; i < ingredientes.length; i++) {
			if (pasos[i] == null) {
				pasos[i] = paso;
				break;
			} else if (ingredientes[i] == paso) {
				System.out.println("Este ingrediente ya fue añadido a la lista");
				break;
			}
		}
	}

	public void menosPasos(int paso) {
		pasos[paso - 1] = null;
	}

	public String verPasos() {
		for (int i = 0; i < pasos.length; i++) {
			if (pasos[i]==null) {
				pasos[i]="SIN PASO";
				System.out.println("PASO " + (i + 1) +" "+ pasos[i]);
			} else {
				System.out.println("PASO " + (i + 1) +" "+ pasos[i]);
			}

		}
		return null;
	}

}
