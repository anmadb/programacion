package j032_notificacion;

import javax.swing.JOptionPane;

public class main {
	public static void main(String[] args) {
		
		correo correo = new correo(JOptionPane.showInputDialog("mensaje1"),JOptionPane.showInputDialog("argumento1"));
		sms sms = new sms(JOptionPane.showInputDialog("mensaje1"),JOptionPane.showInputDialog("destinatario1"));
		app app = new app(JOptionPane.showInputDialog("mensaje1"),JOptionPane.showInputDialog("destinatario1"));
		
		System.out.println(correo.enviar());
		System.out.println(sms.enviar());
		System.out.println(app.enviar());
		
		
		correo correo2 = new correo(JOptionPane.showInputDialog("mensaje2"));
		sms sms2 = new sms(JOptionPane.showInputDialog("mensaje2"));
		app app2 = new app(JOptionPane.showInputDialog("mensaje2"));
		
		System.out.println(correo2.enviar());
		System.out.println(sms2.enviar());
		System.out.println(app2.enviar());
		
	}
}
