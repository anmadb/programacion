package j032_notificacion;

public class correo extends notificacion {
	
	private String mensaje = "Notificacion";
	private String asunto = "Asunto";
	
	public correo(String mensaje, String asunto) {
		super();
		this.mensaje = mensaje;
		this.asunto = asunto;
	}
	public correo(String mensaje) {
		super();
		this.mensaje = mensaje;
		this.asunto = null;
	}

	@Override
	public String enviar() {
		
		return mensaje+" "+asunto;
	}

}
