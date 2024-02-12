package j013_recetaCocina;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {

	public static void main(String[] args) throws IOException {
		BufferedReader lector;
		InputStreamReader stream;
		stream = new InputStreamReader(System.in);
		lector = new BufferedReader(stream);

		recetaCocina receta = new recetaCocina();
		
		int controlador = 0;
		String a;
		int b = 0;
		
		System.out.println("RECETAS DE COCINA ");

		do {

			System.out.println("|| (1)ADD INGRE || (2)DEL INGRED || (3)ADD PASO || (4)DEL PASO || (5)VER INGRE || (6)VER PASOS || (-1)SALIR");
			controlador = Integer.parseInt(lector.readLine());
			switch (controlador) {
			case 1:
				System.out.println("ADD INGRE");
				System.out.print("INGREDIENTE: ");
				a = lector.readLine();
				receta.masIngrediente(a);
				break;
			case 2:
				System.out.println("DEL INGRE");
				System.out.print("NUMERO DE INGREDIENTE (ver listado, para ver listado pulse -1):");
				b = Integer.parseInt(lector.readLine());
				if (b == -1) {
					receta.verIngredientes();
					break;
				}
				receta.menosIngrediente(b);
				break;
			case 3:
				System.out.println("ADD PASO");
				System.out.print("PASO: ");
				a = lector.readLine();
				receta.masPasos(a);
				break;
			case 4:
				System.out.println("DEL PASO");
				System.out.println("NUMERO DE PASO (ver listado, para ver listado pulse -1): ");
				b = Integer.parseInt(lector.readLine());
				if (b == -1) {
					receta.verPasos();
					break;
				}
				receta.menosIngrediente(b);
				break;
			case 5:
				System.out.println("VER INGRE");
				receta.verIngredientes();
				break;
			case 6:
				System.out.println("VER PASOS");
				receta.verPasos();
				break;
			default:
				System.out.println("Numero incorrecto, no entendes que tenes que poner los numeros que te pongo en pantalla imbecil");

				break;
			}
		} while (controlador != -1);

	}

}
