package j025_validarDatos;

public class validarDatos {
	
	 public static boolean esNumero(String cadena) {
	        try {
	            Double.parseDouble(cadena);
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }
	    
	    public static boolean estaEnRango(double numero, double minimo, double maximo) {
	        return numero >= minimo && numero <= maximo;
	    }

}
