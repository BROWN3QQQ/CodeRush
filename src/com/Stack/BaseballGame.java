package com.Stack;

import java.util.Stack;

/**
 * @Classname BaseballGame
 * @Description 很简单的栈实现,但是我实现的很复杂，在保证代码简洁的情况下，令逻辑清晰
 * @Date 2019/3/10 11:54
 * @Created by CQ
 * @LinkUrl ：https://leetcode-cn.com/problems/baseball-game/
 */
public class BaseballGame {
    class Solution {
        public int calPoints(String[] ops) {
            Stack<Integer> stack = new Stack();

            for(String op : ops) {
                if (op.equals("+")) {
                    int top = stack.pop();
                    int newtop = top + stack.peek();
                    stack.push(top);
                    stack.push(newtop);
                } else if (op.equals("C")) {
                    stack.pop();
                } else if (op.equals("D")) {
                    stack.push(2 * stack.peek());
                } else {
                    stack.push(Integer.valueOf(op));
                }
            }

            int ans = 0;
            for(int score : stack) ans += score;
            return ans;
        }
    }

}
