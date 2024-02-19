package j019_usoEmpleado;

import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;

import javax.swing.JOptionPane;

public class uso_empleado {

	public static void main(String[] args) {

		int control = 0;
		empleado[] misEmpleados = new empleado[1000];

		do {

			control = Integer.parseInt(JOptionPane.showInputDialog(
					"1. Registro empleado\n" + "2. Modificacion de sueldo\n" + "3. Comparar fechas de contrato\n"
							+ "4. Lista de empleados\n" + "5. Aumento de sueldo condicionado\n" + "6. SALIR\n"));

			switch (control) {
			case 1:

				for (int i = 0; i < misEmpleados.length; i++) {

					if (misEmpleados[i] == null) {
						String nombre = JOptionPane.showInputDialog("REGISTRO EMPLEADO\n  Nombre: ");
						double pago = Double.parseDouble(JOptionPane.showInputDialog("Salario: "));
						int agno = Integer.parseInt(JOptionPane.showInputDialog("Año: "));
						int mes = Integer.parseInt(JOptionPane.showInputDialog("Mes: "));
						int dia = Integer.parseInt(JOptionPane.showInputDialog("Dia: "));

						misEmpleados[i] = new empleado(nombre, pago, agno, mes, dia);
						break;
					}
				}
				break;
			case 2:
				String nEmpleadox = JOptionPane.showInputDialog("Nombre de empleado que quieras cambiarle el sueldo:");
				String nEmpleadoNoEncontrado = "Nombre de empleado no encontrado";

				for (int i = 0; i <= misEmpleados.length;i++) {
					if (misEmpleados[i].dameNombre().equalsIgnoreCase(nEmpleadox)) {
						misEmpleados[i].subeSueldo(JOptionPane.showInputDialog(
								"Que % quieres subir el sueldo a " + misEmpleados[i].dameNombre() + " :"));
						break;
						
					} else if (i > misEmpleados.length ) {
						JOptionPane.showMessageDialog(null, nEmpleadoNoEncontrado);
						break;
					}					
				}
				
				break;
			case 3:
				int nEmpleado1 =Integer.parseInt( JOptionPane
						.showInputDialog("Numero del primer empleado que quieras comparar la fecha de contrato:"));
				int nEmpleado2 =Integer.parseInt(JOptionPane.showInputDialog("Numero del segundo empleado que quieras comparar la fecha de contrato:"));
				String nEmpleadoNoEncontrado2 = "Nombres de empleado no encontrado";
				
				

				if ((misEmpleados[nEmpleado1 - 1].dameAnioContrato())<(misEmpleados[nEmpleado2 - 1].dameAnioContrato())) {

					String a = "El empleado " + misEmpleados[nEmpleado1-1].dameNombre() + " fue contratado antes que "
							+ misEmpleados[nEmpleado2-1].dameNombre();
					JOptionPane.showMessageDialog(null, a);

				} else if ((misEmpleados[nEmpleado2 - 1].dameAnioContrato())<(misEmpleados[nEmpleado1 - 1].dameAnioContrato())) {

					String b = "El empleado " + misEmpleados[nEmpleado2-1].dameNombre() + " fue contratado antes que "
							+ misEmpleados[nEmpleado1-1].dameNombre();
					JOptionPane.showMessageDialog(null, b);

				} else {
					JOptionPane.showMessageDialog(null, nEmpleadoNoEncontrado2);
					break;
				}

				break;
			case 4:
				String mensaje = "Listado empleados \n";

				for (int i = 0; i < misEmpleados.length; i++) {
					if (misEmpleados[i] != null) {
						mensaje += "NUMERO: " + (i + 1) + "\nNOMBRE: " + misEmpleados[i].dameNombre() + "\nSUELDO: "
								+ misEmpleados[i].dameSueldo() + "\nFECHA CONTRATO: "
								+ misEmpleados[i].dameFechaContrato() + "\n--------------------------------" + "\n";
					}
				}
				JOptionPane.showMessageDialog(null, mensaje);
				break;
			case 5:
				
				int anioCorte = Integer.parseInt(JOptionPane.showInputDialog("Año de corte de subida de sueldo"));
				String porcentajeSubida = JOptionPane.showInputDialog("Porcentaje subida");
				String mensaje3 = "Lista de cabios en salario\n";
				
				for (int i = 0; i < misEmpleados.length; i++) {
					int anioContrato = misEmpleados[i].dameAnioContrato();
					
					if (anioContrato < anioCorte) {
						misEmpleados[i].subeSueldo(porcentajeSubida);
						
						mensaje3 += "Empleado: "+ misEmpleados[i].dameNombre()+ "\n Nuevo salario: "+ misEmpleados[i].dameSueldo() ;
						
						break;
						}
				}
				JOptionPane.showMessageDialog(null, mensaje3);
				break;
			default:
				String mensajeGeneral = "NO SEAS IMBECIL, TENES QUE PONER UNO DE LOS NUMEROS QUE TE DIGO";
				JOptionPane.showMessageDialog(null, mensajeGeneral);
				break;
			}
		} while (control != 6);

	}

	

}

class empleado {
	
	private String nombre;
	private double sueldo;
	private int anio_contrato;
	private String fechaFormateada;


	public empleado(String nom, double sal, int agno, int mes, int dia) {

		nombre = nom;
		sueldo = sal;

		GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
		Date alta_contrato = calendario.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		fechaFormateada = sdf.format(alta_contrato);
		anio_contrato = calendario.get(GregorianCalendar.YEAR);
		
	

	}
	public empleado(String nom) {
		nombre = nom;
		sueldo = 0;
		
		GregorianCalendar calendario = new GregorianCalendar();
		Date alta_contrato = calendario.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		fechaFormateada = sdf.format(alta_contrato);
		anio_contrato = calendario.get(GregorianCalendar.YEAR);
		
	}

	public String dameNombre() {
		return nombre;
	}
	public double dameSueldo() {
		return sueldo;
	}	
	public String dameFechaContrato() {
		return fechaFormateada;
	}	
	public int dameAnioContrato(){		
		return anio_contrato;	
	}
	

	public void subeSueldo(String porcentaje) {

		double porcen = Double.parseDouble(porcentaje);

		double aumento = sueldo * porcen / 100;
		sueldo += aumento;
	}

	public void nombreEmpleado(String nombre) {
		this.nombre = nombre;
	}

	public void sueldoEmpleado(String sueldo) {
		int numSueldo = Integer.parseInt(sueldo);
		this.sueldo = numSueldo;
	}

	public void altaEmpleado(int agno, int mes, int dia) {

	}

}
