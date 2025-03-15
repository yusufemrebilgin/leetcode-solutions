package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * Given an integer array nums and an integer k, return the k most frequent elements.
 * You may return the answer in any order.
 *
 * Example 1:
 *  - Input:        nums = [1,1,1,2,2,3], k = 2
 *  - Output:       [1,2]
 * Example 2:
 *  - Input:        nums = [1], k = 1
 *  - Output:       [1]
 */
public class TopKFrequentElements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        List<Map.Entry<Integer, Integer>> elements = new ArrayList<>(freq.entrySet());
        elements.sort(Map.Entry.comparingByValue());

        int[] result = new int[k];

        for (int i = 0, pos = elements.size() - 1; i < k && pos >= 0; i++) {
            result[i] = elements.get(pos - i).getKey();
        }

        return result;
    }

}
