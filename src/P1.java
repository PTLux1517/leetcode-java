import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.stream.Collectors;


public class P1 {

   int probNum = 1;
   String probName = "Two Sum";


   public int[] twoSum(int[] nums,int target) {
      HashMap<Integer,Integer> valToIndexMap = new HashMap<>();
      int firstIdx = 0;
      int secondIdx = 1;
      int compliment;
      boolean found = false;

      valToIndexMap.put(nums[firstIdx],firstIdx);

      for (; secondIdx<nums.length; secondIdx++) {
         compliment = target-nums[secondIdx];
         if (valToIndexMap.containsKey(compliment)) {
            firstIdx = valToIndexMap.get(compliment);
            found = true;
            break;
         }
         valToIndexMap.put(nums[secondIdx],secondIdx);
      }
      if (!found) return null;
      return new int[] {firstIdx,secondIdx};
   }


   public Duration run() {
      /* Provided input */
      int[] arg1 = new int[] {2,7,11,15};
      int arg2 = 9;

      /* Expected output */
      int[] exp = new int[] {0,1};

      /* Computed output with run time */
      Temporal start = Instant.now();
      int[] sol = twoSum(arg1,arg2);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """
         Problem %d: %s
         Given an array of integers nums and an integer target, return indices of the two numbers
         such that they add up to target. You may assume that each input would have exactly one
         solution, and you may not use the same element twice. You can return the answer in any order.
         
         Constraints:
         * 2<=nums.length<=10^4
         * -10^9<=nums[i]<=10^9
         * -10^9<=target<=10^9
         * Only one valid answer exists
         
         Input: nums = %s, target = %d
         Output: %s
         Expected: %s
         Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
         """, probNum, probName, Arrays.toString(arg1), arg2, Arrays.toString(sol), Arrays.toString(exp)
      );

      /* Pass/Fail status */
      Set<Integer> solSet = Arrays.stream(sol).boxed().collect(Collectors.toSet());
      Set<Integer> expSet = Arrays.stream(exp).boxed().collect(Collectors.toSet());
      Utils.printPassFail(solSet.equals(expSet));

      return Duration.between(start,end);
   }
}
