package j032_notificacion;

public class app extends notificacion{
	
	
	private String mensaje = "Notificacion";
	private String destinatario = "Destinatario";
	
	
	public app(String mensaje, String destinatario) {
		super();
		this.mensaje = mensaje;
		this.destinatario = destinatario;
	}
	public app(String mensaje) {
		super();
		this.mensaje = mensaje;
		this.destinatario = null;
	}


	@Override
	public String enviar() {
		
		return mensaje+" "+destinatario;
	}

}
