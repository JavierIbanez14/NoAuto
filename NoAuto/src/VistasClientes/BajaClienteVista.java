package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class BajaClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoClienteField;

    /**
     * Create the panel.
     */
    public BajaClienteVista() {
        setLayout(null);
        
        JLabel bajaClienteLabel = new JLabel("Baja De Cliente");
        bajaClienteLabel.setBounds(179, 11, 86, 14);
        add(bajaClienteLabel);
        
        JLabel codigoCliente = new JLabel("Codigo de Cliente");
        codigoCliente.setBounds(53, 93, 101, 14);
        add(codigoCliente);
        
        JButton finalizarBajaCliente = new JButton("Finalizar");
        finalizarBajaCliente.setBounds(330, 255, 89, 23);
        add(finalizarBajaCliente);
        
        codigoClienteField = new JTextField();
        codigoClienteField.setBounds(196, 90, 86, 20);
        add(codigoClienteField);
        codigoClienteField.setColumns(10);
    }
}
