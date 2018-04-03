package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Ejemplo1 extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnMenu;
	private JMenuItem mntmRojo;
	private JMenuItem mntmVerde;
	private JMenuItem mntmAzul;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo1 frame = new Ejemplo1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ejemplo1() {
		setTitle("EJEMPLO 1");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 491, 359);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 475, 21);
		contentPane.add(menuBar);
		
		mnMenu = new JMenu("COLORES");
		menuBar.add(mnMenu);
		
		mntmRojo = new JMenuItem("ROJO");
		mnMenu.add(mntmRojo);
		
		mntmVerde = new JMenuItem("AMARILLO");
		mnMenu.add(mntmVerde);
		
		mntmAzul = new JMenuItem("AZUL");
		mnMenu.add(mntmAzul);
	}
}
