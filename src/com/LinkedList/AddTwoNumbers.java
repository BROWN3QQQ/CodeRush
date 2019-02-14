package com.LinkedList;

/**
 * @Classname AddTwoNumbers
 * @Description 我相信我自己，我能超越我自己，别幻想一些无用的努力去感动自己，去触碰自己痛苦区
 * @Date 2019/2/14 0:26
 * @Created by CQ
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode temp1 = l1;
            ListNode temp2 = l2;
            ListNode listNode = new ListNode(0);
            ListNode temp = listNode;
            int sum = 0;
            while (temp1 != null || temp2 != null) {
                sum /= 10;
                if (temp1 != null) {
                    sum += temp1.val;
                    temp1 = temp1.next;
                }
                if (temp2 != null) {
                    sum += temp2.val;
                    temp2 = temp2.next;
                }
                temp.next = new ListNode(sum % 10);
                temp = temp.next;
            }
            if (sum > 9) {
                temp.next = new ListNode(1);
            }
            return listNode.next;
        }

    }
}
/*
* 首位相加，卡判断条件，然后加就完事了*/