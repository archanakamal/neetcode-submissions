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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        int carry=0;
        ListNode curr=dummy;
        while(l1!=null || l2!=null){
            int a=(l1==null)?0:l1.val;
            int b=(l2==null)?0:l2.val;
            int x=a+b+carry;
            int digit = x % 10;
            carry = x / 10;
            
            curr.next=new ListNode(digit);
            curr=curr.next;

            if(l1!=null){
                l1=l1.next;
            }
            if(l2!=null){
                l2=l2.next;
            }
            
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }

        return dummy.next;
    }
}
