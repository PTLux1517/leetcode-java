package com.github.ptlux1517.leetcode.medium;

import com.github.ptlux1517.leetcode.Utils;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.HashSet;


public class P3_Longest_Substring_Without_Repeating_Characters {

   int probNum = 3;
   String probName = "Longest Substring Without Repeating Characters";


   public int lengthOfLongestSubstring(String s) {
      HashSet<Character> charsInCurrentSubstring = new HashSet<>();
      int lowIdx = 0;
      int highIdx = 0;
      int maxLength = 0;

      while (highIdx<s.length()) {
         if (!charsInCurrentSubstring.contains(s.charAt(highIdx))) {
            charsInCurrentSubstring.add(s.charAt(highIdx++));
            maxLength = Math.max(maxLength,highIdx-lowIdx);
         }
         else {
            do {
               charsInCurrentSubstring.remove(s.charAt(lowIdx++));
            } while (s.charAt(lowIdx-1)!=s.charAt(highIdx));
         }
      }

      return maxLength;
   }


   public Duration run() {
      /* Provided input */
      String arg1 = "abcabcbb";

      /* Expected output */
      int exp = 3;

      /* Computed output with run time */
      Temporal start = Instant.now();
      int sol = lengthOfLongestSubstring(arg1);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """
         Problem %d: %s
         Given a string s, find the length of the longest substring without repeating characters.
         
         Constraints:
         * 0<=s.length<=5*10^4
         * s consists of English letters, digits, symbols, and spaces
         
         Input: s = abcabcbb
         Output: %d
         Expected: %d
         Explanation: The answer is "abc", with the length of 3
         """, probNum, probName, sol, exp
      );

      /* Pass/Fail status */
      Utils.printPassFail(sol==exp);

      return Duration.between(start,end);
   }
}
