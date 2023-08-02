package Recursion;

public class SumOfFirstNNumber {
    public static void main(String[] args) {
        int n = 5;
        R(n,0);
    }
    public static void R(int i,int sum){
        if (i<1){
            System.out.println(sum);
            return;
        }
        R(i-1,sum+i);
    }
}
