package com.github.ptlux1517.leetcode.medium;

import com.github.ptlux1517.leetcode.medium.P2_Add_Two_Numbers.ListNode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class P2_Add_Two_Numbers_Tests {

   P2_Add_Two_Numbers problem = new P2_Add_Two_Numbers();

   @Test
   public void example1Test() {
      ListNode res = problem.addTwoNumbers(
         new ListNode(2,new ListNode(4,new ListNode(3))),
         new ListNode(5,new ListNode(6,new ListNode(4)))
      );
      ListNode exp =
         new ListNode(7,new ListNode(0,new ListNode(8)));
      assertEquals(exp.toString(),res.toString());
   }

   @Test
   public void example2Test() {
      ListNode res = problem.addTwoNumbers(
         new ListNode(0),
         new ListNode(0)
      );
      ListNode exp =
         new ListNode(0);
      assertEquals(exp.toString(),res.toString());
   }

   @Test
   public void example3Test() {
      ListNode res = problem.addTwoNumbers(
         new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))),
         new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))
      );
      ListNode exp =
         new ListNode(8,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(0,new ListNode(0,new ListNode(0,new ListNode(1))))))));
      assertEquals(exp.toString(),res.toString());
   }
}
