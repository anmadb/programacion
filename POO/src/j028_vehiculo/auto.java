package j028_vehiculo;

public class auto extends vehiculo {
	
	private String acelera = "Auto acelera";
	private String frena = "Auto frena";
	
	@Override
	public String frenar() {
		return frena;
	}
	@Override
	public String acelerar() {
		return acelera;
	}

}
