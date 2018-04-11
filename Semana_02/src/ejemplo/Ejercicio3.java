package ejemplo;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio3 extends JFrame {

	private JPanel contentPane;
	private JLabel lblCliente;
	private JTextField txtCliente;
	private JLabel lblHabitacion;
	private JComboBox cboHabitación;
	private JLabel lblPiso;
	private JComboBox cboPiso;
	private JLabel lblExtra;
	private JCheckBox chckbxCochera;
	private JCheckBox chckbxCable;
	private JCheckBox chckbxInternet;
	private JCheckBox chckbxGasNatural;
	private JButton btnRegistrar;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio3 frame = new Ejercicio3();
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
	
	DefaultTableModel modelo = new DefaultTableModel();
	
	public Ejercicio3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(139, 37, 61, 14);
		contentPane.add(lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(230, 31, 180, 20);
		contentPane.add(txtCliente);
		txtCliente.setColumns(10);
		
		lblHabitacion = new JLabel("Habitacion");
		lblHabitacion.setBounds(139, 65, 94, 14);
		contentPane.add(lblHabitacion);
		
		cboHabitación = new JComboBox();
		cboHabitación.setBounds(230, 62, 180, 20);
		cboHabitación.addItem("1");
		cboHabitación.addItem("2");
		cboHabitación.addItem("3");
		cboHabitación.addItem("4");
		contentPane.add(cboHabitación);
		
		lblPiso = new JLabel("Piso");
		lblPiso.setBounds(139, 96, 61, 14);
		contentPane.add(lblPiso);
		
		cboPiso = new JComboBox();
		cboPiso.setBounds(230, 93, 180, 20);
		cboPiso.addItem("1");
		cboPiso.addItem("2-3");
		cboPiso.addItem("4-5");
		cboPiso.addItem("6-8");
		cboPiso.addItem("9-10");
		cboPiso.addItem("11-12");
		contentPane.add(cboPiso);
		
		lblExtra = new JLabel("Extra");
		lblExtra.setBounds(139, 133, 61, 14);
		contentPane.add(lblExtra);
		
		chckbxCochera = new JCheckBox("Cochera");
		chckbxCochera.setBounds(230, 129, 97, 23);
		contentPane.add(chckbxCochera);
		
		chckbxCable = new JCheckBox("Cable");
		chckbxCable.setBounds(230, 155, 97, 23);
		contentPane.add(chckbxCable);
		
		chckbxInternet = new JCheckBox("Internet");
		chckbxInternet.setBounds(230, 181, 97, 23);
		contentPane.add(chckbxInternet);
		
		chckbxGasNatural = new JCheckBox("Gas Natural");
		chckbxGasNatural.setBounds(230, 203, 97, 23);
		contentPane.add(chckbxGasNatural);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnRegistrar(arg0);
			}
		});
		btnRegistrar.setBounds(313, 233, 89, 23);
		contentPane.add(btnRegistrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(24, 279, 728, 216);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(modelo);
		modelo.addColumn("Cliente");
		modelo.addColumn("Precio");
		modelo.addColumn("Extra");
		modelo.addColumn("Total");
		scrollPane.setViewportView(table);
	}

	protected void actionPerformedBtnRegistrar(ActionEvent arg0) {
		String cliente = txtCliente.getText();
		
		String habitacion = ""+ cboHabitación.getSelectedItem();
		double precio =0;
		if(habitacion.equals("1"))precio = 30000;
		else if(habitacion.equals("2"))precio = 30000*2;
		else if(habitacion.equals("3"))precio = 30000*3;
		else precio = 30000*4;
		
		int piso = cboPiso.getSelectedIndex();
			if(piso==0){
				precio *=1.45;
			}
			else if(piso==1){
				precio *=1.35;
			}
			else if(piso==2){
				precio *=1.28 ;
			}
			else if(piso==3){
				precio *= 1.25;
			}
			else if(piso==4){
				precio *=0.90;
			}
			else{
				precio *= 0.85;
			}
			//descuento de 15%
			//incrementar - mas = precio *=1.15
			//descuento - menos = precio *=0.85(se resta 1 - 0.15 = 0.85)
			
		int extra =0;
		if(chckbxCochera.isSelected())extra+=25000;
		if(chckbxCable.isSelected())extra+=300;
		if(chckbxInternet.isSelected())extra+=250;
		if(chckbxGasNatural.isSelected())extra+=1100;
		
		modelo.addRow(new Object[]{cliente,precio,extra,(precio+extra)});
	}
}
