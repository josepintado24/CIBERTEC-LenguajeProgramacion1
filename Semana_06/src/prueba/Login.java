package prueba;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnAceptar;
	private JLabel lblCont;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(144, 32, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(144, 75, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(141, 126, 89, 23);
		contentPane.add(btnAceptar);
		
		lblCont = new JLabel("10");
		lblCont.setBounds(143, 11, 180, 14);
		contentPane.add(lblCont);
		
		textArea = new JTextArea();
		textArea.setBounds(29, 159, 309, 91);
		contentPane.add(textArea);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnAceptar) {
			actionPerformedBtnAceptar(e);
		}
	}
	void iniciarTiempo(){
		for (int i=10;i>=0;i--){
			lblCont.setText(i+"s");
			
		
		}
	}
	protected void actionPerformedBtnAceptar(ActionEvent e) {
		
		
			for (int i=10;i>=0;i--){
				lblCont.setText(i+"");
				textField_1.setText(""+i);
				textArea.append(""+i);
				
				System.out.println(i);
				
				try {
					
					Thread.sleep(1000);
					
				} catch (InterruptedException e1) {
			}
		}
	}
}
