public class Pyramid {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 0; i<n ; i++) {
            int totalColumns = i ; 
            int noOfSpaces = n-totalColumns;
            for (int k = 0; k < noOfSpaces; k++) {
                System.out.print(" ");
            }

            for (int j = 0; j <= totalColumns; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
