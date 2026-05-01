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
    public ListNode reverseList1(ListNode head) {
        ListNode cur= head;
        ListNode prev=null;
        while(cur!=null){
            ListNode temp=cur.next;
            cur.next=prev;
            prev=cur;
            cur=temp;
        }
        return prev;

    }
    public ListNode reverseList(ListNode head){
        if(head== null){
            return null;
        }
        ListNode nHead= head;
        if(head.next != null){
            nHead= reverseList(head.next);
            head.next.next= head;
        }
        head.next =null;
        return nHead;
    }
}
