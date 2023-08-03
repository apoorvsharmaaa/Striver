package Recursion;

public class StringIsAPalindrome {
    public static void main(String[] args) {

        String n = "NamaN";
        System.out.println(R(0,n));


    }

    public static boolean R(int i, String n) {
        if (i > n.length() / 2) {
            return true;
        } else if (n.charAt(i) != n.charAt(n.length() - i - 1)) {
            return false;
        } else {
            return R(i + 1, n);
        }
    }
}
