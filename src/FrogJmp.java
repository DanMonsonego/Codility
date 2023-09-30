
public class FrogJmp {
    public int solution(int X, int Y, int D){
        return (int)Math.ceil((double) (Y-X)/D );
    }
        // 2nd solution withour java Math class .
        //        int distance = Y-X;
/*        int jumps = distance/D;
//        if((distance % D) != 0){
            jumps++;
        }
        return jumps;

 */
        public static void main(String[] args) {
            FrogJmp sol = new FrogJmp();
            int X=10,Y=82,D=30;
            int res= sol.solution(X,Y,D);
            System.out.println("Number of min Jumps : " + res);
        }
}

// other main for get parameters from user :
/*    Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting position (X): ");
        int X = scanner.nextInt();

        System.out.print("Enter the target position (Y): ");
        int Y = scanner.nextInt();

        System.out.print("Enter the jump distance (D): ");
        int D = scanner.nextInt();

        Solution solution = new Solution();
        int result = solution.solution(X, Y, D);
        System.out.println("Number of jumps required: " + result);

        scanner.close();
*/