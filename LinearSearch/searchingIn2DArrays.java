package LinearSearch;

import java.util.Arrays;

public class searchingIn2DArrays {
    public static void main(String[] args) {
        int [][] arr = {
            {1,2,3,4},
            {5,6,7},
            {8,9}

        };
        int target = 7;
        int[] ans = search(arr,target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] ani, int target){
        if(ani.length == 0){
            return new int[]{-1,1};
        }
        for (int row = 0; row < ani.length; row++) {
            for (int col = 0; col < ani[row].length; col++) {
                if(ani[row][col] == target){
                    return new int[] {row , col};
                }
            }
        }
        return new int[]{-1,1};


    }
    
}
