import java.util.Arrays;

public class rotatearray {
     public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
    }
    public static void rotate(int[] nums, int k) {
        if (k == 0){
            System.out.println(Arrays.toString(nums));
            return;
        }
        //int temp = nums[nums.length - 1];
        for (int i = 0; i < nums.length-1; i++) {
            int temp = nums[nums.length-1-i];
            nums[nums.length-1-i] = nums[nums.length-2-i];
            nums[nums.length-2-i] = temp;
        }
        rotate(nums , k-1);
    }
}
