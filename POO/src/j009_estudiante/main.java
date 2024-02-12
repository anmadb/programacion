package j009_estudiante;

public class main {

	public static void main(String[] args) {
		
		estudiante juan = new estudiante();
		
		juan.establecer_nombre();
		juan.establecer_edad();
		juan.establecer_calificaciones();
		
		System.out.println(juan.dime_estudiante());
		

	}

}
