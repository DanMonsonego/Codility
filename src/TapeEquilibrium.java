public class TapeEquilibrium {
    public int solution(int[] A) {
        long leftSum = 0, rightSum = 0;
        for (int i : A) rightSum += i;  // calculate the total sum first

        long minDiff = Long.MAX_VALUE;
        for (int P = 1; P < A.length; P++) {
            leftSum += A[P - 1];
            rightSum -= A[P - 1];
            long diff = leftSum - rightSum;
            // Manual absolute value calculation
            if (diff < 0) diff = -diff;
            // Manual minimum calculation
            if (diff < minDiff) minDiff = diff;
        }

        return (int) minDiff;
    }

    public static void main(String[] args) {
        TapeEquilibrium sol = new TapeEquilibrium();
        int[] A = {3, 1, 2, 4, 3};
        int result = sol.solution(A);
        System.out.println("The min dif is "+result);  // Output: 1
    }

}
