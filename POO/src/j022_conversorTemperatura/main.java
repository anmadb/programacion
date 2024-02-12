package j022_conversorTemperatura;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		String opcion;
		
		do {
			
			opcion = JOptionPane.showInputDialog("Calculo || Salir");
			if (opcion.equalsIgnoreCase("Calculo")) {
				String tipo = JOptionPane.showInputDialog("Dime el tipo de grado que vas a introducir CELSIUS o FAHRENHEIT: ");
				String grados = JOptionPane.showInputDialog("Dime los grados: ");
				int gradosInt = Integer.parseInt(grados);
				
				convTemperatura conversor = new convTemperatura(tipo,gradosInt);
				JOptionPane.showInternalMessageDialog(null, conversor.getGrados());
			}else if (opcion.equalsIgnoreCase("salir")){
				String mensaje = "Hasta la proxima";
				JOptionPane.showInternalMessageDialog(null, mensaje);
			}else {
				String mensaje2 = "Opcion INCORRECTA";
				JOptionPane.showInternalMessageDialog(null, mensaje2);
			}

		} while (opcion == "Salir");
		
	}

}
