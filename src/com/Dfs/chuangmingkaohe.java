package com.Dfs;

import java.sql.Array;
import java.util.*;

/**
 * @Classname chuangmingkaohe
 * @Description TODO
 * @Date 2019/3/22 12:39
 * @Created by CQ
 * @LinkUrl ：创明C++组机试招新机试题
 */
public class chuangmingkaohe {
    static  int k;
    static  int n;
    static int[] num = {0,1,2,3,4,5,6,7,8,9};
    static int[] status = {0,0,0,0,0,0,0,0,0,0,0};
    static   List<int[]> list = new ArrayList<>();
    static  int[] temp = null;
    static int tempnum = 0;

    static Vector<int[]> vector = new Vector<>();
    public static void dfs(int layer ){
        if (layer == k ) {
            int tempnum = n;
            for (int j = 1;j <= k;j++){
                tempnum -=temp[j];
            }
            if (tempnum == 0){
                System.out.println(Arrays.toString(temp));
            }
            return;
        }
        layer = layer + 1;
        for(int q = temp[layer-1] + 1;q <= 9;q++){
            if (status[q] == 0){
                status[q] = 1;
                temp[layer] = num[q];
                dfs(layer);
                status[q] = 0;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        k = scan.nextInt();
        n = scan.nextInt();
        scan.close();
        Map<String, String> map = new HashMap<String, String>();
        temp = new int[k + 1];
        dfs(0);
    }
}
