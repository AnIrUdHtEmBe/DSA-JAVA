package BinarySearch;

//binary search in rotated array
public class bSInRotatedArray {
    public static void main(String[] args) {
        int [] arr = {4,5,6,7,0,1,2};
        System.out.println(search(arr, 7));

    }
    /*  first find pivot
    --- pivot is the element from which a new series of sorted array begins
    --- after finding pivot search target in range of pivot accordingly*/ 

    static int search(int[] arr, int target){
        int pivot = findPivot(arr);

        if(arr[pivot] == target){
            return pivot;
        }

        if(pivot == -1){
            bsearch(arr, target, 0 ,arr.length-1);
        }

        if(target >= arr[0]){
            bsearch(arr, target, 0, pivot-1);
        }
        
        return bsearch(arr, target, pivot+1, arr.length-1);
        
        
    }

    static int bsearch(int[] ani , int target,int start,int end){
        
      
        while(start <= end){
            int mid = start + (end -start)/2;

            if(target < ani[mid]){
                end = mid-1;
            }
            else if(target > ani[mid]){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(mid<end && arr[mid] > arr[mid+1]){
                return mid;
            }
            else if(mid > start && arr[mid] < arr[mid-1]){
                return mid-1;
            }
            else if(arr[mid] <= arr[start]){
                end = mid-1;

            }
            else /*if(arr[mid] >= arr[start])*/ {
                start = mid+1;
            }
        }
        return -1;
    }
}
