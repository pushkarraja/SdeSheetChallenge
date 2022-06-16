class Solution {
    public Node copyRandomList(Node head) {
        
        HashMap<Node, Node> rand = new HashMap<>();
        
        Node temp = head;
        Node newHead = new Node(-1);
        Node curr = newHead;
        
        while (temp != null) {
            Node newNode = new Node(temp.val);
            rand.put(temp, newNode);
            curr.next = newNode;
            curr = curr.next;
            temp = temp.next;
        }
        
        temp = head;
        curr = newHead.next;
        
        while (temp != null) {
            if (temp.random != null) {
                curr.random = rand.get(temp.random);
            }
            curr = curr.next;
            temp = temp.next;
        }
        
        return newHead.next;
    }
}
