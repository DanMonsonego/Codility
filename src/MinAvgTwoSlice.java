public class MinAvgTwoSlice {
    public int solution(int[] A) {
        int minStartIndex = 0;
        double minAvg = (A[0] + A[1]) / 2.0; // Using 2.0 to ensure double division

        for (int i = 0; i < A.length - 2; i++) {
            double avgTwo = (A[i] + A[i + 1]) / 2.0;
            double avgThree = (A[i] + A[i + 1] + A[i + 2]) / 3.0;

            double currentMin = Math.min(avgTwo, avgThree);
            if (currentMin < minAvg) {
                minAvg = currentMin;
                minStartIndex = i;
            }
        }

        double avgLastTwo = (A[A.length - 2] + A[A.length - 1]) / 2.0;
        if (avgLastTwo < minAvg) {
            minAvg = avgLastTwo;
            minStartIndex = A.length - 2;
        }

        return minStartIndex;
    }

    public static void main(String[] args) {
        MinAvgTwoSlice solution = new MinAvgTwoSlice();

        int[] A = { 4, 2, 2, 5, 1, 5, 8 };
        int startIndex = solution.solution(A);
        System.out.println("The min index is: " + startIndex);
    }
}
