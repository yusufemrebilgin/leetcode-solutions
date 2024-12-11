package linkedlist;
/*
 * Given the head of a singly linked list, return true if it is a palindrome or false otherwise.
 *
 * Example 1:
 *  - Input:        head = [1,2,2,1]
 *  - Output:       true
 * Example 2:
 *  - Input:        head = [1,2]
 *  - Output:       false

 * Topics: [Linked List, Two Pointers, Stack, Recursion]
 */
class PalindromeLinkedList {
    // Floyd's cycle-finding algorithm
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        // find middle of the list
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = slow;
        ListNode curr = slow.next;
        prev.next = null;
        while (curr != null) {
            // use fast pointer to hold next node
            // to update current node reference
            fast = curr.next;
            curr.next = prev;
            prev = curr;
            curr = fast;
        }

        fast = head;
        slow = prev;
        while (fast != null) {
            if (fast.val != slow.val)
                return false;

            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }
}


