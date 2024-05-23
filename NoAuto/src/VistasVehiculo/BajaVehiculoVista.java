package VistasVehiculo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladorVehiculos.BajaVehiculoControlador;
import controladorVehiculos.BajaVehiculoControladorInterfaz;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BajaVehiculoVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField CodigoVehiculoField;
    private BajaVehiculoControladorInterfaz controlador;

    public BajaVehiculoVista() {
        setLayout(null);

        JLabel BajaVehiculotitulo = new JLabel("Baja Vehiculo");
        BajaVehiculotitulo.setBounds(180, 11, 100, 14);
        add(BajaVehiculotitulo);

        JLabel lblCodigoVehiculo = new JLabel("Codigo del Vehiculo:");
        lblCodigoVehiculo.setBounds(59, 64, 120, 14);
        add(lblCodigoVehiculo);

        CodigoVehiculoField = new JTextField();
        CodigoVehiculoField.setBounds(180, 61, 86, 20);
        add(CodigoVehiculoField);
        CodigoVehiculoField.setColumns(10);

        JButton BajaVehiculoButton = new JButton("Eliminar");
        BajaVehiculoButton.setBounds(180, 100, 89, 23);
        add(BajaVehiculoButton);

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

