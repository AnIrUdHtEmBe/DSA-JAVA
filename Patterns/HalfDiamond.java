public class HalfDiamond {
    public static void main(String[] args) {
        pattern(5);
        // pattern1(5);
    }
    static void pattern(int n){
        for (int i = 0; i < 2*n; i++) {
            int totalCols = i>n? 2*n - i  :i; // if i is greater then n then 2*n-i or else just i(:i)
            for (int j = 0; j < totalCols; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }


    // approach - 2
    // static void pattern(int n){
    //     for (int i = 0; i < n; i++) {
    //         for (int j = 0; j <i; j++) {
    //             System.out.print("* ");
    //         }
    //         System.out.println( );
    //     }
    // }
    // static void pattern1(int n){
    //     for (int i = n; i > 0; i--) {
    //         for (int j = 0; j < i; j++) {
    //             System.out.print("* ");
                
    //         }
    //         System.out.println( );
            
    //     }
    // }
}
