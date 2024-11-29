package twopointers;
/*
 * Given a string `s` and an integer `k`, reverse the first `k` characters for every `2k` characters counting
 * from the start of the string.
 *
 * If there are fewer than `k` characters left, reverse all of them. If there are less than `2k` but greater than
 * or equal to `k` characters, then reverse the first `k` characters and leave the other as original.
 *
 * Example 1:
 *  - Input:    s = "abcdefg", k = 2
 *  - Output:       "bacdfeg"
 * Example 2:
 *  - Input:    s = "abcd", k = 2
 *  - Output:       "bacd"
 */
class ReverseStringII {

    public String reverseStr(String s, int k) {
        char[] c = s.toCharArray();
        int len  = c.length;

        for (int i = 0; i < len; i += 2 * k) {
            int left = len - i;
            if (left < k) {
                reverse(c, i, len - 1);
            } else {
                reverse(c, i, i + k - 1);
            }
        }
        return new String(c);
    }

    public void reverse(char[] c, int i, int j) {
        while (i < j) {
            char tmp = c[i];
            c[i] = c[j];
            c[j] = tmp;
            i++;
            j--;
        }
    }

}
