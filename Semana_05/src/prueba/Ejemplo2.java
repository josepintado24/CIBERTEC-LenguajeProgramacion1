package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejemplo2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lblNombre;
	private JLabel lblEdad;
	private JLabel lblCargo;
	private JLabel lblSexo;
	private JTextField txtxNombre;
	private JTextField txtEdad;
	private JTextField txtCargo;
	private JTextField txtSexo;
	private JLabel lblMensaje;
	private JButton btnOk;
	private JLabel lblApellido;
	private JLabel lblTurno;
	private JLabel lblCargo_1;
	private JLabel lblSueldo;
	private JTextField txtApellido;
	private JTextField txtTurno;
	private JTextField txtCargo2;
	private JTextField txtSueldo;
	private JButton button;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo2 frame = new Ejemplo2();
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
	public Ejemplo2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 546, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(34, 23, 46, 14);
		contentPane.add(lblNombre);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(34, 60, 46, 14);
		contentPane.add(lblEdad);
		
		lblCargo = new JLabel("cargo");
		lblCargo.setBounds(34, 102, 46, 14);
		contentPane.add(lblCargo);
		
		lblSexo = new JLabel("sexo");
		lblSexo.setBounds(34, 142, 46, 14);
		contentPane.add(lblSexo);
		
		txtxNombre = new JTextField();
		txtxNombre.setBounds(114, 20, 86, 20);
		contentPane.add(txtxNombre);
		txtxNombre.setColumns(10);
		
		txtEdad = new JTextField();
		txtEdad.setColumns(10);
		txtEdad.setBounds(114, 57, 86, 20);
		contentPane.add(txtEdad);
		
		txtCargo = new JTextField();
		txtCargo.setColumns(10);
		txtCargo.setBounds(114, 99, 86, 20);
		contentPane.add(txtCargo);
		
		txtSexo = new JTextField();
		txtSexo.setColumns(10);
		txtSexo.setBounds(114, 139, 86, 20);
		contentPane.add(txtSexo);
		
		lblMensaje = new JLabel("-----");
		lblMensaje.setBounds(188, 220, 126, 14);
		contentPane.add(lblMensaje);
		
		btnOk = new JButton("ok");
		btnOk.addActionListener(this);
		btnOk.setBounds(34, 174, 89, 23);
		contentPane.add(btnOk);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(294, 23, 46, 14);
		contentPane.add(lblApellido);
		
		lblTurno = new JLabel("Turno");
		lblTurno.setBounds(294, 57, 46, 14);
		contentPane.add(lblTurno);
		
		lblCargo_1 = new JLabel("cargo");
		lblCargo_1.setBounds(294, 102, 46, 14);
		contentPane.add(lblCargo_1);
		
		lblSueldo = new JLabel("sueldo");
		lblSueldo.setBounds(294, 142, 46, 14);
		contentPane.add(lblSueldo);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(379, 20, 86, 20);
		contentPane.add(txtApellido);
		
		txtTurno = new JTextField();
		txtTurno.setColumns(10);
		txtTurno.setBounds(379, 57, 86, 20);
		contentPane.add(txtTurno);
		
		txtCargo2 = new JTextField();
		txtCargo2.setColumns(10);
		txtCargo2.setBounds(376, 99, 86, 20);
		contentPane.add(txtCargo2);
		
		txtSueldo = new JTextField();
		txtSueldo.setColumns(10);
		txtSueldo.setBounds(379, 139, 86, 20);
		contentPane.add(txtSueldo);
		
		button = new JButton("ok");
		button.addActionListener(this);
		button.setBounds(379, 174, 89, 23);
		contentPane.add(button);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			actionPerformedButton(e);
		}
		if (e.getSource() == btnOk) {
			actionPerformedBtnOk(e);
		}
	}
	protected void actionPerformedBtnOk(ActionEvent e) {
		lblMensaje.setText(txtxNombre.getText().substring(0, 2)+(Integer.parseInt(txtEdad.getText().substring(0,1))+
				(Integer.parseInt(txtEdad.getText().substring(1,2))))+(txtCargo.getText().substring(txtCargo.getText().length()-2))+
				txtSexo.getText());
	}
	protected void actionPerformedButton(ActionEvent e) {
		String ap=txtApellido.getText();
		String tu=txtTurno.getText();
		String car=txtCargo2.getText();
		String su=txtSueldo.getText();
		
		lblMensaje.setText(ap.substring(ap.indexOf(" ")+1)+tu.length()+car.indexOf(("a")+su.substring(su.length()-3)));
	}
}
