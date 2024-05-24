package controladorCliente;

import noAuto.principal.API;

public class AsignarVehiculoControlador implements AsignarVehiculoControladorInterfaz {

    @Override
    public void asignarVehiculoAlCliente(int codigoCliente, int codigoVehiculo, int horas) {
        API api = API.getInstancia();
        api.altaVehiculoAlCliente(codigoCliente, codigoVehiculo, horas);
    }
}
