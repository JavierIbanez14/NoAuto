package noAuto.principal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import noAuto.modelo.Vehiculo;
import noAuto.modelo.TipoVehiculo;
import noAuto.modelo.TipoEstado;
import noAuto.modelo.Cliente;
import noAuto.modelo.TipoCargaVehiculo;
import noAuto.modelo.TipoUbicacion;

public class API {

    private ArrayList<Vehiculo> vehiculos = new ArrayList<>();
    private List<Cliente> clientes;
    private static API instancia = new API();

    private API() {
        this.clientes = new ArrayList<>();
    }

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

    public void altaCliente(String nombre, String dni, int edad) {
        Cliente cliente = new Cliente(nombre, dni, edad);
        clientes.add(cliente);
        cliente.altaCliente();
    }

    public void bajaCliente(int codigoCliente) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigoCliente) {
                clientes.remove(cliente);
                cliente.bajaCliente();
                return;
            }
        }
        System.out.println("Cliente no encontrado.");
    }

    public String mostrarClientes() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Cliente cliente : clientes) {
            stringBuilder.append("Codigo: ").append(cliente.getCodigo()).append("\n");
            stringBuilder.append("Nombre: ").append(cliente.getNombre()).append("\n");
            stringBuilder.append("DNI: ").append(cliente.getDni()).append("\n");
            stringBuilder.append("Edad: ").append(cliente.getEdad()).append("\n");
            stringBuilder.append("Dinero disponible: ").append(cliente.getDinero()).append("\n\n");
        }
        return stringBuilder.toString();
    }
}


