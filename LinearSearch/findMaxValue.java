package LinearSearch;

public class findMaxValue {
    public static void main(String[] args) {
        int[][] arr ={
            {2,390,4},
            {1,2,3,5}
        };
        System.out.println(maxValue(arr));
    }
    
    static int maxValue(int[][]arr){
        int max = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] >max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}
