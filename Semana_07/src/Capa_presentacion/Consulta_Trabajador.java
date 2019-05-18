package Capa_presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Capa_datos.Conexion;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Consulta_Trabajador extends JFrame implements ActionListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblConsulta;
	
	private DefaultTableModel modelo;
	
	Conexion cibertec = new Conexion();
	private JButton btnVarones;
	private JButton btnMujeres;
	private JButton btnTodos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Consulta_Trabajador frame = new Consulta_Trabajador();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Consulta_Trabajador() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowOpened(WindowEvent arg0) {
				
				cibertec.getConnection();
				
			}
		});
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 868, 554);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultaPersonalMaderera = new JLabel("Consulta Personal Maderera Chepen");
		lblConsultaPersonalMaderera.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsultaPersonalMaderera.setBounds(328, 52, 217, 14);
		contentPane.add(lblConsultaPersonalMaderera);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(54, 116, 740, 248);
		contentPane.add(scrollPane);
		
		tblConsulta = new JTable();
		tblConsulta.setFillsViewportHeight(true);
		scrollPane.setViewportView(tblConsulta);
		
		modelo = new DefaultTableModel();
		
		modelo.addColumn("Codigo");
		modelo.addColumn("Apellido");
		modelo.addColumn("Nombre");
		modelo.addColumn("Sexo");
		modelo.addColumn("Edad");
		modelo.addColumn("Estado Civil");
		modelo.addColumn("DNI");
		modelo.addColumn("Direccion");
		modelo.addColumn("Telefono");
		modelo.addColumn("Correo");
		
		
		tblConsulta.setModel(modelo);
		
		btnMujeres = new JButton("Mujeres");
		btnMujeres.addActionListener(this);
		btnMujeres.setBounds(398, 455, 89, 23);
		contentPane.add(btnMujeres);
		
		btnVarones = new JButton("Varones");
		btnVarones.addActionListener(this);
		btnVarones.setBounds(54, 455, 89, 23);
		contentPane.add(btnVarones);
		
		btnTodos = new JButton("Todos");
		btnTodos.addActionListener(this);
		btnTodos.setBounds(705, 455, 89, 23);
		contentPane.add(btnTodos);
		
		JLabel lblTotalDeRegistros = new JLabel("Total de Registros Filtrados");
		lblTotalDeRegistros.setBounds(54, 387, 156, 14);
		contentPane.add(lblTotalDeRegistros);
		
		JLabel lblCant = new JLabel("");
		lblCant.setBackground(Color.DARK_GRAY);
		lblCant.setBounds(305, 387, 22, 14);
		contentPane.add(lblCant);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnTodos) {
			actionPerformedBtnTodos(arg0);
		}
		if (arg0.getSource() == btnMujeres) {
			actionPerformedBtnMujeres(arg0);
		}
		if (arg0.getSource() == btnVarones) {
			actionPerformedBtnVarones(arg0);
		}
	}
	protected void actionPerformedBtnVarones(ActionEvent arg0) {
	}
	protected void actionPerformedBtnMujeres(ActionEvent arg0) {
	}
	protected void actionPerformedBtnTodos(ActionEvent arg0) {
	}
}
