package retosAprendizaje;


public class retoAprendizaje2 {

    public static int binarySearch(int[] a, int t, int inicio, int fin) {

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

    public static int exponentialSearch(int[] a, int t) {

        int n = a.length;

        if (n == 0) {
            return -1;
        }

        if (a[0] == t) {
            return 0;
        }

        int limite = 1;

        while (limite < n && a[limite] < t) {

            if (limite > n / 2) {
                limite = n;
            } else {
                limite *= 2;
            }
        }

        return binarySearch(
                a,
                t,
                limite / 2,
                Math.min(limite, n - 1)
        );
    }

    public static void main(String[] args) {

        int[] numeros = {
                10, 20, 30, 40, 50,
                60, 70, 80, 90, 100
        };

        int[] objetivos = {
                10, 30, 70, 100, 45, 120
        };

        for (int objetivo : objetivos) {

            int resultado = exponentialSearch(numeros, objetivo);

            if (resultado != -1) {
                System.out.println(
                        "Elemento " + objetivo +
                                " encontrado en el índice " + resultado
                );
            } else {
                System.out.println(
                        "Elemento " + objetivo + " no encontrado"
                );
            }
        }
    }
}
