package LinearSearch;

import java .util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,36,38,949,8,389,287,23};
        int target =sc.nextInt();    
        int ans = search(nums , target);
        System.out.println(ans);
        sc.close();
    }
    static int search(int[] arr, int value) {
        if(arr.length == 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == value){
                return i;
            }


        }
        return -1;
    }
}
