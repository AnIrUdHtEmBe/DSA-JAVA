public class oneTwoOneTwo {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <=n; i++) {
            for (int l = 0; l < n-i; l++) {
                System.out.print(" ");
            }

            for (int j = i; j >=1 ; j--) { // print from highest value of i till 1 and stop in the 1st half
                System.out.print(j);
            }
            for (int k = 2; k <=i; k++) { // print from 2 till highest value of i in the second half
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
