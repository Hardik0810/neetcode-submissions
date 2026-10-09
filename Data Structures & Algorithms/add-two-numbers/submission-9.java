// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */

// class Solution {
//     public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//         long a = findNum(l1);
//         long b = findNum(l2);
//         long c = a + b;
//         return findList(c);
        
        
//     }
//     public long findNum(ListNode l1){
//         long a = 0;
//         int p = 0;
//         while(l1 != null){
//            a = a + (long)(l1.val * Math.pow(10, p));
//            p++;
//            l1 = l1.next;
//         }
//         return a;
//     }
//     public ListNode findList(long a){
//         if(a < 10){
//             return new ListNode((int)a);
//         }
//         long c = a;
//         ListNode head = new ListNode((int)c%10);
//         ListNode node = head;
//         c = a/10;
//         while(c >= 10){
//             node.next = new ListNode((int)c % 10);
//             c = c / 10;
//             node = node.next;
//         }
//         node.next = new ListNode((int)c);
//         return head;



//     }
// }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0); // A placeholder to build the list
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            // Get values, use 0 if the list has ended
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            // Calculate sum and carry
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            
            // Create new node with the digit part (sum % 10)
            current.next = new ListNode(sum % 10);
            current = current.next;

            // Move to next nodes
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummyHead.next;
    }
}
