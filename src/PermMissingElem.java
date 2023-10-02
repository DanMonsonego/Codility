import java.awt.event.PaintEvent;

public class PermMissingElem {
    public int solution(int[] A){
        // using long to avoid integer overflow .
        long N = A.length;
        long total_sum = (N+1) * (N+2) /2; // sum of numbers that from 1 to N+1
        long curr_sum =0;
        for(int i=0;i<A.length;i++){
            curr_sum += A[i];
        }
        return (int)(total_sum-curr_sum);
    }

    public static void main(String[] args) {
        PermMissingElem sol = new PermMissingElem();
        int[] A= {2,3,1,5};
        int missingElement = sol.solution(A);
        System.out.println("The missing element is : " + missingElement);
    }

}
