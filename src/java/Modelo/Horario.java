package Modelo;

import java.sql.Time;

public class Horario {

    private int id;
    private int id_ruta;
    private Time hora_salida;
    private String tipo_ida;

    public Horario() {
    }

    public Horario(int id, int id_ruta, Time hora_salida, String tipo_ida) {
        this.id = id;
        this.id_ruta = id_ruta;
        this.hora_salida = hora_salida;
        this.tipo_ida = tipo_ida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_ruta() {
        return id_ruta;
    }

    public void setId_ruta(int id_ruta) {
        this.id_ruta = id_ruta;
    }

    public Time getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(Time hora_salida) {
        this.hora_salida = hora_salida;
    }

    public String getTipo_ida() {
        return tipo_ida;
    }

    public void setTipo_ida(String tipo_ida) {
        this.tipo_ida = tipo_ida;
    }

    @Override
    public String toString() {
        return "horario{" + "id=" + id + ", id_ruta=" + id_ruta + ", hora_salida=" + hora_salida + ", tipo_ida=" + tipo_ida + '}';
    }

}
