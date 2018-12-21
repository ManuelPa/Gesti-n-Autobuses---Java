package Modelo;

import java.sql.Date;

public class Viaje {

    private int id;
    private int id_horario;
    private Date fecha;

    public Viaje() {
    }

    public Viaje(int id_horario, Date fecha) {
        this.id_horario = id_horario;
        this.fecha = fecha;
    }
    
    
    public Viaje(int id, int id_horario, Date fecha) {
        this.id = id;
        this.id_horario = id_horario;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_horario() {
        return id_horario;
    }

    public void setId_horario(int id_horario) {
        this.id_horario = id_horario;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Viaje{" + "id=" + id + ", id_horario=" + id_horario + ", fecha=" + fecha + '}';
    }

}
