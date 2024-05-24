package VistasClientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controladorCliente.DesasignarVehiculoControladorInterfaz;

public class BajaVehiculoClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private DesasignarVehiculoControladorInterfaz controlador;
    private JTextField clienteIDField;
    private JButton desasignarButton;
    private JLabel resultadoLabel;

    public BajaVehiculoClienteVista(DesasignarVehiculoControladorInterfaz controlador) {
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);

        JLabel clienteIDLabel = new JLabel("ID Cliente:");
        clienteIDLabel.setBounds(10, 10, 80, 25);
        add(clienteIDLabel);

        clienteIDField = new JTextField(20);
        clienteIDField.setBounds(100, 10, 160, 25);
        add(clienteIDField);

        desasignarButton = new JButton("Desasignar");
        desasignarButton.setBounds(10, 50, 250, 25);
        add(desasignarButton);

        resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(10, 90, 250, 25);
        add(resultadoLabel);
    }

    private void configurarEventos() {
        desasignarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int clienteID = Integer.parseInt(clienteIDField.getText());
                    if (controlador.desasignarVehiculo(clienteID)) {
                        resultadoLabel.setText("Vehículo desasignado con éxito.");
                    } else {
                        resultadoLabel.setText("Error al desasignar el vehículo.");
                    }
                } catch (NumberFormatException ex) {
                    resultadoLabel.setText("ID de Cliente inválida.");
                }
            }
        });
    }
}

