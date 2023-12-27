public class MushroomPicker {

    public static int mushrooms(int[] A, int k, int m) {
        int n = A.length;
        int result = 0;
        int[] pref = prefixSums(A);

        for (int p = 0; p <= Math.min(m, k); p++) {
            int leftPos = k - p;
            int rightPos = Math.min(n - 1, Math.max(k, k + m - 2 * p));
            result = Math.max(result, countTotal(pref, leftPos, rightPos));
        }

        for (int p = 0; p < Math.min(m + 1, n - k); p++) {
            int rightPos = k + p;
            int leftPos = Math.max(0, Math.min(k, k - (m - 2 * p)));
            result = Math.max(result, countTotal(pref, leftPos, rightPos));
        }

        return result;
    }

    public static int[] prefixSums(int[] A) {
        int n = A.length;
        int[] prefix = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            prefix[i] = prefix[i - 1] + A[i - 1];
        }
        return prefix;
    }

    public static int countTotal(int[] pref, int leftPos, int rightPos) {
        return pref[rightPos + 1] - pref[leftPos];
    }

    public static void main(String[] args) {
        int[] mushroomsArray = {2, 3, 7, 5, 1, 3, 9};
        int k = 4;
        int m = 6;

        int maxMushrooms = mushrooms(mushroomsArray, k, m);
        System.out.println("Maximum mushrooms collected: " + maxMushrooms);
    }
}
