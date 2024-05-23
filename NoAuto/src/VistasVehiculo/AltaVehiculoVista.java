package VistasVehiculo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladorVehiculos.AltaVehiculoControlador;
import controladorVehiculos.AltaVehiculoControladorInterfaz;

import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;

import noAuto.modelo.TipoVehiculo;
import noAuto.modelo.TipoEstado;
import noAuto.modelo.TipoCargaVehiculo;
import noAuto.modelo.TipoUbicacion;
import java.awt.event.ActionEvent;

public class AltaVehiculoVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField CosteField;
    private JComboBox<TipoVehiculo> TipoVehiculoField;
    private JComboBox<TipoEstado> TipoEstadoField;
    private JComboBox<TipoCargaVehiculo> TipoCargaField;
    private JComboBox<TipoUbicacion> TipoUbicacionField;
    private AltaVehiculoControladorInterfaz controlador;

    /**
     * Create the panel.
     */
    public AltaVehiculoVista() {
        setLayout(null);

        JLabel AltaVehiculoTitulo = new JLabel("Alta Vehiculo");
        AltaVehiculoTitulo.setBounds(174, 30, 100, 14);
        add(AltaVehiculoTitulo);

        JLabel CosteLabel = new JLabel("Coste:");
        CosteLabel.setBounds(77, 70, 46, 14);
        add(CosteLabel);

        JLabel TipoVehiculoLabel = new JLabel("Tipo Vehiculo:");
        TipoVehiculoLabel.setBounds(77, 95, 100, 14);
        add(TipoVehiculoLabel);

        JLabel TipoEstadoLabel = new JLabel("Tipo Estado:");
        TipoEstadoLabel.setBounds(77, 120, 100, 14);
        add(TipoEstadoLabel);

        JLabel TipoCargaLabel = new JLabel("Tipo Carga Vehiculo:");
        TipoCargaLabel.setBounds(77, 145, 130, 14);
        add(TipoCargaLabel);

        JLabel TipoUbicacionLabel = new JLabel("Tipo Ubicacion:");
        TipoUbicacionLabel.setBounds(77, 170, 130, 14);
        add(TipoUbicacionLabel);

        CosteField = new JTextField();
        CosteField.setBounds(212, 67, 86, 20);
        add(CosteField);
        CosteField.setColumns(10);

        TipoVehiculoField = new JComboBox<>(TipoVehiculo.values());
        TipoVehiculoField.setBounds(212, 92, 130, 20);
        add(TipoVehiculoField);

        TipoEstadoField = new JComboBox<>(TipoEstado.values());
        TipoEstadoField.setBounds(212, 117, 130, 20);
        add(TipoEstadoField);

        TipoCargaField = new JComboBox<>(TipoCargaVehiculo.values());
        TipoCargaField.setBounds(212, 142, 130, 20);
        add(TipoCargaField);

        TipoUbicacionField = new JComboBox<>(TipoUbicacion.values());
        TipoUbicacionField.setBounds(212, 167, 130, 20);
        add(TipoUbicacionField);

        JButton altaVehiculoButton = new JButton("Registrar");
        altaVehiculoButton.setBounds(150, 210, 100, 23);
        add(altaVehiculoButton);

        controlador = new AltaVehiculoControlador();

        altaVehiculoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double coste = Double.parseDouble(CosteField.getText());
                    TipoVehiculo tipoVehiculo = (TipoVehiculo) TipoVehiculoField.getSelectedItem();
                    TipoEstado tipoEstado = (TipoEstado) TipoEstadoField.getSelectedItem();
                    TipoCargaVehiculo tipoCarga = (TipoCargaVehiculo) TipoCargaField.getSelectedItem();
                    TipoUbicacion tipoUbicacion = (TipoUbicacion) TipoUbicacionField.getSelectedItem();

                    controlador.altaVehiculo(coste, tipoVehiculo, tipoEstado, tipoCarga, tipoUbicacion);
                } catch (NumberFormatException ex) {
                    System.out.println("Error: Coste debe ser un número válido.");
                }
            }
        });
    }
}

