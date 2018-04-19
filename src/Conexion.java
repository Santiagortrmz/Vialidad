import java.sql.*;
public class Conexion {

	String url = "jdbc:mysql://localhost:3306/vialidad",usuario = "root" ,contra = "123456";
	Connection c;
	ResultSet rs;
	
	public Connection conectar() {
		try {
			c = DriverManager.getConnection(url,usuario,contra);
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
}
