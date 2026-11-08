package ejercicios;

public class Ejercicio5 {

    public static int binarySearchOrInsertionPoint(int[] sorted, int t) {

        int lo = 0;
        int hi = sorted.length - 1;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            if (sorted[mid] == t) {
                return mid;
            }

            if (sorted[mid] < t) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return -lo - 1;
    }

    public static void main(String[] args) {

        int[] numeros = {10, 20, 30, 40, 50, 60};

        System.out.println(binarySearchOrInsertionPoint(numeros, 30)); // 2
        System.out.println(binarySearchOrInsertionPoint(numeros, 25)); // -3
        System.out.println(binarySearchOrInsertionPoint(numeros, 70)); // -7
        System.out.println(binarySearchOrInsertionPoint(numeros, 5));  // -1
    }
}