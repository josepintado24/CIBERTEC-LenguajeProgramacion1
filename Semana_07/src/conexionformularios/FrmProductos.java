package conexionformularios;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class FrmProductos extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnOk;
	private JScrollPane scrollPane;
	private JTable table;
	DefaultTableModel modelo = new DefaultTableModel();
	private JTextField txtId;
	private JTextField txtNombre;
	private JTextField txtCodigo;
	private JTextField txtProveedor;
	private JButton btnAgregar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmProductos frame = new FrmProductos();
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
	public FrmProductos() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 542, 464);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnOk = new JButton("Listar");
		btnOk.addActionListener(this);
		btnOk.setBounds(10, 153, 89, 23);
		contentPane.add(btnOk);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 184, 494, 230);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(modelo);
		modelo.addColumn("ID");
		modelo.addColumn("NOMBRE");
		modelo.addColumn("CODIGO");
		modelo.addColumn("PROVEEDOR");
		scrollPane.setViewportView(table);
		
		txtId = new JTextField();
		txtId.setBounds(111, 11, 86, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(111, 42, 86, 20);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(111, 74, 86, 20);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		txtProveedor = new JTextField();
		txtProveedor.setBounds(111, 109, 86, 20);
		contentPane.add(txtProveedor);
		txtProveedor.setColumns(10);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(this);
		btnAgregar.setBounds(285, 10, 89, 23);
		contentPane.add(btnAgregar);
	}
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnAgregar) {
			actionPerformedBtnAgregar(arg0);
		}
		if (arg0.getSource() == btnOk) {
			actionPerformedBtnOk(arg0);
		}
	}
	
	
	protected void actionPerformedBtnOk(ActionEvent arg0) {
		ConexionProductos.iniciar();
		
				try {
					ResultSet rs=ConexionProductos.mostrarProductos();
					while (rs.next()) {
						modelo.addRow(new Object[]{
								rs.getString("id"),
								rs.getString("nombre"),
								rs.getString("codigo"),
								rs.getString("proveedor")
						});
						}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
	}
	protected void actionPerformedBtnAgregar(ActionEvent arg0) {
		ConexionProductos.iniciar();
		int id=Integer.parseInt(txtId.getText());
		String nombre=txtNombre.getText();
		String codigo=txtCodigo.getText();
		String proveedor=txtProveedor.getText();
		String instruccionSql="INSERT INTO PRODUCTOS(ID,NOMBRE,CODIGO,PROVEEDOR)VALUES(?,?,?,?)";
		ConexionProductos.insrtar(instruccionSql,id,nombre,codigo,proveedor);
		//
		
		
		
		
	}
}
