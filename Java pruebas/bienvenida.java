import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.color.*;

public class bienvenida extends JFrame implements ActionListener {

	private JLabel  label1, label2, label3, label4;
	private JTextField usuario;
	private JButton ingresar;
	
	public bienvenida() {
		setLayout(null);
		
		//titulo
		setTitle("Bienvenida");
		
		//elcolordelainterfaz y el icono de la ventana
		getContentPane().setBackground(new Color(255,0,0));
		//setIconImage(new ImageIcon(getClass().getResource("E:\\Users\\david\\Escritorio\\images")).getImage());
		
		
		ImageIcon imagencocacola = new ImageIcon("images/cocacola.png");
		label1 = new JLabel(imagencocacola);
		label1.setBounds(24,15,100,150);
		add(label1);
		
		label2 = new JLabel("Inicio sesion antiVeyon");
		label2.setBounds(35,135,300,30);
		label2.setFont(new Font("Andale Mono" , 3 , 18));
		label2.setForeground(new Color(255,255,255));
		add(label2);
		
		label3 = new JLabel("usuario");
		label3.setBounds(24,250,300,30);
		add(label3);
		label3.setForeground(new Color(255,255,255));
		
		label4 = new JLabel("©2022 smr1 company antiveyon");
		label4.setBounds(24,405,300,150);
		add(label4);
		
		//ahro el jtetfield para meter dates
		
		usuario = new JTextField();
		usuario.setBounds(24,300,300,30);
		add(usuario);
		usuario.addActionListener(this);
		usuario.setBackground(new Color(255,254,224));
		usuario.setForeground(new Color(255,0,0));
		usuario.setFont(new Font("Arial" , 3 , 14));
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == usuario) {
			
		}
	}
	
	public static void main(String args[]) {
		
		bienvenida clase = new bienvenida();
		clase.setVisible(true);
		clase.setBounds(0, 0, 450, 450);
		clase.setLocationRelativeTo(null);
		
	}

}
