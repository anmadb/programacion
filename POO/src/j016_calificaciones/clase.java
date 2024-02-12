package j016_calificaciones;

import javax.swing.JOptionPane;

public class clase {
	
	private String nombreCurso;
	private double calificaciones;
	
	public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

   
    public void setCalificacion(double calificacion) {
    
        this.calificaciones = calificacion;
    }
    
    public void categorizarCalificacion() {
        char categoria;

     
        switch ((int) calificaciones / 10) {
            case 10:
            case 9:
                categoria = 'A';
                break;
            case 8:
                categoria = 'B';
                break;
            case 7:
                categoria = 'C';
                break;
            case 6:
                categoria = 'D';
                break;
            default:
                categoria = 'F';
        }

      
        String mensaje = "Nombre del curso: " + nombreCurso + "\nCalificación: " + calificaciones + "\nCategoría: " + categoria;
        JOptionPane.showMessageDialog(null, mensaje);
    }

}
