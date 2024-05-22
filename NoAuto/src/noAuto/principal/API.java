package noAuto.principal;
import java.util.ArrayList;
import java.util.Iterator;

import noAuto.modelo.Vehiculo;

public class API {

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private static API instancia = new API();

    private API() {}

    public static API getInstancia() {
        return instancia;
    }

    public void altaVehiculo(double coste, TipoVehiculo tipoVehiculo, TipoEstado estado, TipoCargaVehiculo carga, TipoUbicacion ubicacion) {
        Vehiculo vehiculo = new Vehiculo(coste, tipoVehiculo, estado, carga, ubicacion);
        vehiculos.add(vehiculo);
    }

    public void bajaVehiculo(int codigo) {
		Iterator<Vehiculo> iterator = vehiculos.iterator();
		while (iterator.hasNext()) {
			Vehiculo vehiculo = iterator.next();
			if (vehiculo.getCodigo() == codigo) {
				iterator.remove();
				break;
			}
		}
	}
}