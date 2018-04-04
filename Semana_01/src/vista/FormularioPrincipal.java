package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class FormularioPrincipal extends JFrame {

	private JPanel contentPane;
	private JMenuBar menuBar;
	private JMenu mnAdministracin;
	private JMenu mnConsultas;
	private JMenu mnVentas;
	private JMenu mnSeguridad;
	private JMenu mnGestin;
	private JMenuItem mntmProducto;
	private JMenuItem mntmCategoria;
	private JMenuItem mntmCliente;
	private JMenuItem mntmVentas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormularioPrincipal frame = new FormularioPrincipal();
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
	public FormularioPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 461);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnAdministracin = new JMenu("Administraci\u00F3n");
		menuBar.add(mnAdministracin);
		
		mntmProducto = new JMenuItem("Producto");
		mnAdministracin.add(mntmProducto);
		
		mntmCategoria = new JMenuItem("Categoria");
		mnAdministracin.add(mntmCategoria);
		
		mntmCliente = new JMenuItem("Cliente");
		mnAdministracin.add(mntmCliente);
		
		mntmVentas = new JMenuItem("Ventas");
		mnAdministracin.add(mntmVentas);
		
		mnConsultas = new JMenu("Consultas");
		menuBar.add(mnConsultas);
		
		mnVentas = new JMenu("Ventas");
		menuBar.add(mnVentas);
		
		mnSeguridad = new JMenu("Seguridad");
		menuBar.add(mnSeguridad);
		
		mnGestin = new JMenu("Gesti\u00F3n");
		menuBar.add(mnGestin);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
