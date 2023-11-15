public class PassingCars {
    public int solution(int[] A){
        final int LIMIT = 1_000_000_000;
        int eastCars = 0;
        int totalCars = 0;
        for(int car : A ){
            if(car == 0){
                eastCars +=1;
            }else if(car == 1){
                totalCars += eastCars;
                if(totalCars > LIMIT){
                    return -1;
                }
            }
        }
        return totalCars;
    }

    public static void main(String[] args) {
        PassingCars sol = new PassingCars();
        // test Case 1
        int[] array1 = {0,1,0,1,1};
        System.out.println("Number of passing cars: " + sol.solution(array1));
    }
}
