
public class FrogRiverOne {
    public int solution(int X, int[] A){
        // Array to keep the position are covered
        boolean[] positionAreCovered = new boolean[X];
        int totalPosition =0;
        for(int i=0;i<A.length;i++){
            // if the place not covered yet
            if(!positionAreCovered[ A[i]-1 ]){
                positionAreCovered[A[i]-1]=true;
                totalPosition++;
            }
            // if all covered return the time
            if(totalPosition == X){
                return i;
            }
        }
        // If not all positions get covered, return -1
        return -1;
    }
    public static void main(String[] args) {
        // Create an instance of the Solution class
        FrogRiverOne solution = new FrogRiverOne();

        // Define the input values
        int X = 5;
        int[] A = {1, 3, 1, 4, 2, 3, 5, 4};

        // Call the solution method and print the result
        int result = solution.solution(X, A);
        System.out.println(result);  // Output: 6
    }
}
