/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        int x_copy = x;
        int remainder=1;
        int reverse = 0;

        while(x_copy>0){
            //129
            remainder =  x_copy % 10;//9;
            x_copy = x_copy / 10;// 12
            reverse = reverse * 10 + remainder;//9
        }
        if(reverse == x)
            return true;
        return false;
    }
}
// @lc code=end
// Accepted
// 11511/11511 cases passed (9 ms)
// Your runtime beats 99.27 % of java submissions
// Your memory usage beats 64.79 % of java submissions (42.2 MB)
