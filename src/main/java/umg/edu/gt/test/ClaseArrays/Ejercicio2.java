package umg.edu.gt.test.ClaseArrays;


import java.util.*;

public class Ejercicio2 {
    public static int[][] ordenarDiagonales(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        Map<Integer, PriorityQueue<Integer>> diagonales = new HashMap<>();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                diagonales.putIfAbsent(i - j, new PriorityQueue<>());
                diagonales.get(i - j).add(mat[i][j]);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = diagonales.get(i - j).poll();
            }
        }
        return mat;
    }


}
