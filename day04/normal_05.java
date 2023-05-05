package day04;

public class normal_05 {
    public static void main(String[] args) {
        // 数组
        // 希望数组的数据是大小有序的

        int[] nums = { 1, 10, 5, 3, 6, 9, 2, 4 };
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j] - nums[j + 1];
                    nums[j + 1] = nums[j] + nums[j + 1];
                    nums[j] = nums[j + 1] - nums[j];
                }
            }
        }

        for (int nums2 : nums) {
            System.out.println(nums2);
        }
    }
}
