package BinarySearch;

public class bSearch {
    public static void main(String[] args) {
        int[] arr ={-18,-12,-3,-1,0,2,4,10,12,43};
        int target = 43;
        int ans = (bsearch(arr,target));
        System.out.println(ans);
        

    }
    static int bsearch(int[] ani , int target){
        int start = 0;
        int end = ani.length-1;
      
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
}
