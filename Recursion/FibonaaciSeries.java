package Recursion;

public class FibonaaciSeries {
    public static void main(String[] args) {
        System.out.println(Fibo(5));
    }
    static int Fibo(int n){

        if(n < 2){
            return n;
        }
        
        return Fibo(n-1) + Fibo(n-2); // sum of previous number and previous number of previous number;
    }
}
