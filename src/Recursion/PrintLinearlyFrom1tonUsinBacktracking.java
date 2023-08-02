package Recursion;

public class PrintLinearlyFrom1tonUsinBacktracking {
    public static void main(String[] args) {
        int n=5;
        R(n,n);
    }
    public static void R(int i,int n){
        if (i<1){
            return;
        }
        R(i-1,n);
        System.out.println(i);
    }
}
