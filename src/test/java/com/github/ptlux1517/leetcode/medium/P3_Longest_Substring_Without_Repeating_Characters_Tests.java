package com.github.ptlux1517.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P3_Longest_Substring_Without_Repeating_Characters_Tests {

   P3_Longest_Substring_Without_Repeating_Characters problem = new P3_Longest_Substring_Without_Repeating_Characters();

   @Test
   public void example1Test() {
      int res = problem.lengthOfLongestSubstring("abcabcbb");
      int exp = 3;
      assertEquals(exp,res);
   }

   @Test
   public void example2Test() {
      int res = problem.lengthOfLongestSubstring("bbbbb");
      int exp = 1;
      assertEquals(exp,res);
   }

   @Test
   public void example3Test() {
      int res = problem.lengthOfLongestSubstring("pwwkew");
      int exp = 3;
      assertEquals(exp,res);
   }
}
