package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import controladorCliente.AsignarVehiculoControladorInterfaz;

public class AsignarVehiculoVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoVehiculoField;
    private JTextField horasField;
    private JTextField codigoClienteField;
    private JButton finalizarButton;
    private AsignarVehiculoControladorInterfaz controlador;

    public AsignarVehiculoVista(AsignarVehiculoControladorInterfaz controlador) {
        this.controlador = controlador;
        setLayout(null);

        JLabel asignarVehiculoLabel = new JLabel("Asignar Vehículo a Cliente");
        asignarVehiculoLabel.setBounds(150, 10, 200, 20);
        add(asignarVehiculoLabel);

        JLabel codigoClienteLabel = new JLabel("Código del Cliente");
        codigoClienteLabel.setBounds(30, 50, 150, 20);
        add(codigoClienteLabel);

        codigoClienteField = new JTextField();
        codigoClienteField.setBounds(180, 50, 150, 20);
        add(codigoClienteField);

        JLabel codigoVehiculoLabel = new JLabel("Código del Vehículo");
        codigoVehiculoLabel.setBounds(30, 80, 150, 20);
        add(codigoVehiculoLabel);

        codigoVehiculoField = new JTextField();
        codigoVehiculoField.setBounds(180, 80, 150, 20);
        add(codigoVehiculoField);

        JLabel horasLabel = new JLabel("Horas");
        horasLabel.setBounds(30, 110, 150, 20);
        add(horasLabel);

        horasField = new JTextField();
        horasField.setBounds(180, 110, 150, 20);
        add(horasField);

        finalizarButton = new JButton("Asignar");
        finalizarButton.setBounds(150, 150, 100, 30);
        add(finalizarButton);

        finalizarButton.addActionListener(e -> asignarVehiculo());
    }

    private void asignarVehiculo() {
        try {
            int codigoCliente = Integer.parseInt(codigoClienteField.getText());
            int codigoVehiculo = Integer.parseInt(codigoVehiculoField.getText());
            int horas = Integer.parseInt(horasField.getText());
            controlador.asignarVehiculoAlCliente(codigoCliente, codigoVehiculo, horas);
        } catch (NumberFormatException e) {
            System.out.println("Por favor, ingrese valores válidos.");
        }
    }
}
