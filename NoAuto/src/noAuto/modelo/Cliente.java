package noAuto.modelo;

public class Cliente {

	private static int cont = 1;
	private int codigo;
	private String nombre;
	private String dni;
	private int edad;
	private double dinero;
	private Vehiculo vehiculo;

	public Cliente(String nombre, String dni, int edad) {
		this.codigo = cont++;
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
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

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public void altaCliente() {
		System.out.println("Cliente dado de alta correctamente.");
	}

	public void bajaCliente() {
		System.out.println("Cliente dado de baja correctamente.");
	}

	public void modificacionCliente() {
		System.out.println("Cliente modificado correctamente.");
	}

	public void listarCliente() {
		System.out.println("C�digo: " + codigo);
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Edad: " + edad);
		System.out.println("Dinero disponible: " + dinero);
	}

	public void altaVehiculoAlCliente(int codigoVehiculo, int horas) {
		Vehiculo vehiculo = Vehiculo.buscarPorCodigo(codigoVehiculo, null);
		if (vehiculo == null) {
			System.out.println("Veh�culo con c�digo " + codigoVehiculo + " no encontrado.");
			return;
		}

		double costeTotal = vehiculo.getCoste() * horas;
		if (costeTotal <= dinero) {
			dinero -= costeTotal;
			if (vehiculo.getEstado() == TipoEstado.Disponible) {
				vehiculo.setEstado(TipoEstado.Alquilado);
			}
			setVehiculo(vehiculo);
			System.out.println("Veh�culo dado de alta al cliente " + codigo + ".");
		} else {
			System.out.println("El coste total del veh�culo excede el dinero disponible del cliente.");
		}
	}

	public void bajaVehiculoAlCliente() {
		if (vehiculo != null) {
			vehiculo.setEstado(TipoEstado.Disponible);
			vehiculo = null;
			System.out.println("Veh�culo dado de baja al cliente " + codigo + ".");
		} else {
			System.out.println("El cliente " + codigo + " no tiene un veh�culo asignado.");
		}
	}

	public void mostrarQueVehiculoTieneElCliente() {
		if (vehiculo != null) {
			System.out.println("El cliente " + codigo + " tiene el siguiente veh�culo:");
			System.out.println(vehiculo);
		} else {
			System.out.println("El cliente " + codigo + " no tiene un veh�culo asignado.");
		}
	}
}
