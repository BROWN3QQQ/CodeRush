package com;

import java.util.Scanner;

/**
 * @Classname Main
 * @Description TODO
 * @Date 2019/3/12 9:16
 * @Created by CQ
 * @LinkUrl ：蓝桥杯算法，砸核桃https://acmore.cc/problem/LOCAL/1594#desc
 */
public class ZaHeTao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        // 获得a, b的最小公倍数min
        int min = a * b / gcd(a, b);
        // 获得c，min的最小公倍数，即是答案
        int result = min * c / gcd(min, c);
        System.out.println(result);
    }
    private static int gcd(int n, int m) {
        return m == 0 ? n : gcd(m, n % m);
    }
}
