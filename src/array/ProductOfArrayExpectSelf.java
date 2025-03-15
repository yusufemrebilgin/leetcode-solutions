package array;

import java.util.Arrays;
/*
 * Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product
 * of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 * Example 1:
 *  - Input:        nums = [1,2,3,4]
 *  - Output:       [24,12,8,6]
 * Example 2:
 *  - Input:        nums = [-1,1,0,-3,3]
 *  - Output:       [0,0,9,0,0]
 *
 * Topics: [Array, Prefix Sum]
 */
public class ProductOfArrayExpectSelf {

    public int[] productExceptSelf(int[] nums) {

        if (nums == null || nums.length == 1) {
            return nums;
        }

        int len = nums.length;

        int[] ans = new int[len];
        Arrays.fill(ans, 1);

        // Finding prefix
        for (int i = 1; i < len; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        // Applying suffix
        for (int i = len - 1, suffix = 1; i >= 0; i--) {
            ans[i] *= suffix;
            suffix *= nums[i];
        }

        return ans;
    }

}
