package controladorCliente;

import noAuto.principal.API;

public class MostrarClientesControlador implements MostrarClientesControladorInterfaz {

    @Override
    public String mostrarClientes() {
        System.out.println("Llamando al controlador para mostrar Clientes");
        API api = API.getInstancia();
        return api.listarClientes();
    }
}
