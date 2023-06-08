/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        String longest_substring = "";
        String buffer = "";
        for(int i=0; i<s.length();i++){
            buffer = sb.toString();
            if (!sb.toString().contains(Character.toString(s.charAt(i)))) {
                sb.append(s.charAt(i));
            }
            else {
                buffer = buffer.substring(buffer.indexOf(s.charAt(i))+1);
                sb = new StringBuilder(buffer);
                sb.append(s.charAt(i));
            }
            if(sb.toString().length() > longest_substring.length())
                longest_substring = sb.toString();
        }
        return longest_substring.length();
    }
}
// @lc code=end

