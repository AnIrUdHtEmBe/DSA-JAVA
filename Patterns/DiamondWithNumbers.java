public class DiamondWithNumbers {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 1; i <= 2*n; i++) {
            int columns = i > n? 2*n-i :i;

            for (int l = 0; l < n-columns; l++) {
                System.out.print("  ");
            }
            for (int j = columns; j >=1; j--) {
                System.out.print(j+" ");
            }
            for (int k = 2; k <=columns ; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
