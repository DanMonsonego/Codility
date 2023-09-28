
public class BinaryGap {
    public int solution(int N){
        int maxGap=0;
        int currGap=-1;
        while(N>0){
            // Check if the rightmost bit of N is 1 using bitwise AND (&)
            if((N & 1)==1){
                maxGap = Math.max(maxGap,currGap);
                currGap=0;
            }else if((N&1)==0){
                currGap++;
            }
            // Right-shift N by one bit using >>= to process the next bit
            N >>= 1;
        }
        return  maxGap;
    }

    public static void main(String[] args) {
        BinaryGap sol = new BinaryGap();
        int result1 = sol.solution(1041); // Expected output: 5
        int result2 = sol.solution(32);   // Expected output: 0

        System.out.println("Result 1 : "+ result1);
        System.out.println("Result 2 : "+ result2);
    }
}

