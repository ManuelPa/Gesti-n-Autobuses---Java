package Modelo;

public class Estacion {

    private int id;
    private String localidad;
    private String direccion;
    private String denominacion;

    public Estacion() {
    }

    public Estacion(int id, String localidad, String direccion, String denominacion) {
        this.id = id;
        this.localidad = localidad;
        this.direccion = direccion;
        this.denominacion = denominacion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    @Override
    public String toString() {
        return "Estacion{" + "id=" + id + ", localidad=" + localidad + ", direccion=" + direccion + ", denominacion=" + denominacion + '}';
    }

}
