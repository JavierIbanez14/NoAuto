	package controladorCliente;

import noAuto.principal.API;

public class AltaClienteControlador implements AltaClienteControladorInterfaz {

	   @Override
	public void altaCliente(String nombre, String dni, int edad,int dinero) {
	        System.out.println("Llamando al controlador de alta de cliente");
	        API api = API.getInstancia();
	        api.altaCliente(nombre,dni,edad,dinero);
	    }
	}

