package VistasVehiculo;

import javax.swing.JPanel;
import javax.swing.JTextArea;

import controladorVehiculos.MostrarVehiculoControlador;
import controladorVehiculos.MostrarVehiculoControladorInterfaz;

import javax.swing.JButton;

public class MostrarVehiculoVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private MostrarVehiculoControladorInterfaz controlador;

    public MostrarVehiculoVista() {
        setLayout(null);

        textArea = new JTextArea();
        textArea.setBounds(10, 10, 380, 200);
        add(textArea);

        JButton mostrarVehiculosButton = new JButton("Mostrar Vehiculos");
        mostrarVehiculosButton.setBounds(140, 220, 150, 23);
        add(mostrarVehiculosButton);

        mostrarVehiculosButton.addActionListener(e -> {
            String vehiculos = controlador.mostrarVehiculos();
            textArea.setText(vehiculos);
        });

        controlador = new MostrarVehiculoControlador();
    }
}
