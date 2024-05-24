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
    private static List<Cliente> clientes;
    private static API instancia = new API();

    private API() {
        this.clientes = new ArrayList<>();
    }

    public static API getInstancia() {
        return instancia;
    }

    public void altaVehiculo(double coste, TipoVehiculo tipoVehiculo, TipoEstado estado, TipoCargaVehiculo carga,
            TipoUbicacion ubicacion) {
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

    public void altaCliente(String nombre, String dni, int edad, int dinero) {
        Cliente cliente = new Cliente(nombre, dni, edad, dinero);
        clientes.add(cliente);
    }

    public static void bajaCliente(int codigo) {
        Iterator<Cliente> iterator = clientes.iterator();
        while (iterator.hasNext()) {
            Cliente cliente = iterator.next();
            if (cliente.getCodigo() == codigo) {
                iterator.remove();
                System.out.println("Cliente con código " + codigo + " dado de baja correctamente.");
                return;
            }
        }
        System.out.println("Cliente con código " + codigo + " no encontrado.");
    }

    public String listarClientes() {
        StringBuilder sb = new StringBuilder();
        for (Cliente cliente : clientes) {
            sb.append(cliente.toString()).append("\n");
        }
        return sb.toString();
    }

    public void altaVehiculoAlCliente(int codigoCliente, int codigoVehiculo, int horas) {
        Cliente cliente = buscarClientePorCodigo(codigoCliente);
        if (cliente != null) {
            Vehiculo vehiculo = buscarPorCodigo(codigoVehiculo);
            if (vehiculo != null && vehiculo.getEstado() == TipoEstado.Disponible) {
                double costeTotal = vehiculo.getCoste() * horas;
                if (costeTotal <= cliente.getDinero()) {
                    cliente.setDinero(cliente.getDinero() - costeTotal);
                    vehiculo.setEstado(TipoEstado.Alquilado);
                    cliente.setVehiculo(vehiculo);
                    System.out.println("Vehículo dado de alta al cliente " + codigoCliente + ".");
                } else {
                    System.out.println("El coste total del vehículo excede el dinero disponible del cliente.");
                }
            } else {
                System.out.println("Vehículo con código " + codigoVehiculo + " no encontrado o no disponible.");
            }
        } else {
            System.out.println("Cliente con código " + codigoCliente + " no encontrado.");
        }
    }

    public void bajaVehiculoAlCliente(int codigoCliente) {
        Cliente cliente = buscarClientePorCodigo(codigoCliente);
        if (cliente != null) {
            Vehiculo vehiculo = cliente.getVehiculo();
            if (vehiculo != null) {
                vehiculo.setEstado(TipoEstado.Disponible);
                cliente.setVehiculo(null);
                System.out.println("Vehículo dado de baja al cliente " + codigoCliente + ".");
            } else {
                System.out.println("El cliente " + codigoCliente + " no tiene un vehículo asignado.");
            }
        } else {
            System.out.println("Cliente con código " + codigoCliente + " no encontrado.");
        }
    }

    public void mostrarQueVehiculoTieneElCliente(int codigoCliente) {
        Cliente cliente = buscarClientePorCodigo(codigoCliente);
        if (cliente != null) {
            Vehiculo vehiculo = cliente.getVehiculo();
            if (vehiculo != null) {
                System.out.println("El cliente " + codigoCliente + " tiene el siguiente vehículo:");
                System.out.println(vehiculo);
            } else {
                System.out.println("El cliente " + codigoCliente + " no tiene un vehículo asignado.");
            }
        } else {
            System.out.println("Cliente con código " + codigoCliente + " no encontrado.");
        }
    }

    public Cliente buscarClientePorCodigo(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }
    
}

