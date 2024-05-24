package VistasVehiculo;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import controladorVehiculos.ModificarVehiculoControlador;
import noAuto.modelo.TipoCargaVehiculo;
import noAuto.modelo.TipoUbicacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModificarVehiculoVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoField;
    private JComboBox<TipoUbicacion> ubicacionField;
    private JComboBox<TipoCargaVehiculo> cargaField;
    private ModificarVehiculoControlador controlador;

    /**
     * Create the panel.
     */
    public ModificarVehiculoVista() {
        controlador = new ModificarVehiculoControlador();

        JLabel modificarVehiculoTitulo = new JLabel("Modificar Vehículo");

        JLabel codigoLabel = new JLabel("Código:");
        codigoField = new JTextField(10);

        JLabel ubicacionLabel = new JLabel("Nueva Ubicación:");
        ubicacionField = new JComboBox<>(TipoUbicacion.values());

        JLabel cargaLabel = new JLabel("Nueva Carga:");
        cargaField = new JComboBox<>(TipoCargaVehiculo.values());

        JButton modificarButton = new JButton("Modificar");
        modificarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int codigo = Integer.parseInt(codigoField.getText());
                    TipoUbicacion nuevaUbicacion = (TipoUbicacion) ubicacionField.getSelectedItem();
                    TipoCargaVehiculo nuevaCarga = (TipoCargaVehiculo) cargaField.getSelectedItem();

                    controlador.modificarVehiculo(codigo, nuevaUbicacion, nuevaCarga);
                } catch (NumberFormatException ex) {
                    System.out.println("Error: El código debe ser un número válido.");
                }
            }
        });

        // Crear el GroupLayout y configurar los componentes para centrar
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(Alignment.CENTER)
                .addComponent(modificarVehiculoTitulo)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                        .addComponent(codigoLabel)
                        .addComponent(ubicacionLabel)
                        .addComponent(cargaLabel))
                    .addGroup(layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(codigoField)
                        .addComponent(ubicacionField)
                        .addComponent(cargaField)))
                .addComponent(modificarButton)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(modificarVehiculoTitulo)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoField))
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(ubicacionLabel)
                    .addComponent(ubicacionField))
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(cargaLabel)
                    .addComponent(cargaField))
                .addComponent(modificarButton)
        );
    }
}
