import java.sql.*;

import javax.swing.JLabel;
import javax.swing.JTextField;
public class Usuarios {
	ResultSet rs;
	Conexion c= new Conexion();
	public boolean usuarioExiste(String usuario) {
		
		try {
			c.query("Select * from usuario where Nombre = '"+usuario+"';");
			int count = 0;
			while(rs.next()) {
				count++;
			}
			if(count > 0) {
				System.out.println("ya existe el usuario");
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}return false;
		
	}
	public void crearusuario(JTextField txt1,JTextField txt2,JTextField txt3,JTextField txt4,JTextField txt5, JLabel lbl){
		
		if(!usuarioExiste(txt1.getText())) {
			c.update("INSERT INTO usuario(usuario, password, tipo, nombre, apellido1, apellido2) values('"+txt1.getText()+"',"
					+ "'"+txt2.getText()+"',2,'"+txt3.getText()+"','"+txt4.getText()+"','"+txt5.getText()+"';)");
		}
		else { 
			lbl.setText("El usuario no se puede registrar");
		}
	}
}
