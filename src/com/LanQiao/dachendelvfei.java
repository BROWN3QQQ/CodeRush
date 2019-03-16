package com.LanQiao;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Classname dachendelvfei
 * @Description TODO
 * @Date 2019/3/14 21:07
 * @Created by CQ
 * @LinkUrl ：https://acmore.cc/problem/LOCAL/1602
 * 题目：大臣的旅费
 */
public class dachendelvfei {
    static boolean check(int k,Vector<Integer> vector){
        boolean state;
        while ((vector.size() + 1) > k){
            vector.remove(k);
            k *=k;
        }


        return true;
    }
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Scanner scan = new Scanner(System.in);
        vector.add(-1);
        int n = scan.nextInt();
        int m = scan.nextInt();
        scan.close();
        while (m>n + 1){
            vector.add(n+1);
            n = n + 1;
        }
        int j = 1;
        int temp = 0;
        int temp2 = vector.elementAt(j);
        int k = vector.elementAt(j);
        while (vector.size()  >= k){
            vector.set(k,-1);
            temp = temp + 1;
            k =temp*temp2;
            if (k >= vector.size() ){
                for (int p = 1;p<vector.size();p++){
                    if (vector.elementAt(p) == -1){
                        vector.remove(p);
                    }
                }
                j = j + 1;
                temp =0;
                temp2 = vector.elementAt(j);
                k = vector.elementAt(j);
            }
        }
        System.out.println("!");
        System.out.println(vector.size() -1 );

    }
}
