package ejercicios;

public class Ejercicio6 {

    public static int lowerBound(int[] a, int t) {

        int lo = 0;
        int hi = a.length;

        while (lo < hi) {

            int mid = lo + (hi - lo) / 2;

            if (a[mid] < t) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }

        return lo;
    }

    // Encuentra la primera ocurrencia
    public static int firstIndexOfSorted(int[] a, int t) {

        int lb = lowerBound(a, t);

        if (lb < a.length && a[lb] == t) {
            return lb;
        }

        return -1;
    }


    public static int lastIndexOfSorted(int[] a, int t) {

        int lb = lowerBound(a, t);

        if (lb == a.length || a[lb] != t) {
            return -1;
        }

        int siguiente = lowerBound(a, t + 1);

        return siguiente - 1;
    }

    public static void main(String[] args) {

        int[] numeros = {1, 2, 2, 2, 3, 4, 4, 5};

        System.out.println(firstIndexOfSorted(numeros, 2)); // 1
        System.out.println(lastIndexOfSorted(numeros, 2));  // 3

        System.out.println(firstIndexOfSorted(numeros, 4)); // 5
        System.out.println(lastIndexOfSorted(numeros, 4));  // 6

        System.out.println(firstIndexOfSorted(numeros, 8)); // -1
        System.out.println(lastIndexOfSorted(numeros, 8));  // -1
    }
}