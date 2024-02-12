package j014_registroEstudiantes;

import java.io.IOException;
import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) throws NumberFormatException, IOException {

	
		registroEstudiante linkia = new registroEstudiante();

		int controlador = 0;
		int controlador2 = 0;

		do {
			controlador = JOptionPane.showConfirmDialog(null, "¿Quieres ingresar un alumno?");

			if (controlador == JOptionPane.YES_OPTION) {
				linkia.configNombre(JOptionPane.showInputDialog("NOMBRE:"));
				linkia.configEdad(JOptionPane.showInputDialog("EDAD:"));
				linkia.configGrado(JOptionPane.showInputDialog("GRADO:"));
			} else if (controlador == JOptionPane.NO_OPTION) {
				controlador2 = JOptionPane.showConfirmDialog(null, "¿Quieres ver el listado de alumnos?");
				if (controlador2 == JOptionPane.YES_OPTION) {
					linkia.dimeListado();
				}else if(controlador2 == JOptionPane.NO_OPTION) {
					JOptionPane.showMessageDialog(null, "QUE MIERDA QUERES ENTONCES ????");
				}
			}

		} while (controlador != JOptionPane.CANCEL_OPTION && controlador2 != JOptionPane.CANCEL_OPTION);

	}

}
