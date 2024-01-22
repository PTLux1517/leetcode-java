import java.time.Duration;
import java.time.Instant;
import java.time.temporal.Temporal;


public class P4 {

   int probNum = 4;
   String probName = "Median of Two Sorted Arrays";


   public double findMedianSortedArrays(int[] nums1,int[] nums2) {
      return 0.0;
   }


   public Duration run() {
      /* Provided input */
      int[] arg1 = new int[] {1,3};
      int[] arg2 = new int[] {2};

      /* Expected output */
      double exp = 2.0;

      /* Computed output with run time */
      Temporal start = Instant.now();
      double sol = findMedianSortedArrays(arg1,arg2);
      Temporal end = Instant.now();

      /* Problem description with computed output */
      System.out.printf(
         """               
         Problem %d: %s
         Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of
         the two sorted arrays. The overall run time complexity should be O(log(m+n)).
         
         Constraints:
         * nums1.length == m
         * nums2.length == n
         * 0<=m<=1000
         * 0<=n<=1000
         * 1<=m+n<=2000
         * -10^6<=nums1[i], nums2[i]<=10^6
         
         Input: nums1 = [1,3], nums2 = [2]
         Output: %f
         Expected: 2.00000
         Explanation: merged array = [1,2,3] and median is 2
         """, probNum, probName, sol
      );

      /* Pass/Fail status */
      Utils.printPassFail(Math.abs(sol-exp)<0.00001);

      return Duration.between(start,end);
   }
}
