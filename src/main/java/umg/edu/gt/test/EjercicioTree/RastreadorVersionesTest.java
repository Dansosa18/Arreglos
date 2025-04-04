package umg.edu.gt.test.EjercicioTree;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RastreadorVersionesTest {

    @Test
    void testAgregarYObtenerVersiones() {
        RastreadorVersiones rastreador = new RastreadorVersiones();

        rastreador.agregarVersion("System.out.println('Hola Mundo');");
        rastreador.agregarVersion("System.out.println('Hola Java');");

        assertEquals("System.out.println('Hola Mundo');", rastreador.obtenerVersion(1));
        assertEquals("System.out.println('Hola Java');", rastreador.obtenerVersion(2));
        assertEquals("System.out.println('Hola Java');", rastreador.obtenerUltimaVersion());
    }

    @Test
    void testEliminarVersion() {
        RastreadorVersiones rastreador = new RastreadorVersiones();

        rastreador.agregarVersion("Version A");
        rastreador.agregarVersion("Version B");

        rastreador.eliminarVersion(1);
        assertNull(rastreador.obtenerVersion(1), "La versión 1 debería haber sido eliminada.");
    }
}
