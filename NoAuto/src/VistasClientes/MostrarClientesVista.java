package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import controladorCliente.MostrarClientesControladorInterfaz;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;

public class MostrarClientesVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private JButton mostrarClientesButton;
    private MostrarClientesControladorInterfaz controlador;
    private JLabel lblNoautoAlquilerDe;

    public MostrarClientesVista(MostrarClientesControladorInterfaz controlador) {
    	setBackground(new Color(0, 128, 50));
        this.controlador = controlador; 
        setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 380, 200);
        add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        mostrarClientesButton = new JButton("Mostrar Clientes"); 
        mostrarClientesButton.setBounds(173, 228, 120, 23);
        add(mostrarClientesButton);
        
        lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));
        lblNoautoAlquilerDe.setBounds(112, 275, 315, 14);
        add(lblNoautoAlquilerDe);

        mostrarClientesButton.addActionListener(e -> {
            String clientes = controlador.mostrarClientes();
            textArea.setText(clientes);
        });
    }
}
