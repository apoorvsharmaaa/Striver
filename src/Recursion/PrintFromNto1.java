package Recursion;

public class PrintFromNto1 {
    public static void main(String[] args) {
        int n=5;
        R(1,n);
    }
    public static void R(int i,int n){
        if (i>n){
            return;
        }
        System.out.println(n);
        R(i,n-1);
    }
}
