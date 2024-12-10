package string;
/*
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
 * removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric
 * characters include letters and numbers.
 *
 * Example 1:
 *  - Input:        s = "A man, a plan, a canal: Panama"
 *  - Output:       true
 *  - Explanation:  "amanaplanacanalpanama" is a palindrome.
 * Example 2:
 *  - Input:        s = "race a car"
 *  - Output:       false
 *  - Explanation:  "raceacar" is not a palindrome.
 * Example 3:
 *  - Input:        s = " "
 *  - Output:       true
 *  - Explanation:  s is an empty string "" after removing non-alphanumeric characters.
 *                  Since an empty string reads the same forward and backward, it is a palindrome.
 *
 * Topics: [Two Pointers, String]
 */
class ValidPalindrome {
    public boolean isPalindrome(String s) {
        if (s.isBlank())
            return true;

        s = s.toLowerCase();

        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char leftChar = s.charAt(i);
            char rightChar = s.charAt(j);
            if (!Character.isLetterOrDigit(leftChar)) {
                i++;
            } else if (!Character.isLetterOrDigit(rightChar)) {
                j--;
            } else {
                if (leftChar != rightChar) {
                    return false;
                }
                i++;
                j--;
            }
        }

        return true;
    }
}
