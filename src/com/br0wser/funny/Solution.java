package com.br0wser.funny;

import java.util.Comparator;
import java.util.HashMap;
import java.util.NavigableSet;
import java.util.TreeSet;

/**
 * Created by browser on 16/3/4.
 */
public class Solution {

    /**
     * NO.217 Contains Duplicate
     * Given an array of integers, find if the array contains any duplicates.
     * Your function should return true if any value appears at least twice in the array,
     * and it should return false if every element is distinct.
     */
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            } else {
                map.put(nums[i], 1);
            }
        }
        return false;
    }

    /**
     * No.219 Contains Duplicate II
     * Given an array of integers and an integer k, find out whether there are two distinct
     * indices i and j in the array such that nums[i] = nums[j] and the difference between i and j is at most k.
     */
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums==null || nums.length<2) {
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            int key = nums[i];
            if (map.containsKey(key) && i-map.get(key)<=k) {
                return true;
            } else {
                map.put(key, i);
            }
        }
        return false;
    }

    /**
     * NO.220 Contains Duplicate III
     * Given an array of integers, find out whether there are two distinct indices i and j in the array
     * such that the difference between nums[i] and nums[j] is at most t and the difference between i and j is at most k.
     */

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, final int t) {
        if (nums==null || nums.length==1 || k==0) {
            return false;
        }

        if (k>=nums.length) {
            k = nums.length-1;
        }

        NavigableSet<Integer> set = new TreeSet<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                long diff = (long)o1-o2;//overflow
                if (Math.abs(diff)<=t) {
                    return 0;
                } else {
                    return diff>0?1:-1;
                }
            }
        });


        for (int i = 0; i <= k ; i++) {
            if (!set.add(nums[i])) {
                return true;
            }
        }

        for (int i = k+1; i < nums.length; i++) {
            set.remove(nums[i-k-1]);
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }

    /**
     * NO.292 Nim Game
     * You are playing the following Nim Game with your friend: There is a heap of stones on the table,
     * each time one of you take turns to remove 1 to 3 stones. The one who removes the last stone will be the winner.
     * You will take the first turn to remove the stones.
     * Both of you are very clever and have optimal strategies for the game. Write a function to determine
     * whether you can win the game given the number of stones in the heap.
     * For example, if there are 4 stones in the heap, then you will never win the game:
     * no matter 1, 2, or 3 stones you remove, the last stone will always be removed by your friend.
     */

    public boolean canWinNim(int n) {
        return n%4!=0;
    }

    /**
     * No.258 Add Digits
     * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
     * For example:
     * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
     */

    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }

    public int addDigits2(int num) {
        if (num%9==0 && num!=0) {
            return 9;
        }
        return num%9;
    }

}
