package j030_calcSal;

public class main {

	public static void main(String[] args) {
		
		empleadoParcial empleado1 = new empleadoParcial();
		
		empleado1.calculaSalario(7.6, 30);
		System.out.println("El salario es: "+empleado1.salario());

	}

}
