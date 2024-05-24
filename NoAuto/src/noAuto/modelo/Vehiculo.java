package noAuto.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Vehiculo {
    private static int cont = 1;
    private int codigo;
    private double coste;
    private TipoVehiculo tipoVehiculo;
    private TipoEstado estado;
    private TipoCargaVehiculo carga;
    private TipoUbicacion ubicacion;

    private static List<Vehiculo> vehiculos = new ArrayList<>();

    public Vehiculo(double coste, TipoVehiculo tipoVehiculo, TipoEstado estado, TipoCargaVehiculo carga, TipoUbicacion ubicacion) {
        this.codigo = cont++;
        this.coste = coste;
        this.tipoVehiculo = tipoVehiculo;
        this.estado = estado;
        this.carga = carga;
        this.ubicacion = ubicacion;
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
        return estado;
    }

    public void setEstado(TipoEstado estado) {
        this.estado = estado;
    }

    public TipoCargaVehiculo getCarga() {
        return carga;
    }

    public void setCarga(TipoCargaVehiculo carga) {
        this.carga = carga;
    }

    public TipoUbicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(TipoUbicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return "Vehiculo [codigo=" + codigo + ", coste=" + coste + ", tipoVehiculo=" + tipoVehiculo + ", estado=" + estado + ", carga=" + carga + ", ubicacion=" + ubicacion + "]";
    }
}