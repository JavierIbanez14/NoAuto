package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import controladorCliente.AsignarVehiculoControladorInterfaz;
import java.awt.Font;
import java.awt.Color;

public class AsignarVehiculoVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoVehiculoField;
    private JTextField horasField;
    private JTextField codigoClienteField;
    private JButton finalizarButton;
    private AsignarVehiculoControladorInterfaz controlador;

    public AsignarVehiculoVista(AsignarVehiculoControladorInterfaz controlador) {
    	setBackground(new Color(0, 128, 50));
        this.controlador = controlador;
        setLayout(null);

        JLabel asignarVehiculoLabel = new JLabel("Asignar vehiculo a cliente");
        asignarVehiculoLabel.setForeground(new Color(255, 255, 255));
        asignarVehiculoLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        asignarVehiculoLabel.setBounds(88, 41, 280, 20);
        add(asignarVehiculoLabel);

        JLabel codigoClienteLabel = new JLabel("Codigo del cliente");
        codigoClienteLabel.setForeground(new Color(255, 255, 255));
        codigoClienteLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        codigoClienteLabel.setBounds(68, 97, 150, 20);
        add(codigoClienteLabel);

        codigoClienteField = new JTextField();
        codigoClienteField.setBounds(218, 97, 150, 20);
        add(codigoClienteField);

        JLabel codigoVehiculoLabel = new JLabel("Codigo del vehiculo");
        codigoVehiculoLabel.setForeground(new Color(255, 255, 255));
        codigoVehiculoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        codigoVehiculoLabel.setBounds(68, 127, 150, 20);
        add(codigoVehiculoLabel);

        codigoVehiculoField = new JTextField();
        codigoVehiculoField.setBounds(218, 127, 150, 20);
        add(codigoVehiculoField);

        JLabel horasLabel = new JLabel("Horas");
        horasLabel.setForeground(new Color(255, 255, 255));
        horasLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        horasLabel.setBounds(68, 157, 150, 20);
        add(horasLabel);

        horasField = new JTextField();
        horasField.setBounds(218, 157, 150, 20);
        add(horasField);

        finalizarButton = new JButton("Asignar");
        finalizarButton.setBounds(176, 206, 100, 30);
        add(finalizarButton);
        
        JLabel lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));
        lblNoautoAlquilerDe.setBounds(99, 275, 315, 14);
        add(lblNoautoAlquilerDe);

        finalizarButton.addActionListener(e -> asignarVehiculo());
    }

    private void asignarVehiculo() {
        try {
            int codigoCliente = Integer.parseInt(codigoClienteField.getText());
            int codigoVehiculo = Integer.parseInt(codigoVehiculoField.getText());
            int horas = Integer.parseInt(horasField.getText());
            controlador.asignarVehiculoAlCliente(codigoCliente, codigoVehiculo, horas);
        } catch (NumberFormatException e) {
            System.out.println("Ingrese los valores validos");
        }
    }
}
