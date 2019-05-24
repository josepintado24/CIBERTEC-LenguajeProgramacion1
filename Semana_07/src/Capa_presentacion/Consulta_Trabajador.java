package Capa_presentacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Capa_datos.Conexion;
import Capa_entidad.Cls_Trabajador;
import conexionformularios.ConexionProductos;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Consulta_Trabajador extends JFrame implements ActionListener, KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable tblConsulta;
	
	private DefaultTableModel modelo;
	private JButton btnVarones;
	private JButton btnMujeres;
	private JButton btnTodos;
	private static Cls_Trabajador clsT;
	private static ResultSet resultSet;
	private JTextField textField;
	private JLabel lblOk;

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
					clsT=new Cls_Trabajador();
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
		
		textField = new JTextField();
		textField.addKeyListener(this);
		textField.setBounds(54, 65, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblOk = new JLabel("ok");
		lblOk.setBounds(54, 11, 46, 14);
		contentPane.add(lblOk);
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
		ResultSet resultSet = clsT.consulta("SELECT * FROM TRABAJADORES WHERE SEXO='true'");
		mostrar(resultSet);
	}
	protected void actionPerformedBtnMujeres(ActionEvent arg0) {
		ResultSet resultSet = clsT.consulta("SELECT * FROM TRABAJADORES WHERE SEXO='false'");
		mostrar(resultSet);
	}
	
	private void mostrar(ResultSet resultSet){
		modelo.setRowCount(0);
		try {
			
			while (resultSet.next()) {
				modelo.addRow(new Object[]{
						resultSet.getString(1),
						resultSet.getString(2),
						resultSet.getString(3),
						resultSet.getString(4),
						resultSet.getString(5),
						resultSet.getString(6),
						resultSet.getString(7),
						resultSet.getString(8),
						resultSet.getString(9),
						resultSet.getString(10)
				});
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void actionPerformedBtnTodos(ActionEvent arg0) {
		ResultSet resultSet = clsT.consulta("SELECT * FROM TRABAJADORES");
		mostrar(resultSet);
	}
	public void keyPressed(KeyEvent arg0) {
	}
	public void keyReleased(KeyEvent arg0) {
		if (arg0.getSource() == textField) {
			keyReleasedTextField(arg0);
		}
	}
	public void keyTyped(KeyEvent arg0) {
	}
	protected void keyReleasedTextField(KeyEvent arg0) {
		ResultSet resultSet = clsT.consulta("SELECT * FROM TRABAJADORES WHERE APELLIDO LIKE"+"'"+textField.getText()+"%'");
		mostrar(resultSet);
		
	}
}
