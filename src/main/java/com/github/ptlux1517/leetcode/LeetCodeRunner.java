package com.github.ptlux1517.leetcode;

import com.github.ptlux1517.leetcode.easy.*;
import com.github.ptlux1517.leetcode.medium.*;
import com.github.ptlux1517.leetcode.hard.*;

import java.time.Duration;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.SECONDS;


public class LeetCodeRunner {

   public static void main(String[] args) {

      System.out.print("\nEnter the problem number: ");
      int problemNum = Integer.parseInt(new Scanner(System.in).nextLine());
      System.out.println();

      Duration runTime = switch (problemNum) {
         case 0 -> new P0_FizzBuzz().run();
         case 1 -> new P1_Two_Sum().run();
         case 2 -> new P2_Add_Two_Numbers().run();
         case 3 -> new P3_Longest_Substring_Without_Repeating_Characters().run();
         //case 4 -> new P4_Median_Of_Two_Sorted_Arrays().run(); TODO
         case 9 -> new P9_Palindrome_Number().run();
         case 13 -> new P13_Roman_To_Integer().run();
         case 14 -> new P14_Longest_Common_Prefix().run();
         //case 15 -> new P15_3Sum().run(); TODO
         case 226 -> new P226_Invert_Binary_Tree().run();
         case 228 -> new P228_Summary_Ranges().run();
         default -> {System.out.println("That problem has not been completed yet"); yield Duration.of(0,SECONDS);}
      };

      System.out.println("\nExecution took "+runTime.toMillis()+"."+String.format("%03d",runTime.toNanosPart()/1000)+" ms");
   }
}



















































































































