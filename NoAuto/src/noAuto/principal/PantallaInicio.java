package noAuto.principal;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PantallaInicio extends JFrame implements ActionListener {
	
	private JPanel contentPane;
	private JMenuItem altaClienteMenuItem;
	private JMenuItem bajaClienteMenuItem;
	private JMenuItem listaClienteMenuItem;
	private JMenuItem altaVehiculoMenuItem;
	private JMenuItem bajaVehiculoMenuItem;
	private JMenuItem modificarVehiculoMenuItem;
	private JMenuItem listadoVehiculosMenMenuItem;
	private JMenuItem listaUbicacionesMenuItem;
	private JMenuItem alquilarVehiculoMenuItem;
	private JMenuItem devolverVehiculoMenuItem;
	
	
	/**
	 * Create the frame.
	 */
	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 381);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu clientesMenu = new JMenu("Clientes");
		menuBar.add(clientesMenu);
		
		altaClienteMenuItem = new JMenuItem("Alta Cliente");
		clientesMenu.add(altaClienteMenuItem);
		altaClienteMenuItem.addActionListener(this);
		
		bajaClienteMenuItem = new JMenuItem("Baja Cliente");
		clientesMenu.add(bajaClienteMenuItem);
		bajaClienteMenuItem.addActionListener(this);
		
		listaClienteMenuItem = new JMenuItem("Listado de Clientes");
		clientesMenu.add(listaClienteMenuItem);
		listaClienteMenuItem.addActionListener(this);
		
		JMenu vehiculoMenu = new JMenu("Vehiculos");
		menuBar.add(vehiculoMenu);

		
		altaVehiculoMenuItem = new JMenuItem("Alta vehiculo");
		vehiculoMenu.add(altaVehiculoMenuItem);
		altaVehiculoMenuItem.addActionListener(this);
		
		bajaVehiculoMenuItem = new JMenuItem("Baja Vehiculo");
		vehiculoMenu.add(bajaVehiculoMenuItem);
		bajaVehiculoMenuItem.addActionListener(this);
		
		JMenuItem modificarVehiculoMenuItem = new JMenuItem("Modificar vehiculo");
		vehiculoMenu.add(modificarVehiculoMenuItem);
		
		JMenuItem listaVehiculosMenuItem = new JMenuItem("Listado de vehiculos");
		vehiculoMenu.add(listaVehiculosMenuItem);
		
		JMenu ubicacionMenu = new JMenu("Ubicaciones");
		menuBar.add(ubicacionMenu);
		
		JMenuItem listaUbicacionesMenuItem = new JMenuItem("Listado de vehiculos");
		vehiculoMenu.add(listaUbicacionesMenuItem);
		
		JMenu noAutoMenu = new JMenu("NoAuto");
		menuBar.add(noAutoMenu);
		
		JMenuItem alquilarVehiculoMenuItem = new JMenuItem("Alquiler de vehiculos");
		vehiculoMenu.add(alquilarVehiculoMenuItem);
		
		JMenuItem devolverVehiculoMenuItem = new JMenuItem("Devolucion de vehiculos");
		vehiculoMenu.add(devolverVehiculoMenuItem);
		
		
		
		

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
