package ejercicios;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio10 {

    private static final int TAMANO = 5_000_000;
    private static final int CORRIDAS = 10;
    private static final int CALENTAMIENTO = 5;
    private static volatile int resultadoGlobal;

    public static int linearSearch(int[] a, int t) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearchIter(int[] a, int t) {

        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (a[mid] == t) {
                return mid;
            }

            if (a[mid] < t) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] numeros = new int[TAMANO];

        for (int i = 0; i < TAMANO; i++) {
            numeros[i] = i;
        }


        Random random = new Random(42);

        for (int i = numeros.length - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            int temporal = numeros[i];
            numeros[i] = numeros[j];
            numeros[j] = temporal;
        }


        Arrays.sort(numeros);

        int objetivo = numeros[TAMANO - 1];

        System.out.println("Elementos: " + TAMANO);
        System.out.println("Objetivo: " + objetivo);

        System.out.println("\nCalentando JVM...");

        for (int i = 0; i < CALENTAMIENTO; i++) {

            resultadoGlobal = linearSearch(numeros, objetivo);
            resultadoGlobal = binarySearchIter(numeros, objetivo);
        }

        System.out.println("Calentamiento finalizado.");
        long tiempoLinearTotal = 0;
        long tiempoBinaryTotal = 0;

        System.out.println("\n--- MEDICIONES ---");

        for (int i = 0; i < CORRIDAS; i++) {


            long inicioLinear = System.nanoTime();

            resultadoGlobal = linearSearch(numeros, objetivo);

            long finLinear = System.nanoTime();

            long tiempoLinear = finLinear - inicioLinear;

            long inicioBinary = System.nanoTime();

            resultadoGlobal = binarySearchIter(numeros, objetivo);

            long finBinary = System.nanoTime();

            long tiempoBinary = finBinary - inicioBinary;

            tiempoLinearTotal += tiempoLinear;
            tiempoBinaryTotal += tiempoBinary;

            System.out.println(
                    "Corrida " + (i + 1) +
                            " | Linear: " + tiempoLinear / 1_000_000.0 + " ms" +
                            " | Binary: " + tiempoBinary / 1_000_000.0 + " ms"
            );
        }


        double promedioLinear =
                tiempoLinearTotal / (double) CORRIDAS;

        double promedioBinary =
                tiempoBinaryTotal / (double) CORRIDAS;

        System.out.println("\n--- RESULTADOS FINALES ---");

        System.out.println(
                "Promedio Linear Search: " +
                        promedioLinear / 1_000_000.0 + " ms"
        );

        System.out.println(
                "Promedio Binary Search: " +
                        promedioBinary / 1_000_000.0 + " ms"
        );

        System.out.println(
                "Linear / Binary: " +
                        promedioLinear / promedioBinary + " veces"
        );

        System.out.println(
                "Resultado encontrado: " + resultadoGlobal
        );
    }
}
