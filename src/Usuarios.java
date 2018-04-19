import java.sql.*;
public class Usuarios {
	ResultSet rs;
	Conexion c= new Conexion();
	public boolean usuarioExiste(String usuario) {
		
		try {
			Statement sent = c.conectar().createStatement();
			rs = sent.executeQuery("Select * from usuario where Nombre = '"+usuario+"';");
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
	
}
