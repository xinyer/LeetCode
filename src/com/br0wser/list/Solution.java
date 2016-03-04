package com.br0wser.list;

/**
 * Created by browser on 16/3/4.
 */
public class Solution {

    /**
     * NO.203 Remove Linked List Elements
     * Remove all elements from a linked list of integers that have value val.
     * Example
     * Given: 1 --> 2 --> 6 --> 3 --> 4 --> 5 --> 6, val = 6
     * Return: 1 --> 2 --> 3 --> 4 --> 5
     */

    public ListNode removeElements(ListNode head, int val) {

        if (head == null) {
            return null;
        }

        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode p = head;
        while (p != null && p.next != null) {
            if (p.next.val == val) {
                p.next = p.next.next;
            } else {
                p = p.next;
            }
        }

        return head;
    }

}
