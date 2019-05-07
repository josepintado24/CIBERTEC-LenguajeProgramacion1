package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Hilos.HilosHora;

import javax.swing.JMenuBar;
import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;

public class FrmPrincipal extends JFrame {

	private JPanel contentPane;
	private JDesktopPane escritorio;
	public static JLabel lblReloj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frame = new FrmPrincipal();
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
	public FrmPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnSistema = new JMenu("Sistema");
		menuBar.add(mnSistema);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		escritorio = new JDesktopPane();
		contentPane.add(escritorio, BorderLayout.CENTER);
		
		JInternalFrame reloj = new JInternalFrame("");
		reloj.setBounds(58, 164, 131, 55);
		escritorio.add(reloj);
		
		lblReloj = new JLabel("00:00:00");
		reloj.getContentPane().add(lblReloj, BorderLayout.CENTER);
		reloj.setVisible(true);
		
		HilosHora hh = new HilosHora(this);
		hh.IniciaTiempo();
	}
	
}
