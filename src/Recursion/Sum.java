package Recursion;

public class Sum {
    public static void main(String[] args) {
        int n=5;
        System.out.println(R(n));
    }
    public static int R(int n){
        if (n==0){
            return 0;
        }
        return n + R(n-1);
    }
}
