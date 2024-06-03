package BinarySearch;

public class searchInMountain {
    public static void main(String[] args) {
        int [] arr = {1,2,4,5,4,3,2,1};
        int target = 5;
        System.out.println(searchinMountain(arr, target));
    }
    static int searchinMountain(int [] arr , int target){
        int peak = searchMountain(arr);
        int firstTry = searchOABS(arr, target , 0 , peak );
        if(firstTry!=-1){
            return firstTry;
        }
        else{
            return searchOABS(arr, target, peak+1 , arr.length-1);
        }
    }

    static int searchOABS(int[] ani , int target,int start , int end){

    
        boolean isAscending = ani[start] < ani[end];
        
        
        while(start <= end){
            int mid = start + (end -start)/2;

            if(isAscending){
      
           

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
        
            else{
            
           
                if(target > ani[mid]){
                    end = mid-1;
                }
                else if(target < ani[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
    }
    return -1;
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
    return start;
}
}

