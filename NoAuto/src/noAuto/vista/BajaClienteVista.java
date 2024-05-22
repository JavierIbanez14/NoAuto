package noAuto.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class BajaClienteVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField CodigoClienteField;

	/**
	 * Create the panel.
	 */
	public BajaClienteVista() {
		setLayout(null);
		
		JLabel BajaClienteLabel = new JLabel("Baja De Cliente");
		BajaClienteLabel.setBounds(179, 11, 86, 14);
		add(BajaClienteLabel);
		
		JLabel CodigoCliente = new JLabel("Codigo de Cliente");
		CodigoCliente.setBounds(53, 93, 101, 14);
		add(CodigoCliente);
		
		JButton FinalizarBajaCliente = new JButton("Finalizar");
		FinalizarBajaCliente.setBounds(330, 255, 89, 23);
		add(FinalizarBajaCliente);
		
		CodigoClienteField = new JTextField();
		CodigoClienteField.setBounds(196, 90, 86, 20);
		add(CodigoClienteField);
		CodigoClienteField.setColumns(10);

	}

}
