package vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;

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
	private JDesktopPane desktopPane_1;
	private JInternalFrame internalFrame;

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
		public FormularioPrincipal(String cad, int x, int y) {
			super(cad);
			setLocation(0, 0);
			
		
		
		setTitle("Consulta de clientes");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(0, 0, 649, 423);
		
		
		
		
		desktopPane_1 = new JDesktopPane();
		desktopPane_1.setBounds(41, 52, 455, 281);
		this.add(desktopPane_1);
		
		internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setBounds(33, 26, 366, 226);
		desktopPane_1.add(internalFrame);
		internalFrame.setVisible(true);
		
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
		
		//contentPane = new JPanel();
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		//contentPane.setLayout(null);
		
		
	}
}
