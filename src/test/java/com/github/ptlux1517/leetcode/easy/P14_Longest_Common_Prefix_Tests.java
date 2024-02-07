package com.github.ptlux1517.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P14_Longest_Common_Prefix_Tests {

   P14_Longest_Common_Prefix problem = new P14_Longest_Common_Prefix();

   @Test
   public void example1Test() {
      String res = problem.longestCommonPrefix(new String[] {"flower", "flow", "flight"});
      String exp = "fl";
      assertEquals(exp,res);
   }

   @Test
   public void example2Test() {
      String res = problem.longestCommonPrefix(new String[] {"dog","racecar","car"});
      String exp = "";
      assertEquals(exp,res);
   }
}