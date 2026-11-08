package ejercicios;

import java.util.Arrays;

public class Ejercicio9 {

    public static int[] mapTo2D(int indice, int columnas) {
        int fila = indice / columnas;
        int columna = indice % columnas;

        return new int[]{fila, columna};
    }


    public static int lowerBound(int[][] matriz, int t) {

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int lo = 0;
        int hi = filas * columnas;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            int valor = matriz[mid / columnas][mid % columnas];

            if (valor < t) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lo;
    }

    public static int[][] searchRange(int[][] matriz, int t) {

        if (matriz == null || matriz.length == 0 ||
                matriz[0] == null || matriz[0].length == 0) {
            return new int[][]{{-1, -1}, {-1, -1}};
        }

        int filas = matriz.length;
        int columnas = matriz[0].length;
        int total = filas * columnas;

        int primero = lowerBound(matriz, t);

        if (primero == total ||
                matriz[primero / columnas][primero % columnas] != t) {
            return new int[][]{{-1, -1}, {-1, -1}};
        }
        int lo = primero;
        int hi = total;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            int valor = matriz[mid / columnas][mid % columnas];

            if (valor <= t) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        int ultimo = lo - 1;

        return new int[][]{
                mapTo2D(primero, columnas),
                mapTo2D(ultimo, columnas)
        };
    }

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 3},
                {3, 3, 4, 5},
                {5, 6, 7, 8}
        };

        int[][] resultado = searchRange(matriz, 3);

        System.out.println("Primera posición: " +
                Arrays.toString(resultado[0]));

        System.out.println("Última posición: " +
                Arrays.toString(resultado[1]));
    }
}