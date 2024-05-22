package noAuto;

import noAuto.principal.API;

public class MostrarVehiculoControlador implements MostrarVehiculoControladorInterfaz {

    @Override
    public String mostrarVehiculos() {
        System.out.println("Llamando al controlador para mostrar vehículos");
        API api = API.getInstancia();
        return api.listarVehiculos();
    }
}
