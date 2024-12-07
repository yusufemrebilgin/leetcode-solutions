package array;

import java.util.Arrays;

/*
 * Given a non-empty array of integers nums, every element appears twice except for one.
 * Find that single one.
 *
 * Example 1:
 *  - Input:    nums = [2,2,1]
 *  - Output:   1
 * Example 2:
 *  - Input:    nums = [4,1,2,1,2]
 *  - Output:   4
 * Example 3:
 *  - Input:    nums = [1]
 *  - Output:   1
 *
 * Topics: [Array, Bit Manipulation]
 */
class SingleNumber {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        Arrays.sort(nums); // O(n log(n))

        for (int i = 0; i < nums.length - 1; i += 2) {
            if ((nums[i] ^ nums[i + 1]) != 0) {
                return nums[i];
            }
        }

        // If single number is not found in the for loop,
        // it is at the end of the array
        return nums[nums.length - 1];
    }

    /*
    Alternatively, we can find the single number by applying
    the XOR operator to each number, which is a better solution.
    Because XOR behaves like this:
        1) A^A = 0
        2) A^A^B = B
        3) A^A^B^B^C = C
     */

}
