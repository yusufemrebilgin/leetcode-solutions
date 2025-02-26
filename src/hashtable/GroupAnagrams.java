package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
 * Given an array of strings `strs`, group the anagrams together. You can return the answer in any order.
 *
 * Anagram:
 *      An anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 *      using all the original letters exactly once.
 *
 * Example 1:
 *  - Input:        strs = ["eat","tea","tan","ate","nat","bat"]
 *  - Output:              [["bat"],["nat","tan"],["ate","eat","tea"]]
 *  - Explanation:  There is no string in strs that can be rearranged to form "bat".
 *                  The strings "nat" and "tan" are anagrams as they can be rearranged to form each other.
 *                  The strings "ate", "eat", and "tea" are anagrams as they can be rearranged to form each other.
 * Example 2:
 *  - Input:        strs = [""]
 *  - Output:              [[""]]
 * Example 3:
 *  - Input:        strs = ["a"]
 *  - Output:       [["a"]]
 *
 * Topics: [Array, Hash Table, String, Sorting]
 */
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] arrToBeSorted = str.toCharArray();
            Arrays.sort(arrToBeSorted);
            String sortedString = new String(arrToBeSorted);
            map.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(map.values());
    }
}
