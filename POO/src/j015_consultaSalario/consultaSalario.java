package j015_consultaSalario;


import javax.swing.JOptionPane;

public class consultaSalario {

	private String empleado[] = new String[5];
	private int horasTrabajadas[] = new int[5];
	private double precioHora;
	private double cobro[] = new double[5];

	public String dimeSalario() {
		for (int i = 0; i < cobro.length; i++) {
			if (empleado[i] != null || horasTrabajadas[i] != 0 || cobro[i] != 0) {
				String mensaje = empleado[i] + " HORAS: " + horasTrabajadas[i] + " COBRO: " + cobro[i];
				JOptionPane.showMessageDialog(null, mensaje);
			}

		}

		return null;

	}

	public void configEmpleado(String empleado) {
		for (int i = 0; i < this.empleado.length; i++) {
			if (this.empleado[i] == null) {
				this.empleado[i] = empleado;
				break;
			}
		}
	}

	public void configHoras(String horasTrabajadas) {

		int horas = Integer.parseInt(horasTrabajadas);

		for (int i = 0; i < this.horasTrabajadas.length; i++) {
			if (this.horasTrabajadas[i] == 0) {
				this.horasTrabajadas[i] = horas;
				break;
			}
		}
	}

	public void configPrecioHora(String precioHora) {
		this.precioHora = Double.parseDouble(precioHora);
		for (int i = 0; i < horasTrabajadas.length; i++) {
			this.cobro[i] = this.horasTrabajadas[i] * this.precioHora;
		}

	}

}
