package stack;

import java.util.Stack;

/*
 * Given a string `s` containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 * An input string is valid if:
 *  1. Open brackets must be closed by the same type of brackets.
 *  2. Open brackets must be closed in the correct order.
 *  3. Every close bracket has a corresponding open bracket of the same type.
 * Example 1:
 *  - Input:    s = "()"
 *  - Output:       true
 * Example 2:
 *  - Input:    s = "()[]{}"
 *  - Output:       true
 * Example 3:
 *  - Input:    s = "(]"
 *  - Output:       false
 * Example 4:
 *  - Input:    s = "([])"
 *  - Output:       true
 */
class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (isOpenBracket(c))
                stack.push(c);
            else if (isCloseBracket(c) && (stack.isEmpty() || !areBracketsMatching(stack.pop(), c)))
                return false;
        }
        return stack.isEmpty();
    }

    public boolean isOpenBracket(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    public boolean isCloseBracket(char c) {
        return c == ')' || c == '}' || c == ']';
    }

    public boolean areBracketsMatching(char c1, char c2) {
        return (c1 == '(' && c2 == ')') ||
                (c1 == '{' && c2 == '}') ||
                (c1 == '[' && c2 == ']');
    }

}
