package j027_figuraGeometrica;

import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
 
        Rectangulo rectangulo = new Rectangulo(JOptionPane.showInputDialog("Base: "), JOptionPane.showInputDialog("Altura: "));
        Circulo circulo = new Circulo(JOptionPane.showInputDialog("Radio: "));

        String mensaje1 = "Área del rectángulo: " + rectangulo.calcularArea();
        String mensaje2 = "Área del círculo: " + circulo.calcularArea();
        
        JOptionPane.showMessageDialog(null, mensaje1);
        JOptionPane.showMessageDialog(null, mensaje2);
    }
}

