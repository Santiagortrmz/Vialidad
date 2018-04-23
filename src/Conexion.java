import java.sql.*;
public class Conexion {

	String url = "jdbc:mysql://localhost:3306/vialidad",usuario = "root" ,contra = "123456";
	Connection c;
	ResultSet rs;
	
	public ResultSet query(String sentence) {
		try {
			c = DriverManager.getConnection(url,usuario,contra);
			Statement stm = c.createStatement();
			rs = stm.executeQuery(sentence);
			c.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
	
	public void update(String sentence) {
		try {
			c = DriverManager.getConnection(url,usuario,contra);
			Statement stm = c.createStatement();
			stm.executeUpdate(sentence);
			c.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
