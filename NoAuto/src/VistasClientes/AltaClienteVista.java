package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controladorCliente.AltaClienteControladorInterfaz;

public class AltaClienteVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextField nombreField;
    private JTextField dniField;
    private JTextField edadField;
    private JLabel dniLabel;
    private JLabel edadLabel;
    private JLabel dineroLabel;
    private JTextField dineroField;
    private JLabel nombreAlta;

    public AltaClienteVista(AltaClienteControladorInterfaz controlador) {
        setLayout(null);
        
        JLabel nombreLabel = new JLabel("Nombre");
        nombreLabel.setBounds(38, 62, 102, 14);
        add(nombreLabel);
        
        nombreField = new JTextField();
        nombreField.setBounds(150, 59, 86, 20);
        add(nombreField);
        nombreField.setColumns(10);
        
        dniField = new JTextField();
        dniField.setBounds(150, 90, 86, 20);
        add(dniField);
        dniField.setColumns(10);
        
        edadField = new JTextField();
        edadField.setBounds(150, 121, 86, 20);
        add(edadField);
        edadField.setColumns(10);
        
        dniLabel = new JLabel("DNI");
        dniLabel.setBounds(38, 93, 102, 14);
        add(dniLabel);
        
        edadLabel = new JLabel("Edad");
        edadLabel.setBounds(38, 127, 102, 14);
        add(edadLabel);
        
        dineroLabel = new JLabel("Dinero");
        dineroLabel.setBounds(38, 154, 102, 14);
        add(dineroLabel);
        
        dineroField = new JTextField();
        dineroField.setColumns(10);
        dineroField.setBounds(150, 151, 86, 20);
        add(dineroField);
        
        nombreAlta = new JLabel("Alta Cliente");
        nombreAlta.setBounds(150, 21, 102, 14);
        add(nombreAlta);
        
        JButton finalizar = new JButton("Finalizar");
        finalizar.setBounds(305, 266, 89, 23);
        add(finalizar);
        
        finalizar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                String dni = dniField.getText();
                int edad = Integer.parseInt(edadField.getText());
                int dinero = Integer.parseInt(dineroField.getText());
                
                controlador.altaCliente(nombre, dni, edad, dinero);
            }
        });
    }
}
