package j022_conversorTemperatura;

public class convTemperatura {
	
	private int grados;
	private String tipo;
	private final int arregloFarCel = 32;
	private final double factorDeConverFarCel = 1.8;
	
	
	public convTemperatura (String tipo, int grados){		
		this.grados = grados ;
		if (tipo.equalsIgnoreCase("Celsius")) {
			this.tipo = "Fahrenheit";
			this.grados = (int) ((grados * factorDeConverFarCel) + arregloFarCel);
		}else if (tipo.equalsIgnoreCase("Fahrenheit")) {
			this.tipo = "Celsius";
			this.grados = (int) ((grados - arregloFarCel)/factorDeConverFarCel);
		}
	}
	
	public String getGrados() {
		
		return "Son "+this.grados+" "+this.tipo;
	}
	
	
	

}
