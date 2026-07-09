// Last updated: 7/9/2026, 9:15:17 AM
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
    public ListNode reverseList(ListNode head) {
        int n=0;
        ListNode t=new ListNode(0);
        ListNode temp=t;
        if(head==null)
        return head;
        else
        {
            ListNode temp1=head;
            while(temp1!=null)
            {
                n++;
                temp1=temp1.next;
            }
            ListNode a[]=new ListNode[n];
            temp1=head;
            for(int i=0;i<n;i++)
            {
            a[i]=temp1;
            temp1=temp1.next;
            }
            for(int i=n-1;i>=0;i--)
            {
                temp.next=a[i];
                temp=temp.next;
            }
            temp.next=null;
        }
        return t.next;
    }
}