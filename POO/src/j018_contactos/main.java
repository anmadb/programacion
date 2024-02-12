package j018_contactos;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {

		Contacto[] agenda = new Contacto[100];

		while (true) {

			String opcion = JOptionPane.showInputDialog("1. Añadir contacto\n" + "2. Buscar contacto\n"
					+ "3. Mostrar contactos\n" + "4. Salir\n" + "Seleccione una opción:");

			switch (opcion) {
			case "1":

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i] == null) {
						String nombre;
						String telefono;
						String email;
						agenda[i] = new Contacto(nombre = JOptionPane.showInputDialog("Ingrese el nombre:"),
								telefono = JOptionPane.showInputDialog("Ingrese el número de teléfono:"),
								email = JOptionPane.showInputDialog("Ingrese la dirección de email:"));
						break;
					}
				}

				JOptionPane.showMessageDialog(null, "Contacto añadido con éxito.");
				break;

			case "2":

				String buscarNombre = JOptionPane.showInputDialog("Ingrese el nombre a buscar:");
				String contactoEncontrado = "CONTACTO";

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i].getNombre().equalsIgnoreCase(buscarNombre)) {
						contactoEncontrado += "\nNOMBRE: " + agenda[i].getNombre() + "\nNUMERO: "
								+ agenda[i].getTelefono() + "\nMAIL: " + agenda[i].getEmail();

						JOptionPane.showMessageDialog(null, contactoEncontrado);

						break;

					} else if (i > agenda.length) {
						JOptionPane.showMessageDialog(null, "Contacto no encontrado.");
						break;
					}
				}

				break;

			case "3":

				String agendaCompleta = "AGENDA";

				for (int i = 0; i < agenda.length; i++) {
					if (agenda[i] != null) {
						agendaCompleta += "\nNOMBRE: " + agenda[i].getNombre() + "\nNUMERO: " + agenda[i].getTelefono()
								+ "\nMAIL: " + agenda[i].getEmail() + "\n___________________________________________";
					}
				}
				JOptionPane.showMessageDialog(null, agendaCompleta);

				break;

			case "4":

				JOptionPane.showMessageDialog(null, "Saliendo del programa.");
				System.exit(0);

			default:
				JOptionPane.showMessageDialog(null, "Opción no válida. Inténtelo de nuevo.");
				break;
			}
		}
	}
}
