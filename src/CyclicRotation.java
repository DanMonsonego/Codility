
public class CyclicRotation {
    public int[] solution(int[] A, int K ){
        int N = A.length;
        if(N==0){
            return A;
        }
        int[] rotatedArray = new int[N];
        K = K%N;
        for(int i=0;i<N;i++){
            int newPos = (i+K) % N;
            rotatedArray[newPos]=A[i];
        }
        return rotatedArray;
    }

    public static void main(String[] args) {
        CyclicRotation sol = new CyclicRotation();
        int[] ex1 = {3,8,9,7,6};
        int k = 3;
        int[] result = sol.solution(ex1,k);
        System.out.println("Example 1 :");
        for (int num : result) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
