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
    public ListNode sortList(ListNode head) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        temp=head;
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=temp.val;
            temp=temp.next;

        }
        Arrays.sort(a);
        temp=head;
        for(int i=0;i<n;i++){
            temp.val=a[i];
            temp=temp.next;
        }
        return head;
        
    }
}