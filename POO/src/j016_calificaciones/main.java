package j016_calificaciones;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		clase curso = new clase();
		
		 
		curso.setNombreCurso(JOptionPane.showInputDialog("Ingrese el nombre del curso:"));
		
        

        String calificacionStr = JOptionPane.showInputDialog("Ingrese la calificación del curso:");
        double calificacion = Double.parseDouble(calificacionStr);
        curso.setCalificacion(calificacion);

       
        curso.categorizarCalificacion();
		

	}

}
