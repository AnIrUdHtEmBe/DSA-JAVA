package LinearSearch;

public class MinimumNumber {
    public static void main(String[] args) {
         int[] arr ={231,464,45,4554,56,5,-1,43};
        
        // System.out.println(min(arr));
       
        System.out.println(min(arr,2 ,6));
    }
    // static int min(int[] ani){
    //     if(ani.length == 0){
    //         return 0;
            
    //     }
    //     int ans = ani[0];
    //     for (int i = 1; i < ani.length; i++) {
    //         if(ani[i] < ans){
    //             ans = ani[i];
    //         }

    //     }
    //     return ans;
    // }

        //to search in a Range!

        static int min(int[] ani , int start , int end){
            if(ani.length == 0){
                return 0;
                
            }
            int ans = ani[0];
            for (int i = start; i <= end; i++) {
                if(ani[i] < ans){
                    ans = ani[i];
                }
    
            }
            return ans;
        }

}
