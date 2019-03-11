package com.LinkedList.DynamicProgramming;

/**
 * @Classname RangeSumQueryImmutable
 * @Description TODO
 * @Date 2019/3/9 17:23
 * @Created by CQ
 */
public class RangeSumQueryImmutable {
    //解法一
    class NumArray {
        private int[] array;

        public NumArray(int[] nums) {
            array=nums;
            int sum = 0;
            for (int i =0; i<nums.length;i++){
                sum += nums[i];
                array[i] = sum;
            }

        }

        public int sumRange(int i, int j) {

            return i==0?(array[j]):(array[j] - array[i-1]);
        }
    }
}
