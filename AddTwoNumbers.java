/*
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
*/
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode zeroHead = new ListNode(0);
        ListNode a=l1,b=l2,current=zeroHead;
        int carry=0;
        
        while (a!=null || b!=null) 
        {
            int x=(a!=null) ? a.val:0;
            int y=(b!=null) ? b.val:0;
            int sum = carry + x + y;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            
            if (a!=null) 
                a=a.next;
            if (b!=null) 
                b=b.next;
        }
        
    if (carry > 0) 
        current.next = new ListNode(carry);
        
    return zeroHead.next;
    }
}