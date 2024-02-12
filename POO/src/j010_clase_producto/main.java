package j010_clase_producto;

public class main {

	public static void main(String[] args) {
		
		clase_producto leche = new clase_producto();
		
		leche.establecer_nombre();
		leche.establecer_precio();
		leche.establecer_stock();
		System.out.println(leche.dime_producto());

	}

}
