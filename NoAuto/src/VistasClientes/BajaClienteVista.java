package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import controladorCliente.BajaClienteControladorInterfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BajaClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField codigoClienteField;
    private BajaClienteControladorInterfaz controlador;

    /**
     * Create the panel.
     */
    public BajaClienteVista(BajaClienteControladorInterfaz controlador) {
        this.controlador = controlador;
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
        finalizarBajaCliente.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int codigo = Integer.parseInt(codigoClienteField.getText());
                controlador.bajaCliente(codigo);
            }
        });
        
        codigoClienteField = new JTextField();
        codigoClienteField.setBounds(196, 90, 86, 20);
        add(codigoClienteField);
        codigoClienteField.setColumns(10);
    }
}
