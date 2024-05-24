package noAuto.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente {
    private static int cont = 1;
    private int codigo;
    private String nombre;
    private String dni;
    private int edad;
    private double dinero; // Cambiado a int
    private Vehiculo vehiculo;

    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente(String nombre, String dni, int edad, int dinero) { // Actualizado el constructor
        this.codigo = cont++;
        this.nombre = nombre;
        this.dni = dni;
        this.edad = edad;
        this.dinero = dinero; // Actualizado para asignar dinero
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public int getEdad() {
        return edad;
    }

    public double getDinero() { // Método para obtener el dinero
        return dinero;
    }

    public void setDinero(double dinero) { // Método para actualizar el dinero
        this.dinero = dinero;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    @Override
    public String toString() {
        return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", dinero=" + dinero + "]";
    }

    // Alta Cliente
    public static void altaCliente(String nombre, String dni, int edad, int dinero) {
        Cliente nuevoCliente = new Cliente(nombre, dni, edad, dinero);
        clientes.add(nuevoCliente);
        System.out.println("Cliente dado de alta correctamente: " + nuevoCliente);
    }

    // Baja Cliente
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

    // Modificar Cliente
    public static void modificarCliente(int codigo, String nuevoNombre, String nuevoDni, int nuevaEdad, int nuevoDinero) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                cliente.nombre = nuevoNombre;
                cliente.dni = nuevoDni;
                cliente.edad = nuevaEdad;
                cliente.dinero = nuevoDinero;
                System.out.println("Cliente con código " + codigo + " modificado correctamente: " + cliente);
                return;
            }
        }
        System.out.println("Cliente con código " + codigo + " no encontrado.");
    }

    // Listar Clientes
    public static void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

    // Buscar Cliente por Código
    public static Cliente buscarPorCodigo(int codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo() == codigo) {
                return cliente;
            }
        }
        return null;
    }

    public void altaVehiculoAlCliente(int codigoVehiculo, int horas) {
        Vehiculo vehiculo = Vehiculo.buscarPorCodigo(codigoVehiculo);
        if (vehiculo == null) {
            System.out.println("Vehículo con código " + codigoVehiculo + " no encontrado.");
            return;
        }

        double costeTotal = vehiculo.getCoste() * horas;
        if (costeTotal <= dinero) {
            dinero -= costeTotal;
            if (vehiculo.getEstado() == TipoEstado.Disponible) {
                vehiculo.setEstado(TipoEstado.Alquilado);
            }
            setVehiculo(vehiculo);
            System.out.println("Vehículo dado de alta al cliente " + codigo + ".");
        } else {
            System.out.println("El coste total del vehículo excede el dinero disponible del cliente.");
        }
    }

    public void bajaVehiculoAlCliente() {
        if (vehiculo != null) {
            vehiculo.setEstado(TipoEstado.Disponible);
            vehiculo = null;
            System.out.println("Vehículo dado de baja al cliente " + codigo + ".");
        } else {
            System.out.println("El cliente " + codigo + " no tiene un vehículo asignado.");
        }
    }

    public void mostrarQueVehiculoTieneElCliente() {
        if (vehiculo != null) {
            System.out.println("El cliente " + codigo + " tiene el siguiente vehículo:");
            System.out.println(vehiculo);
        } else {
            System.out.println("El cliente " + codigo + " no tiene un vehículo asignado.");
        }
    }
    
}

