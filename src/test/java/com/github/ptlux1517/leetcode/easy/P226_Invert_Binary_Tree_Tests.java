package com.github.ptlux1517.leetcode.easy;

import com.github.ptlux1517.leetcode.easy.P226_Invert_Binary_Tree.TreeNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P226_Invert_Binary_Tree_Tests {

   P226_Invert_Binary_Tree problem = new P226_Invert_Binary_Tree();

   @Test
   public void example1Test() {
      TreeNode res = problem.invertTree(
         new TreeNode(4,
            new TreeNode(2,
               new TreeNode(1),
               new TreeNode(3)
            ),
            new TreeNode(7,
               new TreeNode(6),
               new TreeNode(9)
            )
         )
      );
      TreeNode exp =
         new TreeNode(4,
            new TreeNode(7,
               new TreeNode(9),
               new TreeNode(6)
            ),
            new TreeNode(2,
               new TreeNode(3),
               new TreeNode(1)
            )
         );
      assertEquals(exp.toString(),res.toString());
   }
   
   @Test
   public void example2Test() {
      TreeNode res = problem.invertTree(
         new TreeNode(2,
            new TreeNode(1),
            new TreeNode(3)
         )
      );
      TreeNode exp =
         new TreeNode(2,
            new TreeNode(3),
            new TreeNode(1)
         );
      assertEquals(exp.toString(),res.toString());
   }
   
   @Test
   public void example3Test() {
      TreeNode res = problem.invertTree(new TreeNode());
      TreeNode exp = new TreeNode();
      assertEquals(exp.toString(),res.toString());
   }
}
