package Recursion;

public class ReverseAnArray {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 4, 5};
        int r = n.length - 1;
        R(0, n, r);
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);
        }

    }

    public static void R(int l, int n[], int r) {
        if (l >= n.length / 2) {
            return;
        } else {
            int temp = n[l];
            n[l] = n[n.length - l - 1];
            n[n.length - l - 1] = temp;
            R(l + 1, n, r);
        }
    }
}
