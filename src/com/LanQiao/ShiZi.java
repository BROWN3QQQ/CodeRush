package com;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Classname ShiZi
 * @Description TODO
 * @Date 2019/3/12 16:12
 * @Created by CQ
 * @LinkUrl ：蓝桥杯算法，十字,https://acmore.cc/problem/LOCAL/1595
 */
public class ShiZi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int i = 5 + (n-1)*2;
        String [][] arry = new String[2*i][2*i];

        arry[1][1] = ".";
        arry[2][1] = ".";
        arry[2][2] = ".";
        for (int p = 3;p<i+1;p++){
            if (p % 2 != 0){
                    arry[p][p] = "$";
                    arry[p][p - 1] = "$";
                    arry[p][p - 2] = "$";
            }else{
                    arry[p][p] = ".";
                    arry[p][p - 1] = ".";
                    arry[p][p - 2] = ".";
            }
        }
        int t =1;
        for (int k = 4;k<i+1;k++){
            for (int o = 1;o <= t;o++){
                if (o % 2 != 0){
                    arry[k][o] = "$";
                }else{
                    arry[k][o] = ".";
                }
            }
            t++;
        }
        for (int j = 1;j<arry.length; j++){
            for (int k = 1;k<arry.length;k++){
                arry [j][k] = arry[k][j] ;
            }
        }
        for (int j = arry.length - 1;j > 0; --j){
            for (int k = 1;k<i + 1;k++){
                arry[k][j] = arry[k][arry.length - j];
            }
        }
        for (int j = 1;j < i+ 1; j++){
            for (int k = 1;k<arry.length;k++){
                arry[arry.length - j][arry.length - k] = arry[j][k];
            }
        }

        for (int j = 1;j<arry.length; j++){
            for (int k = 1;k<arry.length;k++){
                System.out.print(arry[j][k]);
            }
            System.out.println("");
        }

    }
}
