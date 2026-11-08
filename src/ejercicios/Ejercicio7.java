package ejercicios;

public class Ejercicio7 {

    public static int linearSearch2D(int[][] matriz, int t) {

        int contador = 0;

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[i].length; j++) {

                if (matriz[i][j] == t) {
                    contador++;
                }
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        int[][] matriz = {
                {5, 2, 8},
                {5, 3, 5},
                {1, 5, 9}
        };

        System.out.println(linearSearch2D(matriz, 5));
        System.out.println(linearSearch2D(matriz, 2));
        System.out.println(linearSearch2D(matriz, 7));
    }
}