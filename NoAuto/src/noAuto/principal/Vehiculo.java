package noAuto.principal;

public class Vehiculo {
	private static int cont = 1;
	private int codigo;
	private double coste;
	private TipoVehiculo tipoVehiculo;
	private TipoEstado Estado;
	private TipoCargaVehiculo Carga;
	private TipoUbicacion Ubicacion;

	public Vehiculo(int coste, TipoVehiculo tipoVehiculo, TipoEstado Estado, TipoCargaVehiculo Carga,
			TipoUbicacion Ubicacion) {
		this.codigo = cont++;
		this.coste = coste;
		this.tipoVehiculo = tipoVehiculo;
		this.Estado = Estado;
		this.Carga = Carga;
		this.Ubicacion = Ubicacion;
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

}
