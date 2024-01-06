import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Distinct {
    public int solution(int[] A){
        Set<Integer> distinctValues = new HashSet<>();
        for (int value : A){
            distinctValues.add(value);
        }

        return distinctValues.size();
    }

    public static void main(String[] args) {
        Distinct solution = new Distinct();
        int[] A = {2, 1, 1, 2, 3, 1};

        System.out.println(solution.solution(A));
    }
}
