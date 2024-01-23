package com.github.ptlux1517.leetcode.easy;

import com.github.ptlux1517.leetcode.Utils;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.stream.IntStream;


public class P9_Palindrome_Number {

   int probNum = 9;
   String probName = "Palindrome Number";


   public boolean isPalindrome(int x) {
      if (x<0) return false; //negative sign always results in non-palindrome
      boolean isPalindrome = true;

      List<Integer> xList = toList(x);


      ListIterator<Integer> forwardIter = xList.listIterator();
      ListIterator<Integer> reverseIter = xList.listIterator(xList.size());
      int mid = xList.size()/2;

      while (forwardIter.hasNext() && reverseIter.hasPrevious() && forwardIter.nextIndex()<mid) {
         Integer f = forwardIter.next();
         Integer r = reverseIter.previous();
         isPalindrome = isPalindrome && f.equals(r);
      }

      return isPalindrome;
   }


   private List<Integer> toList(int x) {
      LinkedList<Integer> list = new LinkedList<>();
      IntStream.iterate(0, i->i+1)
         .mapToDouble(i -> Math.pow(10,i))
         .takeWhile(powOf10 -> powOf10<=Integer.MAX_VALUE && x/(int)powOf10!=0)
         .mapToInt(powOf10 -> (x/(int)powOf10)%10)
         .forEach(list::addFirst);
      return list;
   }


   public Duration run() {
      /* Provided input */
      int arg1 = 121;

      /* Expected output */
      boolean exp = true;

      /* Computed output with run time */
      Temporal start = Instant.now();
      boolean sol = isPalindrome(arg1);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """               
         Problem %d: %s
         Given an integer x, return true if x is a palindrome, and false otherwise.
         
         Constraints:
         * -2^31<=x<=(2^31)-1
         
         Input: x=%d
         Output: %b
         Expected: %b
         Explanation: %d reads as %d from left to right and from right to left.
         """, probNum, probName, arg1, sol, exp, arg1, arg1
      );

      /* Pass/Fail status */
      Utils.printPassFail(sol==exp);

      return Duration.between(start,end);
   }
}
