package com.br0wser.array;

/**
 * Created by browser on 16/3/4.
 */
public class Solution {

    /**
     * NO.27 Remove Element My Submissions Question
     * Given an array and a value, remove all instances of that value in place and return the new length.
     * The order of elements can be changed. It doesn't matter what you leave beyond the new length.
     */

    public int removeElement(int[] nums, int val) {
        int l=-1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[++l] = nums[i];
            }
        }

        return l+1;
    }

    /**
     * NO. 283 Move Zeroes My Submissions Question
     * Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

     * Note:
     * You must do this in-place without making a copy of the array.
     * Minimize the total number of operations.
     */

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j=i+1; j < nums.length; j++)
                if (nums[i] == 0 && nums[i]!=nums[j]) {
                    swap(nums, i, j);
                }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

}
