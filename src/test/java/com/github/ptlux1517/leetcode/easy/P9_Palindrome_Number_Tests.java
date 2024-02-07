package com.github.ptlux1517.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P9_Palindrome_Number_Tests {

   P9_Palindrome_Number problem = new P9_Palindrome_Number();

   @Test
   public void example1Test() {
      boolean res = problem.isPalindrome(121);
      boolean exp = true;
      assertEquals(exp,res);
   }

   @Test
   public void example2Test() {
      boolean res = problem.isPalindrome(-121);
      boolean exp = false;
      assertEquals(exp,res);
   }
   
   @Test
   public void example3Test() {
      boolean res = problem.isPalindrome(10);
      boolean exp = false;
      assertEquals(exp,res);
   }
}
