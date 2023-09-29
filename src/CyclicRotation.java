public class CyclicRotation {
    public int[] solution(int[] A, int K ){
        int N = A.length;
        if(N==0){
            return A;
        }
        int[] rotatedArray = new int[N];
        //Copy the elements after rotation to new Array.
        System.arraycopy(A,N-K,rotatedArray,0,K);
        // Copy the elements before rotation to new array
        System.arraycopy(A,0,rotatedArray,K,N-K);

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
