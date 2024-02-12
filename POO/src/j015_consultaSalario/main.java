package j015_consultaSalario;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		consultaSalario empleado = new consultaSalario();
		
		for (int i = 0; i < 2 ; i++) {
			empleado.configEmpleado(JOptionPane.showInputDialog("Nombre del empleado: "));
			empleado.configHoras(JOptionPane.showInputDialog("Horas trabajadas: "));
			empleado.configPrecioHora(JOptionPane.showInputDialog("Precio por hora: "));
		}
	
		
		empleado.dimeSalario();

	}

}
