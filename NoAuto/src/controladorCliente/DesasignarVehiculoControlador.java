package controladorCliente;

import noAuto.principal.API;

public class DesasignarVehiculoControlador implements DesasignarVehiculoControladorInterfaz {
    @Override
    public boolean desasignarVehiculo(int clienteID) {
        System.out.println("Llama al controlador Desasignar Vehiculo");
        API api = API.getInstancia();
        api.bajaVehiculoAlCliente(clienteID);
        return true;
    }
}
