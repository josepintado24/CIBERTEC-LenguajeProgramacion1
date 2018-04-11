package Ejemplo1;
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

public class Ejemplo4 extends JFrame {

	private JPanel contentPane;
	private JLabel lblVariable;
	private JLabel lblVariable_1;
	private JTextField txta;
	private JTextField txtb;
	private JButton btnCalcular;
	private JLabel lblRespuesta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejemplo4 frame = new Ejemplo4();
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
	public Ejemplo4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 414);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblVariable = new JLabel("Variable 1");
		lblVariable.setBounds(89, 50, 80, 24);
		contentPane.add(lblVariable);
		
		lblVariable_1 = new JLabel("Variable 2");
		lblVariable_1.setBounds(89, 106, 65, 32);
		contentPane.add(lblVariable_1);
		
		txta = new JTextField();
		txta.setBounds(192, 52, 86, 20);
		contentPane.add(txta);
		txta.setColumns(10);
		
		txtb = new JTextField();
		txtb.setBounds(192, 112, 86, 20);
		contentPane.add(txtb);
		txtb.setColumns(10);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnCalcular(arg0);
			}
		});
		btnCalcular.setBounds(217, 171, 89, 23);
		contentPane.add(btnCalcular);
		
		lblRespuesta = new JLabel("Respuesta");
		lblRespuesta.setBounds(89, 246, 80, 32);
		contentPane.add(lblRespuesta);
	}
	protected void actionPerformedBtnCalcular(ActionEvent arg0) {
		try {
			int num1= Integer.parseInt(txta.getText());
			int num2= Integer.parseInt(txtb.getText());
			int res= num1/num2;
			lblRespuesta.setText(""+res);
			
		} 
		catch (NumberFormatException ex) {// evalua tipo de variable numerico
			ex.printStackTrace();
		}
		catch (ArithmeticException ex) {// evalua error aritmetico
			ex.printStackTrace();
		}
	}
}
