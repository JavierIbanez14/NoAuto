package controladorCliente;

public class DesasignarVehiculoControlador implements DesasignarVehiculoControladorInterfaz {
    @Override
    public boolean desasignarVehiculo(int clienteID) {
        System.out.println("Desasignando Vehiculo del cliente con ID: " + clienteID);
        return true;
    }
}
