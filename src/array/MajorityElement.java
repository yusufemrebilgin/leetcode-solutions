package array;
/*
 * Given an array nums of size n, return the majority element.
 *
 * The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that
 * the majority element always exists in the array.
 *
 * Example 1:
 *  - Input:        nums = [3,2,3]
 *  - Output:       3
 * Example 2:
 *  - Input:        nums = [2,2,1,1,1,2,2]
 *  - Output:       2
 *
 * Topics: [Array, Hash Table, Divide and Conquer, Sorting, Counting]
 */
class MajorityElement {
    // Boyer-Moore's majority voting algorithm
    public int majorityElement(int[] nums) {
        int count = 0, element = 0;
        for (int num : nums) {
            if (count == 0) {
                element = num;
            }

            if (element == num) {
                count++;
            } else {
                count--;
            }
        }

        return element;
    }
}
