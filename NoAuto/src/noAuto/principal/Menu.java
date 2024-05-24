package noAuto.principal;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

import controladorCliente.AltaClienteControlador;
import controladorCliente.AltaClienteControladorInterfaz;
import controladorCliente.AsignarVehiculoControlador;
import controladorCliente.BajaClienteControlador;
import controladorCliente.BajaClienteControladorInterfaz;
import controladorCliente.MostrarClientesControlador;
import controladorCliente.MostrarClientesControladorInterfaz;
import controladorCliente.DesasignarVehiculoControlador;
import controladorCliente.DesasignarVehiculoControladorInterfaz;
import VistasClientes.AltaClienteVista;
import VistasClientes.AsignarVehiculoVista;
import VistasClientes.BajaClienteVista;
import VistasClientes.MostrarClientesVista;
import VistasClientes.BajaVehiculoClienteVista;
import VistasVehiculo.AltaVehiculoVista;
import VistasVehiculo.BajaVehiculoVista;
import VistasVehiculo.MostrarVehiculoVista;
import controladorCliente.AsignarVehiculoControladorInterfaz;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import java.awt.GridLayout;

public class Menu extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JMenuItem altaVehiculo;
    private JMenuItem bajaVehiculo;
    private JMenuItem mostrarVehiculos;
    private JMenuItem altaCliente;
    private JMenuItem bajaCliente;
    private JMenuItem mostrarClientes;
    private JMenuItem alquilarVehiculo;
    private JMenuItem desasignarVehiculo;
    private JLabel lblNoauto;
    private JLabel lblAlquilerDeVehiculos;

    public Menu() {
    	getContentPane().setBackground(new Color(0, 128, 50));
    	getContentPane().setLayout(null);
    	
    	lblNoauto = new JLabel("NoAuto ");
    	lblNoauto.setForeground(Color.WHITE);
    	lblNoauto.setFont(new Font("Arial", Font.BOLD, 55));
    	lblNoauto.setBounds(81, 45, 315, 84);
    	getContentPane().add(lblNoauto);
    	
    	lblAlquilerDeVehiculos = new JLabel("Alquiler de vehiculos sostenibles");
    	lblAlquilerDeVehiculos.setForeground(Color.WHITE);
    	lblAlquilerDeVehiculos.setFont(new Font("Arial", Font.ITALIC, 20));
    	lblAlquilerDeVehiculos.setBounds(43, 99, 315, 68);
    	getContentPane().add(lblAlquilerDeVehiculos);
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

        // AlquilarVehiculo
        JMenu AlquilerVehiculoMenu = new JMenu("Alquilar");
        menubar.add(AlquilerVehiculoMenu);

        alquilarVehiculo = new JMenuItem("Alquilar");
        AlquilerVehiculoMenu.add(alquilarVehiculo);
        alquilarVehiculo.addActionListener(this);

        // DesasignarVehiculo
        desasignarVehiculo = new JMenuItem("Desasignar Vehículo");
        AlquilerVehiculoMenu.add(desasignarVehiculo);
        desasignarVehiculo.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == altaVehiculo) {
            System.out.println("Evento recogido alta vehículo");
            AltaVehiculoVista altaVehiculoVista = new AltaVehiculoVista();
            setContentPane(altaVehiculoVista);
            setVisible(true);

        } else if (e.getSource() == bajaVehiculo) {
            System.out.println("Evento recogido baja vehículo");
            BajaVehiculoVista bajaVehiculoVista = new BajaVehiculoVista();
            setContentPane(bajaVehiculoVista);
            setVisible(true);

        } else if (e.getSource() == mostrarVehiculos) {
            System.out.println("Evento recogido mostrar vehículos");
            MostrarVehiculoVista mostrarVehiculoVista = new MostrarVehiculoVista();
            setContentPane(mostrarVehiculoVista);
            setVisible(true);

        } else if (e.getSource() == altaCliente) {
            System.out.println("Evento recogido alta cliente");
            AltaClienteControladorInterfaz controlador = new AltaClienteControlador();
            AltaClienteVista altaClienteVista = new AltaClienteVista(controlador);
            setContentPane(altaClienteVista);
            setVisible(true);

        } else if (e.getSource() == bajaCliente) {
            System.out.println("Evento recogido baja cliente");
            BajaClienteControladorInterfaz controlador = new BajaClienteControlador();
            BajaClienteVista bajaClienteVista = new BajaClienteVista(controlador);
            setContentPane(bajaClienteVista);
            setVisible(true);
        } else if (e.getSource() == mostrarClientes) {
            System.out.println("Evento recogido mostrar cliente");
            MostrarClientesControladorInterfaz controlador = new MostrarClientesControlador();
            MostrarClientesVista mostrarClienteVista = new MostrarClientesVista(controlador);
            setContentPane(mostrarClienteVista);
            setVisible(true);

        } else if (e.getSource() == alquilarVehiculo) {
            System.out.println("Evento recogido Alquilar vehiculo a cliente");
            AsignarVehiculoControladorInterfaz controlador = new AsignarVehiculoControlador();
            AsignarVehiculoVista mostrarClienteVista = new AsignarVehiculoVista(controlador);
            setContentPane(mostrarClienteVista);
            setVisible(true);

        } else if (e.getSource() == desasignarVehiculo) {
            System.out.println("Evento recogido Desasignar vehiculo de cliente");
            DesasignarVehiculoControladorInterfaz controlador = new DesasignarVehiculoControlador();
            BajaVehiculoClienteVista bajaVehiculoClienteVista = new BajaVehiculoClienteVista(controlador);
            setContentPane(bajaVehiculoClienteVista);
            setVisible(true);
        }
        // Aquí puedes agregar el código para manejar otras opciones del menú
    }
}
