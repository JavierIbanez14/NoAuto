package noAuto.principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Vehiculo {
	private static int cont = 1;
	private int codigo;
	private double coste;
	private TipoVehiculo tipoVehiculo;
	private TipoEstado Estado;
	private TipoCargaVehiculo Carga;
	private TipoUbicacion Ubicacion;
	
	 private List<Vehiculo> vehiculos;

	public Vehiculo(int coste, TipoVehiculo tipoVehiculo, TipoEstado Estado, TipoCargaVehiculo Carga,
			TipoUbicacion Ubicacion) {
		this.codigo = cont++;
		this.coste = coste;
		this.tipoVehiculo = tipoVehiculo;
		this.Estado = Estado;
		this.Carga = Carga;
		this.Ubicacion = Ubicacion;
	}

	public Vehiculo(double coste2, TipoVehiculo tipoVehiculo2, TipoEstado estado2, TipoCargaVehiculo carga2,
			TipoUbicacion ubicacion2) {
		// TODO Auto-generated constructor stub
	}

	public double getCoste() {
		return coste;
	}

	public void setCoste(double coste) {
		this.coste = coste;
	}

	public TipoVehiculo getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public TipoEstado getEstado() {
		return Estado;
	}

	public void setEstado(TipoEstado estado) {
		Estado = estado;
	}

	public TipoCargaVehiculo getCarga() {
		return Carga;
	}

	public void setCarga(TipoCargaVehiculo carga) {
		Carga = carga;
	}

	public TipoUbicacion getUbicacion() {
		return Ubicacion;
	}

	public void setUbicacion(TipoUbicacion ubicacion) {
		Ubicacion = ubicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	@Override
	public String toString() {
		return "Vehiculo [codigo=" + codigo + ", coste=" + coste + ", tipoVehiculo=" + tipoVehiculo + ", Estado="
				+ Estado + ", Carga=" + Carga + ", Ubicacion=" + Ubicacion + "]";
	}
	
	// Alta Vehículo
    public void altaVehiculo(double coste, TipoVehiculo tipoVehiculo, TipoEstado estado, TipoCargaVehiculo carga, TipoUbicacion ubicacion) {
        Vehiculo nuevoVehiculo = new Vehiculo(coste, tipoVehiculo, estado, carga, ubicacion);
        vehiculos.add(nuevoVehiculo);
    }

    // Baja Vehículo
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

    // Modificar Vehículo
    public void modificarVehiculo(int codigo, TipoUbicacion nuevaUbicacion, TipoCargaVehiculo nuevaCarga) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getCodigo() == codigo) {
                vehiculo.setUbicacion(nuevaUbicacion);
                vehiculo.setCarga(nuevaCarga);
                break;
            }
        }
    }


}

