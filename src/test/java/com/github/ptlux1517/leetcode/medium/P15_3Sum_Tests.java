package com.github.ptlux1517.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class P15_3Sum_Tests {

   P15_3Sum problem = new P15_3Sum();

   @Test
   public void example1Test() {
      List<List<Integer>> res = problem.threeSum(new int[] {-1,0,1,2,-1,-4});
      List<List<Integer>> exp = List.of(
         List.of(-1,-1,2),
         List.of(-1,0,1)
      );
      assertEquals(exp,res);
   }

   @Test
   public void example2Test() {
      List<List<Integer>> res = problem.threeSum(new int[] {0,1,1});
      List<List<Integer>> exp = List.of();
      assertEquals(exp,res);
   }

   @Test
   public void example3Test() {
      List<List<Integer>> res = problem.threeSum(new int[] {0,0,0});
      List<List<Integer>> exp = List.of(List.of(0,0,0));
      assertEquals(exp,res);
   }
}
