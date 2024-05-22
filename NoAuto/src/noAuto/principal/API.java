package noAuto.principal;

import java.util.ArrayList;
import java.util.Iterator;
import noAuto.modelo.Vehiculo;
import noAuto.modelo.TipoVehiculo;
import noAuto.modelo.TipoEstado;
import noAuto.modelo.TipoCargaVehiculo;
import noAuto.modelo.TipoUbicacion;

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

    public Vehiculo buscarPorCodigo(int codigo) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCodigo() == codigo) {
                return vehiculo;
            }
        }
        return null;
    }

    public void modificarVehiculo(int codigo, TipoUbicacion nuevaUbicacion, TipoCargaVehiculo nuevaCarga) {
        Vehiculo vehiculo = buscarPorCodigo(codigo);
        if (vehiculo != null) {
            vehiculo.setUbicacion(nuevaUbicacion);
            vehiculo.setCarga(nuevaCarga);
        }
    }

    public String listarVehiculos() {
        StringBuilder sb = new StringBuilder();
        for (Vehiculo vehiculo : vehiculos) {
            sb.append(vehiculo.toString()).append("\n");
        }
        return sb.toString();
    }
}
