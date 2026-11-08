package retosAprendizaje;

import java.util.logging.Logger;

public class retoAprendizaje3 {

    private static final Logger LOGGER =
            Logger.getLogger(retoAprendizaje3.class.getName());

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

    public static int linearSearch(int[] a, int t) {

        for (int i = 0; i < a.length; i++) {

            if (a[i] == t) {
                return i;
            }
        }

        return -1;
    }

    public static boolean isSorted(int[] a) {

        for (int i = 1; i < a.length; i++) {

            if (a[i] < a[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static boolean resultadoValido(int[] a, int t, int resultado) {

        if (resultado == -1) {
            return true;
        }

        return resultado >= 0
                && resultado < a.length
                && a[resultado] == t;
    }

    public static int safeSearch(int[] a, int t) {

        if (a == null) {
            LOGGER.warning("Arreglo nulo. Búsqueda cancelada.");
            return -1;
        }


        int resultado = binarySearch(a, t);


        boolean ordenado = isSorted(a);
        boolean valido = resultadoValido(a, t, resultado);

        if (ordenado && valido) {

            LOGGER.info("Búsqueda binaria completada correctamente.");

            return resultado;
        }


        LOGGER.warning(
                "No se puede confiar en la búsqueda binaria. "
                        + "Activando búsqueda lineal."
        );

        return linearSearch(a, t);
    }

    public static void main(String[] args) {

        int[] ordenado = {
                10, 20, 30, 40, 50, 60
        };

        int[] casiOrdenado = {
                10, 20, 50, 40, 60, 70
        };

        int objetivo = 50;

        System.out.println("=== ARREGLO ORDENADO ===");

        int resultado1 = safeSearch(ordenado, objetivo);

        System.out.println("Resultado: " + resultado1);

        System.out.println("\n=== ARREGLO CASI ORDENADO ===");

        int resultado2 = safeSearch(casiOrdenado, objetivo);

        System.out.println("Resultado: " + resultado2);
    }
}
