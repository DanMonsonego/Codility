import java.util.*;

public class MissingInteger {
   public int solution(int[] A){
       Set<Integer> numbers = new HashSet<>();
       for(int number: A){
           if (number > 0){
               numbers.add(number);
           }
       }
       int smallNumber = 1;
       while (numbers.contains(smallNumber)) {
           smallNumber++;
       }

       return smallNumber;
   }

    public static void main(String[] args) {
            MissingInteger sol = new MissingInteger();

            // Test Case 1
            int[] array1 = {1, 3, 6, 4, 1, 2};
            System.out.println("Smallest missing integer in {1, 3, 6, 4, 1, 2}: " + sol.solution(array1));

            // Test Case 2
            int[] array2 = {1, 2, 3};
            System.out.println("Smallest missing integer in {1, 2, 3}: " + sol.solution(array2));

            // Test Case 3
            int[] array3 = {-1, -3};
            System.out.println("Smallest missing integer in {-1, -3}: " + sol.solution(array3));
   }
}
