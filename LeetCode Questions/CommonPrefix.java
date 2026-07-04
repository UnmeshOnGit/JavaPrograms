// 14. Longest Common Prefix
// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".


import java.util.*;
public class CommonPrefix{
    public static String commonPrefix(String s1, String s2){
        int n = Math.min(s1.length(), s2.length());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            if(s1.charAt(i) == s2.charAt(i)){
                sb.append(s1.charAt(i));
            }else{
                break;
            }
        }
        return sb.toString();
    }
    public static void main(String[] args){
        String strs [] = {"flower", "flow", "flour"};
        String res = strs[0];
        for(int i = 1; i < strs.length; i++){
            res = commonPrefix(res, strs[i]);
        }
        System.out.println(res);
    } 
}