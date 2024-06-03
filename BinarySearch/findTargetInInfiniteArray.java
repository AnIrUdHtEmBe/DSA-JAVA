package BinarySearch;

//find target in an infinite array whose size is unknown
// Basically doing binary search without knowing/using the size of the array
public class findTargetInInfiniteArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5,8,9,11,23,25,26,28,33,390,790,990,1290,1390};
        int target = 390;
        System.out.println(findSearchingRangeOfArray(arr, target));

    }
    static int findSearchingRangeOfArray(int[] arr , int target){

        int start = 0;
        int end = 1;

        // now find new start and end 
        while(target > arr[end]){
            int newStart = end + 1;

            /*as we do not know the size of the array(infinite) we search target in bits of the array increasing the index of start 
            and end exponentially eventually searching the target in log(N) time complexity. array.length(); function should not be
            to find index of End*/
            end = end + (end-start+1)*2;

            start = newStart;

        }
        return bSearch(arr , target , start , end);
    }

    static int bSearch(int[] arr , int target , int start , int end){

        while(start <=end ){
            int mid = start + (end-start)/2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start =mid +1;
            }
            else{
                return mid;
            }

        }
        return -1;
    }
}
