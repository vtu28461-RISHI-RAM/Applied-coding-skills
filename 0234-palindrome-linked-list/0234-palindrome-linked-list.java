class Solution {

    public ListNode middle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nex = current.next;
            current.next = prev;
            prev = current;
            current = nex;
        }

        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode mid = middle(head);
        ListNode rev = reverse(mid);
        while (rev != null) {

            if (head.val != rev.val) {
                return false;
            }

            head = head.next;
            rev = rev.next;
        }

        return true;
    }
}