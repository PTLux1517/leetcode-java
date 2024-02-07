package com.github.ptlux1517.leetcode.medium;

import com.github.ptlux1517.leetcode.Utils;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;


public class P2_Add_Two_Numbers {

   int probNum = 2;
   String probName = "Add Two Numbers";


   /* LeetCode definition for singly-linked list. */
   static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      public String toString() {
         String s = "[";
         for (ListNode curr=this; curr!=null; curr=curr.next) {
            s += curr.val;
            if (curr.next!=null) s+= ", ";
         }
         s += "]";
         return s;
      }
   }


   public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
      return addTwoNumbers(l1,l2,0);
   }


   private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
      if ((l1==null || l2==null) && carry==0)
         return (l1==null) ? l2 : l1;
      ListNode l1NonNull = (l1==null) ? new ListNode() : l1;
      ListNode l2NonNull = (l2==null) ? new ListNode() : l2;
      int sum = l1NonNull.val+l2NonNull.val+carry;
      ListNode solutionNode = new ListNode(sum%10);
      solutionNode.next = addTwoNumbers(l1NonNull.next,l2NonNull.next,sum/10);
      return solutionNode;
   }


   public Duration run() {
      /* Provided input */
      ListNode arg1 = new ListNode(2,new ListNode(4,new ListNode(3)));
      ListNode arg2 = new ListNode(5,new ListNode(6,new ListNode(4)));

      /* Expected output */
      String exp = "[7, 0, 8]";

      /* Computed output with run time */
      Temporal start = Instant.now();
      ListNode sol = addTwoNumbers(arg1,arg2);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """               
         Problem %d: %s
         You are given two non-empty linked lists representing two non-negative integers.
         The digits are stored in reverse order, and each of their nodes contains a single digit.
         Add the two numbers and return the sum as a linked list.
         You may assume the two numbers do not contain any leading zero, except the number 0 itself.
         
         Constraints:
         * The number of nodes in each linked list is in the range [1,100]
         * 0<=Node.val<=9
         * It is guaranteed that the list represents a number that does not have leading zeros
         
         Input: l1 = [2, 4, 3],  l2 = [5, 6, 4]
         Output: %s
         Expected: %s
         Explanation: 342 + 465 = 807
         """, probNum, probName, sol, exp
      );

      /* Pass/Fail status */
      Utils.printPassFail(sol.toString().equals(exp));

      return Duration.between(start,end);
   }
}
