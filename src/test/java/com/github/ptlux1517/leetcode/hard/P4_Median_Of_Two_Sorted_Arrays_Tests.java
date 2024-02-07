package com.github.ptlux1517.leetcode.hard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P4_Median_Of_Two_Sorted_Arrays_Tests {

   P4_Median_Of_Two_Sorted_Arrays problem = new P4_Median_Of_Two_Sorted_Arrays();

   @Test
   public void example1Test() {
      double res = problem.findMedianSortedArrays(new int[] {1,3},new int[] {2});
      double exp = 2.00000;
      assertEquals(exp,res);
   }

   @Test
   public void example2Test() {
      double res = problem.findMedianSortedArrays(new int[] {1,2},new int[] {3,4});
      double exp = 2.50000;
      assertEquals(exp,res);
   }
}
