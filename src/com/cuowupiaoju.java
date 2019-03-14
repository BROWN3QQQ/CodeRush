package com;

import java.util.*;
/**
 * @Classname daifenshu
 * @Description TODO
 * @Date 2019/3/12 17:49
 * @Created by CQ
 * @LinkUrl ：蓝桥杯算法：错误票据
 */
public class cuowupiaoju {


    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        while (n  > 0){
            n = n -1 ;
            String[] strarry = scan.nextLine().split(" ");
            for(int i = 0;i < strarry.length;i++){
                vector.add(Integer.valueOf(strarry[i]));
            }
        }
        scan.close();
        Collections.sort(vector);
        int a = 0;
        int b = 0;
        for (int i = 0;i < vector.size();i++){
            if (i == vector.size() - 1)
                break;
            if (vector.elementAt(i+1) - vector.elementAt(i) == 2){

                a = vector.elementAt(i) + 1;
            }
            if (vector.elementAt(i+1) - vector.elementAt(i) == 0){

                b = vector.elementAt(i);
            }
        }
        System.out.print(a + " " + b);

    }
}
