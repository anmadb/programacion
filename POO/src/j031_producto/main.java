package j031_producto;

public class main {

	public static void main(String[] args) {
		
		producto tomate = new producto("Tomate",2.99,300);
		producto lechuga = new producto("Lechuga");
		
		System.out.println(tomate.getNombre()+ " cuesta "+ tomate.getPrecio()+" y hay en stock "+tomate.getStock());
		System.out.println(lechuga.getNombre()+ " cuesta "+ lechuga.getPrecio()+" y hay en stock "+lechuga.getStock());
	

	}

}
