package j025_validarDatos;

public class main {
	
	public static void main(String[] args) {
       
        String cadena1 = "123";
        String cadena2 = "abc";
        System.out.println(cadena1 + " es número: " + validarDatos.esNumero(cadena1));
        System.out.println(cadena2 + " es número: " + validarDatos.esNumero(cadena2));
        
        double numero1 = 5;
        double numero2 = 10;
        double minimo = 0;
        double maximo = 100;
        System.out.println(numero1 + " está en el rango [" + minimo + ", " + maximo + "]: " + validarDatos.estaEnRango(numero1, minimo, maximo));
        System.out.println(numero2 + " está en el rango [" + minimo + ", " + maximo + "]: " + validarDatos.estaEnRango(numero2, minimo, maximo));
    }

}
