// To find number of elemens in a array containing even digits.

package LinearSearch;

public class evenDigits {
    public static void main(String[] args) {
        int[] nums = {12,6,8,1234,390,17,373};
        System.out.println("There are " +even(nums)+ " digits containing even no:of digits");
    }
    static int even(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            if(evenDigitsOrNot(num)){
                count++;
            }
           
        }
        return count;
    }

    static boolean evenDigitsOrNot(int num){
        int noOfDigits = digits(num);
        if(noOfDigits % 2 == 0){
            return true;
        }
        return false;
    }


    static int digits(int num){
        int count=0;
        
        while(num>0){
            
            count++;
            num/=10;
        }
        return count;
    }

}

