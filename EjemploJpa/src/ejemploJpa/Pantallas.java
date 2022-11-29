package ejemploJpa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.table.DefaultTableModel;

public class Pantallas {

	private JFrame frame;
	private JTextField textCodigo;
	private JTextField textNombre;
	private JTextField textEmail;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pantallas window = new Pantallas();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Pantallas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 527, 373);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo");
		lblCodigo.setBounds(35, 4, 45, 13);
		frame.getContentPane().add(lblCodigo);
		
		textCodigo = new JTextField();
		textCodigo.setBounds(85, 1, 96, 19);
		frame.getContentPane().add(textCodigo);
		textCodigo.setColumns(10);
		
		JButton btnCrearTabla = new JButton("Crear Tabla");
		btnCrearTabla.setBounds(341, 0, 130, 21);
		frame.getContentPane().add(btnCrearTabla);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(35, 29, 45, 13);
		frame.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(85, 26, 251, 19);
		frame.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(35, 52, 45, 13);
		frame.getContentPane().add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setBounds(85, 50, 251, 19);
		frame.getContentPane().add(textEmail);
		textEmail.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(35, 277, 85, 21);
		frame.getContentPane().add(btnNuevo);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(157, 277, 85, 21);
		frame.getContentPane().add(btnGuardar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(274, 277, 85, 21);
		frame.getContentPane().add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSalir.setBounds(386, 277, 85, 21);
		frame.getContentPane().add(btnSalir);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(49, 90, 394, 177);
		frame.getContentPane().add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Email", "Nombre", "Codigo"
			}
		));
		scrollPane.setViewportView(table);
	}
}
