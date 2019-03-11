package com.Sort;

import java.util.Arrays;

/**
 * @Classname SquaresOfASortedArray
 * @Description 简单的题，但是评论里都有不一样的解答，受益匪浅
 * @Date 2019/3/10 15:42
 * @Created by CQ
 * @LinkUrl ：https://leetcode-cn.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfASortedArray {
    class Solution {
        public int[] sortedSquares(int[] A) {
            int n = 0;
            for (int i : A){
                A[n] = i*i;
                n++;
            }
            Arrays.sort(A);
            return A;
        }
    }
}
