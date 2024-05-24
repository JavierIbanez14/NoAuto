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
import java.awt.Color;
import java.awt.Font;

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
    	setBackground(new Color(0, 128, 50));
        controlador = new ModificarVehiculoControlador();

        JLabel modificarVehiculoTitulo = new JLabel("Modificar Vehículo");
        modificarVehiculoTitulo.setForeground(new Color(255, 255, 255));
        modificarVehiculoTitulo.setFont(new Font("Arial", Font.PLAIN, 20));

        JLabel codigoLabel = new JLabel("Código:");
        codigoLabel.setForeground(new Color(255, 255, 255));
        codigoLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        codigoField = new JTextField(10);

        JLabel ubicacionLabel = new JLabel("Nueva Ubicación:");
        ubicacionLabel.setForeground(new Color(255, 255, 255));
        ubicacionLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        ubicacionField = new JComboBox<>(TipoUbicacion.values());

        JLabel cargaLabel = new JLabel("Nueva Carga:");
        cargaLabel.setForeground(new Color(255, 255, 255));
        cargaLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
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
        
        JLabel lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));

        // Crear el GroupLayout y configurar los componentes para centrar
        GroupLayout layout = new GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.CENTER)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(185)
        			.addComponent(modificarButton)
        			.addContainerGap(180, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(152, Short.MAX_VALUE)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(modificarVehiculoTitulo)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(codigoLabel)
        						.addComponent(ubicacionLabel)
        						.addComponent(cargaLabel))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        						.addComponent(codigoField)
        						.addComponent(ubicacionField, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(cargaField, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        			.addGap(130))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(135, Short.MAX_VALUE)
        			.addComponent(lblNoautoAlquilerDe, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(63)
        			.addComponent(modificarVehiculoTitulo)
        			.addGap(39)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(codigoLabel)
        				.addComponent(codigoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(ubicacionLabel)
        				.addComponent(ubicacionField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cargaLabel)
        				.addComponent(cargaField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(26)
        			.addComponent(modificarButton)
        			.addGap(18)
        			.addComponent(lblNoautoAlquilerDe, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
        			.addGap(37))
        );
        this.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
    }
}
