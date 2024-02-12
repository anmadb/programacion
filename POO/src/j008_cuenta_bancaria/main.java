package j008_cuenta_bancaria;

public class main {
	public static void main(String[] args) {
		cuenta_bancaria cuentaJuan = new cuenta_bancaria();
		cuentaJuan.establecer_titular();
		cuentaJuan.establecer_saldo();
		
		System.out.println(cuentaJuan.dime_cuenta());
	}

}
