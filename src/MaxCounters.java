
public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] counters = new int[N];  // Initialize all counters to 0
        int maxCounter = 0;  // For keeping track of the maximum counter value
        int lastUpdate = 0;  // For keeping track of the last maxCounter operation

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                // increase(X) operation
                int index = A[i] - 1;
                if (counters[index] < lastUpdate) {
                    // This counter hasn't been updated since the last maxCounter operation, update it now
                    counters[index] = lastUpdate + 1;
                } else {
                    // This counter has been updated since the last maxCounter operation, increment it
                    counters[index]++;
                }
                // Update maxCounter if necessary
                if (counters[index] > maxCounter) {
                    maxCounter = counters[index];
                }
            } else if (A[i] == N + 1) {
                // maxCounter operation
                lastUpdate = maxCounter;
            }
        }

        // Ensure all counters are updated to at least the lastUpdate value
        for (int i = 0; i < N; i++) {
            if (counters[i] < lastUpdate) {
                counters[i] = lastUpdate;
            }
        }

        return counters;
    }

    public static void main(String[] args) {
        // Create an instance of the Solution class
        MaxCounters solution = new MaxCounters();

        // Define the inputs
        int N = 5;
        int[] A = {3, 4, 4, 6, 1, 4, 4};

        // Call the solution method and print the result
        int[] result = solution.solution(N, A);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}
