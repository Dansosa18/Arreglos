package umg.edu.gt.test.ClaseArrays;

import java.util.Scanner;

import static umg.edu.gt.test.ClaseArrays.Ejercicio1.encontrarRiquezaMaxima;
import static umg.edu.gt.test.ClaseArrays.Ejercicio2.ordenarDiagonales;
import static umg.edu.gt.test.ClaseArrays.Ejercicio3.calcularSumaMatriz;
import static umg.edu.gt.test.ClaseArrays.Ejercicio3.imprimirMatriz;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejercicio 1: Encontrar la riqueza máxima
        System.out.print("Ingrese el número de clientes: ");
        int m = scanner.nextInt();
        System.out.print("Ingrese el número de bancos: ");
        int n = scanner.nextInt();

        int[][] cuentas = new int[m][n];
        System.out.println("Ingrese los valores de las cuentas: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cuentas[i][j] = scanner.nextInt();
            }
        }
        scanner.close();
        // Ejercicio 2: Ordenar diagonales de una matriz
        int riquezaMaxima = encontrarRiquezaMaxima(cuentas);
        System.out.println("La riqueza máxima es: " + riquezaMaxima);

        System.out.print("Ingrese el número de filas de la matriz: ");
        int filas = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz: ");
        int columnas = scanner.nextInt();

        int[][] matriz = new int[filas][columnas];
        System.out.println("Ingrese los valores de la matriz: ");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = scanner.nextInt();
            }
        }
        scanner.close();

        System.out.println("Matriz ordenada por diagonales: ");
        imprimirMatriz(ordenarDiagonales(matriz));

        // Ejercicio 3: Sumar los elementos de una matriz
        System.out.print("Ingrese el número de filas de la matriz de suma: ");
        int filasSuma = scanner.nextInt();
        System.out.print("Ingrese el número de columnas de la matriz de suma: ");
        int columnasSuma = scanner.nextInt();

        int[][] matrizSuma = new int[filasSuma][columnasSuma];
        System.out.println("Ingrese los valores de la matriz de suma: ");
        for (int i = 0; i < filasSuma; i++) {
            for (int j = 0; j < columnasSuma; j++) {
                matrizSuma[i][j] = scanner.nextInt();
            }
        }

        int sumaMatriz = calcularSumaMatriz(matrizSuma);
        System.out.println("La suma de todos los elementos de la matriz es: " + sumaMatriz);

        scanner.close();
    }

}
