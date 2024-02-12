package j001_coche;

public class coche {

	// defino caracteristicas

	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;

	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;


	public coche() {

		ruedas = 4;
		largo = 4000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}

	public String dime_peso_coche() {
		int pesoCarroceria = 500;
		peso_total = peso_plataforma + pesoCarroceria;

		if (asientos_cuero == true) {
			peso_total = peso_total + 50;
		}
		if (climatizador == true) {
			peso_total = peso_total + 20;
		}
		return "El peso del coche es " + peso_total;
	}
	
	public int precio_coche() {
		int precio_final = 10000;
		
		if (asientos_cuero == true) {
			precio_final+=2000;
		}
		if (climatizador == true) {
			precio_final+=1500;
		}
		return precio_final;
	}

	public boolean isClimatizador() {
		return climatizador;
	}

	public void configuraClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}

	public String dimeClimatizador() {

		if (climatizador == true) {
			return "tienes climatizador";
		} else {
			return "no tienes climatizador";
		}
	}

	public String dime_motor() {
		return "el motor del coche tiene " + motor + " caballos de potencia.";
	}

	public void establecer_color(String color_coche) {
		color = color_coche;
	}

	public String dime_color() {
		return "el color de mi coche es " + color;
	}

	public String dime_datos_generales() {
		return "la plataforma del coche tiene " + ruedas + " ruedas. mide " + largo / 1000 + 
				" metros con un ancho de "
				+ ancho + " centimetros y un pedo de platafotma de " + peso_plataforma + " kgb";

	}

	public void configuracion_asiento(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}

	public String dime_asientos() {
		if (this.asientos_cuero == true) {
			return "el coche tiene asientos de cuero";
		} else {
			return "tus asientos son de pena";
		}
	}

	public String dimeasientos() {
		return asientos_cuero ? "el coche tiene asientos de cuero" : "tus asientos son de pena";
	}

}
