package ejemplo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.ListSelectionModel;

public class TestEjercicios extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox cboNumeros;
	private JButton btnNewButton;
	private JLabel lblNewLabel;
	private JScrollPane scrollPane;
	DefaultTableModel modelo = new DefaultTableModel();
	private JTable table;
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
		lblNewLabel.setBounds(70, 75, 292, 14);
		contentPane.add(lblNewLabel);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 122, 384, 117);
		contentPane.add(scrollPane);
		
		table = new JTable();
		
		modelo.addColumn("Empleado");
		modelo.addColumn("Cargo");
		modelo.addColumn("Sueldo Liquidación");
		modelo.addColumn("Familiar");
		modelo.addColumn("Beneficio");
		modelo.addColumn("Neto");
		scrollPane.setViewportView(table);
		table.setModel(modelo);
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
		modelo.addRow(new Object[]{"hola", "hola"});
		
	}
}
