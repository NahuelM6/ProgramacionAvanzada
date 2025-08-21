package terceraimplementacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Presentación extends JFrame{
	
	Logica logica = new Logica();
	
	public Presentación() {
		this.setTitle("Ventana"); 
		this.setSize(800,600); 
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setLocationRelativeTo(null); 
		this.setLayout(new BorderLayout());
		this.setResizable(false);
		
		JLabel etiquetaone = new JLabel("ISBN ");
		JLabel etiquetatwo = new JLabel("Autor ");
		JLabel etiquetathree = new JLabel("Titulo ");
		JLabel validacion = new JLabel("Registrado correctamente");
		validacion.setVisible(false);
		JTextField textoone = new JTextField(6);
		JTextField textotwo = new JTextField(6);
		JTextField textothree = new JTextField(6);
		JButton botonone = new JButton("Registrar");
		JButton botontwo = new JButton("Listar");
		JPanel panelone = new JPanel();
		panelone.setLayout(new BoxLayout(panelone, BoxLayout.Y_AXIS));
		
		botonone.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				logica.guardarlibro(textoone.getText(), textotwo.getText(), textothree.getText());
				validacion.setVisible(logica.validacion);
				
			}
		});
		
		botontwo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				logica.listarlibros();
				
			}
		});
		
		this.add(panelone);
		panelone.add(etiquetaone);
		panelone.add(textoone);
		panelone.add(etiquetatwo);
		panelone.add(textotwo);
		panelone.add(etiquetathree);
		panelone.add(textothree);
		panelone.add(botonone);
		panelone.add(botontwo);
		panelone.add(validacion);
	}
	
}
