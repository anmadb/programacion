package j027_figuraGeometrica;

import javax.swing.JOptionPane;

public class main {
	
	public static void main(String[] args) {
 
        Rectangulo rectangulo = new Rectangulo(JOptionPane.showInputDialog("Base: "), JOptionPane.showInputDialog("Altura: "));
        Rectangulo rectangulo1 = new Rectangulo(JOptionPane.showInputDialog("Base: "));
        Circulo circulo = new Circulo(JOptionPane.showInputDialog("Radio: "));

        String mensaje1 = "Área del rectángulo: " + rectangulo.calcularArea();
        String mensaje3 = "Área del rectángulo: " + rectangulo1.calcularArea();
        String mensaje2 = "Área del círculo: " + circulo.calcularArea();
        
        JOptionPane.showMessageDialog(null, mensaje1);
        JOptionPane.showMessageDialog(null, mensaje3);
        JOptionPane.showMessageDialog(null, mensaje2);
    }
}

