
public class GenomicRangeQuery {
    public static void main(String[] args) {
        GenomicRangeQuery solution = new GenomicRangeQuery();

        // Test case 1
        String S1 = "CAGCCTA";
        int[] P1 = {2, 5, 0};
        int[] Q1 = {4, 5, 6};
        int[] result1 = solution.solution(S1, P1, Q1);

        // Print the result for Test case 1
        System.out.println("Result for Test Case 1:");
        for (int i : result1) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public int[] solution(String S, int[] P, int[] Q) {
        int N = S.length();
        int M = P.length;
        int[][] prefixSums = new int[4][N + 1];

        for (int i = 0; i < N; i++) {
            char nucleotide = S.charAt(i);
            for (int j = 0; j < 4; j++) {
                prefixSums[j][i + 1] = prefixSums[j][i];
            }
            if (nucleotide == 'A') prefixSums[0][i + 1]++;
            else if (nucleotide == 'C') prefixSums[1][i + 1]++;
            else if (nucleotide == 'G') prefixSums[2][i + 1]++;
            else if (nucleotide == 'T') prefixSums[3][i + 1]++;
        }

        int[] result = new int[M];
        for (int k = 0; k < M; k++) {
            for (int j = 0; j < 4; j++) {
                if (prefixSums[j][Q[k] + 1] - prefixSums[j][P[k]] > 0) {
                    result[k] = j + 1;
                    break;
                }
            }
        }
        return result;
    }
}
