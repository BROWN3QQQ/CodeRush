package com.DynamicProgramming;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

/**
 * @Classname gold
 * @Description TODO
 * @Date 2019/3/16 12:22
 * @Created by CQ
 * @LinkUrl ：
 */
public class gold {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] gold = {1,3,5};
        int[] dp = new int[n+1];
        dp[0] = 0;

        for (int i = 1 ;i<n+1;i++){
            for (int j = 0 ;j<3;j++){
               if (i>= gold[j]){
                   if (dp[i]  == 0){
                       dp[i] = dp[i-gold[j]] + 1;
                   }else {
                       dp[i] = Math.min(dp[i],dp[i-gold[j]] + 1);
                   }
               }
            }
        }
        System.out.println(dp[n]);
    }

}
