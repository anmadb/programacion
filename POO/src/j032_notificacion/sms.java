package j032_notificacion;

public class sms extends notificacion{
	
	private String mensaje = "Notificacion";
	private String destinatario = "Destinatario";

	public sms(String mensaje, String destinatario) {
		this.mensaje = mensaje;
		this.destinatario = destinatario;
	}
	public sms(String mensaje) {
		this.mensaje = mensaje;
		this.destinatario = null;
	}

	@Override
	public String enviar() {
	
		return mensaje+" "+destinatario;
	}

}
