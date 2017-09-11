/*
Write a program to find the node at which the intersection of two singly linked lists begins.
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class IntersectionOfTwoLinkedLists. {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) 
            return null;
    
        ListNode x = headA;
        ListNode y = headB;
    
    while(x != y)
    {
        x = x == null? headB : x.next;
        y = y == null? headA : y.next;    
    }
    
    return x;
    }
}