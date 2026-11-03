package ejercicios;

import java.util.Arrays;

public class Ejercicio3 {

    public static int[] removeFirst(int[] a, int t) {

        int indice = -1;


        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                indice = i;
                break;
            }
        }


        if (indice == -1) {
            return Arrays.copyOf(a, a.length);
        }


        int[] nuevo = new int[a.length - 1];

        System.arraycopy(a, 0, nuevo, 0, indice);


        System.arraycopy(
                a, indice + 1,
                nuevo, indice,
                a.length - indice - 1
        );

        return nuevo;
    }

    public static void main(String[] args) {

        int[] numeros = {5, 2, 5, 8, 5, 3};

        int[] resultado = removeFirst(numeros, 5);

        System.out.println(Arrays.toString(resultado));
    }
}