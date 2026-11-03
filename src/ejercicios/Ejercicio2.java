package ejercicios;

public class Ejercicio2 {

    public static int count(int[] a, int t) {

        int contador = 0;

        for (int i = 0; i < a.length; i++) {

            if (a[i] == t) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        int[] numeros = {5, 2, 5, 8, 5, 3, 2};

        System.out.println(count(numeros, 5)); // 3
        System.out.println(count(numeros, 2)); // 2
        System.out.println(count(numeros, 8)); // 1
        System.out.println(count(numeros, 10)); // 0
    }
}