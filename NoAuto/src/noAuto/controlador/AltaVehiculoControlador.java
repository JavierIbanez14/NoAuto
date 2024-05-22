package noAuto.controlador;


import noAuto.modelo.Vehiculo;

public class AltaVehiculoControlador implements AltaVehiculoControladorInterfaz {

    @Override
    public void altaVehiculo(double coste, TipoVehiculo tipoVehiculo, TipoEstado estado, TipoCargaVehiculo carga, TipoUbicacion ubicacion) {
        System.out.println("Llamando al controlador del alta de vehículo");
        APIModelo api = APIModelo.getInstancia();
        api.altaVehiculo(coste, tipoVehiculo, estado, carga, ubicacion);
    }
}