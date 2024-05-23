package noAuto.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import VistasVehiculo.AltaVehiculoVista;
import VistasVehiculo.BajaVehiculoVista;
import VistasVehiculo.MostrarVehiculoVista;
import VistasClientes.AltaClienteVista;
import VistasClientes.BajaClienteVista;
import VistasClientes.MostrarClientesVista;

public class Menu extends JFrame implements ActionListener {
    
    private static final long serialVersionUID = 1L;
    private JMenuItem altaVehiculo;
    private JMenuItem bajaVehiculo;
    private JMenuItem mostrarVehiculos;
    private JMenuItem altaCliente;
    private JMenuItem bajaCliente;
    private JMenuItem mostrarClientes;

    public Menu() {
        System.out.println("Cargando Menu");
        setBounds(0, 0, 400, 300);
        setTitle("NoAuto");

        JMenuBar menubar = new JMenuBar();
        setJMenuBar(menubar);
        
        // Vehículos
        JMenu vehiculoMenu = new JMenu("Vehiculo");
        menubar.add(vehiculoMenu);

        altaVehiculo = new JMenuItem("Alta");
        vehiculoMenu.add(altaVehiculo);
        altaVehiculo.addActionListener(this);

        bajaVehiculo = new JMenuItem("Baja");
        vehiculoMenu.add(bajaVehiculo);
        bajaVehiculo.addActionListener(this);

        mostrarVehiculos = new JMenuItem("Mostrar");
        vehiculoMenu.add(mostrarVehiculos);
        mostrarVehiculos.addActionListener(this);

        // Clientes
        JMenu clienteMenu = new JMenu("Clientes");
        menubar.add(clienteMenu);

        altaCliente = new JMenuItem("Alta");
        clienteMenu.add(altaCliente);
        altaCliente.addActionListener(this);

        bajaCliente = new JMenuItem("Baja");
        clienteMenu.add(bajaCliente);
        bajaCliente.addActionListener(this);

        mostrarClientes = new JMenuItem("Mostrar");
        clienteMenu.add(mostrarClientes);
        mostrarClientes.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == altaVehiculo) {
            System.out.println("Evento recogido alta");
            AltaVehiculoVista altaVehiculoVista = new AltaVehiculoVista();
            setContentPane(altaVehiculoVista);
            setVisible(true);
        } else if (e.getSource() == bajaVehiculo) {
            System.out.println("Evento recogido baja");
            BajaVehiculoVista bajaVehiculoVista = new BajaVehiculoVista();
            setContentPane(bajaVehiculoVista);
            setVisible(true);
        } else if (e.getSource() == mostrarVehiculos) {
            System.out.println("Evento recogido mostrar");
            MostrarVehiculoVista mostrarVehiculoVista = new MostrarVehiculoVista();
            setContentPane(mostrarVehiculoVista);
            setVisible(true);
        } else if (e.getSource() == altaCliente) {
            System.out.println("Evento recogido alta cliente");
            AltaClienteVista altaClienteVista = new AltaClienteVista();
            setContentPane(altaClienteVista);
            setVisible(true);
        } else if (e.getSource() == bajaCliente) {
            System.out.println("Evento recogido baja cliente");
            BajaClienteVista bajaClienteVista = new BajaClienteVista();
            setContentPane(bajaClienteVista);
            setVisible(true);
        } else if (e.getSource() == mostrarClientes) {
            System.out.println("Evento recogido mostrar clientes");
            MostrarClientesVista mostrarClientesVista = new MostrarClientesVista();
            setContentPane(mostrarClientesVista);
            setVisible(true);
        }
    }
}


