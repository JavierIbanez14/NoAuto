package VistasClientes;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;

public class MostrarClientesVista extends JPanel {

    private static final long serialVersionUID = 1L;
    private JTextArea textArea;
    private JButton mostrarClientesButton; // Declaración del botón como campo de clase

    public MostrarClientesVista() {
        setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10, 10, 380, 200);
        add(scrollPane);

        textArea = new JTextArea();
        scrollPane.setViewportView(textArea);

        mostrarClientesButton = new JButton("Mostrar Clientes"); // Inicialización del botón
        mostrarClientesButton.setBounds(140, 220, 120, 23);
        add(mostrarClientesButton);
    }

    public void setTextoClientes(String texto) {
        textArea.setText(texto);
    }

    public void agregarListenerMostrarClientes(ActionListener listener) {
        mostrarClientesButton.addActionListener(listener);
    }
}
