package retosAprendizaje;
import java.util.Arrays;
public class retoAprendizaje1 {

    public static int linearSearch(int[] a, int t) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] a, int t) {
        int inicio = 0;
        int fin = a.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;

            if (a[medio] == t) {
                return medio;
            } else if (a[medio] < t) {
                inicio = medio + 1;
            } else {
                fin = medio - 1;
            }
        }

        return -1;
    }

    public static int jumpSearch(int[] a, int t) {
        int n = a.length;

        if (n == 0) {
            return -1;
        }

        int salto = (int) Math.sqrt(n);
        int inicio = 0;
        int fin = salto;

        while (inicio < n && a[Math.min(fin, n) - 1] < t) {
            inicio = fin;
            fin += salto;

            if (inicio >= n) {
                return -1;
            }
        }


        for (int i = inicio; i < Math.min(fin, n); i++) {
            if (a[i] == t) {
                return i;
            }

            if (a[i] > t) {
                return -1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] tamanos = {
                1_000,
                10_000,
                100_000,
                1_000_000,
                5_000_000
        };

        for (int n : tamanos) {

            int[] numeros = new int[n];

            for (int i = 0; i < n; i++) {
                numeros[i] = i;
            }

            int objetivo = numeros[n - 1];


            for (int i = 0; i < 5; i++) {
                linearSearch(numeros, objetivo);
                binarySearch(numeros, objetivo);
                jumpSearch(numeros, objetivo);
            }

            long inicio;
            long tiempoLinear = 0;
            long tiempoBinary = 0;
            long tiempoJump = 0;

            int corridas = 10;

            for (int i = 0; i < corridas; i++) {

                inicio = System.nanoTime();
                linearSearch(numeros, objetivo);
                tiempoLinear += System.nanoTime() - inicio;

                inicio = System.nanoTime();
                binarySearch(numeros, objetivo);
                tiempoBinary += System.nanoTime() - inicio;

                inicio = System.nanoTime();
                jumpSearch(numeros, objetivo);
                tiempoJump += System.nanoTime() - inicio;
            }

            double promedioLinear =
                    tiempoLinear / (double) corridas / 1_000_000;

            double promedioBinary =
                    tiempoBinary / (double) corridas / 1_000_000;

            double promedioJump =
                    tiempoJump / (double) corridas / 1_000_000;

            System.out.println("\nElementos: " + n);
            System.out.println("Objetivo: " + objetivo);

            System.out.printf("Linear Search: %.6f ms%n", promedioLinear);
            System.out.printf("Binary Search: %.6f ms%n", promedioBinary);
            System.out.printf("Jump Search: %.6f ms%n", promedioJump);

            if (linearSearch(numeros, objetivo) != objetivo
                    || binarySearch(numeros, objetivo) != objetivo
                    || jumpSearch(numeros, objetivo) != objetivo) {

                System.out.println("ERROR: los algoritmos no coinciden.");
            } else {
                System.out.println("Verificación: correcta.");
            }
        }
    }
}
