/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        Node node = head;
        Node head1 = null;
        Node node2 = head1;
        while(node != null){
            Node node3 = new Node(node.val);
            if(head1 == null){
                head1 = node3;
                node2 = head1;
            }
            else{
                node2.next = node3;
                node2 = node3;
            }
            map.put(node, node3);
            node = node.next;
        }
        node = head;
        while(node != null){
            map.get(node).random = map.get(node.random);
            node = node.next;
        }
        return head1;
        
    }
    
}
