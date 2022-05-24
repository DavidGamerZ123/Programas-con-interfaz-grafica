import javax.swing.*;

import java.awt.event.*;
import java.awt.color.*;

public class A extends JFrame implements ActionListener {

	
	
	private JLabel label;
	
	private JButton botonparasalir;

	
	
	public A() {
		setLayout(null);
		
		label = new JLabel("Bienvenido a la interfaz grafica de recordarse de como programar aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		label.setVisible(true);
		label.setBounds(10, 10, 350, 350);
		add(label);
		
		botonparasalir = new JButton("Dame");
		botonparasalir.setBounds(0,0,100,100);
		botonparasalir.setVisible(true);
		add(botonparasalir);
		botonparasalir.addActionListener(this);
	}

	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == botonparasalir) {
			System.exit(0);
		}
	}
	
	
	
	public static void main(String[] args) {
		
		A a = new A();
		a.setVisible(true);
		a.setLocationRelativeTo(null);
		a.setBounds(0, 0, 500, 500);
		a.setResizable(true);

	}

}
