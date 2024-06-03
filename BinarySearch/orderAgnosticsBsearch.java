package BinarySearch;

public class orderAgnosticsBsearch {
    public static void main(String[] args) {
        int[] arr = {23,22,21,4,2,0,-2,-3,-45};
        int target = 0;
        System.out.println(searchOABS(arr, target));
    }
    static int searchOABS(int[] ani , int target){

        int start = 0;
        int end = ani.length-1;
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
}
            

