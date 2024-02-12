package j012_reservaHotel;


public class reservaHotel {

	private int numHabi;
	private String tipoHabi;
	private int ocupadas[] = new int[10];
	private String tipoOcupadas[] = new String[10];

	public void habitacion(int numHabi, String tipoHabi) {
		this.numHabi = numHabi;
		this.tipoHabi = tipoHabi;
		for (int i = 0; i < ocupadas.length; i++) {
			if (ocupadas[i] == 0) {
				ocupadas[i] = numHabi;
				tipoOcupadas[i] = tipoHabi;
				break;
			} else if (ocupadas[i] == this.numHabi) {
				System.out.println("ESTA HABITACION YA ESTA OCUPADA");
				break;
			}
		}

	}

	public void cancela(int numHabi) {
		for (int i = 0; i < ocupadas.length;) {
			if (ocupadas[i] == this.numHabi) {
				ocupadas[i] = 0;
				System.out.println("RESERVA CANCELADA");
				break;
			} else {
				System.out.println("RESERVA NO ENCONTRADA");
				break;
			}
		}
	}

	public void disponibilidad() {
		System.out.println("ESTAS SON LAS HABITACIONES OCUPADAS");
		for (int i = 0; i < ocupadas.length; i++) {
			System.out.print(ocupadas[i] + " "+ tipoOcupadas[i]+" ");
			System.out.println();
		}
	}

	public String resumen() {
		return "Has reservado la habitacion numero " + numHabi + " del tipo " + tipoHabi;
	}

}
