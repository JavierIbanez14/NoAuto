package VistasVehiculo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AltaVehiculoVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField CosteField;
	private JTextField TipoVehiculoField;
	private JTextField TiipoEstadoField;
	private JTextField TipoCargaField;
	private JTextField TipoUbicacionField;

	/**
	 * Create the panel.
	 */
	public AltaVehiculoVista() {
		setLayout(null);
		
		JLabel AltaVehiculo = new JLabel("AltaVehiculo");
		AltaVehiculo.setBounds(174, 30, 81, 14);
		add(AltaVehiculo);
		
		JLabel CosteLabel = new JLabel("Coste");
		CosteLabel.setBounds(77, 70, 46, 14);
		add(CosteLabel);
		
		JLabel lblTipovehiculo = new JLabel("TipoVehiculo");
		lblTipovehiculo.setBounds(77, 95, 65, 14);
		add(lblTipovehiculo);
		
		JLabel lblTipoestado = new JLabel("TipoEstado");
		lblTipoestado.setBounds(77, 120, 65, 14);
		add(lblTipoestado);
		
		JLabel lblTipocargavehiculo = new JLabel("TipoCargaVehiculo");
		lblTipocargavehiculo.setBounds(76, 145, 88, 14);
		add(lblTipocargavehiculo);
		
		JLabel lblTipoubicacion = new JLabel("TipoUbicacion");
		lblTipoubicacion.setBounds(77, 170, 87, 14);
		add(lblTipoubicacion);
		
		CosteField = new JTextField();
		CosteField.setBounds(212, 67, 86, 20);
		add(CosteField);
		CosteField.setColumns(10);
		
		TipoVehiculoField = new JTextField();
		TipoVehiculoField.setColumns(10);
		TipoVehiculoField.setBounds(212, 92, 86, 20);
		add(TipoVehiculoField);
		
		TiipoEstadoField = new JTextField();
		TiipoEstadoField.setColumns(10);
		TiipoEstadoField.setBounds(212, 117, 86, 20);
		add(TiipoEstadoField);
		
		TipoCargaField = new JTextField();
		TipoCargaField.setColumns(10);
		TipoCargaField.setBounds(212, 142, 86, 20);
		add(TipoCargaField);
		
		TipoUbicacionField = new JTextField();
		TipoUbicacionField.setColumns(10);
		TipoUbicacionField.setBounds(212, 167, 86, 20);
		add(TipoUbicacionField);

	}

}
