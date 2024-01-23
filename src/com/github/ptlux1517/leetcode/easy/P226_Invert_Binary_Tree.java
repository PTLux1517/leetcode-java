package com.github.ptlux1517.leetcode.easy;

import com.github.ptlux1517.leetcode.Utils;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.LinkedList;
import java.util.Queue;
import java.util.function.Function;


public class P226_Invert_Binary_Tree {

   int probNum = 226;
   String probName = "Invert Binary Tree";


   public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
      @Override
      public String toString() {
         StringBuilder sb = new StringBuilder("[");
         Queue<TreeNode> q = new LinkedList<>();
         q.offer(this);
         mapLevelOrder(q, (TreeNode node) -> sb.append(node.val).append(","));
         if (sb.charAt(sb.length()-1) == ',')
            sb.setLength(sb.length()-1);
         return sb.append("]").toString();
      }
      private void mapLevelOrder(Queue<TreeNode> q, Function<TreeNode,?> f) {
         TreeNode curr = q.poll();
         if (curr == null) return;
         f.apply(curr);
         q.offer(curr.left);
         q.offer(curr.right);
         mapLevelOrder(q, f);
      }
   }


   public TreeNode invertTree(TreeNode root) {
      if (root == null) return null;
      TreeNode tempL = root.left;
      root.left = root.right;
      root.right = tempL;
      invertTree(root.left);
      invertTree(root.right);
      return root;
   }


   public Duration run() {
      /* Provided input */
      TreeNode arg1 = new TreeNode( //root
         4,
         new TreeNode( //left
            2,
            new TreeNode(1),
            new TreeNode(3)
         ),
         new TreeNode( //right
            7,
            new TreeNode(6),
            new TreeNode(9)
         )
      );

      /* Expected output */
      TreeNode exp = new TreeNode( //root
         4,
         new TreeNode( //left
            7,
            new TreeNode(9),
            new TreeNode(6)
         ),
         new TreeNode( //right
            2,
            new TreeNode(3),
            new TreeNode(1)
         )
      );

      /* Computed output with run time */
      Temporal start = Instant.now();
      TreeNode sol = invertTree(arg1);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """               
         Problem %d: %s
         Given the root of a binary tree, invert the tree, and return its root.
         
         Constraints:
         * The number of nodes in the tree is in the range [0, 100]
         * -100 <= Node.val <= 100
         
         Input: root = %s
         Output: %s
         Expected: %s
         """, probNum, probName, arg1, sol, exp
      );

      /* Pass/Fail status */
      Utils.printPassFail(sol.toString().equals(exp.toString()));

      return Duration.between(start,end);
   }
}
