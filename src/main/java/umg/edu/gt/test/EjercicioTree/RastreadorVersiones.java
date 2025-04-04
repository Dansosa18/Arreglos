package umg.edu.gt.test.EjercicioTree;


import java.util.TreeMap;

public class RastreadorVersiones {
    private TreeMap<Integer, String> versiones;
    private int contadorVersiones;

    public RastreadorVersiones() {
        this.versiones = new TreeMap<>();
        this.contadorVersiones = 0;
    }

    // Agregar una nueva versión con clave autoincrementada
    public void agregarVersion(String codigo) {
        contadorVersiones++;
        versiones.put(contadorVersiones, codigo);
        System.out.println("Agregada versión " + contadorVersiones + ": \"" + codigo + "\"");
    }

    // Obtener una versión específica
    public String obtenerVersion(int numeroVersion) {
        return versiones.getOrDefault(numeroVersion, "Versión no encontrada");
    }

    // Obtener la última versión disponible
    public String obtenerUltimaVersion() {
        return versiones.isEmpty() ? "No hay versiones disponibles" : versiones.lastEntry().getValue();
    }

    // Eliminar una versión específica
    public void eliminarVersion(int numeroVersion) {
        if (versiones.remove(numeroVersion) != null) {
            System.out.println("Versión " + numeroVersion + " eliminada.");
        } else {
            System.out.println("Versión no encontrada.");
        }
    }

    public static void main(String[] args) {
        RastreadorVersiones rastreador = new RastreadorVersiones();
        rastreador.agregarVersion("System.out.println('Hola Mundo');");
        rastreador.agregarVersion("System.out.println('Hola Java');");

        System.out.println("Última versión: \"" + rastreador.obtenerUltimaVersion() + "\"");
        System.out.println("Versión 1: \"" + rastreador.obtenerVersion(1) + "\"");
    }
}

