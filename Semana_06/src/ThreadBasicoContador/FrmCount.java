package ThreadBasicoContador;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FrmCount extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel label;
	private JButton btnComenzar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmCount frame = new FrmCount();
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
	public FrmCount() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 280, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("0");
		label.setFont(new Font("Tahoma", Font.PLAIN, 46));
		label.setBounds(124, 105, 99, 53);
		contentPane.add(label);
		
		btnComenzar = new JButton("Comenzar");
		btnComenzar.addActionListener(this);
		btnComenzar.setBounds(86, 238, 89, 23);
		contentPane.add(btnComenzar);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnComenzar) {
			actionPerformedBtnComenzar(e);
		}
	}
	protected void actionPerformedBtnComenzar(ActionEvent e) {
		Count coutn=new Count(label);
		coutn.start();
	}
}
