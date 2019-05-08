package propuesto02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CiberCliente extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnEnviar;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNombre;
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CiberCliente frame = new CiberCliente();
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
	public CiberCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 160);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(this);
		btnEnviar.setBounds(207, 47, 89, 23);
		contentPane.add(btnEnviar);
		
		textField = new JTextField();
		textField.setBounds(81, 11, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(81, 48, 86, 20);
		contentPane.add(textField_1);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 14, 46, 14);
		contentPane.add(lblNombre);
		
		lblMensaje = new JLabel("Mensaje");
		lblMensaje.setBounds(10, 51, 46, 14);
		contentPane.add(lblMensaje);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnEnviar) {
			actionPerformedBtnEnviar(e);
		}
	}
	void enviarMensaje(){
		String host
	}
	protected void actionPerformedBtnEnviar(ActionEvent e) {
	}
}
