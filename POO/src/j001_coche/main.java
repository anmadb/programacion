package j001_coche;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		coche subaru = new coche();
		subaru.establecer_color(JOptionPane.showInputDialog("INTRODUCE COLOR"));
		
		System.out.println(subaru.dime_color());
		
		subaru.configuracion_asiento(JOptionPane.showInputDialog("TIENES ASIENTOS DE CUERO"));
		System.out.println(subaru.dime_asientos());
		
		subaru.configuraClimatizador(JOptionPane.showInputDialog("TENES CLIMATIZADOR ??"));
		System.out.println(subaru.dimeClimatizador());
		System.out.println(subaru.dime_peso_coche());
		System.out.println("El precio es "+subaru.precio_coche());

		
		
		

	}

}
