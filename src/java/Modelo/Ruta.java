package Modelo;

import java.time.LocalTime;

public class Ruta {

    private int id;
    private int origen;
    private int destino;
    private LocalTime duracion;
    private double distancia;
    private double precio;

    public Ruta() {
    }

    public Ruta(int id, int origen, int destino, LocalTime duracion, double distancia, double precio) {
        this.id = id;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
        this.distancia = distancia;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public LocalTime getDuracion() {
        return duracion;
    }

    public void setDuracion(LocalTime duracion) {
        this.duracion = duracion;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Ruta{" + "id=" + id + ", origen=" + origen + ", destino=" + destino + ", duracion=" + duracion + ", distancia=" + distancia + ", precio=" + precio + '}';
    }

}
