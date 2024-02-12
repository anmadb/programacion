package j021_calculadoraImpuestos;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		int control;
		do {
			
	
		String precioStr = JOptionPane.showInputDialog("(-1 SALIR)  Precio: ");
		control = Integer.parseInt(precioStr);
		if (control != -1) {
			Calculadora producto = new Calculadora(precioStr);
			String text = "EL producto tiene un precio de "+ producto.getPrecio()+" y con el impuesto "
					+ "del 15% quedaria en "+producto.getPrecioIMP();
			JOptionPane.showMessageDialog(null, text);
		}
		
	} while (control != -1);

	}
}



