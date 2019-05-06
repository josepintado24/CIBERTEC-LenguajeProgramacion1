package ejemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestEjercicios extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox cboNumeros;
	private JButton btnNewButton;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestEjercicios frame = new TestEjercicios();
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
	public TestEjercicios() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		cboNumeros = new JComboBox();
		String []items={"cero", "uno", "dos", "tres","cuatro"};
		cboNumeros.setModel(new DefaultComboBoxModel(items));
		cboNumeros.setBounds(70, 32, 77, 20);
		contentPane.add(cboNumeros);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(this);
		btnNewButton.setBounds(273, 31, 89, 23);
		contentPane.add(btnNewButton);
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(70, 136, 292, 14);
		contentPane.add(lblNewLabel);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnNewButton) {
			actionPerformedBtnNewButton(arg0);
		}
	}
	protected void actionPerformedBtnNewButton(ActionEvent arg0) {
		String item=""+cboNumeros.getSelectedItem();
		
		if (item.equals("uno")){
			lblNewLabel.setText("uno");
		}
		else if("dos"==item) {
			lblNewLabel.setText("dos");
		}
		
	}
}
