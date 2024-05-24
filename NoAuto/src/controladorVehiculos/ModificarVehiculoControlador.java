package controladorVehiculos;

import noAuto.modelo.TipoCargaVehiculo;
import noAuto.modelo.TipoUbicacion;
import noAuto.principal.API;

public class ModificarVehiculoControlador implements modificarVehiculoControladorInterfaz {

	@Override
	public void modificarVehiculo(int codigo, TipoUbicacion nuevaUbicacion, TipoCargaVehiculo nuevaCarga) {
		// TODO Auto-generated method stub
        System.out.println("Llamando al controlador de modificar de vehiculo");
        API api = API.getInstancia();
        api.modificarVehiculo(codigo, nuevaUbicacion, nuevaCarga);
    
	}

}
