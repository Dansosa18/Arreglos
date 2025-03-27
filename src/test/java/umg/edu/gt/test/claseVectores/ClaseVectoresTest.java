package umg.edu.gt.test.claseVectores;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import umg.edu.gt.desarrollo.estructuradedatos2025.clases.ClaseVectores;

public class ClaseVectoresTest {
    @Test
    void testBuscarNumero() {
    	
        int[] numeros = {10, 20, 30, 40, 50};
        assertTrue(ClaseVectores.buscarNumero(numeros, 30), "El número 30 debe estar en el array");
        assertFalse(ClaseVectores.buscarNumero(numeros, 100), "El número 100 no debe estar en el array");

    }
}