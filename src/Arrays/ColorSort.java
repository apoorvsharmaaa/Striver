package Arrays;

public class ColorSort {
    public static void main(String[] args) {
        int arr[] = {0,2,1,2,2,1,1,0};
        sortColors(arr);
    }
    public static void sortColors(int[] nums) {
        for(int i=0; i<nums.length; i++){
            for(int j=1; j<nums.length ; j++){
                if(nums[j-1] > nums[j]){
                    int temp = nums[j-1];
                    nums[j-1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }
}