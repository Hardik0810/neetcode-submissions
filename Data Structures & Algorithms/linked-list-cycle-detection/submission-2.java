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
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null){
            return false;
        }
        ListNode temp1 = head;
        ListNode temp2 = head.next;
        while(temp2 != null && temp2.next != null){
            if(temp1.val == temp2.val){
                return true;
            }
            temp1 = temp1.next;
            temp2 = temp2.next.next;
        }
        return false;
        
    }
}
