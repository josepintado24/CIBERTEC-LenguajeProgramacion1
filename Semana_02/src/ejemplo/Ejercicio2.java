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
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ejercicio2 extends JFrame {

	private JPanel contentPane;
	private JLabel lblCliente;
	private JTextField txtCliente;
	private JLabel lblCantidadDePersonas;
	private JTextField txtPersonas;
	private JLabel lblDestino;
	private JComboBox cboDestino;
	private JLabel lblCantDias;
	private JTextField txtDias;
	private JLabel lblPaquete;
	private JRadioButton rdbtnA;
	private JRadioButton rdbtnEco;
	private JLabel lblAdicional;
	private JCheckBox chckbxFilmacion;
	private JCheckBox chckbxAlojamiento;
	private JCheckBox chckbxComida;
	private JButton btnRegistar;
	private JScrollPane scrollPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ejercicio2 frame = new Ejercicio2();
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
	
	public Ejercicio2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 778, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCliente = new JLabel("Cliente");
		lblCliente.setBounds(126, 44, 69, 14);
		contentPane.add(lblCliente);
		
		txtCliente = new JTextField();
		txtCliente.setBounds(266, 41, 164, 20);
		contentPane.add(txtCliente);
		txtCliente.setColumns(10);
		
		lblCantidadDePersonas = new JLabel("Cant de personas");
		lblCantidadDePersonas.setBounds(126, 77, 131, 14);
		contentPane.add(lblCantidadDePersonas);
		
		txtPersonas = new JTextField();
		txtPersonas.setBounds(266, 72, 164, 20);
		contentPane.add(txtPersonas);
		txtPersonas.setColumns(10);
		
		lblDestino = new JLabel("Destino");
		lblDestino.setBounds(126, 114, 69, 14);
		contentPane.add(lblDestino);
		
		cboDestino = new JComboBox();
		cboDestino.setBounds(266, 111, 164, 20);
		cboDestino.addItem("Cusco");
		cboDestino.addItem("Iquitos");
		cboDestino.addItem("Mancora");
		cboDestino.addItem("Trujillo");
		contentPane.add(cboDestino);
		
		lblCantDias = new JLabel("Cant Dias");
		lblCantDias.setBounds(126, 152, 69, 14);
		contentPane.add(lblCantDias);
		
		txtDias = new JTextField();
		txtDias.setBounds(266, 145, 164, 21);
		contentPane.add(txtDias);
		txtDias.setColumns(10);
		
		lblPaquete = new JLabel("Paquete");
		lblPaquete.setBounds(126, 187, 57, 14);
		contentPane.add(lblPaquete);
		
		rdbtnA = new JRadioButton("A1");
		rdbtnA.setBounds(267, 183, 109, 23);
		contentPane.add(rdbtnA);
		
		rdbtnEco = new JRadioButton("Economico");
		rdbtnEco.setBounds(378, 183, 109, 23);
		contentPane.add(rdbtnEco);
		
		ButtonGroup paquete =  new ButtonGroup();
		paquete.add(rdbtnA);paquete.add(rdbtnEco);
		
		lblAdicional = new JLabel("Adicional");
		lblAdicional.setBounds(126, 222, 69, 14);
		contentPane.add(lblAdicional);
		
		chckbxFilmacion = new JCheckBox("Filmacion");
		chckbxFilmacion.setBounds(266, 218, 97, 23);
		contentPane.add(chckbxFilmacion);
		
		chckbxAlojamiento = new JCheckBox("Alojamiento");
		chckbxAlojamiento.setBounds(365, 218, 97, 23);
		contentPane.add(chckbxAlojamiento);
		
		chckbxComida = new JCheckBox("Comida");
		chckbxComida.setBounds(477, 218, 97, 23);
		contentPane.add(chckbxComida);
		
		btnRegistar = new JButton("Registrar");
		btnRegistar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnRegistar(arg0);
			}
		});
		btnRegistar.setBounds(311, 262, 89, 23);
		contentPane.add(btnRegistar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 296, 717, 201);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(modelo);
		modelo.addColumn("Cliente");
		modelo.addColumn("Destino");
		modelo.addColumn("Paquete");
		modelo.addColumn("Servicio");
		modelo.addColumn("Neto");
		scrollPane.setViewportView(table);
	}

	protected void actionPerformedBtnRegistar(ActionEvent arg0) {
		String cliente = txtCliente.getText();

		String destino = ""+ cboDestino.getSelectedItem();
			
		int precio=0;
		if (rdbtnEco.isSelected()){
			if(destino.equals("Cusco"))precio=90;
			else if(destino.equals("Iquitos"))precio =70;
			else if(destino.equals("Trujillo"))precio =50;
			else if(destino.equals("Mancora"))precio =100;
		}
		else{
			if(destino.equals("Cusco"))precio=170;
			else if(destino.equals("Iquitos"))precio =120;
			else if(destino.equals("Trujillo"))precio =50;
			else if(destino.equals("Mancora"))precio =210;
		}
		
		int cantPersonas = Integer.parseInt(txtPersonas.getText()) ;
		precio=precio*cantPersonas*2;
		
		int cantDias= Integer.parseInt(txtDias.getText());
		
		int adicional =0;
		if(chckbxFilmacion.isSelected())adicional+=900;
		if(chckbxAlojamiento.isSelected())adicional+=30*cantPersonas*cantDias;
		if(chckbxComida.isSelected())adicional+=20*cantPersonas*cantDias;
		
		modelo.addRow(new Object[]{cliente,destino,precio,adicional,(precio+adicional)});
		
		
	}
}
