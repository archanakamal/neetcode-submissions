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
        int l=0;
        ListNode temp=head;
        while(temp!=null){
            temp=temp.next;
            l++;
        }
        
        int n=l/k;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        for(int i=0;i<n;i++){
            ListNode curr=prev.next;
            for(int j=0;j<k-1;j++){
                    ListNode next=curr.next;
                    curr.next=next.next;
                    next.next=prev.next;
                    prev.next=next;
                }
                prev=curr;
            }
            return dummy.next;
    }
}
