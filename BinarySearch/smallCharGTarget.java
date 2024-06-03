package BinarySearch;

// To return the smallest Character greater than the target
public class smallCharGTarget {
    public static void main(String[] args) {
        char [] arr = {'c' , 'f' , 'j'};
        char target = 'j';
        char ans = smallestNum(arr, target);
        System.out.println(ans);
    }
     static char smallestNum(char [] ani , char target){
        int start = 0;
        int end = ani.length-1;

        while(start <= end){
            int mid = start + (end - start )/2;
            if(target < ani[mid]){
                end = mid -1;
                
            }
            else {
                start = mid+1;
            }
        }
        return ani[start % ani.length];
        
     }
    
}
