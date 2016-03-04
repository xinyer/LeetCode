package com.br0wser.string;

import java.util.Arrays;

public class Solution {

    /**
     * NO.242 Valid Anagram My Submissions Question
     * Given two strings s and t, write a function to determine if t is an anagram of s.
     * For example,
     * s = "anagram", t = "nagaram", return true.
     * s = "rat", t = "car", return false.
     * Note:
     * You may assume the string contains only lowercase alphabets.
     */
    public boolean isAnagram2(String s, String t) {

        if (s==null || t==null || s.length()!=t.length()) {
            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        if (new String(sc).equals(new String(tc))) {
            return true;
        }

        return false;
    }

    public boolean isAnagram(String s, String t) {

        if (s==null || t==null || s.length()!=t.length()) {
            return false;
        }

        int[] array = new int[256];

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        for (char c : sc) {
            array[c]++;
        }

        for (char c : tc) {
            if (array[c]>0) {
                array[c]--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
//        System.out.println(new Solution().isAnagram("abfceff", "becfffa"));
    }
}
