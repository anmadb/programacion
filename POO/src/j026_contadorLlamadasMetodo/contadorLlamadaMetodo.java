package j026_contadorLlamadasMetodo;

public class contadorLlamadaMetodo {
	
	private static int contadorLlamadas = 0;

    public static void metodoSimple() {
        System.out.println("Ejecutando el método simple");
        contadorLlamadas++;
    }

    public static int obtenerContador() {
        return contadorLlamadas;
    }
}
