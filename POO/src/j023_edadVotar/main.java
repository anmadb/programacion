package j023_edadVotar;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		
		String nombre = JOptionPane.showInputDialog("Nombre:");
		int edad =Integer.parseInt(JOptionPane.showInputDialog("Edad:"));
		
		edadVotar verificarEdad = new edadVotar(nombre,edad);
		
		JOptionPane.showMessageDialog(null, verificarEdad.getMensaje());
		
		
		
	}

}
