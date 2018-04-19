import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login logframe = new Login();
					logframe.setVisible(true);
					Tarjeta tarVentana = new Tarjeta();
					tarVentana.setVisible(false);
					Registrar regVentana = new Registrar();
					regVentana.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
