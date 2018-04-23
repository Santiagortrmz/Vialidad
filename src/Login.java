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

public class Login extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField txtUsuario;
	private JTextField txtContra;
	JButton btnRegistrarse = new JButton("Registrarse"),btnIngresar = new JButton("Ingresar");;
	Tarjeta tar = new Tarjeta();
	Registrar reg = new Registrar();
	Usuarios u = new Usuarios();
	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 237, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 221, 261);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 58, 201, 27);
		panel.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(10, 37, 201, 14);
		panel.add(lblUsuario);
		
		JLabel lblContra = new JLabel("Contrase\u00F1a");
		lblContra.setBounds(10, 96, 201, 14);
		panel.add(lblContra);
		
		txtContra = new JTextField();
		txtContra.setColumns(10);
		txtContra.setBounds(10, 111, 201, 27);
		panel.add(txtContra);
		
		
		btnRegistrarse.setBounds(10, 162, 89, 23);
		panel.add(btnRegistrarse);
		btnRegistrarse.addActionListener(this);
		
		
		btnIngresar.setBounds(122, 227, 89, 23);
		btnIngresar.addActionListener(this);
		panel.add(btnIngresar);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnIngresar) {
			tar.setVisible(true);
			this.setVisible(false);
		}else if(e.getSource() == btnRegistrarse) {
			reg.setVisible(true);
			this.setVisible(false);
		}
		
		if(e.getSource()==reg.btnRegistrar) 
		{
			u.crearusuario(reg.txtUsuario, reg.txtContra,reg.txtNombre,reg.txtApellido1,reg.txtApellido2,reg.lblError);
		}
	}
}