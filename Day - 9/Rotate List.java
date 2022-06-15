class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        
        ListNode temp = head;
        int len = 1;
        while (temp.next != null) {
            len++;
            temp = temp.next;
        }
        
        k = k % len;
        if (k == 0) return head;
        
        temp.next = head;
        int end = len - k;
        
        while (end-- != 0) {
            temp = temp.next;
        }
        
        head = temp.next;
        temp.next = null;
        return head;
    }
}
