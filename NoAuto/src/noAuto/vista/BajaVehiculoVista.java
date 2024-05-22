package noAuto.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class BajaVehiculoVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField CodigoVehiculoField;

	/**
	 * Create the panel.
	 */
	public BajaVehiculoVista() {
		setLayout(null);
		
		JLabel BajaVehiculotitulo = new JLabel("Baja Vehiculo");
		BajaVehiculotitulo.setBounds(180, 11, 70, 14);
		add(BajaVehiculotitulo);
		
		JLabel lblNewLabel_1 = new JLabel("Codigo del Vehiculo");
		lblNewLabel_1.setBounds(59, 64, 95, 14);
		add(lblNewLabel_1);
		
		CodigoVehiculoField = new JTextField();
		CodigoVehiculoField.setBounds(164, 61, 86, 20);
		add(CodigoVehiculoField);
		CodigoVehiculoField.setColumns(10);
		
		JButton BajaVehiculo = new JButton("Finalizar");
		BajaVehiculo.setBounds(324, 253, 89, 23);
		add(BajaVehiculo);

	}

}
