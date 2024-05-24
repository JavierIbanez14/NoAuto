package controladorVehiculos;

import noAuto.principal.API;

public class BajaVehiculoControlador implements BajaVehiculoControladorInterfaz {

    @Override
    public void bajaVehiculo(int codigo) {
        System.out.println("Llamando al controlador de baja de vehiculo");
        API api = API.getInstancia();
        api.bajaVehiculo(codigo);
    }
}
