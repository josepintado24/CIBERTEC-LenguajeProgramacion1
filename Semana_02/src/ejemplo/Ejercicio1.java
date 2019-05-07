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

public class Ejercicio1 extends JFrame {

	private JPanel contentPane;
	private JLabel lblEmpleado;
	private JLabel lblCargo;
	private JLabel lblAoServicio;
	private JLabel lblHijos;
	private JLabel lblZona;
	private JTextField txtEmpleado;
	private JComboBox cboCargo;
	private JTextField txtAño;
	private JTextField txtHijos;
	private JRadioButton rdbtnCentro;
	private JRadioButton rdbtnNorte;
	private JRadioButton rdbtnSur;
	private JLabel lblBeneficios;
	private JCheckBox chckbxEnfermedad;
	private JCheckBox chckbxSinAccidentes;
	private JCheckBox chckbxSinIncidencias;
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
					Ejercicio1 frame = new Ejercicio1();
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
	
	public Ejercicio1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 541);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEmpleado = new JLabel("Empleado");
		lblEmpleado.setBounds(96, 40, 75, 14);
		contentPane.add(lblEmpleado);
		
		lblCargo = new JLabel("Cargo");
		lblCargo.setBounds(96, 74, 75, 14);
		contentPane.add(lblCargo);
		
		lblAoServicio = new JLabel("A\u00F1o Servicio");
		lblAoServicio.setBounds(96, 102, 93, 14);
		contentPane.add(lblAoServicio);
		
		lblHijos = new JLabel("Hijos");
		lblHijos.setBounds(96, 130, 60, 14);
		contentPane.add(lblHijos);
		
		lblZona = new JLabel("Zona");
		lblZona.setBounds(96, 162, 60, 14);
		contentPane.add(lblZona);
		
		txtEmpleado = new JTextField();
		txtEmpleado.setBounds(193, 37, 155, 20);
		contentPane.add(txtEmpleado);
		txtEmpleado.setColumns(10);
		
		cboCargo = new JComboBox();
		cboCargo.setBounds(193, 68, 155, 20);
		cboCargo.addItem("Gerente");
		cboCargo.addItem("Servicio");
		cboCargo.addItem("Obrero");
		cboCargo.addItem("Seguridad");
		contentPane.add(cboCargo);
		
		txtAño = new JTextField();
		txtAño.setBounds(193, 99, 86, 20);
		contentPane.add(txtAño);
		txtAño.setColumns(10);
		
		txtHijos = new JTextField();
		txtHijos.setBounds(193, 127, 86, 20);
		contentPane.add(txtHijos);
		txtHijos.setColumns(10);
		
		rdbtnCentro = new JRadioButton("Centro");
		rdbtnCentro.setBounds(193, 158, 109, 23);
		contentPane.add(rdbtnCentro);
		
		rdbtnNorte = new JRadioButton("Norte");
		rdbtnNorte.setBounds(317, 158, 109, 23);
		contentPane.add(rdbtnNorte);
		
		rdbtnSur = new JRadioButton("Sur");
		rdbtnSur.setBounds(428, 158, 109, 23);
		contentPane.add(rdbtnSur);
		
		ButtonGroup zona = new ButtonGroup();
		zona.add(rdbtnCentro);zona.add(rdbtnNorte);zona.add(rdbtnSur);
		
		lblBeneficios = new JLabel("Beneficios");
		lblBeneficios.setBounds(96, 206, 75, 14);
		contentPane.add(lblBeneficios);
		
		chckbxEnfermedad = new JCheckBox("Enfermedad");
		chckbxEnfermedad.setBounds(193, 202, 97, 23);
		contentPane.add(chckbxEnfermedad);
		
		chckbxSinAccidentes = new JCheckBox("Sin accidentes");
		chckbxSinAccidentes.setBounds(317, 202, 109, 23);
		contentPane.add(chckbxSinAccidentes);
		
		chckbxSinIncidencias = new JCheckBox("Sin incidencias");
		chckbxSinIncidencias.setBounds(440, 202, 115, 23);
		contentPane.add(chckbxSinIncidencias);
		
		btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionPerformedBtnRegistrar(arg0);
			}
		});
		btnRegistrar.setBounds(299, 244, 89, 23);
		contentPane.add(btnRegistrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(21, 278, 676, 202);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(modelo);
		modelo.addColumn("Empleado");
		modelo.addColumn("Cargo");
		modelo.addColumn("Sueldo Liquidación");
		modelo.addColumn("Familiar");
		modelo.addColumn("Beneficio");
		modelo.addColumn("Neto");
		
		scrollPane.setViewportView(table);
	}
	protected void actionPerformedBtnRegistrar(ActionEvent arg0) {
		String empleado = txtEmpleado.getText();
		
		String cargo = ""+ cboCargo.getSelectedItem();
			double sueldo=0;
			if(cargo.equals("Gerente"))sueldo=9500;
			else if(cargo.equals("Servicio"))sueldo=5500;
			else if(cargo.equals("Obrero"))sueldo=4500;
			else sueldo=2500;
			
		int año= Integer.parseInt(txtAño.getText());
		
		sueldo= sueldo*0.65*año;
		
		if(rdbtnCentro.isSelected())sueldo*=1.15;
		else if (rdbtnNorte.isSelected())sueldo*=1.25;
		else sueldo*=1.35;
		
		double familiar=0;
		if(Integer.parseInt(txtHijos.getText())>0)
			familiar= sueldo*0.05;
		
		int beneficio=0;
		if(chckbxEnfermedad.isSelected())beneficio+=5500;
		if(chckbxSinAccidentes.isSelected())beneficio+=4500;
		if(chckbxSinIncidencias.isSelected())beneficio+=3500;
		
		modelo.addRow(new Object[]{"hola"});
	}
}
