package j017_inventario;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
       
        int numProductos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de productos en el inventario:"));

        
        producto[] inventario = new producto[numProductos];

        
        for (int i = 0; i < numProductos; i++) {
            producto producto = new producto();

            producto.setNombreProducto(JOptionPane.showInputDialog("Ingrese el nombre del producto " + (i + 1) + ":"));
            producto.setCantidad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del producto " + (i + 1) + ":")));
            producto.setPrecio(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio del producto " + (i + 1) + ":")));

            inventario[i] = producto;
        }
        
        String resInv = "INVENTARIO \n";
        
        
        for (int i = 0; i < numProductos; i++) {
        	resInv += "Producto " + (i + 1) + ":"+
        "\nNombre: " + inventario[i].getNombreProducto()+
        "\nCantidad: " + inventario[i].getCantidad()+
        "\nPrecio: " + inventario[i].getPrecio()+
        "\nPrecio total: " + inventario[i].calcularValorInventario()+
        "\n----------------------\n";
        
        }
        
        JOptionPane.showMessageDialog(null, resInv);
  
    }
}
