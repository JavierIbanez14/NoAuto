package controladorCliente;

import noAuto.principal.API;

public class AltaClienteControlador implements ControladorInterfazCliente {

    private final API api;

    public AltaClienteControlador() {
        this.api = API.getInstancia();
    }

    @Override
    public void altaCliente(String nombre, String dni, int edad) {
        api.altaCliente(nombre, dni, edad);
    }

    @Override
    public void bajaCliente(int codigoCliente) {
        // No implementado para este controlador
    }

    @Override
    public String mostrarClientes() {
        // No implementado para este controlador
        return null;
    }
}
