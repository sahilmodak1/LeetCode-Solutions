/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) 
    {
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) 
        {
            fast = fast.next.next;
            slow = slow.next;
        }
        
        if (fast != null)  // for odd nodes in the linked list, let right half smaller
            slow = slow.next;
        
        
        slow = reverse(slow);
        fast = head;

        while (slow != null) 
        {
            if (fast.val != slow.val) 
                return false;
            
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }

    public ListNode reverse(ListNode head) 
    {
        ListNode prev = null;
        ListNode next = null;
        ListNode current = head;
        
        while (current != null) 
        {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev; //Since current is now null, previous is head
    }
}