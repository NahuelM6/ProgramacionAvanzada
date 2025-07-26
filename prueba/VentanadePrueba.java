package prueba;
import java.awt.*;
import javax.swing.*;

public class VentanadePrueba extends JFrame{
		
public VentanadePrueba() {
	this.setTitle("Ventana de prueba - Nahuel Montenegro"); // Titulo de la ventana
	this.setSize(600,400); // Tamaño en Pixels, primro ancho, después largo
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // La acción que se hace al cerrar la ventana
	this.setLocationRelativeTo(null); // Posición default en la que inicia la ventana
	this.setLayout(new GridLayout());
	
	JPanel panel1 = new JPanel();
	panel1.setBackground(Color.orange);
	panel1.setLayout(new FlowLayout());
	JLabel etiqueta1 = new JLabel("¡Bienvenido a mi programa!");
	JLabel etiqueta2 = new JLabel("Nombre: ");
	JLabel relleno = new JLabel("                                   ");
	JTextField textfield1 = new JTextField();
	
	textfield1.setColumns(20);
	
	this.add(panel1);
	panel1.add(etiqueta1);
	panel1.add(relleno);
	panel1.add(etiqueta2);
	panel1.add(textfield1);
	
	}	
}
