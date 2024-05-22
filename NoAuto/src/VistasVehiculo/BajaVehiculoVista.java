package VistasVehiculo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import noAuto.controlador.BajaVehiculoControlador;
import noAuto.controlador.BajaVehiculoControladorInterfaz;

public class BajaVehiculoVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField CodigoVehiculoField;
    private BajaVehiculoControladorInterfaz controlador;

    public BajaVehiculoVista() {
        setLayout(null);

        JLabel BajaVehiculotitulo = new JLabel("Baja Vehiculo");
        BajaVehiculotitulo.setBounds(180, 11, 100, 14);
        add(BajaVehiculotitulo);

        JLabel lblCodigoVehiculo = new JLabel("Codigo del Vehiculo");
        lblCodigoVehiculo.setBounds(59, 64, 120, 14);
        add(lblCodigoVehiculo);

        CodigoVehiculoField = new JTextField();
        CodigoVehiculoField.setBounds(180, 61, 86, 20);
        add(CodigoVehiculoField);
        CodigoVehiculoField.setColumns(10);

        JButton BajaVehiculoButton = new JButton("Finalizar");
        BajaVehiculoButton.setBounds(180, 100, 89, 23);
        add(BajaVehiculoButton);

        BajaVehiculoButton.addActionListener(e -> {
            int codigo = Integer.parseInt(CodigoVehiculoField.getText());
            controlador.bajaVehiculo(codigo);
        });

        controlador = new BajaVehiculoControlador();
    }
}
