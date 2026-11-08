package ejercicios;

public class Ejercicio4 {

    public static int argMin(int[] a) {

        if (a.length == 0) {
            return -1;
        }

        int indiceMinimo = 0;

        for (int i = 1; i < a.length; i++) {

            if (a[i] < a[indiceMinimo]) {
                indiceMinimo = i;
            }
        }

        return indiceMinimo;
    }

    public static void main(String[] args) {

        int[] numeros = {8, 3, 12, 1, 7, 5};

        System.out.println(argMin(numeros)); // 3
    }
}