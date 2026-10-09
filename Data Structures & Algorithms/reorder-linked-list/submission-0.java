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
    public void reorderList(ListNode head) {
    if (head == null || head.next == null) return;

    ListNode mid = findMid(head);

    ListNode secondHalf = reverse(mid.next);
    mid.next = null;
    
    ListNode firstHalf = head;
    while (secondHalf != null) {
        ListNode tmp1 = firstHalf.next;
        ListNode tmp2 = secondHalf.next;
        firstHalf.next = secondHalf;
        secondHalf.next = tmp1;
        firstHalf = tmp1;
        secondHalf = tmp2;
    }
}
    public ListNode findMid(ListNode head) {
    if (head == null || head.next == null) {
        return head;
    }

    ListNode slow = head; 
    ListNode fast = head;

    while (fast.next != null && fast.next.next != null) {
        slow = slow.next;
        fast = fast.next.next;
    }
    return slow;
}
    public ListNode reverse(ListNode head) {
    ListNode prev = null;
    ListNode curr = head;
    
    while (curr != null) {
        ListNode nextTemp = curr.next; 
        curr.next = prev;             
        prev = curr;                   
        curr = nextTemp;              
    }
    
   
    return prev;
}
}
