import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;
import java.util.*;
import java.util.stream.Collectors;


public class P15 {

   int probNum = 15;
   String probName = "3Sum";


   public List<List<Integer>> twoSum(int[] nums, int startIdx, int target) {
      HashMap<Integer,Integer> valToIdxMap = new HashMap<>();
//      List<List<Integer>> solutions = new ArrayList<>();
      Map<Integer,List<Integer>> pairs = new HashMap<>();

      valToIdxMap.put(nums[startIdx],startIdx);

      for (int idxL=startIdx, idxR=startIdx+1; idxR<nums.length; idxR++) {
         int valRCompliment = target-nums[idxR];
         if (valToIdxMap.containsKey(valRCompliment)) {
            idxL = valToIdxMap.get(valRCompliment);
//            solutions.add(List.of(idxL,idxR));
            if (pairs.containsKey(nums[idxL])) {
               List<Integer> rights = pairs.get(nums[idxL]);
               if (!rights.contains(nums[idxR])) {
                  rights.add(nums[idxR]);
               }
            }
            else if (pairs.containsKey(nums[idxR])) {
               List<Integer> lefts = pairs.get(nums[idxR]);
            }
         }
         valToIdxMap.put(nums[idxR],idxR);
      }
//      return solutions;
      return null;
   }

//   public List<List<Integer>> threeSum(int[] nums) {
//      List<List<Integer>> emptyList = List.of(List.of());
//      List<List<Integer>> solution = emptyList;
//      if (nums.length < 3) return emptyList;
//      P1 p1 = new P1();
//      Set<Integer> solutionIndices = new HashSet<>();
//      for (int i=0; i<nums.length-2; i++) {
//         int target = -nums[i];
////         int[] numsTail = Arrays.copyOfRange(nums,i+1,nums.length);
////         int[] complementPair = p1.twoSum(numsTail,target);
////         if (complementPair != null) {
////            solutionIndices.add(i);
////            Arrays.stream(complementPair).forEach(solutionIndices::add);
////         }
//         for (
//            int[] numsTail = Arrays.copyOfRange(nums,i+1,nums.length), complementPair = p1.twoSum(numsTail,target);
//            complementPair != null;
//            complementPair = p1.twoSum(numsTail,target)
//         ) {
//
//         }
//      }
//      int[] x = new P1().twoSum(nums,0);
//
//      //set of seen i's (if complement map key exists, no need to store i's in set. first search of complement pairs found all pairs)
//      //map of seen complements (sums) to unique addend pairs
//         //search tail for complement pairs, if found add to map
//
//      //convert nums array to treeset of vals in one pass (CAN'T BECAUSE DUPLICATE VALS CAN BE USED FROM DIFFERENT INDICES)
//
//
//      return null;
//   }


//   public List<List<Integer>> twoSum(int[] nums, HashSet<Integer> targets) {
////      HashMap<Integer,Integer> valToIndexMap = new HashMap<>();
//      List<List<Integer>> solutions = new ArrayList<>();
//      int idx1 = 1;
//      int idx2 = 2;
////      valToIndexMap.put(nums[idx1],idx1);
//      for(; idx2<nums.length; idx2++) {
//
//      }
//      return null;
//   }


   public List<List<Integer>> threeSum(int[] nums) {
      if (nums.length < 3)
         return List.of(List.of());
      HashSet<Integer> complements = Arrays.stream(nums)
         .sequential()
         .boxed()
         .limit(nums.length-2)
         .map(elem -> -elem)
         .collect(Collectors.toCollection(HashSet::new));
      List<List<Integer>> solutions = new ArrayList<>();
      complements.forEach(target -> {
         List<List<Integer>> pairs = twoSum(nums,0,target);
         if (!pairs.isEmpty())
            pairs.forEach(pair -> solutions.add(List.of(-target,pair.get(0),pair.get(1))));
      });
      return solutions;
   }


   public Duration run() {
      /* Provided input */
      int[] arg1 = new int[] {-1,0,1,2,-1,-4};

      /* Expected output */
      int[][] exp = new int[][] {
         {-1,-1,2},
         {-1,0,1}
      };

      /* Computed output with run time */
      Temporal start = Instant.now();
      List<List<Integer>> sol = threeSum(arg1);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """               
         Problem %d: %s
         Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that
         i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

         Notice that the solution set must not contain duplicate triplets.
         
         Constraints:
         * 3 <= nums.length <= 3000
         * -10^5 <= nums[i] <= 10^5
         
         Input: nums = %s
         Output: %s
         Expected: %s
         Explanation:
         nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
         nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
         nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
         The distinct triplets are [-1,0,1] and [-1,-1,2].
         Notice that the order of the output and the order of the triplets does not matter.
         """, probNum, probName, Arrays.toString(arg1), sol, Arrays.toString(exp)
      );

      /* Pass/Fail status */
      Utils.printPassFail(false);

      return Duration.between(start,end);
   }
}
