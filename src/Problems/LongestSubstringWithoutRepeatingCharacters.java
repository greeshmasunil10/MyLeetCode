package Problems;

import java.util.ArrayList;

public class LongestSubstringWithoutRepeatingCharacters {
    public LongestSubstringWithoutRepeatingCharacters(){
        lengthOfLongestSubstring("aab");
    }
    public int lengthOfLongestSubstring(String s) {
        StringBuilder sb = new StringBuilder();
        String longest_substring = "";
        String buffer = "";
        for(int i=0; i<s.length();i++){
            buffer = sb.toString();
            System.out.println(i+":"+s.charAt(i));
            if (!sb.toString().contains(Character.toString(s.charAt(i)))) {
                sb.append(s.charAt(i));
            }
            else {
//                sb = new StringBuilder(Character.toString(s.charAt(i)));
                System.out.println("error, buffer:"+buffer);
                int index = buffer.indexOf(s.charAt(i));
                System.out.println("i:+"+i);
                System.out.println("end index:+"+(i+(s.length()-buffer.length())+1));
                System.out.println("start index:+"+index);
                buffer = buffer.substring(index+1);
                sb = new StringBuilder(buffer);
                sb.append(s.charAt(i));
                buffer = sb.toString();
                System.out.println("new buffer:"+buffer);

            }
            if(sb.toString().length() > longest_substring.length())
                longest_substring = sb.toString();
            System.out.println("current substring:"+ sb.toString()+"\n");
        }
        System.out.println("longest substring:"+ longest_substring);
        return longest_substring.length();
    }
}
