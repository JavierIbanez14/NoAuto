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
	private double dinero;
	private Vehiculo vehiculo;

	private static List<Cliente> clientes = new ArrayList<>();

	public Cliente(String nombre, String dni, int edad, int dinero) {
		this.codigo = cont++;
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.dinero = dinero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getCodigo() {
		return codigo;
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

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", dni=" + dni + ", edad=" + edad + ", dinero="
				+ dinero + "]";
	}
}
