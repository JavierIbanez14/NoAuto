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
	private JMenuItem altaVehiculoMenuItem;
	private JMenuItem bajaEnvioMenuItem;
	private JMenuItem listadoMenMenuItem;
	
	/**
	 * Create the frame.
	 */
	public PantallaInicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 603, 381);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mensajeroMenu = new JMenu("Clientes");
		menuBar.add(mensajeroMenu);
		
		altaClienteMenuItem = new JMenuItem("Alta Cliente");
		mensajeroMenu.add(altaClienteMenuItem);
		altaClienteMenuItem.addActionListener(this);
		
		bajaClienteMenuItem = new JMenuItem("Baja Cliente");
		mensajeroMenu.add(bajaClienteMenuItem);
		bajaClienteMenuItem.addActionListener(this);
		
		JMenu envioMenu = new JMenu("Envio");
		menuBar.add(envioMenu);

		
		altaVehiculoMenuItem = new JMenuItem("Alta envio");
		envioMenu.add(altaVehiculoMenuItem);
		altaVehiculoMenuItem.addActionListener(this);
		
		bajaEnvioMenuItem = new JMenuItem("Baja Envio");
		envioMenu.add(bajaEnvioMenuItem);
		bajaEnvioMenuItem.addActionListener(this);
		
		JMenuItem asignarEnvioMenuItem = new JMenuItem("Asignar Envio");
		envioMenu.add(asignarEnvioMenuItem);
		
		JMenuItem entregaEnvioMenuItem = new JMenuItem("Entrega Envio");
		envioMenu.add(entregaEnvioMenuItem);
		
		JMenu listadosMenu = new JMenu("Listados");
		menuBar.add(listadosMenu);
		
		listadoMenMenuItem = new JMenuItem("Listado mensajeros");
		listadosMenu.add(listadoMenMenuItem);
		listadoMenMenuItem.addActionListener(this);
		
		JMenuItem EnviosEsperasMenuItem = new JMenuItem("Envios en Espera");
		listadosMenu.add(EnviosEsperasMenuItem);
		

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
