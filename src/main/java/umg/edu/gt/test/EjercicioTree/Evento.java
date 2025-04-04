package umg.edu.gt.test.EjercicioTree;


import java.time.LocalDateTime;

public class Evento implements Comparable<Evento> {
    private LocalDateTime fecha;
    private String nombre;
    private String ubicacion;

    public Evento(LocalDateTime fecha, String nombre, String ubicacion) {
        this.fecha = fecha;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    @Override
    public int compareTo(Evento otro) {
        return this.fecha.compareTo(otro.fecha); // Orden por fecha
    }

    @Override
    public String toString() {
        return "\"" + nombre + "\", " + fecha.toString().replace('T', ' ') + ", " + ubicacion;
    }
}
