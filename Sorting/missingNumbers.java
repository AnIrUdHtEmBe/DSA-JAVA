package Sorting;

import java.util.Arrays;

// To find missing  and duplicate numbers in an array of range(1,n)
public class missingNumbers {
    public static void main(String[] args) {
        int[] arr = {2,1,3,3,5,4};
        System.out.println("The index at which there is a duplicate number is "+Arrays.toString(search(arr)));
        
    }
    static int[] search(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correctIndex = arr[i] -1;
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
            }
            else{
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if(arr[j] != j+1 ){
                return new int[]{j};
            }
        }
        return new int[]{0};
    }
    static void swap(int[] arr , int index , int correctIndex){
        int temp = arr[index];
        arr[index] = arr[correctIndex];
        arr[correctIndex] = temp;
    }
}
