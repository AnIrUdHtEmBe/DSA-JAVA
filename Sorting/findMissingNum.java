package Sorting;

//To find a missing number in an array of range (0,n)
//If the number missing is N (length of array itself) return length;

public class findMissingNum {
    public static void main(String[] args) {
        int[] arr = {4,0,2,1,5};
        System.out.println(search(arr));
        
    }
    static int search(int[] arr){
        int i =0;
        while(i < arr.length){
            int correctIndex = arr[i];//correctIndex is taken as arr[i] instead of arr[i] - 1 because array elements starts from 0. 
            if(arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr,i,correctIndex);
            }
            else{
                i++;
            }
        }
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        
        }
        
        return arr.length;
    }
    static void swap(int[] arr , int j , int correct){
        int temp = arr[j];
        arr[j] = arr[correct];
        arr[correct] = temp;
    }
}
