package com.github.ptlux1517.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class P228_Summary_Ranges_Tests {
   
   P228_Summary_Ranges problem = new P228_Summary_Ranges();
   
   @Test
   public void example1Test() {
      List<String> res = problem.summaryRanges(new int[] {0,1,2,4,5,7});
      List<String> exp = List.of("0->2","4->5","7");
      assertEquals(exp,res);
   }

   @Test
   public void example2Test() {
      List<String> res = problem.summaryRanges(new int[] {0,2,3,4,6,8,9});
      List<String> exp = List.of("0","2->4","6","8->9");
      assertEquals(exp,res);
   }
}
