package hashtable;

import java.util.HashSet;
import java.util.Set;
/*
 * Given an integer array nums, return true if any value appears at least twice
 * in the array, and return false if every element is distinct.
 *
 * Example 1:
 *  - Input:        nums = [1,2,3,1]
 *  - Output:       true
 *  - Explanation:  The element 1 occurs at the indices 0 and 3.
 * Example 2:
 *  - Input:        nums = [1,2,3,4]
 *  - Output:       false
 *  - Explanation:  All elements are distinct.
 *
 * Topics: [Array, Hash Table, Sorting]
 */
class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (!numbers.add(num))
                return true;
        }
        return false;
    }
}
