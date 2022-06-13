public class Solution {
	public static ListNode removeKthNode(ListNode head, int K) {
        
        ListNode start = new ListNode(-1);
        ListNode slow = start, fast = start;
        start.next = head;
        
        for (int i = 0; i < K; i++) {
            fast = fast.next;
        }
        
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        if (slow != null && slow.next != null) {
            slow.next = slow.next.next;
        }
        
        return start.next;
	}
}
