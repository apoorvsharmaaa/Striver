package Recursion;

public class PrintName5Times {
    public static void main(String[] args) {
        int n=3;
//        System.out.println(n);
        f(1,n);
    }

    private static void f(int i, int n) {
        if (i>n) {
            return;
        }
            System.out.println("Apoorv");
            f(i+1,n);
    }
}
