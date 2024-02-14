package j029_animal;

public class main {
	    public static void main(String[] args) {
	       
	        perro perro = new perro();
	        gato gato = new gato();

	       
	        System.out.println("Perro:");
	        perro.hacerSonido();
	        perro.moverse();

	        System.out.println("\nGato:");
	        gato.hacerSonido();
	        gato.moverse();
	    
	}

}
