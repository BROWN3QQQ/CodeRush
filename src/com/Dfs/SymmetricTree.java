package com.Dfs;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * @Classname SymmetricTree
 * @Description TODO
 * @Date 2019/3/29 21:07
 * @Created by CQ
 * @LinkUrl ：https://leetcode-cn.com/problems/symmetric-tree/
 */
public class SymmetricTree {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }

    class Solution {
        public boolean isSymmetric(TreeNode root) {
            return isMirror(root, root);
        }

        private boolean isMirror(TreeNode root1, TreeNode root2) {
            if(root1 == null) return root2 == null;
            if(root2 == null) return root1 == null;
            if(root1.val != root2.val) return false;
            return isMirror(root1.left, root2.right) && isMirror(root1.right, root2.left);
        }
    }

}
