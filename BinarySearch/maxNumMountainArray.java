package BinarySearch;

//to find the Max number in an mountain/bi-tonic array.
public class maxNumMountainArray {
    public static void main(String[] args) {
        int [] arr={1,3,4,6,390,4,3,2,1};
        System.out.println(searchMountain(arr));
    }
    static int searchMountain(int[] arr){
        
        int start=0;
        int end = arr.length-1;
        while(start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] > arr[mid+1]){
                //we are in the descending part of the array
                end = mid;
            }
            else if(arr[mid] < arr[mid+1]){
                //we are in the ascending part of the array
                start = mid+1;
            }
           
           
        }
        // final ans is found when start == equal.
        //return start or end both are equal.
        return arr[start];
    } 
    
}
