package controladorCliente;

import noAuto.modelo.Cliente;
import noAuto.principal.API;

public class MostrarVehiculoAsignadoControlador implements MostrarVehiculoAsignadoControladorInterfaz {

    @Override
    public void mostrarVehiculoAsignadoAlCliente(int codigoCliente) {
        System.out.println("Llamando al controlador para mostrar el vehiculo asignado al cliente");
        API api = API.getInstancia();
        Cliente cliente = api.buscarClientePorCodigo(codigoCliente);
        if (cliente != null && cliente.getVehiculo() != null) {
            System.out.println("El cliente " + codigoCliente + " tiene el siguiente vehiculo asignado:");
            System.out.println(cliente.getVehiculo());
        } else {
            System.out.println("El cliente " + codigoCliente + " no tiene un vehiculo asignado.");
        }
    }
}
