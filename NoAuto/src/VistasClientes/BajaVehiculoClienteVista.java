package VistasClientes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controladorCliente.DesasignarVehiculoControladorInterfaz;
import java.awt.Color;
import java.awt.Font;

public class BajaVehiculoClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private DesasignarVehiculoControladorInterfaz controlador;
    private JTextField clienteIDField;
    private JButton desasignarButton;
    private JLabel resultadoLabel;
    private JLabel lblNoautoAlquilerDe;

    public BajaVehiculoClienteVista(DesasignarVehiculoControladorInterfaz controlador) {
    	setBackground(new Color(0, 128, 50));
        this.controlador = controlador;
        inicializarComponentes();
        configurarEventos();
    }

    private void inicializarComponentes() {
        setLayout(null);

        JLabel clienteIDLabel = new JLabel("ID Cliente:");
        clienteIDLabel.setForeground(new Color(255, 255, 255));
        clienteIDLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        clienteIDLabel.setBounds(95, 90, 80, 25);
        add(clienteIDLabel);

        clienteIDField = new JTextField(20);
        clienteIDField.setBounds(185, 92, 160, 25);
        add(clienteIDField);

        desasignarButton = new JButton("Desasignar");
        desasignarButton.setBounds(156, 165, 120, 25);
        add(desasignarButton);

        resultadoLabel = new JLabel("");
        resultadoLabel.setBounds(10, 90, 250, 25);
        add(resultadoLabel);
        
        lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));
        lblNoautoAlquilerDe.setBounds(108, 263, 315, 14);
        add(lblNoautoAlquilerDe);
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

