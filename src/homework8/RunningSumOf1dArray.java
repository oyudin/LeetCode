package homework8;

public class RunningSumOf1dArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
            System.out.println(nums[i]);
        }

        System.out.println();

        int[] nums2 = {1, 1, 1, 1, 1};
        for (int i = 1; i < nums2.length; i++) {
            nums2[i] += nums2[i - 1];
            System.out.println(nums2[i]);
        }

        System.out.println();

        int[] nums3 = {3, 1, 2, 10, 1};
        for (int i = 1; i < nums3.length; i++) {
            nums3[i] += nums3[i - 1];
            System.out.println(nums3[i]);
        }
    }
}