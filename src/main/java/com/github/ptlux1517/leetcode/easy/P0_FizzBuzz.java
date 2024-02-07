package com.github.ptlux1517.leetcode.easy;

import com.github.ptlux1517.leetcode.Utils;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.stream.IntStream;

/**
 * Dummy class for non-leetcode problems
 */
public class P0_FizzBuzz {

   int probNum = 0;
   String probName = "Fizzbuzz";


   public void fizzbuzz(int n) {
      IntStream.rangeClosed(1,n)
         .forEach(x -> {
            if (x%15==0) System.out.println("FizzBuzz");
            else if (x%5==0) System.out.println("Buzz");
            else if (x%3==0) System.out.println("Fizz");
            else System.out.println(x);
         });
   }


   public Duration run() {
      /* Provided input */
      int arg1 = 100;

      /* Expected output */
      //none

      /* Computed output with run time */
      Temporal start = Instant.now();
      fizzbuzz(arg1);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf("Problem %d: %s\n", probNum, probName);

      /* Pass/Fail status */
      Utils.printPassFail(true);

      return Duration.between(start,end);
   }


   // -------------------------------- Other Non-LeetCode Problems ---------------------------------
   /**
    * @return idx of target elem, or -1 if not present
    */
   private static int binarySearch(int[] arr, int lIdx, int rIdx, int target) {
      if (lIdx>rIdx) return -1;
      int mid = lIdx + (rIdx-lIdx)/2;
      if (arr[mid]>target) return binarySearch(arr,lIdx,mid-1,target);
      if (arr[mid]<target) return binarySearch(arr,mid+1,rIdx,target);
      return mid;
   }
}
