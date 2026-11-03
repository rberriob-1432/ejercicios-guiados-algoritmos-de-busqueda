package ejercicios;

public class Ejercicio1 {

    public static int Ejercicio1(int[] a, int t) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == t) {
                return i;
            }
        }

        return -1;
    }

    public static boolean contains(int[] a, int t) {
        return Ejercicio1(a, t) != -1;
    }

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println(contains(numeros, 30));
        System.out.println(contains(numeros, 60));
    }
}