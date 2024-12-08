package string;
/*
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 *
 * Anagram: An anagram is a word or phrase formed by rearranging the letters of a different
 * word or phrase, using all the original letters exactly once.
 *
 * Example 1:
 *  - Input:        s = "anagram", t = "nagaram"
 *  - Output:       true
 * Example 2:
 *  - Input:        s = "rat", t = "car"
 *  - Output:       false
 *
 * Topics: [Hash Table, String, Sorting]
 */
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        for (char c: t.toCharArray()) {
            if (freq[c - 'a'] == 0)
                return false;
            freq[c - 'a']--;
        }

        return true;
    }
    // Alternatively, the solution can be reached by increasing and decreasing the letter frequency
    // with a HashMap that keeps the frequency. If any value is different from zero, it returns false.
}
