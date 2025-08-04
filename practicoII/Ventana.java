package practicoII;
import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
	public Ventana() {
		this.setTitle("Registrar Usuario"); // Titulo de la ventana
		this.setSize(600,400); // Tamaño en Pixels, primro ancho, después largo
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // La acción que se hace al cerrar la ventana
		this.setLocationRelativeTo(null); // Posición default en la que inicia la ventana
		this.setLayout(new GridLayout(1,2));
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.orange);
		panel1.setLayout(new GridLayout(0,2));
		JLabel etiquetaone = new JLabel("Nombre ");
		JTextField textoone = new JTextField("");
		JLabel etiquetatwo = new JLabel("Apellido ");
		JTextField textotwo = new JTextField("");
		JLabel etiquetathree = new JLabel("Cédula ");
		JTextField textothree = new JTextField("");
		JLabel etiquetafour = new JLabel("Edad ");
		JTextField textofour = new JTextField("");
		String[] roles = {"","texto secreto"};
		JComboBox cositoderoles = new JComboBox(roles);
		cositoderoles.setBackground(Color.orange);
		JButton botonone = new JButton("Registrar");
		botonone.setBackground(Color.orange);
		JLabel etiquetafive = new JLabel("Rol ");
		
		this.add(panel1);
		panel1.add(etiquetaone);
		panel1.add(textoone);
		panel1.add(etiquetatwo);
		panel1.add(textotwo);
		panel1.add(etiquetathree);
		panel1.add(textothree);
		panel1.add(etiquetafour);
		panel1.add(textofour);
		panel1.add(etiquetafive);
		panel1.add(cositoderoles);
		panel1.add(botonone);
		
	}
	
}
