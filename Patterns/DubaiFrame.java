public class DubaiFrame {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int i = 0; i <2*n; i++) {
            for (int j = 0 ; j <2*n; j++) {
                System.out.print("* "); 
            }
            System.out.println();
           
        }
    }
}
