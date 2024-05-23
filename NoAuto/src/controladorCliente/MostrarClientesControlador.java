package controladorCliente;

import noAuto.principal.API;

public class MostrarClientesControlador implements ControladorInterfazCliente {

    private final API api;

    public MostrarClientesControlador() {
        this.api = API.getInstancia();
    }

    @Override
    public void altaCliente(String nombre, String dni, int edad) {
        // No implementado para este controlador
    }
    @Override
    public String mostrarClientes() {
        return api.mostrarClientes();
    }

	@Override
	public void bajaCliente(int codigoCliente) {
		// TODO Auto-generated method stub
		
	}
}
