package twopointers;
/*
 * Given a string `s`, reverse the string according to the following rules:
 *  - All the characters that are not English letters remain in the same position.
 *  - All the English letters (lowercase or uppercase) should be reversed.
 *
 * Return `s` after reversing it.
 *
 * Example 1:
 *  - Input:    s = "ab-cd"
 *  - Output:       "dc-ba"
 * Example 2:
 *  - Input:    s = "a-bC-dEf-ghIj"
 *  - Output:       "j-Ih-gfE-dCba"
 * Example 3:
 *  - Input:    s = "Test1ng-Leet=code-Q!"
 *  - Output:       "Qedo1ct-eeLg=ntse-T!"
 */
class ReverseOnlyLetters {
    public String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        int left = 0, right = c.length - 1;
        while (left < right) {
            if (Character.isLetter(c[left]) && Character.isLetter(c[right])) {
                char tmp = c[left];
                c[left++] = c[right];
                c[right--] = tmp;
                continue;
            }

            if (!Character.isLetter(c[left]))  left++;
            if (!Character.isLetter(c[right])) right--;
        }

        return new String(c);
    }
}
