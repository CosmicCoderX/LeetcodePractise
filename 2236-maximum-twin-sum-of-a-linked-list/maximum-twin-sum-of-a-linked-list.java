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
    public static int pairSum(ListNode head) {
        List<Integer> arr = new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }

        int n = arr.size();
        int i = 0;
        int j = n-1;
        int max = Integer.MIN_VALUE;
        while(i<j){
            max = Math.max(max, arr.get(i) + arr.get(j));
            i++;
            j--;
        }
        return max;
    }
}