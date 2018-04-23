import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Registrar extends JFrame implements ActionListener {

	public JPanel contentPane;
	JLabel lblError = new JLabel("");
	public JTextField txtUsuario,txtContra,txtConfirmar;
	JButton btnRegistrar = new JButton("Registrar");
	Conexion c = new Conexion();
	Usuarios u = new Usuarios();
	public JTextField txtNombre;
	public JTextField txtApellido1;
	public JTextField txtApellido2;
	public Registrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 507);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 286, 468);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 241, 213, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 216, 213, 14);
		panel.add(lblUsuario);
		
		JLabel lblContra = new JLabel("Contrase\u00F1a");
		lblContra.setBounds(10, 272, 213, 14);
		panel.add(lblContra);
		
		txtContra = new JTextField();
		txtContra.setColumns(10);
		txtContra.setBounds(10, 297, 213, 20);
		panel.add(txtContra);
		
		JLabel lblConfirmar = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmar.setBounds(10, 328, 213, 14);
		panel.add(lblConfirmar);
		
		txtConfirmar = new JTextField();
		txtConfirmar.setColumns(10);
		txtConfirmar.setBounds(10, 353, 213, 20);
		panel.add(txtConfirmar);
		
		
		btnRegistrar.setBounds(134, 434, 89, 23);
		btnRegistrar.addActionListener(this);
		panel.add(btnRegistrar);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(10, 47, 108, 20);
		panel.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido1 = new JTextField();
		txtApellido1.setBounds(10, 102, 108, 20);
		panel.add(txtApellido1);
		txtApellido1.setColumns(10);
		
		txtApellido2 = new JTextField();
		txtApellido2.setBounds(10, 155, 108, 20);
		panel.add(txtApellido2);
		txtApellido2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre");
		lblNewLabel.setBounds(10, 22, 71, 14);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Apellido Paterno");
		lblNewLabel_1.setBounds(10, 78, 137, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido Materno");
		lblNewLabel_2.setBounds(10, 133, 150, 14);
		panel.add(lblNewLabel_2);
		
		lblError.setBounds(10, 434, 56, 23);
		panel.add(lblError);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRegistrar) {
			
			
		}
	}
}
