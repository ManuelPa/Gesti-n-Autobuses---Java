package DAO;

import Modelo.Estacion;
import Modelo.Horario;
import Modelo.Ruta;
import Modelo.Viaje;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;

public class Operaciones {

    public Operaciones() {
    }

    public static ArrayList<Estacion> setOrigen(Connection conexion) throws SQLException {
        ArrayList<Estacion> estaciones = new ArrayList<>();
        PreparedStatement origen = conexion.prepareStatement("SELECT * FROM estacion ORDER BY localidad;");
        ResultSet rs = origen.executeQuery();
        while (rs.next()) {
            Estacion e = new Estacion(rs.getInt("id"), rs.getString("localidad"), rs.getString("direccion"), rs.getString("denominacion"));
            estaciones.add(e);
        }
        return estaciones;
    }

    public static ArrayList<Estacion> setDestino(Connection conexion, int idorigen) throws SQLException {
        ArrayList<Estacion> estaciones = new ArrayList<>();
        PreparedStatement destino = conexion.prepareStatement("SELECT destino FROM ruta WHERE origen=?;");
        destino.setInt(1, idorigen);
        ResultSet rs = destino.executeQuery();
        while (rs.next()) {
            PreparedStatement dest = conexion.prepareStatement("SELECT * FROM estacion WHERE id=? ORDER BY localidad;");
            dest.setInt(1, rs.getInt("destino"));
            ResultSet rs2 = dest.executeQuery();
            while (rs2.next()) {
                Estacion e = new Estacion(rs2.getInt("id"), rs2.getString("localidad"), rs2.getString("direccion"), rs2.getString("denominacion"));
                estaciones.add(e);
            }
        }
        return estaciones;
    }

    public static ArrayList<Horario> setHorario(Ruta ruta, Date fecha, Connection conexion) throws SQLException {
        ArrayList<Horario> horarios = new ArrayList<>();
        PreparedStatement horario = conexion.prepareStatement("SELECT * FROM horario WHERE id_ruta=? ORDER BY id");
        horario.setInt(1, ruta.getId());
        ResultSet rs = horario.executeQuery();
        while (rs.next()) {
            Horario h = new Horario(rs.getInt("id"), rs.getInt("id_ruta"), rs.getTime("hora_salida"), rs.getString("tipo_ida"));
            PreparedStatement viaje = conexion.prepareStatement("SELECT * FROM viaje WHERE id_horario=? AND fecha=? ORDER BY id_horario");
            viaje.setInt(1, h.getId());
            viaje.setDate(2, fecha);
            ResultSet rs2 = viaje.executeQuery();
            while (rs2.next()) {
                Viaje v = new Viaje(rs2.getInt("id"), rs2.getInt("id_horario"), rs2.getDate("fecha"));
                horarios.add(h);
            }
        }
        return horarios;
    }

    public static Estacion setEstacion(int idestacion, Connection conexion) throws SQLException {
        Estacion estacion = new Estacion();
        PreparedStatement consulta = conexion.prepareStatement("SELECT * FROM estacion WHERE id=?");
        consulta.setInt(1, idestacion);
        ResultSet rs = consulta.executeQuery();
        while (rs.next()) {
            estacion = new Estacion(rs.getInt("id"), rs.getString("localidad"), rs.getString("direccion"), rs.getString("denominacion"));
        }
        return estacion;
    }

    public static Ruta setRuta(int origen, int destino, Connection conexion) throws SQLException {
        Ruta rutas = new Ruta();
        PreparedStatement ruta = conexion.prepareStatement("SELECT * FROM ruta WHERE origen=? AND destino=?");
        ruta.setInt(1, origen);
        ruta.setInt(2, destino);
        ResultSet rs = ruta.executeQuery();
        while (rs.next()) {
            rutas = new Ruta(rs.getInt("id"), rs.getInt("origen"), rs.getInt("destino"), rs.getTime("duracion").toLocalTime(), rs.getDouble("distancia"), rs.getDouble("precio"));
        }
        return rutas;
    }
}
