

public class OddOccurrencesInArray {
    public int solution(int[] A){
        int res = 0;
        // My solution include the XOR operation for each element
        for(int num : A){
            res ^= num;
        }
        // res will hold the unpaired element
        return res;
    }

    public static void main(String[] args) {
        OddOccurrencesInArray solution = new OddOccurrencesInArray();

        // Example usage
        int[] exampleArray = {9, 3, 9, 3, 9, 7, 9};
        int unpairedElement = solution.solution(exampleArray);
        System.out.println("Unpaired Element: " + unpairedElement);
    }
}
