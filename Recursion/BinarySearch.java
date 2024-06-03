package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8};
        int target = 8;
        int start = 0;
        int end = arr.length -1;
        System.out.println(Bsearch( arr ,  target ,  start ,  end));
        
    }
    static int Bsearch(int[] arr , int target , int start, int end){
        if ( start > end){
            return -1;
        }
        int mid = start + (end -start)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(target < arr[mid]){
            return Bsearch(arr, target, start, mid -1);
        }
        
        return Bsearch(arr, target, mid + 1, end);
        
    }
}
