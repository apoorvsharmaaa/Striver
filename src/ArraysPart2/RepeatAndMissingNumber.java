package ArraysPart2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class RepeatAndMissingNumber {
    public static void main(String[] args) {
        int nums[] = {3,1,2,5,3};
        System.out.println(Arrays.toString(repeatedNumber(nums)));
    }
    public static int[] repeatedNumber(final int[] A) {
        int []ans = new int[2];
        HashSet<Integer> st = new HashSet<>();
        int c=0;
        Arrays.sort(A);
        for(int j=0;j<A.length;j++){
            if(c+1!=A[j]){
                ans[1]=c+1;
            }
            else{
                c=A[j];
            }
        }
        for(int i=0;i<A.length;i++){
            if(st.contains(A[i])){
                ans[0]=A[i];
            }
            else{
                st.add(A[i]);
            }
        }
        return ans;
    }
}
