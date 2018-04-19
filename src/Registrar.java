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

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContra;
	private JTextField txtConfirmar;
	JButton btnRegistrar = new JButton("Registrar");
	Conexion c = new Conexion();
	Usuarios u = new Usuarios();
	public Registrar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 249, 297);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 233, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 78, 213, 20);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 57, 213, 14);
		panel.add(lblUsuario);
		
		JLabel lblContra = new JLabel("Contrase\u00F1a");
		lblContra.setBounds(10, 109, 213, 14);
		panel.add(lblContra);
		
		txtContra = new JTextField();
		txtContra.setColumns(10);
		txtContra.setBounds(10, 134, 213, 20);
		panel.add(txtContra);
		
		JLabel lblConfirmar = new JLabel("Confirmar contrase\u00F1a");
		lblConfirmar.setBounds(10, 168, 213, 14);
		panel.add(lblConfirmar);
		
		txtConfirmar = new JTextField();
		txtConfirmar.setColumns(10);
		txtConfirmar.setBounds(10, 193, 213, 20);
		panel.add(txtConfirmar);
		
		
		btnRegistrar.setBounds(134, 227, 89, 23);
		btnRegistrar.addActionListener(this);
		panel.add(btnRegistrar);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRegistrar) {
			u.usuarioExiste(txtUsuario.getText());
		}
	}

}
