package com.github.ptlux1517.leetcode.easy;

import com.github.ptlux1517.leetcode.Utils;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.Comparator;


public class P14_Longest_Common_Prefix {

   int probNum = 14;
   String probName = "Longest Common Prefix";


   public String longestCommonPrefix(String[] strs) {
      String commonPrefix = "";
      if (strs==null || strs.length==0) return commonPrefix;
      int minLength = Arrays.stream(strs)
         .min(Comparator.comparingInt(String::length))
         .orElse("")
         .length();
      boolean matches = true;
      for (int idx=0; idx<minLength; idx++) {
         char charToMatch = strs[0].charAt(idx);
         for (int str=1; str<strs.length; str++) {
            matches = matches && strs[str].charAt(idx)==charToMatch;
         }
         if (matches) commonPrefix += charToMatch;
         else break;
      }
      return commonPrefix;
   }


   public Duration run() {
      /* Provided input */
      String[] arg1 = new String[] {"flower", "flow", "flight"};

      /* Expected output */
      String exp = "fl";

      /* Computed output with run time */
      Temporal start = Instant.now();
      String sol = longestCommonPrefix(arg1);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """               
         Problem %d: %s
         Write a function to find the longest common prefix string amongst an array of strings.
         If there is no common prefix, return an empty string "".
         
         Constraints:
         * 1<=strs.length<=200
         * 0<=strs[i].length<=200
         * strs[i] consists of only lowercase English letters.
         
         Input: strs = ["flower","flow","flight"]
         Output: %s
         Expected: %s
         Explanation:
         """, probNum, probName, sol, exp
      );

      /* Pass/Fail status */
      Utils.printPassFail(sol.equals(exp));

      return Duration.between(start,end);
   }
}
