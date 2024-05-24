package controladorCliente;

import noAuto.principal.API;

public class BajaClienteControlador implements BajaClienteControladorInterfaz {


	public void bajaCliente(int codigo) {
        System.out.println("Llamando al controlador de baja de Cliente");
        API api = API.getInstancia();
        api.bajaCliente(codigo);
	}
}
