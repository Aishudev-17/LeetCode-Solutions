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
    public ListNode mergeNodes(ListNode head) {
        ListNode p1=head.next;
        ListNode p2=head;
        int sum=0;
    
        while(p1!=null){
            if(p1.val!=0){
                sum+=p1.val;
            }
        else{
            p2=p2.next;
            p2.val=sum;
            sum=0;

        }
        p1=p1.next;
        }
        p2.next=null;
        return head.next;
        
    }
}