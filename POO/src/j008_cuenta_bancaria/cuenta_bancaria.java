package j008_cuenta_bancaria;

public class cuenta_bancaria {
	
	private String titular;
	private double saldo;
	
	public void establecer_titular() {
		titular = "juan";
	}
	public void establecer_saldo() {
		saldo = 3423422.34;
	}
	public String dime_cuenta() {
		return "el titular es "+titular+" y la el saldo de la cuenta es "+saldo;
	}
	
}
