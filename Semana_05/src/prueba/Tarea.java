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

public class Tarea extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblPrimerNobre;
	private JLabel lblSegundoNombre;
	private JLabel lblApellidoPaterno;
	private JLabel lblApellidoMaterno;
	private JButton btnOk;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tarea frame = new Tarea();
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
	public Tarea() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(186, 56, 236, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblPrimerNobre = new JLabel("Primer Nobre");
		lblPrimerNobre.setBounds(76, 131, 104, 14);
		contentPane.add(lblPrimerNobre);
		
		lblSegundoNombre = new JLabel("Segundo Nombre");
		lblSegundoNombre.setBounds(76, 166, 104, 14);
		contentPane.add(lblSegundoNombre);
		
		lblApellidoPaterno = new JLabel("Apellido Paterno");
		lblApellidoPaterno.setBounds(76, 209, 104, 14);
		contentPane.add(lblApellidoPaterno);
		
		lblApellidoMaterno = new JLabel("Apellido Materno");
		lblApellidoMaterno.setBounds(76, 257, 104, 14);
		contentPane.add(lblApellidoMaterno);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(432, 92, 89, 23);
		contentPane.add(btnOk);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		String nom=textField.getText();
		lblPrimerNobre.setText(nom.substring(0, nom.indexOf(" ")));
		String tres=nom.substring(nom.indexOf(" ")+1);
		lblSegundoNombre.setText(tres.substring(0, tres.indexOf(" ")));
		String dos=tres.substring(tres.indexOf(" ")+1);
		lblApellidoPaterno.setText(dos.substring(0, dos.indexOf(" ")));
		//String uno=tres.substring(dos.indexOf(" ")+1);
		lblApellidoMaterno.setText(nom.substring(nom.lastIndexOf(" ")+1));
		
		
	}
}
