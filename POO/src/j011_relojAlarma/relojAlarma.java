package j011_relojAlarma;

public class relojAlarma {

	private String hora;
	private String horaAlarma;
	private Boolean activa;

	public relojAlarma() {
		hora = "07:00";
		activa = false;
	}

	public void hora_alarma(String horaAlarma) {
		this.horaAlarma = horaAlarma;
	}

	public void alarma_On(int alarma_On) {
		if (alarma_On == 1) {
			activa = true;
		} else {
			activa = false;
		}
	}

	public void cambiar_hora(String hora) {
		this.hora = hora;
	}

	public String ver_hora() {
		return "LA HORA ES " + hora;
	}

	public String ver_activa() {
		if (activa == true) {
			System.out.println("LA ALARMA SONARA A LAS " + horaAlarma );
		} else {
			System.out.println("LA ALARMA ESTA DESACTIVADA");
		}
		return null;
	}

}
