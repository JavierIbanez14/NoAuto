package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import controladorCliente.MostrarClientesControladorInterfaz;

public class MostrarClientesVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private JButton mostrarClientesButton; // Declaración del botón como campo de clase
    private MostrarClientesControladorInterfaz controlador;

    public MostrarClientesVista(MostrarClientesControladorInterfaz controlador) {
        this.controlador = controlador; // Guardamos una referencia al controlador
        setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 380, 200);
        add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        mostrarClientesButton = new JButton("Mostrar Clientes"); // Inicialización del botón
        mostrarClientesButton.setBounds(140, 220, 120, 23);
        add(mostrarClientesButton);

        // Agregamos un ActionListener al botón para manejar el evento de clic
        mostrarClientesButton.addActionListener(e -> {
            // Cuando se hace clic en el botón, solicitamos al controlador que nos proporcione la lista de clientes
            String clientes = controlador.mostrarClientes();
            // Luego, establecemos el texto en el JTextArea con la lista de clientes recibida
            textArea.setText(clientes);
        });
    }
}
