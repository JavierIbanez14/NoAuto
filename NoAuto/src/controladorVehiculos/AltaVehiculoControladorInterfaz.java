package controladorVehiculos;

import noAuto.modelo.TipoCargaVehiculo;
import noAuto.modelo.TipoEstado;
import noAuto.modelo.TipoUbicacion;
import noAuto.modelo.TipoVehiculo;

public interface AltaVehiculoControladorInterfaz {
    void altaVehiculo(double coste, TipoVehiculo tipoVehiculo, TipoEstado tipoEstado, TipoCargaVehiculo tipoCarga, TipoUbicacion tipoUbicacion);
}
