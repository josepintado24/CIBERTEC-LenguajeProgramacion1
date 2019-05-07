package vista;

import java.awt.EventQueue;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JFrame;


public class FrmRepVtas extends JFrame {
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmRepVtas frame = new FrmRepVtas();
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
	public FrmRepVtas() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Reporte de Ventas");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(10, 11, 215, 37);
		getContentPane().add(lblNewLabel);
		
		JLabel lblDel = new JLabel("Del:");
		lblDel.setBounds(20, 59, 39, 24);
		getContentPane().add(lblDel);
		
		JButton btnReporte = new JButton("Reporte");
		btnReporte.setBounds(302, 60, 89, 23);
		getContentPane().add(btnReporte);
		
		JTextArea txtSalida = new JTextArea();
		txtSalida.setBounds(20, 106, 389, 130);
		getContentPane().add(txtSalida);

	}
	
	
}
