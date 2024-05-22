package noAuto.vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AltaClienteVista extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField NombreField;
	private JTextField DNIField;
	private JTextField EdadField;
	private JLabel DNILabel;
	private JLabel EdadLabel;
	private JLabel DineroLabel;
	private JTextField DineroField;
	private JLabel NombreAlta;

	/**
	 * Create the panel.
	 */
	public AltaClienteVista() {
		setLayout(null);
		
		JLabel NombreLabel = new JLabel("Nombre");
		NombreLabel.setBounds(38, 62, 102, 14);
		add(NombreLabel);
		
		NombreField = new JTextField();
		NombreField.setBounds(150, 59, 86, 20);
		add(NombreField);
		NombreField.setColumns(10);
		
		DNIField = new JTextField();
		DNIField.setBounds(150, 90, 86, 20);
		add(DNIField);
		DNIField.setColumns(10);
		
		EdadField = new JTextField();
		EdadField.setBounds(150, 121, 86, 20);
		add(EdadField);
		EdadField.setColumns(10);
		
		DNILabel = new JLabel("DNI");
		DNILabel.setBounds(38, 93, 102, 14);
		add(DNILabel);
		
		EdadLabel = new JLabel("Edad");
		EdadLabel.setBounds(38, 127, 102, 14);
		add(EdadLabel);
		
		DineroLabel = new JLabel("Dinero");
		DineroLabel.setBounds(38, 154, 102, 14);
		add(DineroLabel);
		
		DineroField = new JTextField();
		DineroField.setColumns(10);
		DineroField.setBounds(150, 151, 86, 20);
		add(DineroField);
		
		NombreAlta = new JLabel("Alta Cliente");
		NombreAlta.setBounds(150, 21, 102, 14);
		add(NombreAlta);
		
		JButton Finalizar = new JButton("Finalizar");
		Finalizar.setBounds(305, 266, 89, 23);
		add(Finalizar);

	}
}
