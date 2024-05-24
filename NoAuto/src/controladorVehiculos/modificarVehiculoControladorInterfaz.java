package controladorVehiculos;

import noAuto.modelo.TipoCargaVehiculo;
import noAuto.modelo.TipoUbicacion;

public interface modificarVehiculoControladorInterfaz {
	void modificarVehiculo(int codigo, TipoUbicacion nuevaUbicacion, TipoCargaVehiculo nuevaCarga);
}
