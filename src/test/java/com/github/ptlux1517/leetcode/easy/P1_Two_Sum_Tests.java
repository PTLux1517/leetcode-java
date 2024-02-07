package com.github.ptlux1517.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P1_Two_Sum_Tests {

   P1_Two_Sum problem = new P1_Two_Sum();

   @Test
   public void example1Test() {
      int[] res = problem.twoSum(new int[] {2,7,11,15}, 9);
      int[] exp = new int[] {0,1};
      assertArrayEquals(exp,res);
   }

   @Test
   public void example2Test() {
      int[] res = problem.twoSum(new int[] {3,2,4}, 6);
      int[] exp = new int[] {1,2};
      assertArrayEquals(exp,res);
   }

   @Test
   public void example3Test() {
      int[] res = problem.twoSum(new int[] {3,3}, 6);
      int[] exp = new int[] {0,1};
      assertArrayEquals(exp,res);
   }
}
