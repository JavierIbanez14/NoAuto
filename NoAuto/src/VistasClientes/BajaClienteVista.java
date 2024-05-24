package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import controladorCliente.BajaClienteControladorInterfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

public class BajaClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoClienteField;
    private BajaClienteControladorInterfaz controlador;

    /**
     * Create the panel.
     */
    public BajaClienteVista(BajaClienteControladorInterfaz controlador) {
    	setBackground(new Color(0, 128, 50));
        this.controlador = controlador;
        setLayout(null);
        
        JLabel bajaClienteLabel = new JLabel("Baja De Cliente");
        bajaClienteLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        bajaClienteLabel.setForeground(new Color(255, 255, 255));
        bajaClienteLabel.setBounds(141, 52, 171, 14);
        add(bajaClienteLabel);
        
        JLabel codigoCliente = new JLabel("Codigo de Cliente");
        codigoCliente.setForeground(new Color(255, 255, 255));
        codigoCliente.setFont(new Font("Arial", Font.PLAIN, 16));
        codigoCliente.setBounds(78, 138, 139, 14);
        add(codigoCliente);
        
        JButton finalizarBajaCliente = new JButton("Dar de baja");
        finalizarBajaCliente.setBounds(167, 193, 89, 23);
        add(finalizarBajaCliente);
        finalizarBajaCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(codigoClienteField.getText());
                controlador.bajaCliente(codigo);
            }
        });
        
        codigoClienteField = new JTextField();
        codigoClienteField.setBounds(227, 137, 86, 20);
        add(codigoClienteField);
        codigoClienteField.setColumns(10);
        
        JLabel lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));
        lblNoautoAlquilerDe.setBounds(97, 260, 315, 14);
        add(lblNoautoAlquilerDe);
    }
}
