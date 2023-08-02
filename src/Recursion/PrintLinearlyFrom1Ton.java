package Recursion;

public class PrintLinearlyFrom1Ton {
    public static void main(String[] args) {
        int n=5;
        R(1,n);
    }

    private static void R(int i, int n) {
        if (i>n){
            return;
        }
        System.out.println(i);
        R(i+1,n);
    }
}
