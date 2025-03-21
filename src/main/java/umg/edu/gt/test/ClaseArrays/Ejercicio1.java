package umg.edu.gt.test.ClaseArrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static int encontrarMaximo(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El arreglo no puede estar vacío o ser nulo");
        }
        return java.util.Arrays.stream(numeros).max().getAsInt();
    }

    public static int encontrarRiquezaMaxima(int[][] cuentas) {
        int riquezaMaxima = 0;
        for (int[] cliente : cuentas) {
            int riquezaCliente = 0;
            for (int dinero : cliente) {
                riquezaCliente += dinero;
            }
            riquezaMaxima = Math.max(riquezaMaxima, riquezaCliente);
        }
        return riquezaMaxima;
    }

}
