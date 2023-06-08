/*
 * @lc app=leetcode id=2 lang=java
 *
 * [2] Add Two Numbers
 *
 * https://leetcode.com/problems/add-two-numbers/description/
 *
 * algorithms
 * Medium (40.59%)
 * Likes:    26217
 * Dislikes: 5077
 * Total Accepted:    3.7M
 * Total Submissions: 9M
 * Testcase Example:  '[2,4,3]\n[5,6,4]'
 *
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order, and each of their nodes
 * contains a single digit. Add the two numbers and return the sum as a linked
 * list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 * 
 * 
 * 
 * Constraints:
 * 
 * 
 * The number of nodes in each linked list is in the range [1, 100].
 * 0 <= Node.val <= 9
 * It is guaranteed that the list represents a number that does not have
 * leading zeros.
 * 
 * 
 */

// @lc code=start
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
 
        int digit_sum;
        ListNode l3 = null;
        ListNode current = null;
        ListNode temp;
        int carry = 0;
        while(l1 != null || l2 != null || carry > 0){

             if(l1 == null && l2 == null){
                digit_sum = carry;
                carry = 0;
            } else if(l1==null)
                 digit_sum = l2.val;
             else if(l2==null)
                 digit_sum = l1.val;
            else
                digit_sum = l1.val + l2.val;//3529 + 112, 12
            if(carry>0){// no carry
                digit_sum+=carry;
                carry=0;
            }
            if(digit_sum >9){//yes, 11
                temp = new ListNode(digit_sum%10);// l3 = 2
                carry = digit_sum/10;// carry = 1
            } else{
                 temp = new ListNode(digit_sum);
            }
            if(l3 ==null){
                l3 = temp;
                current = l3;
            } else{
                current.next = temp;
                current = current.next;
            }
            if(l1!= null)
                l1 = l1.next;
            else l1 = null;
            if(l2!= null)
                l2 = l2.next;
            else l2 = null;
        }
        return l3;
    }
}
// @lc code=end
// Accepted
// 1568/1568 cases passed (2 ms)
// Your runtime beats 99.15 % of java submissions
// Your memory usage beats 15.1 % of java submissions (43.5 MB)
