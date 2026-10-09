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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int count = 0;
        ListNode curr = head;
        while (count != k){
            if(curr == null){
                return head;
            }
            count++;
            curr = curr.next;
        }
        ListNode prev = reverseKGroup(curr , k);
        return reverse(head , prev, k);

        
    }
    public ListNode reverse(ListNode head, ListNode previous, int k){
        ListNode prev = previous; 
        ListNode curr = head;
        
        for (int i = 0; i < k; i++) {
            ListNode next = curr.next; 
            curr.next = prev;              
            prev = curr;                   
            curr = next;               
        }
       
        return prev;
    }
}
