package com.github.ptlux1517.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P13_Roman_To_Integer_Tests {

   P13_Roman_To_Integer problem = new P13_Roman_To_Integer();

   @Test
   public void example1Test() {
      int res = problem.romanToInt("III");
      int exp = 3;
      assertEquals(exp,res);
   }

   @Test
   public void example2Test() {
      int res = problem.romanToInt("LVIII");
      int exp = 58;
      assertEquals(exp,res);
   }

   @Test
   public void example3Test() {
      int res = problem.romanToInt("MCMXCIV");
      int exp = 1994;
      assertEquals(exp,res);
   }
}
