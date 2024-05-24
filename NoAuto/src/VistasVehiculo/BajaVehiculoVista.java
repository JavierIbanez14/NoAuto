package VistasVehiculo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladorVehiculos.BajaVehiculoControlador;
import controladorVehiculos.BajaVehiculoControladorInterfaz;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class BajaVehiculoVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField CodigoVehiculoField;
    private BajaVehiculoControladorInterfaz controlador;

    public BajaVehiculoVista() {
    	setBackground(new Color(0, 128, 50));
        setLayout(null);

        JLabel BajaVehiculotitulo = new JLabel("Baja Vehículo");
        BajaVehiculotitulo.setForeground(new Color(255, 255, 255));
        BajaVehiculotitulo.setFont(new Font("Arial", Font.PLAIN, 20));
        BajaVehiculotitulo.setBounds(166, 65, 198, 14);
        add(BajaVehiculotitulo);

        JLabel lblCodigoVehiculo = new JLabel("Código del Vehículo:");
        lblCodigoVehiculo.setForeground(new Color(255, 255, 255));
        lblCodigoVehiculo.setFont(new Font("Arial", Font.PLAIN, 16));
        lblCodigoVehiculo.setBounds(41, 141, 168, 14);
        add(lblCodigoVehiculo);

        CodigoVehiculoField = new JTextField();
        CodigoVehiculoField.setBounds(201, 140, 86, 20);
        add(CodigoVehiculoField);
        CodigoVehiculoField.setColumns(10);

        JButton BajaVehiculoButton = new JButton("Eliminar");
        BajaVehiculoButton.setBounds(198, 190, 89, 23);
        add(BajaVehiculoButton);
        
        JLabel lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));
        lblNoautoAlquilerDe.setBounds(110, 275, 315, 14);
        add(lblNoautoAlquilerDe);

        BajaVehiculoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int codigo = Integer.parseInt(CodigoVehiculoField.getText());
                    controlador.bajaVehiculo(codigo);
                } catch (NumberFormatException ex) {
                    System.out.println("Error: El código debe ser un número válido.");
                }
            }
        });

        controlador = new BajaVehiculoControlador();
    }
}

