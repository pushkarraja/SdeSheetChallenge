public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head, fast = head;
        
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            
            if (fast == slow) break;
        }
        
        slow = head;
        if (fast == null || fast.next == null) return null;
        
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
    }
}
