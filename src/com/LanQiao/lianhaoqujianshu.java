package com.LanQiao;

import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

/**
 * @Classname lianhaoqujianshu
 * @Description TODO
 * @Date 2019/3/14 11:59
 * @Created by CQ
 * @LinkUrl ：https://acmore.cc/problem/LOCAL/1600#submissions
 * 时间超过限制
 */
public class lianhaoqujianshu {

    static boolean check (Vector<Integer> vector){
        Collections.sort(vector);
        boolean statue = true;
        if (vector.elementAt(vector.size() -1) - vector.elementAt(0) + 1 != vector.size())
            statue= false;
        return statue;
    }

    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0;

        while (n > 0){
            vector.add(scan.nextInt());
            --n;
        }

        for (int i = 0;i < vector.size();i++){
            Vector<Integer> newvector = new Vector<>();
            for (int j = i;j < vector.size();j++){
                newvector.add(vector.elementAt(j));
                if (newvector.size() == 1){
                    System.out.println(newvector);
                    sum = sum + 1;
                    continue;
                }
                if (check(newvector)){
                    System.out.println(newvector);
                    sum = sum + 1;
                }
            }
        }
        System.out.println(sum);
    }


}
