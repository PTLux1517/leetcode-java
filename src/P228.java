import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class P228 {

   int probNum = 228;
   String probName = "Summary Ranges";


   public List<String> summaryRanges(int[] nums) {
      if (nums == null || nums.length == 0) return List.of();
      if (nums.length == 1) return List.of(""+nums[0]);

      List<String> solution = new ArrayList<>();
      Integer currRangeStartVal = nums[0];
      Integer currRangeStartIdx = 0;

      for (int i=1; i<nums.length; i++) {
         int valStep = nums[i] - nums[i-1];
         int idxSteps = i - currRangeStartIdx;
         boolean atEnd = i == nums.length-1;

         if (valStep==1) { //curr is part of a range: continue or terminate at end of nums
            if (!atEnd) continue;
            else solution.add(currRangeStartVal+"->"+nums[i]);
         }
         else if (idxSteps==1) { //prev was a singleton
            solution.add(currRangeStartVal.toString());
            if (atEnd) solution.add(""+nums[i]);
         }
         else { //prev was end of a range
            solution.add(currRangeStartVal+"->"+nums[i-1]);
            if (atEnd) solution.add(""+nums[i]);
         }
         currRangeStartVal = nums[i];
         currRangeStartIdx = i;
      }

      return solution;
   }


   public Duration run() {
      /* Provided input */
//      int[] arg1 = new int[] {0,1,2,4,5,7};
      int[] arg1 = new int[] {0,2,3,4,6,8,9};


      /* Expected output */
//      List<String> exp = List.of("0->2","4->5","7");
      List<String> exp = List.of("0","2->4","6","8->9");

      /* Computed output with run time */
      Temporal start = Instant.now();
      List<String> sol = summaryRanges(arg1);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """               
         Problem %d: %s
         You are given a sorted unique integer array nums.
                  
         A range [a,b] is the set of all integers from a to b (inclusive).
                  
         Return the smallest sorted list of ranges that cover all the numbers in the array exactly.
         That is, each element of nums is covered by exactly one of the ranges, and there is no 
         integer x such that x is in one of the ranges but not in nums.
                  
         Each range [a,b] in the list should be output as:
         * "a->b" if a != b
         * "a" if a == b
                  
         Constraints:
         * 0 <= nums.length <= 20
         * -2^31 <= nums[i] <= 2^31 - 1
         * All the values of nums are unique
         * nums is sorted in ascending order
                  
         Input: nums = %s
         Output: %s
         Expected: %s
         Explanation: The ranges are:
         [0,0] --> "0"
         [2,4] --> "2->4"
         [6,6] --> "6"
         [8,9] --> "8->9"
         """, probNum, probName, Arrays.toString(arg1), sol, exp
      );

      /* Pass/Fail status */
      Utils.printPassFail(sol.toString().equals(exp.toString()));

      return Duration.between(start,end);
   }
}
