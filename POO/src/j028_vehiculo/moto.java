package j028_vehiculo;

public class moto extends vehiculo {
	
	private String acelera = "Moto acelera";
	private String frena = "Moto frena";
	
	@Override
	public String frenar() {
		return frena;
	}
	@Override
	public String acelerar() {
		return acelera;
	}

}
