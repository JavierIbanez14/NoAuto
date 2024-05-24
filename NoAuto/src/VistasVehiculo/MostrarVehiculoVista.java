package VistasVehiculo;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import controladorVehiculos.MostrarVehiculoControlador;
import controladorVehiculos.MostrarVehiculoControladorInterfaz;

import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class MostrarVehiculoVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private MostrarVehiculoControladorInterfaz controlador;

    public MostrarVehiculoVista() {
    	setBackground(new Color(0, 128, 50));
        setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(35, 24, 380, 153);
        add(textArea);

        JButton mostrarVehiculosButton = new JButton("Mostrar Vehiculo");
        mostrarVehiculosButton.setBounds(150, 205, 150, 23);
        add(mostrarVehiculosButton);
        
        JLabel lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));
        lblNoautoAlquilerDe.setBounds(100, 275, 315, 14);
        add(lblNoautoAlquilerDe);

        mostrarVehiculosButton.addActionListener(e -> {
            String vehiculos = controlador.mostrarVehiculos();
            textArea.setText(vehiculos);
        });

        controlador = new MostrarVehiculoControlador();
    }
}
