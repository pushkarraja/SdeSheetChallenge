// Iterative :
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode temp = head;
        while (temp.next != null) {
            ListNode node = temp.next;
            temp.next = temp.next.next;
            node.next = head;
            head = node;
        }
        
        return head;
        
    }
}

// recursive :
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        
        ListNode revHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        
        return revHead;
    }
}
