import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public int solution(int[] A) {
        // Create a set to store unique elements of the array
        Set<Integer> uniqueElements = new HashSet<>();

        // Loop through the array and add elements to the set
        for (int number : A) {
            // Also check if the number is within the range 1 to N
            if (number < 1 || number > A.length) {
                return 0;  // Not a permutation if out of range
            }
            uniqueElements.add(number);
        }

        // checks for duplicate numbers and ensures all numbers from 1 to N are present
        if (uniqueElements.size() == A.length) {
            return 1;  // It's a permutation
        } else {
            return 0;  // Not a permutation
        }
    }
    public static void main(String[] args) {
        PermCheck solution = new PermCheck();

        int[] A1 = {4, 1, 3, 2};
        System.out.println(solution.solution(A1));  // Output: 1

        int[] A2 = {4, 1, 3};
        System.out.println(solution.solution(A2));  // Output: 0
    }
}
