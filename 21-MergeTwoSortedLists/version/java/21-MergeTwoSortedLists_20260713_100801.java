// Last updated: 7/13/2026, 10:08:01 AM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        
14        // if list1 is empty then return the remaining nodes of list2
15        if(list1==null)
16        {
17            return list2;
18        } 
19
20        // if list2 is empty then return the remaining nodes of list1
21        if(list2==null)
22        {
23            return list1;
24        }
25
26        //compare the current nodes of  both list
27        if(list1.val<=list2.val)
28        {
29            list1.next=mergeTwoLists(list1.next,list2);
30            return list1;
31        }
32        else
33        {
34            list2.next=mergeTwoLists(list1,list2.next);
35            return list2;
36        }
37
38        
39    }
40}