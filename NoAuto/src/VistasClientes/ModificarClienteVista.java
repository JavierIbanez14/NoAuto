package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controladorCliente.ModificarClienteControlador;

import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

import noAuto.modelo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ModificarClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoField;
    private JTextField nombreField;
    private JTextField dniField;
    private JTextField edadField;
    private JTextField dineroField;
    private ModificarClienteControlador controlador;

    /**
     * Create the panel.
     */
    public ModificarClienteVista() {
        controlador = new ModificarClienteControlador();

        JLabel modificarClienteTitulo = new JLabel("Modificar Cliente");

        JLabel codigoLabel = new JLabel("Código:");
        codigoField = new JTextField(10);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField(10);

        JLabel dniLabel = new JLabel("DNI:");
        dniField = new JTextField(10);

        JLabel edadLabel = new JLabel("Edad:");
        edadField = new JTextField(10);

        JLabel dineroLabel = new JLabel("Dinero:");
        dineroField = new JTextField(10);

        JButton modificarButton = new JButton("Modificar");
        modificarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int codigo = Integer.parseInt(codigoField.getText());
                    String nombre = nombreField.getText();
                    String dni = dniField.getText();
                    int edad = Integer.parseInt(edadField.getText());
                    int dinero = Integer.parseInt(dineroField.getText());

                    controlador.modificarCliente(codigo, nombre, dni, edad, dinero);
                } catch (NumberFormatException ex) {
                    System.out.println("Error: Asegúrese de que el código, la edad y el dinero sean números válidos.");
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
                .addComponent(modificarClienteTitulo)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(Alignment.TRAILING)
                        .addComponent(codigoLabel)
                        .addComponent(nombreLabel)
                        .addComponent(dniLabel)
                        .addComponent(edadLabel)
                        .addComponent(dineroLabel))
                    .addGroup(layout.createParallelGroup(Alignment.LEADING)
                        .addComponent(codigoField)
                        .addComponent(nombreField)
                        .addComponent(dniField)
                        .addComponent(edadField)
                        .addComponent(dineroField)))
                .addComponent(modificarButton)
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(modificarClienteTitulo)
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(codigoLabel)
                    .addComponent(codigoField))
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(nombreLabel)
                    .addComponent(nombreField))
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(dniLabel)
                    .addComponent(dniField))
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(edadLabel)
                    .addComponent(edadField))
                .addGroup(layout.createParallelGroup(Alignment.BASELINE)
                    .addComponent(dineroLabel)
                    .addComponent(dineroField))
                .addComponent(modificarButton)
        );
    }
}
