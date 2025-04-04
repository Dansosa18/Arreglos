package umg.edu.gt.test.EjercicioTree;


import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class FrecuenciasPalabras {

    public static Map<String, Integer> contarPalabras(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        
        // Si el archivo no existe, lo creamos con contenido de prueba
        if (!archivo.exists()) {
            try (FileWriter writer = new FileWriter(rutaArchivo)) {
                writer.write("Hola mundo! Hola Java. Java es genial.");
                System.out.println("Archivo de prueba creado: " + rutaArchivo);
            } catch (IOException e) {
                System.err.println("No se pudo crear el archivo: " + e.getMessage());
                return null;
            }
        }

        Map<String, Integer> frecuenciaPalabras = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] palabras = linea.replaceAll("[^a-zA-ZáéíóúÁÉÍÓÚüÜñÑ ]", "").toLowerCase().split("\\s+");
                for (String palabra : palabras) {
                    if (!palabra.isEmpty()) {
                        frecuenciaPalabras.put(palabra, frecuenciaPalabras.getOrDefault(palabra, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }

        return frecuenciaPalabras;
    }

    public static void main(String[] args) {
        String rutaArchivo = "texto.txt"; // Puede ser ruta absoluta si prefieres
        Map<String, Integer> resultado = contarPalabras(rutaArchivo);
        if (resultado != null) {
            resultado.forEach((palabra, frecuencia) -> System.out.println(palabra + ": " + frecuencia));
        }
    }
}

