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
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Color;
import java.awt.Font;

public class ModificarClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoField;
    private JTextField nombreField;
    private JTextField dniField;
    private JTextField edadField;
    private JTextField dineroField;
    private ModificarClienteControlador controlador;

    
    public ModificarClienteVista() {
    	setBackground(new Color(0, 128, 50));
        controlador = new ModificarClienteControlador();

        JLabel modificarClienteTitulo = new JLabel("Modificar Cliente");
        modificarClienteTitulo.setForeground(new Color(255, 255, 255));
        modificarClienteTitulo.setFont(new Font("Arial", Font.PLAIN, 20));

        JLabel codigoLabel = new JLabel("Codigo:");
        codigoLabel.setForeground(new Color(255, 255, 255));
        codigoLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        codigoField = new JTextField(10);

        JLabel nombreLabel = new JLabel("Nombre:");
        nombreLabel.setForeground(new Color(255, 255, 255));
        nombreLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        nombreField = new JTextField(10);

        JLabel dniLabel = new JLabel("DNI:");
        dniLabel.setForeground(new Color(255, 255, 255));
        dniLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        dniField = new JTextField(10);

        JLabel edadLabel = new JLabel("Edad:");
        edadLabel.setForeground(new Color(255, 255, 255));
        edadLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        edadField = new JTextField(10);

        JLabel dineroLabel = new JLabel("Saldo");
        dineroLabel.setForeground(new Color(255, 255, 255));
        dineroLabel.setFont(new Font("Arial", Font.PLAIN, 16));
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
                    System.out.println("Error: Asegúrese de que el codigo, la edad y el dinero sean números válidos.");
                }
            }
        });
        
        JLabel lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));

       
        GroupLayout layout = new GroupLayout(this);
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(138)
        			.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(modificarClienteTitulo)
        				.addGroup(layout.createSequentialGroup()
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addComponent(codigoLabel)
        						.addComponent(nombreLabel)
        						.addComponent(dniLabel)
        						.addComponent(edadLabel)
        						.addComponent(dineroLabel))
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addComponent(codigoField, Alignment.LEADING)
        							.addComponent(nombreField, Alignment.LEADING)
        							.addComponent(dniField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        						.addComponent(edadField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        						.addComponent(dineroField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(161, Short.MAX_VALUE))
        		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
        			.addContainerGap(104, Short.MAX_VALUE)
        			.addComponent(lblNoautoAlquilerDe, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
        			.addGap(31))
        		.addGroup(layout.createSequentialGroup()
        			.addGap(187)
        			.addComponent(modificarButton)
        			.addContainerGap(188, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(37)
        			.addComponent(modificarClienteTitulo)
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(codigoLabel)
        				.addComponent(codigoField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(nombreLabel)
        				.addComponent(nombreField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(dniLabel)
        				.addComponent(dniField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(edadLabel)
        				.addComponent(edadField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(dineroLabel)
        				.addComponent(dineroField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(modificarButton)
        			.addGap(18)
        			.addComponent(lblNoautoAlquilerDe, GroupLayout.PREFERRED_SIZE, 14, GroupLayout.PREFERRED_SIZE)
        			.addGap(42))
        );
        this.setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
    }
}
