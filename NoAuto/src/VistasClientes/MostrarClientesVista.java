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
    private JButton mostrarClientesButton; // Declaración del botón como campo de clase
    private MostrarClientesControladorInterfaz controlador;
    private JLabel lblNoautoAlquilerDe;

    public MostrarClientesVista(MostrarClientesControladorInterfaz controlador) {
    	setBackground(new Color(0, 128, 50));
        this.controlador = controlador; // Guardamos una referencia al controlador
        setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 380, 200);
        add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        mostrarClientesButton = new JButton("Mostrar Clientes"); // Inicialización del botón
        mostrarClientesButton.setBounds(173, 228, 120, 23);
        add(mostrarClientesButton);
        
        lblNoautoAlquilerDe = new JLabel("NoAuto alquiler de vehiculos sostenibles");
        lblNoautoAlquilerDe.setForeground(Color.WHITE);
        lblNoautoAlquilerDe.setFont(new Font("Arial", Font.ITALIC, 12));
        lblNoautoAlquilerDe.setBounds(112, 275, 315, 14);
        add(lblNoautoAlquilerDe);

        // Agregamos un ActionListener al botón para manejar el evento de clic
        mostrarClientesButton.addActionListener(e -> {
            // Cuando se hace clic en el botón, solicitamos al controlador que nos proporcione la lista de clientes
            String clientes = controlador.mostrarClientes();
            // Luego, establecemos el texto en el JTextArea con la lista de clientes recibida
            textArea.setText(clientes);
        });
    }
}
