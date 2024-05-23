package controladorVehiculos;

import noAuto.modelo.TipoCargaVehiculo;
import noAuto.modelo.TipoEstado;
import noAuto.modelo.TipoUbicacion;
import noAuto.modelo.TipoVehiculo;
import noAuto.principal.API;

public class AltaVehiculoControlador implements AltaVehiculoControladorInterfaz {

    @Override
    public void altaVehiculo(double coste, TipoVehiculo tipoVehiculo, TipoEstado tipoEstado, TipoCargaVehiculo tipoCarga, TipoUbicacion tipoUbicacion) {
        System.out.println("Llamando al controlador de alta de vehículo");
        API api = API.getInstancia();
        api.altaVehiculo(coste, tipoVehiculo, tipoEstado, tipoCarga, tipoUbicacion);
    }
}
