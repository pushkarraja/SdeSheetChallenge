public class Solution {
    
    static Node merge(Node a, Node b) {
        Node temp = new Node(-1);
        Node res = temp;
        
        while (a != null && b != null) {
            if (a.data < b.data) {
                temp.child = a;
                temp = temp.child;
                a = a.child;
            } else {
                temp.child = b;
                temp = temp.child;
                b = b.child;
            }
        }
        temp.child = (a != null) ? a : b;
        return res.child;
    }
    
    
	public static Node flattenLinkedList(Node start) {
		if (start == null || start.next == null) {
            return start;
        }
        
        start.next = flattenLinkedList(start.next);
        start = merge(start, start.next);
        return start;
	}
}
