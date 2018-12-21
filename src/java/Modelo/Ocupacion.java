package Modelo;

public class Ocupacion {

    private int id;
    private int id_viaje;
    private int id_pasajero;
    private int asiento;

    public Ocupacion() {
    }

    public Ocupacion(int id, int id_viaje, int id_pasajero, int asiento) {
        this.id = id;
        this.id_viaje = id_viaje;
        this.id_pasajero = id_pasajero;
        this.asiento = asiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_viaje() {
        return id_viaje;
    }

    public void setId_viaje(int id_viaje) {
        this.id_viaje = id_viaje;
    }

    public int getId_pasajero() {
        return id_pasajero;
    }

    public void setId_pasajero(int id_pasajero) {
        this.id_pasajero = id_pasajero;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    @Override
    public String toString() {
        return "Ocupacion{" + "id=" + id + ", id_viaje=" + id_viaje + ", id_pasajero=" + id_pasajero + ", asiento=" + asiento + '}';
    }

}
