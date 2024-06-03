public class FullDiamond {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 0; i<2*n ; i++) {
            int totalCols = i > n?  2*n-i :i; // if i is greater than n then 2*n-i or else just i(:i)
            int noOfSpaces = n-totalCols;
            for (int k = 0; k < noOfSpaces; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j < totalCols; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}


