package Recursion;

public class fibonacci {
    public static void main(String[] args) {
        int n=4;
        System.out.println(R(4));

    }
    public static int R(int n) {
        if (n <= 0) {
            return n;
        } else {
            int last = R(n-1);
            int secLast = R(n-2);
            return last+secLast;
        }
    }
}
