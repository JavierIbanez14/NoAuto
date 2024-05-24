package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import controladorCliente.AltaClienteControladorInterfaz;
import java.awt.Color;
import java.awt.Font;

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
    private JLabel lblNoautoAlquilerDe;

    public AltaClienteVista(AltaClienteControladorInterfaz controlador) {
    	setBackground(new Color(0, 128, 50));
        setLayout(null);
        
        JLabel nombreLabel = new JLabel("Nombre");
        nombreLabel.setForeground(new Color(255, 255, 255));
        nombreLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        nombreLabel.setBounds(120, 65, 102, 14);
        add(nombreLabel);
        
        nombreField = new JTextField();
        nombreField.setBounds(232, 62, 86, 20);
        add(nombreField);
        nombreField.setColumns(10);
        
        dniField = new JTextField();
        dniField.setBounds(232, 93, 86, 20);
        add(dniField);
        dniField.setColumns(10);
        
        edadField = new JTextField();
        edadField.setBounds(232, 124, 86, 20);
        add(edadField);
        edadField.setColumns(10);
        
        dniLabel = new JLabel("DNI");
        dniLabel.setForeground(new Color(255, 255, 255));
        dniLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        dniLabel.setBounds(120, 96, 102, 14);
        add(dniLabel);
        
        edadLabel = new JLabel("Edad");
        edadLabel.setForeground(new Color(255, 255, 255));
        edadLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        edadLabel.setBounds(120, 130, 102, 14);
        add(edadLabel);
        
        dineroLabel = new JLabel("Saldo");
        dineroLabel.setForeground(new Color(255, 255, 255));
        dineroLabel.setFont(new Font("Arial", Font.PLAIN, 16));
        dineroLabel.setBounds(120, 157, 102, 14);
        add(dineroLabel);
        
        dineroField = new JTextField();
        dineroField.setColumns(10);
        dineroField.setBounds(232, 154, 86, 20);
        add(dineroField);
        
        nombreAlta = new JLabel("Alta Cliente");
        nombreAlta.setForeground(new Color(255, 255, 255));
        nombreAlta.setFont(new Font("Arial", Font.PLAIN, 20));
        nombreAlta.setBounds(165, 29, 102, 14);
        add(nombreAlta);
        
        JButton finalizar = new JButton("Dar alta");
        finalizar.setBounds(178, 210, 89, 23);
        add(finalizar);
        
        lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));
        lblNoautoAlquilerDe.setBounds(98, 275, 315, 14);
        add(lblNoautoAlquilerDe);
        
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
