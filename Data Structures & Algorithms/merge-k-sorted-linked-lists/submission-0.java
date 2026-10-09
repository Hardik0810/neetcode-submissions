/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0){
            return null;
        }
        if(lists.length == 1){
            return lists[0];
        }
        ListNode out = lists[0];
        for(int i = 1; i < lists.length; i++){
            out = merge(out, lists[i]);
        }
        return out;


    }
    public ListNode merge(ListNode a, ListNode b){
        ListNode head = null;
        ListNode node1 = head;
        while(a != null && b != null){
            if(a.val<b.val){
                if(head == null){
                    head = a;
                    node1 = head;
                    a = a.next;
                }
                else{
                    node1.next = a;
                    a = a.next;
                    node1 = node1.next;
                }
            }
            else{
                if(head == null){
                    head = b;
                    node1 = head;
                    b = b.next;
                }
                else{
                    node1.next = b;
                    b = b.next;
                    node1 = node1.next;
                }

            }
        }
        if(a == null){
            while(b!= null){
                node1.next = b;
                b = b.next;
                node1 = node1.next;
            }
        }
        else if(b == null){
            while(a!= null){
                node1.next = a;
                a = a.next;
                node1 = node1.next;
            }
        }
        return head;
    }
}
