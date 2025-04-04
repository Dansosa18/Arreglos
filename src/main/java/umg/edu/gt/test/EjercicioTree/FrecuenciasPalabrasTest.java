package umg.edu.gt.test.EjercicioTree;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class EjercicioTreeTest {

    @Test
    void testContarPalabras() throws IOException {
        // Crear un archivo de prueba temporal
        File archivoPrueba = File.createTempFile("test", ".txt");
        FileWriter writer = new FileWriter(archivoPrueba);
        writer.write("Hola mundo! Hola Java. Java es genial.");
        writer.close();

        // Llamar al método
        Map<String, Integer> resultado = FrecuenciasPalabras.contarPalabras(archivoPrueba.getAbsolutePath());

        // Verificar resultados esperados
        assertEquals(2, resultado.get("hola"));
        assertEquals(2, resultado.get("java"));
        assertEquals(1, resultado.get("mundo"));
        assertEquals(1, resultado.get("es"));
        assertEquals(1, resultado.get("genial"));
    }
}
