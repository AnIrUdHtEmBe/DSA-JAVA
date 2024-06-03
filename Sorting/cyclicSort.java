package Sorting;

import java.util.Arrays;

public class cyclicSort {
    public static void main(String[] args) {
        int [] arr = {4,1,3,2,5};
       check(arr);
       System.out.println(Arrays.toString(arr));
    }
    static void check(int[] arr){
        int i = 0;
        
        while(i < arr.length){
            int correctIndex = arr[i]-1;
            if(arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr , int first , int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;

    }
}
