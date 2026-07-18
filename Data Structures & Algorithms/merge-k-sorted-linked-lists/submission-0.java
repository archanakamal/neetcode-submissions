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
        ListNode dummy=new ListNode(0);
        ListNode nh=dummy;
        PriorityQueue<ListNode> pq =new PriorityQueue<>((a, b) -> a.val - b.val);
        for(int i=0;i<lists.length;i++){
            ListNode curr=lists[i];
            if(curr!=null){
                pq.offer(curr);
            }
        }

        while(!pq.isEmpty()){
            ListNode temp=pq.poll();
            nh.next=temp;
            nh=nh.next;

            if(temp.next!=null){
                pq.offer(temp.next);
            }
        }
        return dummy.next;

    }
}
