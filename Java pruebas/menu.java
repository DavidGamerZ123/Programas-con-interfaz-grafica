import javax.swing.*;
import java.awt.*;
import java.awt.color.*;
import java.awt.event.*;

public class menu extends JFrame implements ActionListener {

	private JMenuBar crearbarra;
	private JMenu cuadrado1, cuadrado2, cuadrado3;
	private JMenuItem item1, item2, itemde1, itemde2;
	String texto = "caca";
	
	public menu() {
		setLayout(null);
		
	crearbarra = new JMenuBar();
	setJMenuBar(crearbarra);
	
	cuadrado1 = new JMenu("Opciones");
	crearbarra.add(cuadrado1);
	

	cuadrado3 = new JMenu("a");
	cuadrado1.add(cuadrado3);
	
	cuadrado2 = new JMenu("Ajustes");
	crearbarra.add(cuadrado2);
	
	item1 = new JMenuItem("Pedo");
	cuadrado1.add(item1);
	item1.addActionListener(this);
	
	
	
	item2 = new JMenuItem("PIS");	
	cuadrado2.add(item2);
	

	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == item1) {
			System.exit(0);
		}
	}
	


	public static void main(String[] args) {
		menu a = new menu();
		a.setVisible(true);
		a.setLocationRelativeTo(null);
		a.setBounds(10, 10, 500, 500);
		a.setResizable(true);


	}

}
