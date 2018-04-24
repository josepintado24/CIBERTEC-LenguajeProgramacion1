package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtDni;
	private JTextField txtCodigo1;
	private JTextField txtCodigo2;
	private JTextField txtCodigo3;
	private JButton btnVer;
	private JLabel lblMensaje;
	private JLabel lblTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo frame = new Ejemplo();
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
	public Ejemplo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 608, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(119, 32, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(26, 35, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel DNI = new JLabel("DNI");
		DNI.setBounds(26, 74, 46, 14);
		contentPane.add(DNI);
		
		JLabel lblCodigo = new JLabel("codigo");
		lblCodigo.setBounds(26, 114, 46, 14);
		contentPane.add(lblCodigo);
		
		JLabel label = new JLabel("codigo");
		label.setBounds(26, 158, 46, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("codigo");
		label_1.setBounds(26, 197, 46, 14);
		contentPane.add(label_1);
		
		txtDni = new JTextField();
		txtDni.setColumns(10);
		txtDni.setBounds(119, 63, 86, 20);
		contentPane.add(txtDni);
		
		txtCodigo1 = new JTextField();
		txtCodigo1.setColumns(10);
		txtCodigo1.setBounds(119, 111, 86, 20);
		contentPane.add(txtCodigo1);
		
		txtCodigo2 = new JTextField();
		txtCodigo2.setColumns(10);
		txtCodigo2.setBounds(119, 155, 86, 20);
		contentPane.add(txtCodigo2);
		
		txtCodigo3 = new JTextField();
		txtCodigo3.setColumns(10);
		txtCodigo3.setBounds(119, 194, 86, 20);
		contentPane.add(txtCodigo3);
		
		btnVer = new JButton("Ver");
		btnVer.addActionListener(this);
		btnVer.setBounds(107, 262, 89, 23);
		contentPane.add(btnVer);
		
		lblMensaje = new JLabel("------");
		lblMensaje.setBounds(124, 326, 136, 14);
		contentPane.add(lblMensaje);
		
		lblTelefono = new JLabel("telefono");
		lblTelefono.setBounds(309, 35, 46, 14);
		contentPane.add(lblTelefono);
		
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnVer) {
			actionPerformedBtnVer(e);
		}
	}
	protected void actionPerformedBtnVer(ActionEvent e) {
		String nombre=txtNombre.getText();
		String dni=txtDni.getText();
		String codigo1=txtCodigo1.getText();
		String codigo2=txtCodigo2.getText();
		String codigo3=txtCodigo3.getText();
		 if (!nombre.matches("[a-zA-z\\s]+")){
			 lblMensaje.setText("Solo Texto");
			 
		 }
		 else  if (!dni.matches("\\d{8}")){
			 lblMensaje.setText("Solo Numeros");
			 
		 }
		 else  if (!codigo1.matches("\\s\\d{1,3}")){
			 lblMensaje.setText("No es formato codigo 1");
			 
		 }
		 else  if (!codigo2.matches("\\D{2}\\d{3}")){
			 lblMensaje.setText("No es formato codigo 2");
			 
		 }
		 else  if (!codigo3.matches("[M-S]{3}-[4-6][4-6][4-6]")){
			 lblMensaje.setText("No es formato codigo 3");
			 
		 }
		 else{
			 lblMensaje.setText("Corecto");
		 }
			 
		
		
	}
}
