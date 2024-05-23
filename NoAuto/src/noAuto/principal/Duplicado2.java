package noAuto.principal;

	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

	import javax.swing.JFrame;
	import javax.swing.JMenu;
	import javax.swing.JMenuBar;
	import javax.swing.JMenuItem;

import VistasVehiculo.AltaVehiculoVista;

	public class Duplicado2 extends JFrame implements ActionListener{ // Esto sera el menu de nuestra aplicacion donde añadiremos las opciones
		// JFrame
		// ActionListener Este lo que hace es guardar los eventos como alta baja etc
		
		private JMenuItem altaVehiculo;
		private JMenuItem bajaVehiculo;
		private JMenuItem modificarVehiculo;
		
		private JMenuItem altaCliente;
		private JMenuItem bajaCliente;
		private JMenuItem modificarCliente;
		
		public Duplicado2() {
			System.out.println("Cargando Menu"); // Ha esto se le llama una traza para saber que se esta ejecuntando
			setBounds(0, 0, 300, 300); // Esto para darle el tamaño en mi ventana
			setTitle("NoAuto"); // Añadir un titulo

			JMenuBar menubar = new JMenuBar();// Esto para añadir una menu de barra en la parte superior
			setJMenuBar(menubar);// Esto para aplicar el menu de barra a nuesta ventana (Si no aparece nada es porque no hay elementos)
			JMenu VehiculoMenu = new JMenu("Vehiculo"); // Creamos el objeto VehiculoMenu donde le podemos dar un nombre
			menubar.add(VehiculoMenu); // Aqui ya le añadimos objeto a nuestra barra

			// Alta
			altaVehiculo = new JMenuItem("Alta"); // Aqui para añadir una lista al menu, podemos darle nombre
			VehiculoMenu.add(altaVehiculo); // Aqui añadimos el alta Vehiculo al objeto alta para que lo tome como una opcion
			altaVehiculo.addActionListener(this); // Añadimos esto para saber que esto es un evento
			
			// Baja
			bajaVehiculo =new JMenuItem("Baja");// Aqui añadimos el baja Vehiculo al objeto alta para que lo tome como una opcion
			VehiculoMenu.add(bajaVehiculo);// Aqui añadimos el baja Vehiculo al objeto baja para que lo tome como una opcion
			bajaVehiculo.addActionListener(this); // Añadimos esto para saber que esto es un evento
			
			// Modificacion
			modificarVehiculo = new JMenuItem("Modificar");// Aqui añadimos el Modificar deportista al objeto alta para que lo tome como una opcion
			VehiculoMenu.add(modificarVehiculo);// Aqui añadimos el baja Vehiculo al objeto Modificar para que lo tome como una opcion
			modificarVehiculo.addActionListener(this);// Añadimos esto para saber que esto es un evento
			
			
			JMenu ClienteMenu = new JMenu("Cliente"); // Creamos el objeto VehiculoMenu donde le podemos dar un nombre
			menubar.add(ClienteMenu); // Aqui ya le añadimos objeto a nuestra barra

			// Alta
			altaCliente = new JMenuItem("Alta"); // Aqui para añadir una lista al menu, podemos darle nombre
			ClienteMenu.add(altaCliente); // Aqui añadimos el alta Vehiculo al objeto alta para que lo tome como una opcion
			altaVehiculo.addActionListener(this); // Añadimos esto para saber que esto es un evento
			
			// Baja
			bajaCliente =new JMenuItem("Baja");// Aqui añadimos el baja Vehiculo al objeto alta para que lo tome como una opcion
			ClienteMenu.add(bajaCliente);// Aqui añadimos el baja Vehiculo al objeto baja para que lo tome como una opcion
			bajaCliente.addActionListener(this); // Añadimos esto para saber que esto es un evento
			
			// Modificacion
			modificarCliente = new JMenuItem("Modificar");// Aqui añadimos el Modificar deportista al objeto alta para que lo tome como una opcion
			ClienteMenu.add(modificarCliente);// Aqui añadimos el baja Vehiculo al objeto Modificar para que lo tome como una opcion
			modificarCliente.addActionListener(this);// Añadimos esto para saber que esto es un evento
		}

	@Override
	public void actionPerformed(ActionEvent e) {  // Metodo que se añade automaticamente implementando ActionListener
		
		// Vehiculos
		
		if (e.getSource()==altaVehiculo) { // Se añade para que avise cuando el evento alta se ejecute
			System.out.println("Evento recogido alta");
			// Para añadir una vista le das clib derecho al paquete Vehiculo.vista /new/other/windows builder/windows desing/jpanel
			AltaVehiculoVista altaVehiculoVista =new AltaVehiculoVista();// Declaramos para llamarlo mas adelante nuestra vista
			setContentPane(altaVehiculoVista); // Llamamos nuestra vista Creada en Vehiculo.vista
			setVisible(true); // Esto es para decirle que se puede visualizar por eso el true
		}
		else if (e.getSource()==bajaVehiculo) { // Se añade para que avise cuando el evento baja se ejecute
			System.out.println("Evento recogido baja");
			
		}
		else if (e.getSource()==modificarVehiculo) { // Se añade para que avise cuando el evento modificacion se ejecute
			System.out.println("Evento recogido modificacion");
		}
		// CLIENTES
		
		if (e.getSource()==altaCliente) { // Se añade para que avise cuando el evento alta se ejecute
			System.out.println("Evento recogido alta");
			// Para añadir una vista le das clib derecho al paquete Vehiculo.vista /new/other/windows builder/windows desing/jpanel
			AltaVehiculoVista altaVehiculoVista =new AltaVehiculoVista();// Declaramos para llamarlo mas adelante nuestra vista
			setContentPane(altaVehiculoVista); // Llamamos nuestra vista Creada en Vehiculo.vista
			setVisible(true); // Esto es para decirle que se puede visualizar por eso el true
		}
		else if (e.getSource()==bajaCliente) { // Se añade para que avise cuando el evento baja se ejecute
			System.out.println("Evento recogido baja");
		}
		else if (e.getSource()==modificarCliente) { // Se añade para que avise cuando el evento modificacion se ejecute
			System.out.println("Evento recogido modificacion");
		}
	}
}
