package com.LinkedList.DynamicProgramming;

/**
 * @Classname MaximumSubarray
 * @Description 我还真是弱啊，这段代码击败了1%的提交。。。。
 * @Date 2019/3/6 12:13
 * @Created by CQ
 *
 */
public class MaximumSubarray {
    class Solution {
        public int maxSubArray(int[] nums) {

            int sum = 0;
            int truemax = -100000;
            int max ;
            int len = nums.length;
            if(len == 1)
                return nums[0];
            for(int i = 0;i<len;i++){
                sum = nums[i];
                max = sum;
                for (int j = i + 1 ;j < len ;j++){
                    sum +=  nums[j];
                    if(max < sum)
                        max = sum;
                }
                if(max < sum)
                    max = sum;
                if(truemax < max){
                    truemax = max;
                }
            }
            return truemax;
        }
    }
}
