import java.time.Duration;
import java.util.Scanner;

import static java.time.temporal.ChronoUnit.SECONDS;


public class LeetCodeRunner {

   public static void main(String[] args) {

      System.out.print("\nEnter the problem number: ");
      int problemNum = Integer.parseInt(new Scanner(System.in).nextLine());
      System.out.println();

      Duration runTime = switch (problemNum) {
         case 0 -> new P0().run(); //fizzbuzz
         case 1 -> new P1().run(); //two sum
         case 2 -> new P2().run(); //add two numbers
         case 3 -> new P3().run(); //longest substring without repeating characters
         case 4 -> new P4().run(); //median of two sorted arrays
         case 9 -> new P9().run(); //palindrome number
         case 13 -> new P13().run(); //roman to integer
         case 14 -> new P14().run(); //longest common prefix
         case 226 -> new P226().run(); //invert binary tree
         case 228 -> new P228().run(); //summary ranges
         default -> {System.out.println("That problem has not been completed yet"); yield Duration.of(0,SECONDS);}
      };

      System.out.println("\nExecution took "+runTime.toMillis()+"."+String.format("%03d",runTime.toNanosPart()/1000)+" ms");

//      String s = "";
//      boolean p = isPalindrome(s);
//      System.out.printf("\nIs (%s) a palindrome? %b\n",s,p);
   }

   private static boolean isPalindrome(String s) {
      if (s==null) return false;
      if (s.length()==0) return true;
      boolean isPalindrome = true;
      for (int l=0, r=s.length()-1; l<=r; l++, r--) {
         if (s.charAt(l)!=s.charAt(r)) {
            isPalindrome = false;
            break;
         }
      }
      return isPalindrome;
   }

   /**
    *
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



















































































































