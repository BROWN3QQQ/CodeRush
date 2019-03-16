package com.LanQiao;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Classname maibudaodeshumu
 * @Description TODO
 * @Date 2019/3/14 14:25
 * @Created by CQ
 * @LinkUrl ：https://acmore.cc/problem/LOCAL/1601#submit
 */
public class maibudaodeshumu {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();

        int max = n*m - (n+m);
        System.out.println(max);
    }

}
