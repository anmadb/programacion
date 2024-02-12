package j024_descuento;

import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
		
		descuentoRopa descuentos = new descuentoRopa();
		int control;
		do {
			control = Integer.parseInt(JOptionPane.showInputDialog(" (1)Salir || (2)Continuar"));
			if (control == 2) {
					String nombre = JOptionPane.showInputDialog("Nombre producto: ");
					int precio = Integer.parseInt(JOptionPane.showInputDialog("Precio producto"));
					descuentos.descuentos(nombre, precio);
			}else {
				String mensaje = "SOLO ACEPTO 1 Y 2";
				JOptionPane.showMessageDialog(null, mensaje);
			}
	
		} while (control != 1);
		
		JOptionPane.showMessageDialog(null, descuentos.verProductos());
		JOptionPane.showMessageDialog(null, descuentos.verTotal());

		
	}

}
