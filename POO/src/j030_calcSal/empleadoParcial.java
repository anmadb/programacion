package j030_calcSal;

public class empleadoParcial extends empleados {
    private double precioHora;
    private int horasTrabajadas;

    public void calculaSalario(double precioHora, int horasTrabajadas){
       this.horasTrabajadas = horasTrabajadas;
       this.precioHora = precioHora;
    }


	@Override
	public double salario() {
		return precioHora * horasTrabajadas;
	}
}
