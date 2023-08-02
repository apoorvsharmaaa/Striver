package Recursion;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        System.out.println(R(n));
    }
    public static int R(int n){
        if (n==0){
            return 1;
        }
        return n*R(n-1);
    }
}
