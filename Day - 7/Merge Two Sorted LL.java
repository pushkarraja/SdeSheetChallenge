public class Solution {
	public static LinkedListNode<Integer> sortTwoLists(LinkedListNode<Integer> first, LinkedListNode<Integer> second) {
    
		    LinkedListNode<Integer> newList = new LinkedListNode<>(-1);
        LinkedListNode<Integer> temp = newList;
        
        while (first != null && second != null) {
            if (first.data < second.data) {
                LinkedListNode<Integer> newNode = new LinkedListNode<>(first.data);
                temp.next = newNode;
                first = first.next;
            } else {
                LinkedListNode<Integer> newNode = new LinkedListNode<>(second.data);
                temp.next = newNode;
                second = second.next;
            }
            temp = temp.next;
        }
        
        if (first != null) {
            temp.next = first;
        } else {
            temp.next = second;
        }
        
        return newList.next;
	}
}
