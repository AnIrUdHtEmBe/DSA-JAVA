package BinarySearch;

import java.util.Arrays;

public class bSearchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };
        int target = 90;
        System.out.println(Arrays.toString(search(arr,target)));

    }
    static int[] search(int[][] matrix , int target){
        int row = 0;
        int col = matrix.length-1;
      

        while(row < matrix.length && col >0){
            if (matrix[row][col] == target){
                return new int[] {row,col};
            }
            else if(matrix[row][col] > target){
                col-- ;
            }
            else {
                row++;
            }
        }
        return new int[] {-1,-1};
    }
}
