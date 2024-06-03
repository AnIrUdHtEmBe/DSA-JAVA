// int[][] wealth = {
//     {1,2,3},  -- wealth of person 1
//     {12,3},   -- wealth of person 2
//     {1,3,10}  -- wealth of person 3
// };
// Find richest person by adding their wealth and find maxwealth.


package LinearSearch;

public class maxWealthLeetCode {
    public static void main(String[] args) {
        int[][] wealth = {
            {1,2,3},
            {12,3},
            {1,3,10}
        };
        System.out.println(wealth(wealth));
    }
    static int wealth(int[][] ani){
        int max = 0;
        for (int row = 0; row < ani.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < ani[row].length; col++) {
                rowSum += ani[row][col]; 
            }
            
            if(rowSum > max){
                max = rowSum;
            }
        }
        return max;
    }
}
