package Sorting;

public class smallestMissingPositiveNum {
    public static void main(String[] args) {
        int[] arr={1,2,0};
        System.out.println(search(arr));

        
    }
    static int search(int [] arr){
        int i =0;
        while(i<arr.length){
            int correctIndex = arr[i] ;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]){
                swap(arr , i , correctIndex);
            }
            else{
                i++;
            }

        }
        for (int j = 0; j < arr.length; j++) {
            
                if(arr[j] != j){
                    return j;
                }
            
            
        }
        return arr.length ;
    }
    static void swap(int[] arr , int index , int correct){
        int temp = arr[index];
        arr[index] = arr[correct];
        arr[correct] = temp;
    }
}
