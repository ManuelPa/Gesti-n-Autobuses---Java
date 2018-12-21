package Modelo;

public class Pasajero {

    private int id;
    private String nif;
    private String nombre;
    private String apellidos;

    public Pasajero() {
    }

    public Pasajero(int id, String nif, String nombre, String apellidos) {
        this.id = id;
        this.nif = nif;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "Pasajero{" + "id=" + id + ", nif=" + nif + ", nombre=" + nombre + ", apellidos=" + apellidos + '}';
    }

}
