package umg.edu.gt.test.EjercicioTree;


import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.TreeSet;

public class SistemaEventos {
    private TreeSet<Evento> eventos;

    public SistemaEventos() {
        this.eventos = new TreeSet<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void mostrarEventos() {
        System.out.println("Lista de eventos:");
        int i = 1;
        for (Evento evento : eventos) {
            System.out.println(i + ". " + evento);
            i++;
        }
    }

    public Evento obtenerProximoEvento() {
        eliminarEventosPasados(); // Limpia eventos pasados primero
        return eventos.isEmpty() ? null : eventos.first();
    }

    private void eliminarEventosPasados() {
        LocalDateTime ahora = LocalDateTime.now();
        Iterator<Evento> iterator = eventos.iterator();
        while (iterator.hasNext()) {
            Evento e = iterator.next();
            if (e.getFecha().isBefore(ahora)) {
                iterator.remove(); // Elimina si ya pasó
            } else {
                break; // Ya no hay más eventos pasados (están ordenados)
            }
        }
    }

    public static void main(String[] args) {
        SistemaEventos sistema = new SistemaEventos();

        sistema.agregarEvento(new Evento(LocalDateTime.of(2025, 4, 15, 14, 0), "Taller de Machine Learning", "Sala 3"));
        sistema.agregarEvento(new Evento(LocalDateTime.of(2025, 5, 10, 10, 0), "Conferencia de Java", "Auditorio A"));

        Evento proximo = sistema.obtenerProximoEvento();
        System.out.println("Próximo evento: " + (proximo != null ? proximo : "Ninguno"));

        sistema.mostrarEventos();
    }
}
