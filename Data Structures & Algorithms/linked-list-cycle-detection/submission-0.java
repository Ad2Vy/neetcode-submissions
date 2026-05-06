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
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hash= new HashSet<>();
        ListNode cur= head;
        while(cur!=null){
            if(hash.contains(cur)){
                return true;
            }
            hash.add(cur);
            cur=cur.next;
        }
        return false;
    }
}
