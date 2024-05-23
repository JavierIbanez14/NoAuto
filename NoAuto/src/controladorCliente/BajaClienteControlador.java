package controladorCliente;

import noAuto.principal.API;

public class BajaClienteControlador implements ControladorInterfazCliente {

    private final API api;

    public BajaClienteControlador() {
        this.api = API.getInstancia();
    }

    @Override
    public void altaCliente(String nombre, String dni, int edad) {
        // No implementado para este controlador
    }

    @Override
    public void bajaCliente(int codigoCliente) {
        api.bajaCliente(codigoCliente);
    }

    @Override
    public String mostrarClientes() {
        // No implementado para este controlador
        return null;
    }
}
