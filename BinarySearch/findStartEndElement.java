package BinarySearch;

import java.util.Arrays;

public class findStartEndElement {
    public static void main(String[] args) {
       
        int[] arr = {5,6,7,7,7,7,8,8,8,9,10};
        int target = 7;
        int[] solution = searchRange(arr , target);
        System.out.println(Arrays.toString(solution));
        
    }

    static  int[] searchRange(int[] ani , int target){
        int[] ans = {-1,1}; 
        int start = searchNums(ani, target, true);
        int end = searchNums(ani, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int searchNums(int[] ani , int target , boolean findStartIndex){

        int ans = -1;
        int start = 0;
        int end = ani.length-1;
        
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target < ani[mid]){
                end = mid - 1;
            }
            else if(target > ani[mid]){
                start = mid + 1;
            }
            else {
                //potential answer might be found
                ans = mid;
                if(findStartIndex){
                    end = mid -1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
    
    
}
