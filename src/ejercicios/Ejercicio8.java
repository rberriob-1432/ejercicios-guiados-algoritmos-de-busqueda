package ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Ejercicio8 {

    public static List<int[]> staircaseSearch(int[][] matriz, int t) {

        List<int[]> posiciones = new ArrayList<>();

        if (matriz == null || matriz.length == 0 ||
                matriz[0] == null || matriz[0].length == 0) {
            return posiciones;
        }

        int filas = matriz.length;
        int columnas = matriz[0].length;

        int i = 0;
        int j = columnas - 1;

        while (i < filas && j >= 0) {

            if (matriz[i][j] == t) {

                // Buscar todas las apariciones de t en esta fila
                int columna = j;

                while (columna >= 0 && matriz[i][columna] == t) {
                    posiciones.add(new int[]{i, columna});
                    columna--;
                }

                i++;

            } else if (matriz[i][j] > t) {

                j--;

            } else {

                i++;
            }
        }

        return posiciones;
    }

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 2, 4},
                {2, 2, 3, 5},
                {2, 3, 4, 6},
                {3, 4, 5, 7}
        };

        List<int[]> resultado = staircaseSearch(matriz, 2);

        for (int[] posicion : resultado) {
            System.out.println(
                    "Fila: " + posicion[0] +
                            ", Columna: " + posicion[1]
            );
        }
    }
}